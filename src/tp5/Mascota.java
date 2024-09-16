package tp5;

public class Mascota implements Nombrado {
	private String nombre; 
	private String raza;
	
	Mascota(String nombre, String raza) {
		this.raza = raza;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	
}
