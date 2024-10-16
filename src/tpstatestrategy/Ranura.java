package tpstatestrategy;

public class Ranura {
	int fichasTotales = 0;

	public void recibirFicha(Ficha ficha, MáquinaDeVideojuegos máquinaDeVideojuegos) {
		máquinaDeVideojuegos.getEstado().recibirFicha(máquinaDeVideojuegos);
		fichasTotales++;

	}

	public int getFichasTotales() {
		return fichasTotales;
	}

}
