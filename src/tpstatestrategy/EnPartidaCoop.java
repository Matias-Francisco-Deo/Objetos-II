package tpstatestrategy;

public class EnPartidaCoop implements Estado {

	@Override
	public void recibirFicha(MáquinaDeVideojuegos máquinaDeVideojuegos) {
		máquinaDeVideojuegos.setEstado(new EnPartidaCoop());
	}

	@Override
	public void pulsarBotónInicio(MáquinaDeVideojuegos máquinaDeVideojuegos) {
		System.out.print("EMPEZANDO PARTIDA COOP");
	}

}
