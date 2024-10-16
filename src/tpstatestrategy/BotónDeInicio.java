package tpstatestrategy;

public class BotónDeInicio {

	public void pulsar(MáquinaDeVideojuegos máquinaDeVideojuegos) {

		máquinaDeVideojuegos.getEstado().pulsarBotónInicio(máquinaDeVideojuegos);
//		if (máquinaDeVideojuegos.ranura.getFichasTotales() == 1) {
//			máquinaDeVideojuegos.setEstado(new EnPartidaSolitario());
//		} else if (máquinaDeVideojuegos.ranura.getFichasTotales() == 2) {
//			máquinaDeVideojuegos.setEstado(new EnPartidaCoop());
//		}

	}

}
