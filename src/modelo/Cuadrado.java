package modelo;

public class Cuadrado implements IPerimetro {
	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "] perimetro" + perimetro();
	}
	
	

}
