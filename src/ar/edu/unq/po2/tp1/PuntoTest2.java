package ar.edu.unq.po2.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest2 {

	private Punto punto;
	
	private Ajedrez aj;
	
	@BeforeEach
	void setUp() throws Exception {
		this.punto = new Punto();
		this.punto.setY(2);
		this.aj = new Ajedrez("julieta");
		
	}

	@Test
	void test() {
		//assertEquals("Ajedrez", punto.reconocer());
		//assertEquals(2, punto.y);
		
		punto.reconocer(this.aj);
		System.out.println(this.aj);
	}

}
