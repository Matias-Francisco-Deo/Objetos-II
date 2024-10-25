package Observer;

public class EnLobby implements EstadoJuego {

	@Override
	public void empezar() {
		throw new AcciónInválida("No se puede iniciar hasta que el juego indique.");
	}

	@Override
	public void responder(Participante participante, Pregunta pregunta, String respuesta, JuegoPreguntas juego) {
		throw new AcciónInválida("No se puede jugar hasta que el juego indique.");

	}

}
