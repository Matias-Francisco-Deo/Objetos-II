package claseIteradoresStreams;

import java.util.ArrayList;

public class PrefijosLista implements Comparable<String> {
	
	public ArrayList<String> nuevaListaPrefijos(ArrayList<String> lista, String prefijo) {
		
		for (String elem : lista) {
			if (!elem.startsWith(prefijo) ) {
				lista.remove(elem);
			};
		}
//		lista.stream().mapToDouble(lista).filter(null);
//		lista.stream().filter(prefijo);
		
		return lista;
	}

	@Override
	public int compareTo(String o) {
		return -1;
	}
}
