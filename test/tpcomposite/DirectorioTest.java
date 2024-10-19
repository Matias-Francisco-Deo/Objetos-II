package tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTest {

	private Directorio directorio;

	@BeforeEach
	void setUp() throws Exception {
		directorio = new Directorio("ricardo2020");

	}

	@Test
	void testFecha() {
		assertEquals(directorio.getFechaDeCreación(), LocalDate.now());
	}

	@Test
	void testContenidoVacío() {
		assertTrue(directorio.contenido().isEmpty());
	}

	@Test
	void testContenidoConUnArchivo() {
		Unidad archivo = mock(Unidad.class);
		directorio.añadirArchivo(archivo);
		assertFalse(directorio.contenido().isEmpty());
	}

}
