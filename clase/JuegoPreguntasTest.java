package Observer;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JuegoPreguntasTest {

	private Pregunta pregunta;
	private JuegoPreguntas juego;
	private Participante participante;

	@BeforeEach
	void setUp() throws Exception {
		juego = new JuegoPreguntas();
		participante = mock(Participante.class);
		juego.sumarParticipante(participante);
		juego.sumarParticipante(participante);
		juego.sumarParticipante(participante);
		juego.sumarParticipante(participante);
		juego.sumarParticipante(participante);
		// 5 participantes
		pregunta = mock(Pregunta.class);
		List<Pregunta> preguntas = Arrays.asList(pregunta, pregunta, pregunta, pregunta, pregunta);
		juego.iniciarPartida(preguntas);
	}

	@Test
	void testCuandoElParticipanteRespondeCorrectamenteElJuegoLeAvisa() {
		when(pregunta.esRespuestaCorrecta("Jorgito")).thenReturn(true);
		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
		// count participante.respuestaCorrecta() 1 times
		// count participante.mostrarCorrecta() 1 times
	}

	@Test
	void testCuandoElParticipanteRespondeIncorrectamenteElJuegoLeAvisa() {
		when(pregunta.esRespuestaCorrecta("Jorgito")).thenReturn(true);
		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
		// count participante.respuestaIncorrecta() 1 times
	}

	@Test
	void testCuandoElParticipanteRespondeBienLaÚltimaAvisaElGanador() {
		when(pregunta.esRespuestaCorrecta("Jorgito")).thenReturn(true);
		when(participante.estáPorÚltimaPregunta()).thenReturn(true);
		juego.enviarRespuestaDe(participante, pregunta, "Jorgito");
		// count participante.mostrarGanador() 1 times
	}
	//hacer para los estados...

}
