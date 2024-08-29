package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona p;

	@BeforeEach
	void setUp() throws Exception {
		LocalDate l = LocalDate.of(1984, 1, 1);
		p = new Persona("juan", l);
	}

	@Test
	void test() {
		assertEquals(40, p.getEdad());
	}

}
