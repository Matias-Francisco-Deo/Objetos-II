package tp4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	private Trabajador pepe;

	@BeforeEach
	void setUp() throws Exception {
		this.pepe = new Trabajador();
		pepe.recibirIngreso(10, "Pago por servicios de cocina.", 10000);
	}

	@Test
	void test() {
		
		assertEquals(9800, pepe.getMontoImponible(), 0.01);
		assertEquals(10000, pepe.getTotalPercibido(), 0.01);
		assertEquals(200, pepe.getImpuestoAPagar(), 0.01);
	}

}
