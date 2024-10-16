package tpstatestrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MáquinaDeVideojuegosTest {

	private MáquinaDeVideojuegos máquinavideojuegos;
	private Ficha ficha;

	@BeforeEach
	void setUp() throws Exception {
		máquinavideojuegos = new MáquinaDeVideojuegos();
		ficha = mock(Ficha.class);
	}

	@Test
	void testLaMáquinaApagadaNoHaceNada() {
		máquinavideojuegos.pulsarBotónInicio();
		máquinavideojuegos.recibirFicha(ficha);
		assertEquals(Apagado.class, máquinavideojuegos.getEstado().getClass());
	}

	@Test
	void testMáquinaEnStandBy() {
		máquinavideojuegos.encender();
		assertEquals(StandBy.class, máquinavideojuegos.getEstado().getClass());
	}

	@Test
	void testMáquinaEnPartidaSolitario() {
		máquinavideojuegos.encender();
		máquinavideojuegos.recibirFicha(ficha);
		máquinavideojuegos.pulsarBotónInicio();
		assertEquals(EnPartidaSolitario.class, máquinavideojuegos.getEstado().getClass());
	}

	@Test
	void testMáquinaEnPartidaCoop() {
		máquinavideojuegos.encender();
		máquinavideojuegos.recibirFicha(ficha);
		máquinavideojuegos.recibirFicha(ficha);
		máquinavideojuegos.pulsarBotónInicio();
		assertEquals(EnPartidaCoop.class, máquinavideojuegos.getEstado().getClass());
	}

	@Test
	void testMáquinaTerminaPartida() {
		máquinavideojuegos.encender();
		máquinavideojuegos.recibirFicha(ficha);
		máquinavideojuegos.recibirFicha(ficha);
		máquinavideojuegos.pulsarBotónInicio();
		máquinavideojuegos.terminarPartida();
		assertEquals(StandBy.class, máquinavideojuegos.getEstado().getClass());
	}

	@AfterEach
	public void tearDown() {
		System.out.print("\n");
		System.out.flush();
	}

}
