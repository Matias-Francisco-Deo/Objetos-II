package tpstatestrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EncriptadorNaiveTest {

	private EncriptadorNaive encriptadorNaive;

	@BeforeEach
	void setUp() throws Exception {
		Encriptador encriptador = Mockito.mock(Encriptador.class);
		encriptadorNaive = new EncriptadorNaive(encriptador);
	}

	@Test
	void testSiguienteVocalEncriptar() {
		Encriptador encriptadorSiguienteVocal = Mockito.mock(EncriptadorSiguienteVocal.class);
		when(encriptadorSiguienteVocal.encriptar("abc12")).thenReturn("bcd12");
		encriptadorNaive.setEncriptador(encriptadorSiguienteVocal);
		assertEquals(encriptadorNaive.encriptar("abc12"), "bcd12");
	}

	@Test
	void testSiguienteVocalDesencriptar() {
		Encriptador encriptadorSiguienteVocal = Mockito.mock(EncriptadorSiguienteVocal.class);
		when(encriptadorSiguienteVocal.desencriptar("bcd12")).thenReturn("abc12");
		encriptadorNaive.setEncriptador(encriptadorSiguienteVocal);
		assertEquals(encriptadorNaive.desencriptar("bcd12"), "abc12");
	}

}
