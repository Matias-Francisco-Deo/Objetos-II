package parciales;

import java.util.ArrayList;
import java.util.List;

public class SecretaríaDeInfraestructura {
	List<Planificación> planificaciones;

	public SecretaríaDeInfraestructura() {
		this.planificaciones = new ArrayList<Planificación>();
	}

	public float inversiónTotal() {
		return (float) planificaciones.stream().mapToDouble(plan -> plan.calcularInversiónTotal()).sum();
	}

	public void añadirPlanificación(Planificación planificación) {
		this.getPlanificaciones().add(planificación);
	}

	public List<Planificación> getPlanificaciones() {
		return planificaciones;
	}
}
