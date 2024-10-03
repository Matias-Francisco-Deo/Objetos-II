package tp8;

public enum Deporte {
	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(3), JABALINA(4);

	private int complejidad;

	Deporte(int i) {
		this.setComplejidad(i);
	}

	public int getComplejidad() {
		return complejidad;
	}

	private void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
}
