package tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp7.IteratorAdapter;

public class IteratorAdapterTest {
	private IteratorAdapter it;
	private ArrayList<String> names;

	@BeforeEach
	void setUp() throws Exception {
		names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Eve");
		it = new IteratorAdapter(names.iterator());
	}

	@Test
	void test() {
		int count = 0;
		while (it.hasMoreElements()) {
			count++;
			it.nextElement();
		}
		assertEquals(count, 5);
	}
}