package tp9doubles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PóquerStatusTest {
	PóquerStatus ps;

	@BeforeEach
	void setUp() throws Exception {
		// setup
		ps = new PóquerStatus();

	}

	@Test
	void testVerificarEsPóquer() {
		// Exercise
		String carta1 = "10P";
		String carta2 = "10C";
		String carta3 = "10D";
		String carta4 = "10T";
		String carta5 = "1T";
		String jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Póquer", jugada);
	}

	@Test
	void testVerificarEsTrío() {
		// Exercise
		String carta1 = "10P";
		String carta2 = "10C";
		String carta3 = "10D";
		String carta4 = "2T";
		String carta5 = "1T";
		String jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Trío", jugada);
	}

	@Test
	void testVerificarEsColor() {
		// Exercise
		String carta1 = "1P";
		String carta2 = "2P";
		String carta3 = "3P";
		String carta4 = "5P";
		String carta5 = "10P";
		String jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Color", jugada);
	}

	@Test
	void testVerificarEsNada() {

		// Exercise
		String carta1 = "10P";
		String carta2 = "2C";
		String carta3 = "10D";
		String carta4 = "2T";
		String carta5 = "1T";
		String jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertEquals("Nada", jugada);
	}

	// no hay código para limpiar

}
