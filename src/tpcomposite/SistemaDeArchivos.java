package tpcomposite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SistemaDeArchivos implements FileSystem {

	List<Unidad> archivos = new ArrayList<Unidad>();

	@Override
	public int totalSize() {
		return archivos.stream().mapToInt(Unidad::getPeso).sum();
	}

	@Override
	public void printStructure() {
		System.out.print("SYSTEM \n");
		archivos.forEach(archivo -> archivo.printStructure(0));

	}

	@Override
	public Unidad lastModified() {
//		Stream<Unidad> todos = archivos.stream().flatMap(archivo -> archivo.contenido().stream());
//		List<Unidad> list = todos.toList();
//		Unidad unidad = todos.max(Comparator.comparing(Unidad::getFecha)).orElse(null);
//		return unidad;
		return archivos.stream().map(archivo -> archivo.lastModified()).max(Comparator.comparing(Unidad::getFecha))
				.orElse(null);
	}

	@Override
	public Unidad oldestElement() {
		// TODO Auto-generated method stub
		return archivos.stream().map(archivo -> archivo.lastModified()).min(Comparator.comparing(Unidad::getFecha))
				.orElse(null);
	}

	public void añadirArchivo(Unidad archivo) {
		archivos.add(archivo);

	}

}
