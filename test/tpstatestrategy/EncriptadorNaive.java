package tpstatestrategy;

public class EncriptadorNaive {

	private Encriptador encriptador;

	public EncriptadorNaive(Encriptador encriptador) {
		this.setEncriptador(encriptador);
	}

	public void setEncriptador(Encriptador encriptador) {
		this.encriptador = encriptador;
	}

	public String encriptar(String string) {
		return this.encriptador.encriptar(string);
	}

	public String desencriptar(String string) {
		return this.encriptador.desencriptar(string);
	}

}
