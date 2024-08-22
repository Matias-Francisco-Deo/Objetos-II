package ar.edu.unq.po2.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {
	
	private Punto punto;
	
	@BeforeEach
	void setUp() throws Exception {
		this.punto = new Punto();
		this.punto.setY(2);
		
	}

	@Test
	void test() {
		assertEquals(0, punto.x);
		assertEquals(2, punto.y);
	}

}
