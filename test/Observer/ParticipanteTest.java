package Observer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParticipanteTest {

	private Participante participante;
	private JuegoPreguntas juego;
	private List<Pregunta> preguntas;

	@BeforeEach
	void setUp() throws Exception {
		participante = new Participante("Alfredo");
		juego = mock(JuegoPreguntas.class);
		Pregunta pregunta1 = mock(Pregunta.class);
		when(pregunta1.getPregunta()).thenReturn("¿Quién es salvaje?");
		this.preguntas = Arrays.asList(pregunta1, pregunta1, pregunta1, pregunta1, pregunta1);
	}

	@Test
	void testParticipanteSeSumaAUnJuego() {
		participante.sumarse(juego);
		assertEquals(participante.getJuego(), juego);
	}

	@Test
	void testParticipanteComienzaConTodasLasPreguntas() {
		participante.sumarse(juego);

		participante.comenzarPartida(preguntas);
		assertEquals(participante.getPreguntas(), preguntas);
	}

	@Test
	void testParticipanteRespondePreguntaCorrectamenteSuPuntajeAumenta() {
		participante.sumarse(juego);
		participante.comenzarPartida(preguntas);
		participante.responderPregunta(participante.getPreguntaActual(), "Jorge");
		participante.respuestaCorrecta();
		participante.mostrarCorrecta(preguntas.get(0), participante);
		assertEquals(participante.getPuntaje(), 1);
	}

	@Test
	void testParticipanteRespondePreguntaIncorrectamenteSuPuntajeSeMantiene() {
		participante.sumarse(juego);
		participante.comenzarPartida(preguntas);
		participante.responderPregunta(participante.getPreguntaActual(), "Tigre");
		participante.respuestaIncorrecta();
		assertEquals(participante.getPuntaje(), 0);
	}

}
