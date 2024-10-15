package tpstatestrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorSiguienteVocalTest {

	private EncriptadorSiguienteVocal encriptador;

	@BeforeEach
	void setUp() throws Exception {
		encriptador = new EncriptadorSiguienteVocal();
	}

	@Test
	void testEncriptar() {
		assertEquals(encriptador.encriptar("abc123"), "bcd123");
	}

	@Test
	void testDesencriptar() {
		assertEquals(encriptador.desencriptar("bcd123"), "abc123");
	}

}
