package ar.edu.unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Desarmador {
	
	private List<Integer> list;

	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<>();
		list.add(2322222);
		list.add(12345);
		list.add(5);
		list.add(7);
		list.add(944);
		list.add(1);
//		list.add(1);
		list.add(666666666);
//		list.add(1);
//		list.add(4);
	}

	@Test
	void test() {
		int max = -1;// inicializo los comparadores generales 
		int maxEven = -1;
		
		
		for (int num:list) { // por cada num
			int evens = 0;
			int current = num; 
			int dig = 0;
			while (current > 0) {
				
				dig++; //cuento sus digs
				current /= 10;
			}
			current = num; 
//			System.out.print(dig);
//			System.out.print(" ");
			
			
			
			int power = 1;
			int count = 1;
			while (count < dig) {
				power = power*10; //me fijo la potencia con los dígitos
				count++;
			}
			
			count = 1; 
			
			while (count <= dig) {
				//empiezo desde el final (si 23, empiezo por 2)
				
//				int powercnt = 1;
//				
//				while (dig < count) {
//					power = power/10;
//					powercnt++;
//				}
				
				int digit = current/power;
//				System.out.print("current ");
//				System.out.print(current);
//				System.out.print(" power ");
//				System.out.print(power);
//				System.out.print(" digit ");
//				System.out.print(digit);
				
				current = current - digit * power; // quito el anterior número para poder ver el siguiente dígito limpio
				power /= 10; //bajo la potencia
				
				
//				System.out.print(current);
				
				if (digit % 2 == 0) {
					evens++;
				}
				
				count++;
			}
			if (evens > maxEven) {
				maxEven = evens;
				max = num;
			}
//			System.out.print(evens);
			
			
		}
		System.out.print(max);
		assertEquals(666666666, max);
	}

}
