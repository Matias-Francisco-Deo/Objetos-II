package Observer;

import java.util.List;

public class Participante {

	private String nombre;
	private JuegoPreguntas juego;
	private List<Pregunta> preguntas;
	private int posPreguntaActual;
	private int puntaje;

	public Participante(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void sumarse(JuegoPreguntas juego) {
		this.setJuego(juego);
	}

	public JuegoPreguntas getJuego() {
		return juego;
	}

	private void setJuego(JuegoPreguntas juego) {
		this.juego = juego;
	}

	public void comenzarPartida(List<Pregunta> preguntas) {
		this.setPreguntas(preguntas);
		this.setPosPreguntaActual(0);
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public int getPosPreguntaActual() {
		return posPreguntaActual;
	}

	private void setPosPreguntaActual(int posPreguntaActual) {
		this.posPreguntaActual = posPreguntaActual;
	}

	public Pregunta getPreguntaActual() {
		return this.getPreguntas().get(posPreguntaActual);
	}

	public void responderPregunta(Pregunta preguntaActual, String respuesta) {
		this.setPosPreguntaActual(posPreguntaActual + 1);
		this.getJuego().enviarRespuestaDe(this, respuesta);
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public void respuestaCorrecta() {
		this.setPuntaje(puntaje + 1);
	}

	public void respuestaIncorrecta() {

	}

	public void mostrarCorrecta(Pregunta pregunta, Participante participante) {
		System.out.print(pregunta.getPregunta() + " Respondida por: " + participante.getNombre());
	}

}
