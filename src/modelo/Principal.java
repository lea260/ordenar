package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import ordenar.OrdenarFigura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IPerimetro> lista = new ArrayList<IPerimetro>();
		lista.add(new Triangulo(2, 50));
		lista.add(new Cuadrado(25));
		lista.add(new Triangulo(2, 50));
		lista.add(new Triangulo(15, 50));
		lista.add(new Triangulo(25, 50));
		lista.sort(new OrdenarFigura());
		for (IPerimetro iper : lista) {
			System.out.println(iper.toString());
		}
	}

}
