package Observer;

import java.util.ArrayList;
import java.util.List;

public class AplicaciónDistributiva {

	private List<EventoDeporte> eventosDeporte = new ArrayList<EventoDeporte>();

	public void registrarNuevoDeporte(EventoDeporte evt) {
		this.eventosDeporte.add(evt);

	}

	public void registrarSuscriptorDeDeportes(SuscriptorDeDeportes sus, List<Deporte> list) {

	}

	public void ingresarPartido(Partido partido) {
		for (EventoDeporte evt : eventosDeporte) {
			if (evt.esDelMismoDeporteQue(partido.getDeporte())) {
				evt.notificar(partido);
			}
		}

	}

}
