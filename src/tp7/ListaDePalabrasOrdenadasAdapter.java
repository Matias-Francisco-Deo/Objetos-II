package tp7;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String> {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ListaDePalabrasOrdenadas lista;

	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas lista) {
		this.lista = lista;
		this.addElementsSorted();

	}

	public void addElementsSorted() {
		int count = 0;
		while (count < lista.cantidadDePalabras()) {
			super.addElement(lista.getPalabraDePosicion(count));
			count++;
		}
	}

	@Override
	public void addElement(String palabra) {
		lista.agregarPalabra(palabra);
		this.clear();
		this.addElementsSorted();
	}

}
