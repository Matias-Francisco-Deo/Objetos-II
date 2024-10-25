package Observer;

public class SuscriptorFiltroContincante {

	private SuscriptorDeContrincantes suscriptor;
	private String contrincante;

	public SuscriptorFiltroContincante(SuscriptorDeContrincantes suscriptor, String contrincante) {
		this.setSuscriptor(suscriptor);
		this.setContrincante(contrincante);
	}

	public void recibirPartido(Partido partido) {
		if (partido.getContrincantes().contains(this.getContrincante())) {
			this.getSuscriptor().enviarPartido(partido);
		}
	}

	public SuscriptorDeContrincantes getSuscriptor() {
		return suscriptor;
	}

	public void setSuscriptor(SuscriptorDeContrincantes suscriptor) {
		this.suscriptor = suscriptor;
	}

	public String getContrincante() {
		return contrincante;
	}

	public void setContrincante(String contrincante) {
		this.contrincante = contrincante;
	}

}
