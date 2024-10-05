package tp8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretaríaDeDeportes {
	private List<ActividadSemanal> acts;

	public List<ActividadSemanal> todasActsFútbol() {
		Stream<ActividadSemanal> stream = acts.stream();
		return stream.filter(act -> act.getDeporte() == Deporte.FUTBOL).toList();
	}

	public List<ActividadSemanal> todasDeComplejidad(int complejidad) {
		Stream<ActividadSemanal> stream = acts.stream();
		return stream.filter(act -> act.getDeporte().getComplejidad() == complejidad).toList();
	}

	public int horasTotales() {
		Stream<ActividadSemanal> stream = acts.stream();
		return stream.mapToInt(act -> act.getDuración()).sum();
	}

	public ActividadSemanal actDeMenorCosto(Deporte deporte) {
		Stream<ActividadSemanal> stream = acts.stream();
		return stream.filter(act -> act.getDeporte() == deporte)
				.min(Comparator.comparingInt(ActividadSemanal::getDuración)).orElse(null);
	}

	public Map<Deporte, ActividadSemanal> deMenorCostoPorAct() {
		Stream<ActividadSemanal> stream = acts.stream();
		return stream.collect(Collectors.groupingBy(ActividadSemanal::getDeporte,
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(ActividadSemanal::getPrecio)),
						optional -> optional.orElse(null))));
	}

	public void setActs(List<ActividadSemanal> acts) {
		this.acts = acts;

	}

	public void imprimirActs() {
		System.out.print(this.acts.stream().map(act -> act.toString()).collect(Collectors.joining(", \n")));
		;
	}

}
