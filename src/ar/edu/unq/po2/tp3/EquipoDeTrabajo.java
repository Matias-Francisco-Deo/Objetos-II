package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> personas;
	
	EquipoDeTrabajo(String nombre, List<Persona> personas ) {
		this.nombre = nombre;
		this.personas = personas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	public int getPromedioEdad() {
		int edades = 0;
		for (Persona persona:this.personas) {
			edades += persona.getEdad();
		}
		return edades / this.personas.size();
	}
	
}


