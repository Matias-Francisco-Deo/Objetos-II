package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
	
	public int sumarTodos(List<Integer> ints) {
		int total = 0;
		for (Integer n:ints) {
			total += n;
		}
		return total;
	}
	
	public int restarTodos(List<Integer> ints) {
		int total = 0;
		for (Integer n:ints) {
			total -= n;
		}
		return total;
	}
	
	public int multiplicarTodos(List<Integer> ints) {
		int total = 1;
		for (Integer n:ints) {
			total *= n;
		}
		return total;
	}
	
}
