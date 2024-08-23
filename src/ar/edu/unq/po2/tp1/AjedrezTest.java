package ar.edu.unq.po2.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AjedrezTest {
	
	Ajedrez aj;

	@BeforeEach
	void setUp() throws Exception {
		this.aj = new Ajedrez("tyler");
	}

	@Test
	void test() {
		assertEquals("Configura el tablero de ajedrez\r\n"
				+ "Aprende a mover las piezas en ajedrez\r\n"
				+ "Descubre las reglas especiales\r\n"
				+ "Averigua quien hace la 1ª jugada\r\n"
				+ "Revisa las normas de cómo ganar\r\n"
				+ "Estudia las estrategias básicas\r\n"
				+ "Practica jugando muchas partidas", aj.getReglas());
	}

}
