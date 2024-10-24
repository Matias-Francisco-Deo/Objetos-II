package Observer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PreguntaTest {

	private Pregunta preg;

	@BeforeEach
	void setUp() throws Exception {
		preg = new Pregunta("¿Quién hizo el Arca Gemela?", "Jorge");
	}

	@Test
	void testPreguntaConRespuestaCorrecta() {
		assertTrue(preg.esRespuestaCorrecta("Jorge"));
	}

	@Test
	void testPreguntaConRespuestaIncorrecta() {
		assertFalse(preg.esRespuestaCorrecta("Pepito Repepe"));
	}

}
