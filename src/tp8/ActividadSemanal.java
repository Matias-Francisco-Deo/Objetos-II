package tp8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ActividadSemanal {
	private DíaDeLaSemana dia;
	private int horaInicio;
	private int duración;
	private Deporte deporte;

	public ActividadSemanal(Deporte deporte, DíaDeLaSemana dia, int duración, int horaInicio) {
		this.setDeporte(deporte);
		this.setDia(dia);
		this.setDuración(duración);
		this.setHoraInicio(horaInicio);
	}

	private Deporte getDeporte() {
		return deporte;
	}

	private void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	private int getHoraInicio() {
		return horaInicio;
	}

	private void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	private int getDuración() {
		return duración;
	}

	private void setDuración(int duración) {
		this.duración = duración;
	}

	private DíaDeLaSemana getDia() {
		return dia;
	}

	private void setDia(DíaDeLaSemana dia) {
		this.dia = dia;
	}

	public int getPrecio() {
		// no hay otra manera??? es muy feo con los if
		int precio = (this.dia == DíaDeLaSemana.Lunes || this.dia == DíaDeLaSemana.Martes
				|| this.dia == DíaDeLaSemana.Miércoles) ? 500 : 1000;
		return precio + (this.deporte.getComplejidad() * 200);
	}

	public List<ActividadSemanal> todasActsFútbol(List<ActividadSemanal> list) {
		Stream<ActividadSemanal> stream = list.stream();
		return stream.filter(act -> act.getDeporte() == Deporte.FUTBOL).toList();
	}

	public List<ActividadSemanal> todasDeComplejidad(List<ActividadSemanal> list, int complejidad) {
		Stream<ActividadSemanal> stream = list.stream();
		return stream.filter(act -> act.getDeporte().getComplejidad() == complejidad).toList();
	}

	public int horasTotales(List<ActividadSemanal> list) {
		Stream<ActividadSemanal> stream = list.stream();
		return stream.mapToInt(act -> act.duración).sum();
	}

	public ActividadSemanal horasTotales(List<ActividadSemanal> list, Deporte deporte) {
		Stream<ActividadSemanal> stream = list.stream();
		return stream.filter(act -> act.getDeporte() == deporte)
				.min(Comparator.comparingInt(ActividadSemanal::getDuración)).orElse(null);
	}
}
