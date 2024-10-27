package parciales;

import java.time.LocalDate;
import java.util.List;

public class Proyecto extends Planificación {

	private int duración;

	private List<EmpleadoProyecto> empleados;

	public Proyecto(String nombre, EmpleadoProyecto líder, LocalDate fechaInicio, int duración) {
		super(nombre, líder);
		this.setFechaInicio(fechaInicio);
		this.setDuración(duración);
	}

	@Override
	public float calcularInversiónTotal() {
		return (float) this.getEmpleados().stream().mapToDouble(empl -> empl.sueldoDiario()).sum() + getSueldoLíder();
	}

	@Override
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	private float getSueldoLíder() {
		return this.getLíder().sueldoDiario() * 1.3f;
	}

	public void añadirEmpleado(EmpleadoProyecto empleado) {
		this.getEmpleados().add(empleado);
	}

	public List<EmpleadoProyecto> getEmpleados() {
		return this.empleados;
	}

	public void setDuración(int duración) {
		this.duración = duración;
	}

}
