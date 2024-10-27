package parciales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa extends Planificación {

	private float costoGestión;
	private List<Planificación> planificaciones;

	public Programa(String nombre, EmpleadoProyecto líder, float costoGestión) {
		super(nombre, líder);
		this.setCostoGestión(costoGestión);
		this.planificaciones = new ArrayList<Planificación>();
	}

	@Override
	public float calcularInversiónTotal() {
		return (float) this.getPlanificaciones().stream().mapToDouble(plan -> plan.calcularInversiónTotal()).sum()
				+ this.getCostoGestión();
	}

	@Override
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	public void añadirPlanificación(Planificación planificación) {
		this.getPlanificaciones().add(planificación);
		this.setFechaInicio(this.getPlanificaciones().stream().min(Comparator.comparing(Planificación::getFechaInicio))
				.orElse(null).getFechaInicio());
	}

	private List<Planificación> getPlanificaciones() {
		return this.planificaciones;
	}

	public float getCostoGestión() {
		return costoGestión;
	}

	public void setCostoGestión(float costoGestión) {
		this.costoGestión = costoGestión;
	}

}
