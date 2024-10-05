package tp8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretaríaDepTest {
	SecretaríaDeDeportes sec;
	List<ActividadSemanal> acts;
	private ActividadSemanal act4;
	private ActividadSemanal act1;
	private ActividadSemanal act7;

	@BeforeEach
	void setUp() throws Exception {
		act1 = new ActividadSemanal(Deporte.BASKET, DíaDeLaSemana.Lunes, 2, 14);
		ActividadSemanal act2 = new ActividadSemanal(Deporte.BASKET, DíaDeLaSemana.Miércoles, 2, 14);
		ActividadSemanal act3 = new ActividadSemanal(Deporte.BASKET, DíaDeLaSemana.Sábado, 2, 14);
		act4 = new ActividadSemanal(Deporte.FUTBOL, DíaDeLaSemana.Lunes, 2, 14);
		ActividadSemanal act5 = new ActividadSemanal(Deporte.FUTBOL, DíaDeLaSemana.Miércoles, 2, 14);
		ActividadSemanal act6 = new ActividadSemanal(Deporte.FUTBOL, DíaDeLaSemana.Sábado, 2, 14);
		act7 = new ActividadSemanal(Deporte.JABALINA, DíaDeLaSemana.Lunes, 2, 14);
		ActividadSemanal act8 = new ActividadSemanal(Deporte.JABALINA, DíaDeLaSemana.Sábado, 2, 14);
		acts = Arrays.asList(act1, act2, act3, act4, act5, act6, act7, act8);
		sec = new SecretaríaDeDeportes();
		sec.setActs(acts);

	}

	@Test
	void testFulbo() {
		assertEquals(sec.todasActsFútbol().size(), 3);
	}

	@Test
	void testTodasDeComplejidad() {
		assertEquals(sec.todasDeComplejidad(2).size(), 6);
	}

	@Test
	void horasTotales() {
		assertEquals(sec.horasTotales(), 16);
	}

	@Test
	void actDeMenorCosto() {
		assertEquals(sec.actDeMenorCosto(Deporte.FUTBOL), act4);
	}

	@Test
	void deMenorCostoPorAct() {
		assertEquals(sec.deMenorCostoPorAct().get(Deporte.BASKET), act1);
		assertEquals(sec.deMenorCostoPorAct().get(Deporte.FUTBOL), act4);
		assertEquals(sec.deMenorCostoPorAct().get(Deporte.JABALINA), act7);
	}

	@Test
	void imprimirActs() {
//		assertEquals(sec.deMenorCostoPorAct().get(Deporte.BASKET), act1);
		sec.imprimirActs();

	}

}
