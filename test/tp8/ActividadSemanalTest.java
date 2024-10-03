package tp8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {

	private ActividadSemanal actividad;

	@BeforeEach
	void setUp() throws Exception {
		actividad = new ActividadSemanal(Deporte.FUTBOL, DíaDeLaSemana.Miércoles, 5, 14);
	}

	@Test
	void test() {
		assertEquals(actividad.getPrecio(), 900);
	}

}
