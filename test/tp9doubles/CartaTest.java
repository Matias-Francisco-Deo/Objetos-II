package tp9doubles;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	Carta carta1;

	@BeforeEach
	void setUp() throws Exception {
		carta1 = new Carta("1", "P");

	}

	@Test
	void testCartaEsSuperior() {
		Carta carta2 = new Carta("4", "P");
		assertTrue(carta2.esSuperior(carta1));
	}

	@Test
	void testCartaNoEsSuperior() {
		Carta carta2 = new Carta("Q", "P");
		assertFalse(carta1.esSuperior(carta2));
	}

	@Test
	void testPoseenMismoPalo() {
		Carta carta2 = new Carta("4", "P");
		assertTrue(carta1.esMismoPalo(carta2));
	}

	@Test
	void testNoPoseenMismoPalo() {
		Carta carta2 = new Carta("4", "D");
		assertFalse(carta1.esMismoPalo(carta2));
	}

}
