package Observer;

public class Pregunta {

	private String pregunta;
	private String respuesta;

	public Pregunta(String pregunta, String respuesta) {
		this.setPregunta(pregunta);
		this.setRespuesta(respuesta);
	}

	public String getPregunta() {
		return pregunta;
	}

	private void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	private void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public boolean esRespuestaCorrecta(String respuesta) {
		// TODO Auto-generated method stub
		return this.getRespuesta() == respuesta;
	}

}
