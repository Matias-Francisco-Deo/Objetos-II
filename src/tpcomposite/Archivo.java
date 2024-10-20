package tpcomposite;

import java.time.LocalDate;

public class Archivo implements Unidad {

	private String nombre;
	private int peso;
	private LocalDate fechaDeÚltimaModificación;

	public Archivo(String nombre, int peso) {
		this.setNombre(nombre);
		this.setPeso(peso);
		this.setFechaDeÚltimaModificación(LocalDate.now());
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	private void setPeso(int peso) {
		this.peso = peso;
	}

	public LocalDate getFechaDeÚltimaModificación() {
		return fechaDeÚltimaModificación;
	}

	private void setFechaDeÚltimaModificación(LocalDate fechaDeÚltimaModificación) {
		this.fechaDeÚltimaModificación = fechaDeÚltimaModificación;
	}

	public void cambiarNombre(String nuevoNombre) {
		setNombre(nuevoNombre);
		this.fechaDeÚltimaModificación = LocalDate.now();
	}

	@Override
	public LocalDate getFecha() {
		// TODO Auto-generated method stub
		return this.fechaDeÚltimaModificación;
	}

	@Override
	public Unidad lastModified() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Unidad oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void printStructure(int depth) {
		String spacing = "";
		int count = 0;
		while (count < depth) {
			spacing = "-" + spacing;
			count++;
		}
		System.out.print(spacing + this.nombre + "\n");

	}

}
