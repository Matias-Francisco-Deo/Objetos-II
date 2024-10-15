package tpstatestrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNúmerosTest {

	private EncriptadorNúmeros encriptador;

	@BeforeEach
	void setUp() throws Exception {
		encriptador = new EncriptadorNúmeros();
	}

	@Test
	void testEncriptar() {
		assertEquals(encriptador.encriptar("abc "), "1230");
	}

	@Test
	void testDesencriptar() {
		assertEquals(encriptador.desencriptar("1230"), "abc ");
	}

}
