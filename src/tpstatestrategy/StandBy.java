package tpstatestrategy;

public class StandBy implements Estado {

	@Override
	public void recibirFicha(MáquinaDeVideojuegos máquinaDeVideojuegos) {
		máquinaDeVideojuegos.setEstado(new EnPartidaSolitario());
	}

	@Override
	public void pulsarBotónInicio(MáquinaDeVideojuegos máquinaDeVideojuegos) {

	}

}
