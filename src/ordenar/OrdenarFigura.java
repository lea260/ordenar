package ordenar;

import java.util.Comparator;

import modelo.IPerimetro;

public class OrdenarFigura implements Comparator<IPerimetro> {

	@Override
	public int compare(IPerimetro p1, IPerimetro p2) {
		// TODO Auto-generated method stub
		if (p1.perimetro() < p2.perimetro()) {
			return -1;
		} else if (p1.perimetro() > p2.perimetro()) {
			return 1;
		} else {
			return 0;
		}

	}

	public OrdenarFigura() {

	}

}
