package tpstatestrategy;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegosEstadosTest {

	private Apagado apagado;
	private StandBy standby;
	private EnPartidaCoop enpartidacoop;
	private EnPartidaSolitario enpartidasolitario;
	private Ficha ficha;

	@BeforeEach
	void setUp() throws Exception {
		apagado = new Apagado();
		standby = new StandBy();
		enpartidacoop = new EnPartidaCoop();
		enpartidasolitario = new EnPartidaSolitario();
		ficha = mock(Ficha.class);

	}

	@Test
	void testApagadoNoHaceNadaAlPulsar() {
		apagado.pulsarBotónInicio();

	}

	@Test
	void testApagadoNoHaceNadaAlInsertarFicha() {
		apagado.recibirFicha(ficha);

	}

}
