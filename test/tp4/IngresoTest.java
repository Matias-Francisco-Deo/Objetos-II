package tp4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	private Ingreso ing;

	@BeforeEach
	void setUp() throws Exception {
		ing = new Ingreso(10, "Pago por trabajo mensual en IT", 10000);
	}

	@Test
	void test() {
		assertEquals(200, ing.getImpuestoTotal());
		assertEquals(9800, ing.getMontoImponible());
		assertEquals(10000, ing.getMonto());
	}

}
