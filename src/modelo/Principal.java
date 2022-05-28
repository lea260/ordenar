package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IPerimetro> lista = new ArrayList<IPerimetro>();
		lista.add(new Triangulo(2, 50));
		lista.add(new Cuadrado(25));
		lista.add(new Triangulo(2, 50));
		lista.add(new Triangulo(15, 50));
		lista.add(new Triangulo(25, 50));
		for (IPerimetro iper : lista) {
			System.out.print(iper.perimetro());
		}
	}

}
