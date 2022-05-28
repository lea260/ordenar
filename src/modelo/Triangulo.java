package modelo;

public class Triangulo implements IPerimetro {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return base * 3;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "] perimetro"+ perimetro();
	}
	
	

}
