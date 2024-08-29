package ar.edu.unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Múltiplos {
	
	Integer pepe;
//	private int pepe2;
	
	@BeforeEach
	void setUp() throws Exception {
	}
	/**
	 * 
	 * @param x String
	 * @param y Array
	 * @return pepe
	 */
	public int getMúltiplo(int x, int y) {
		int i = -1;
		if (x % y == 0) {
			i = x;
		} else if ( y % x == 0) {
			i = y;
		}
		return i;
	}

	@Test
	void test() {
		int x = 9;
		int y = 3;
		int mult = getMúltiplo(x, y);
		int p;
		Integer z;
//		pepe2 = this.pepe;
		int current = mult;
		while (mult != -1 && current + mult < 1000) {
			current = current + mult;
//			if (current + mult % 6 == 0 && current + mult % 3 == 0) {
//				current = current + mult;
//			}
		}	
//		current = current;
//		return current;
	}

}
