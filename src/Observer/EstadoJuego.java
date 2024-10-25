package Observer;

public interface EstadoJuego {

	public void empezar();

	public void responder(Participante participante, Pregunta pregunta, String respuesta, JuegoPreguntas juego);

}
