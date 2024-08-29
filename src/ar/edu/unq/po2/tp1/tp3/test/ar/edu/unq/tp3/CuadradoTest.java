package ar.edu.unq.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.tp3.Cuadrado;

class CuadradoTest {

	Cuadrado r;

	@BeforeEach
	void setUp() throws Exception {
		r = new Cuadrado();
		r.cambiarAltura(20);
	}

	@Test
	void esHorizontalTest() {
		assertEquals(r.esHorizontal(),false);
	}
	@Test
	void areaTest() {
		assertEquals(r.getArea(),8);
	}
	@Test
	void esVertical() {
		assertEquals(r.esVertical(),true);
	}

}

