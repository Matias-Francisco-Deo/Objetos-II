package tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

	private Archivo archivo;

	@BeforeEach
	void setUp() throws Exception {
		archivo = new Archivo("ricardo notas", 20);
	}

	@Test
	void testModificarNombreCambiaFecha() {
		archivo.cambiarNombre("ricardo notas final");
		assertEquals(archivo.getFechaDeÚltimaModificación(), LocalDate.now());
	}

}
