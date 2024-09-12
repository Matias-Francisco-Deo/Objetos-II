package tp4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoAlTrabajadorTest {
	private ImpuestoAlTrabajador imp;

	@BeforeEach
	void setUp() throws Exception {
		imp = new ImpuestoAlTrabajador();
	}

	@Test
	void test() {
		assertEquals(2, imp.getValor());
	}

}
