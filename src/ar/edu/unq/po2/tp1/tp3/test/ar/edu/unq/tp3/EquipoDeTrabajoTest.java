package ar.edu.unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.tp3.EquipoDeTrabajo;
import ar.edu.unq.tp3.Persona;

class EquipoDeTrabajoTest {
	EquipoDeTrabajo e;
	
	@BeforeEach
	void setUp() throws Exception {
		LocalDate l = LocalDate.of(1984, 1, 1);
		LocalDate d = LocalDate.of(1920, 1, 1);
		Persona p = Persona.crearPersona("pepe", l);
		Persona a = Persona.crearPersona("ana", d);
		List<Persona> lp = new ArrayList<Persona>();
		lp.add(p);
		lp.add(p);
		lp.add(a);
		lp.add(a);
		lp.add(p);
		this.e = new EquipoDeTrabajo("ElMegaEquipardo", lp);
	}

	@Test
	void test() {
		System.out.print(e.getPromedioEdad());
	}

}
