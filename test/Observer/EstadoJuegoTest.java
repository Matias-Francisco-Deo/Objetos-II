package Observer;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoJuegoTest {

	private EnLobby estado1;
	private EnCurso estado2;

	@BeforeEach
	void setUp() throws Exception {
		estado1 = new EnLobby();
		estado2 = new EnCurso();
	}

	@Test
	void testNoSePuedeEmpezarLaPartidaHastaQueElEstadoNoSeaEnCurso() {
		assertThrows(AcciónInválida.class, () -> {
			estado1.empezar();
		});
	}

	@Test
	void testNoSePuedeResponderSiNoEstáEnCurso() {
		assertThrows(AcciónInválida.class, () -> {
			estado1.responder(null, null, null, null);
		});
	}

	@Test
	void testSiEstáEnCursoSePuedeResponder() {
		EnCurso spy = spy(estado2);
		JuegoPreguntas juego = mock(JuegoPreguntas.class);
		spy.responder(null, null, null, juego);
		verify(spy, times(1)).responder(null, null, null, juego);
	}

	@Test
	void testSiEstáEnCursoSePermiteEmpezar() {
		EnCurso spy = spy(estado2);
		spy.empezar();
		verify(spy, times(1)).empezar();
	}

}
