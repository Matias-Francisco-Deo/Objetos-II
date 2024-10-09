package tp9doubles;

public class Carta {

	private int valor;
	private String palo;

	public Carta(String valor, String palo) {

		this.setPalo(palo);
		switch (valor) {
		case "1":
			this.setValor(13);
			break;
		case "J":
			this.setValor(11);
			break;
		case "Q":
			this.setValor(12);
			break;
		case "K":
			this.setValor(13);
			break;
		default:
			this.setValor(Integer.parseInt(valor));
			break;
		}

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public boolean esSuperior(Carta otraCarta) {
		return this.valor > otraCarta.valor;
	}

	public boolean esMismoPalo(Carta otraCarta) {
		return this.palo == otraCarta.palo;
	}

}
