package tp5;

import java.time.LocalDate;

public class Persona implements Nombrado {
	private String nombre; 
	private LocalDate fechaDeNacimiento;
	
	Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		return fechaDeNacimiento.getYear() - LocalDate.now().getYear();
	}
	
	public boolean menorQue(Persona otraPersona) {
		return this.edad() < otraPersona.edad();
	}

}
