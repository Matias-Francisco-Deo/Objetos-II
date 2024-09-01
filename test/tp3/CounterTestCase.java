package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.tp3.Counter;

class CounterTestCase {

	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
	int amount = counter.getEvenOcurrences();
	// I check the amount is the expected one
		assertEquals(1, amount);
	}
	@Test
	public void testOddNumbers() {
		int amount = counter.getOddOcurrences();
		// I check the amount is the expected one
		assertEquals(9, amount);
		}
	@Test
	public void testNumbers() {
		int amount = counter.getOcurrencesOf(3);
		// I check the amount is the expected one
		assertEquals(2, amount);
		}


}
