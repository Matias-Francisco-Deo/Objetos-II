package tpstatestrategy;

public class EnPartidaSolitario implements Estado {

	@Override
	public void recibirFicha(MáquinaDeVideojuegos máquinaDeVideojuegos) {
		máquinaDeVideojuegos.setEstado(new EnPartidaCoop());

	}

	@Override
	public void pulsarBotónInicio(MáquinaDeVideojuegos máquinaDeVideojuegos) {
		System.out.print("EMPEZANDO PARTIDA SINGLEPLAYER");

	}

}
