package tp8;

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

	public Deporte getDeporte() {
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

	public int getDuración() {
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

	@Override
	public String toString() {
		return String.format("Deporte: %s, Día: %s a las %d. Duración: %d hora(s)", this.deporte, this.dia,
				this.duración, this.horaInicio);
	}

}
