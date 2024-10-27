package parciales;

import java.time.LocalDate;

public abstract class Planificación {

	private String nombre;
	protected LocalDate fechaInicio;
	private EmpleadoProyecto líder;

	public Planificación(String nombre, EmpleadoProyecto líder) {
		this.setNombre(nombre);
		this.setLíder(líder);
	}

	public abstract float calcularInversiónTotal();

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public EmpleadoProyecto getLíder() {
		return líder;
	}

	private void setLíder(EmpleadoProyecto líder) {
		this.líder = líder;
	}

}
