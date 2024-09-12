package tp4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoHorasExtraTest {
	private Ingreso ing;

	@BeforeEach
	void setUp() throws Exception {
		ing = new IngresoHorasExtra(10, "Pago por trabajo mensual en IT", 10000, 5);
	}

	@Test
	void test() {
		assertEquals(0, ing.getImpuestoTotal());
		assertEquals(10000, ing.getMontoImponible());
		assertEquals(10000, ing.getMonto());
	}

}
