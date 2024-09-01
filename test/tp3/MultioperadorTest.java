package tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.tp3.Multioperador;

class MultioperadorTest {
	List<Integer> list;
	Multioperador m;
	int pepe;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new Multioperador();
		list = new ArrayList<Integer>(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	}

	@SuppressWarnings("unused")
	@Test
	void test() {
		int val = m.sumarTodos(list);
		int var = m.restarTodos(list);
		int re = m.multiplicarTodos(list);
		pepe = val + var + re;	
	}

}
