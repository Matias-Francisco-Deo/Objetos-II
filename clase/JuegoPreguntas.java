package Observer;

public class JuegoPreguntas {

	private List<Participante> participantes;

	public void enviarRespuestaDe(Participante participante, Pregunta pregunta, String respuesta) {
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

	private void notificarFinConGanador(Participante ganador) {
		for (Participante participante : this.getParticipantes()) {
			participante.mostrarGanador(ganador);
		}
	}

	private void notificarATodosCorrecta(Participante participCorrecto, Pregunta pregunta) {
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

}
