package tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> list = new ArrayList<>();
	
	public void addNumber(int num) {
		list.add(num);
	}
	
	public int getEvenOcurrences() {
		int evens = 0;
		for (int num:(this.list)) {
			if ((num % 2) == 0) {
				
				evens++;
			}
		}
		return evens;
	}
	
	public int getOddOcurrences() {
		int odds = 0;
		for (int num:(this.list)) {
			if ((num % 2) != 0) {
				
				odds++;
			}
		}
		return odds;
	}
	
	public int getOcurrencesOf(int mult) {
		int mults = 0;
		for (int num:(this.list)) {
			System.out.print(((num % mult) == 0));
			System.out.print(num% mult);
			if ((num % mult) == 0) {
				
				mults++;
			}
		}
		return mults;
	}
}
