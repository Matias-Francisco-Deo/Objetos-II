package tp8;

public enum LesiónDermatológica {

	Rojo("Sangrante", 10), Gris("Mejorando", 7), Amarillo("Ya casi", 4), Miel("Recuperada", 2);

	private String descripción;
	private int riesgo;

	LesiónDermatológica(String descripción, int i) {
		this.setDescripción(descripción);
		this.setRiesgo(i);
	}

	public LesiónDermatológica darSig() {
		LesiónDermatológica sig = LesiónDermatológica.values()[(this.ordinal() + 1)
				% (LesiónDermatológica.values().length)];
		return sig;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public int getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}
}
