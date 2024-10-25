package Observer;

public class EnCurso implements EstadoJuego {

	@Override
	public void empezar() {

	}

	@Override
	public void responder(Participante participante, Pregunta pregunta, String respuesta, JuegoPreguntas juego) {
		juego.finalizarEnviarRespuestaDe(participante, pregunta, respuesta);

	}

}
