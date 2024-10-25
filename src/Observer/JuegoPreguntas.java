package Observer;

import java.util.ArrayList;
import java.util.List;

public class JuegoPreguntas {

	private List<Participante> participantes = new ArrayList<Participante>();
	private EstadoJuego estado = new EnLobby();

	public void enviarRespuestaDe(Participante participante, Pregunta pregunta, String respuesta) {
		this.getEstado().responder(participante, pregunta, respuesta, this);
	}

	public void finalizarEnviarRespuestaDe(Participante participante, Pregunta pregunta, String respuesta) {
		if (pregunta.esRespuestaCorrecta(respuesta)) {
			verificarRespuestaCorrecta(participante, pregunta);
		} else {
			participante.respuestaIncorrecta();
		}
	}

	private void verificarRespuestaCorrecta(Participante participante, Pregunta pregunta) {
		participante.respuestaCorrecta();
		notificarATodosCorrecta(participante, pregunta);
		if (participante.estáPorÚltimaPregunta()) {
			notificarFinConGanador(participante);
		}
	}

	public void notificarFinConGanador(Participante ganador) {
		for (Participante participante : this.getParticipantes()) {
			participante.mostrarGanador(ganador);
		}
		this.setEstado(new EnLobby());
	}

	public void notificarATodosCorrecta(Participante participCorrecto, Pregunta pregunta) {
		for (Participante participante : this.getParticipantes()) {
			participante.mostrarCorrecta(pregunta, participCorrecto);
		}

	}

	public void sumarParticipante(Participante participante) {
		this.getParticipantes().add(participante);

	}

	private List<Participante> getParticipantes() {
		return this.participantes;
	}

	public void iniciarPartida(List<Pregunta> preguntas) {
		for (Participante part : this.getParticipantes()) {
			part.comenzarPartida(preguntas);
		}
		this.setEstado(new EnCurso());
	}

	private void setEstado(EstadoJuego estado) {
		this.estado = estado;

	}

	public void empezar() {
		this.getEstado().empezar();

	}

	public EstadoJuego getEstado() {
		return this.estado;
	}

}
