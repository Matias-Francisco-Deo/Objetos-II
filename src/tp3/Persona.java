package tp3;


import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	static public Persona crearPersona(String nombre, LocalDate fechaDeNacimiento) {
		return new Persona(nombre, fechaDeNacimiento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int getEdad() {
		LocalDate today = LocalDate.now();
		return today.getYear() - this.fechaDeNacimiento.getYear();
	}
	
	public boolean menorQue(Persona otraPersona) {
		return this.getEdad() < otraPersona.getEdad();
	}
	
}


/* 1- No lo conoce, ya que Persona oculta su implementación, se llama encapsulamiento.
 * 
 * 
 * 
 * 
 */
