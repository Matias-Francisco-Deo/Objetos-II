package tp8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionesDermatológicasTest {
	LesiónDermatológica lesión;

	@BeforeEach
	void setUp() throws Exception {
		lesión = LesiónDermatológica.Rojo;

	}

	@Test
	void testDarSig() {
		lesión = lesión.darSig();
		assertEquals(lesión, LesiónDermatológica.Gris);
	}

	@Test
	void testDarSigBucle() {
		lesión = lesión.darSig();
		lesión = lesión.darSig();
		lesión = lesión.darSig();
		lesión = lesión.darSig();
		assertEquals(lesión, LesiónDermatológica.Rojo);
	}

}
