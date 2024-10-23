package Observer;

import java.util.ArrayList;
import java.util.List;

public class EventoDeporte {

	private Deporte deporte;
	private List<SuscriptorDeDeportes> suscriptores;

	public EventoDeporte(Deporte deporte) {
		this.setDeporte(deporte);
		suscriptores = new ArrayList<SuscriptorDeDeportes>();
	}

	public Deporte getDeporte() {
		return deporte;
	}

	private void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public void registrarSuscriptor(SuscriptorDeDeportes sus) {
		this.suscriptores.add(sus);

	}

	public void notificar(Partido partido) {
		this.suscriptores.forEach(sus -> sus.enviarPartido(partido));

	}

	public boolean esDelMismoDeporteQue(Deporte deporte) {

		return deporte.esMismoDeporte(deporte);
	}

}
