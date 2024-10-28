package parciales;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parcial1.EmpleadoProyecto;
import parcial1.Programa;
import parcial1.Proyecto;

class ProgramaTest {
	Programa programaRoot;
	Programa programa2;

	@BeforeEach
	void setUp() throws Exception {

		EmpleadoProyecto líder = mock(EmpleadoProyecto.class);

		when(líder.sueldoDiario()).thenReturn(1000f);

		Proyecto proyecto = mock(Proyecto.class);
		Proyecto proyecto2 = mock(Proyecto.class);
		Proyecto proyecto3 = mock(Proyecto.class);
		programaRoot = new Programa("programa1", líder, 1000);
		programa2 = new Programa("programa2", líder, 5000);

//		when(proyecto.getFechaInicio()).thenReturn(LocalDate.of(2000, 1, 1)).thenReturn(LocalDate.of(2020, 5, 1))
//				.thenReturn(LocalDate.of(2000, 10, 5));
		when(proyecto.getFechaInicio()).thenReturn(LocalDate.of(2000, 1, 1));
		when(proyecto2.getFechaInicio()).thenReturn(LocalDate.of(2005, 1, 10));
		when(proyecto3.getFechaInicio()).thenReturn(LocalDate.of(2010, 1, 5));

//		EmpleadoProyecto empleado = mock(EmpleadoProyecto.class);
//		when(empleado.sueldoDiario()).thenReturn(500f);
//		when(proyecto.getEmpleados()).thenReturn(Arrays.asList(empleado, empleado));
//		when(proyecto2.getEmpleados()).thenReturn(Arrays.asList(empleado, empleado));
//		when(proyecto3.getEmpleados()).thenReturn(Arrays.asList(empleado, empleado));

		when(proyecto.calcularInversiónTotal()).thenReturn(1000f);
		when(proyecto2.calcularInversiónTotal()).thenReturn(2000f);
		when(proyecto3.calcularInversiónTotal()).thenReturn(1500f);

		programaRoot.añadirPlanificación(proyecto);
		programa2.añadirPlanificación(proyecto2);
		programa2.añadirPlanificación(proyecto3);
		programaRoot.añadirPlanificación(programa2);
	}

	@Test
	void testFechaInicio() {
		assertEquals(programaRoot.getFechaInicio(), LocalDate.of(2000, 1, 1));
	}

	@Test
	void testInversiónTotal() {
		assertEquals(programaRoot.calcularInversiónTotal(), 10500);
	}

}
