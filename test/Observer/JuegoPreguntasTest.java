package Observer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class JuegoPreguntasTest {

	private Pregunta pregunta;
	private JuegoPreguntas juego;
	private Participante participante;
	private Participante participante2;
	private List<Pregunta> preguntas;

	@BeforeEach
	void setUp() throws Exception {
		juego = new JuegoPreguntas();
		participante = mock(Participante.class);
		participante2 = mock(Participante.class);
		juego.sumarParticipante(participante);
		juego.sumarParticipante(participante2);
		juego.sumarParticipante(participante2);
		juego.sumarParticipante(participante2);
		juego.sumarParticipante(participante2);
		// 5 participantes
		pregunta = mock(Pregunta.class);
		preguntas = Arrays.asList(pregunta, pregunta, pregunta, pregunta, pregunta);
	}

	@Test
	void testCuandoElParticipanteRespondeCorrectamenteElJuegoLeAvisa() {
		juego.iniciarPartida(preguntas);
		when(pregunta.esRespuestaCorrecta("Jorgito")).thenReturn(true);
		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
		Mockito.verify(participante, Mockito.times(1)).respuestaCorrecta();
		Mockito.verify(participante, Mockito.times(1)).mostrarCorrecta(pregunta, participante);
	}

	@Test
	void testCuandoElParticipanteRespondeIncorrectamenteElJuegoLeAvisa() {
		juego.iniciarPartida(preguntas);
		when(pregunta.esRespuestaCorrecta("Jorgito")).thenReturn(false);
		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
		Mockito.verify(participante, Mockito.times(1)).respuestaIncorrecta();
	}

	@Test
	void testCuandoElParticipanteRespondeBienLaÚltimaAvisaElGanador() {
		juego.iniciarPartida(preguntas);
		when(pregunta.esRespuestaCorrecta("Jorgito")).thenReturn(true);
		when(participante.estáPorÚltimaPregunta()).thenReturn(true);
		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
		Mockito.verify(participante, Mockito.times(1)).mostrarGanador(participante);
	}

//	@Test
//	void testCuandoElParticipanteQuiereComenzarAntesQueElServidorPermitaEsteLanzaExcepción() {
//		juego.iniciarPartida(preguntas);
//		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
//		Mockito.verify(participante, Mockito.times(1)).mostrarGanador(participante);
//	}

	@Test
	void testAntesDeEmpezarLaPartidaEstáEnLobby() {
		assertEquals(EnLobby.class, juego.getEstado().getClass());
	}

	@Test
	void testCuandoEmpiezaLaPartidaSePoneEnEstadoEnCurso() {
		juego.iniciarPartida(preguntas);
		assertEquals(EnCurso.class, juego.getEstado().getClass());
	}

	@Test
	void testCuandoFinalizarLaPartidaVuelveALobby() {
		juego.iniciarPartida(preguntas);
		juego.notificarFinConGanador(participante);
		assertEquals(EnLobby.class, juego.getEstado().getClass());
	}

}
