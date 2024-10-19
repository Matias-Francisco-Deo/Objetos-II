package tpcomposite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio implements Unidad {

	List<Unidad> archivos = new ArrayList<Unidad>();
	private String nombre;
	private LocalDate fechaDeCreación;

	public Directorio(String nombre) {
		this.setNombre(nombre);
		this.setFechaDeCreación(LocalDate.now());
	}

	public void añadirArchivo(Unidad archivo) {
		archivos.add(archivo);

	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeCreación() {
		return fechaDeCreación;
	}

	private void setFechaDeCreación(LocalDate fechaDeCreación) {
		this.fechaDeCreación = fechaDeCreación;
	}

	public List<Unidad> contenido() {
		return archivos;
	}

	@Override
	public int getPeso() {
		return contenido().stream().mapToInt(Unidad::getPeso).sum();
	}

	@Override
	public LocalDate getFecha() {
		// TODO Auto-generated method stub
		return this.fechaDeCreación;
	}

	@Override
	public Unidad lastModified() {
		// TODO Auto-generated method stub
		return archivos.stream().map(archivo -> archivo.lastModified()).max(Comparator.comparing(Unidad::getFecha))
				.orElse(null);
	}

	@Override
	public Unidad oldestElement() {
		// TODO Auto-generated method stub
		return archivos.stream().map(archivo -> archivo.oldestElement()).min(Comparator.comparing(Unidad::getFecha))
				.orElse(null);
	}

	@Override
	public void printStructure(int depth) {
		String spacing = "";
		int count = 0;
		while (count < depth) {
			spacing = "-" + spacing;
			count++;
		}
		System.out.print(spacing + "DIR " + this.nombre + "\n");
		archivos.forEach(archivo -> archivo.printStructure(depth + 1));

	}

}
