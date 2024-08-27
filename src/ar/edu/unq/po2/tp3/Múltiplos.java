package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Múltiplos {

	@BeforeEach
	void setUp() throws Exception {
	}
	
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
			
		int current = mult;
		while (mult != -1 && current + mult < 1000) {
			current = current + mult;
//			if (current + mult % 6 == 0 && current + mult % 3 == 0) {
//				current = current + mult;
//			}
		}	
		current = current;
//		return current;
	}

}
