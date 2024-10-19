package tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeArchivosTest {

	private SistemaDeArchivos sistema;
	private Archivo archivo1;

	@BeforeEach
	void setUp() throws Exception {
		sistema = new SistemaDeArchivos();
		archivo1 = mock(Archivo.class);
		when(archivo1.getPeso()).thenReturn(50).thenReturn(150);

		Directorio directorio1 = new Directorio("roberto 2020");
		directorio1.añadirArchivo(archivo1);
		directorio1.añadirArchivo(archivo1);
//		Archivo archivo2 = mock(Archivo.class);
//		when(directorio1.contenido()).thenReturn(Arrays.asList(archivo1, archivo1)); puedo hacer esto de alguna manera?
		sistema.añadirArchivo(directorio1);
	}

	@Test
	void testCantidadDeMb() {
		assertEquals(200, sistema.totalSize());
	}

	@Test
	void testElementoMásNuevo() {
		when(archivo1.getFecha()).thenReturn(LocalDate.of(2000, 1, 1)).thenReturn(LocalDate.of(2000, 1, 1));
		when(archivo1.lastModified()).thenReturn(archivo1);
		Archivo archivo2 = mock(Archivo.class);
		when(archivo2.getFecha()).thenReturn(LocalDate.now());
		when(archivo2.lastModified()).thenReturn(archivo2);

		sistema.añadirArchivo(archivo2);
		assertEquals(archivo2, sistema.lastModified());
	}

	@Test
	void testElementoMásViejo() {
		when(archivo1.getFecha()).thenReturn(LocalDate.of(2000, 1, 1)).thenReturn(LocalDate.of(2000, 2, 1));
		when(archivo1.lastModified()).thenReturn(archivo1);
		Archivo archivo2 = mock(Archivo.class);
		when(archivo2.getFecha()).thenReturn(LocalDate.now());
		when(archivo2.lastModified()).thenReturn(archivo2);

		sistema.añadirArchivo(archivo2);
		assertEquals(archivo1, sistema.oldestElement());
	}

	@Test
	void testPrint() {
		Archivo archivo2 = new Archivo("pepito notas", 20);
		Archivo archivo3 = new Archivo("matias letras", 60);
		Directorio directorio = new Directorio("matias 2024");
		directorio.añadirArchivo(archivo3);
		directorio.añadirArchivo(archivo2);
		sistema.añadirArchivo(directorio);
		sistema.printStructure();
	}

}
