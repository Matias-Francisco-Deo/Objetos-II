package tpsolid.banco;

public class PropiedadInmobiliaria {
	
	private String descripción;
	private String dirección;
	private float valor;

	PropiedadInmobiliaria(String descripción, String dirección, float valor) {
		this.descripción = descripción;
		this.dirección = dirección;
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}
}
