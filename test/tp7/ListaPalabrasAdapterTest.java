package tp7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaPalabrasAdapterTest {
	Ventana ventana;
	ListaDePalabrasOrdenadas lista;

	@BeforeEach
	void setUp() throws Exception {
		lista = new ListaDePalabrasOrdenadas();
		lista.agregarPalabra("the");
		lista.agregarPalabra("dog");
		lista.agregarPalabra("is");
		lista.agregarPalabra("the");
		lista.agregarPalabra("dogger");
		ListaDePalabrasOrdenadasAdapter adapter = new ListaDePalabrasOrdenadasAdapter(lista);
		ventana = new Ventana(adapter);
	}

	@Test
	void test() {

	}

}
