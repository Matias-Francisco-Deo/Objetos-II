package tp7;

public class Main {
	static Ventana ventana;
	static ListaDePalabrasOrdenadas lista;

	public static void main(String[] args) {
		lista = new ListaDePalabrasOrdenadas();
		lista.agregarPalabra("the");
		lista.agregarPalabra("dog");
		lista.agregarPalabra("is");
		lista.agregarPalabra("the");
		lista.agregarPalabra("dogger");
		ListaDePalabrasOrdenadasAdapter adapter = new ListaDePalabrasOrdenadasAdapter(lista);
		ventana = new Ventana(adapter);
	}

}
