package tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPersonasYMascotas {
	Mascota juanito = new Mascota("juanito", "golden");
	Persona pepe = new Persona("pepe", LocalDate.now());
	Mascota pepito = new Mascota("pepito", "golden");
	Persona alejandro = new Persona("alejandro", LocalDate.now());
	List<Nombrado> nombrados;

	@BeforeEach
	void setUp() throws Exception {
		nombrados = new ArrayList<Nombrado>();
		nombrados.add(pepe);
		nombrados.add(alejandro);
		nombrados.add(juanito);
		nombrados.add(pepito);
	}

	@Test
	void test() {
		for (Nombrado nm : nombrados) {
			System.out.print(nm.getNombre());
			System.out.print(" ");
		}
	}

}
