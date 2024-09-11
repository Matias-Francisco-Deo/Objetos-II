package tp4;

public class Producto {
	private String nombre;
	protected double precio;
	private boolean esParteDePC;
	
	Producto(String nombre, double precio, boolean esParteDePC){
		this.nombre = nombre;
		this.precio = precio;
		this.esParteDePC = esParteDePC;
	}
	
//	Producto(String nombre, double precio, boolean esParteDePC, int descuento){
//		this.nombre = nombre;
//		this.precio = precio*(descuento / 100);
//		this.esParteDePC = esParteDePC;
//	}
	
	Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esParteDePC = false;
	}
	
//	Producto(String nombre, double precio, int descuento) {
//		this.nombre = nombre;
//		this.precio = precio*(descuento / 100);
//		this.esParteDePC = false;
//	}
	
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public double setPrecio() {
		return precio;
	}
	public void aumentarPrecio(double d) {
		precio += d;
	}
	public boolean esPrecioCuidado() {
		return esParteDePC;
	}

	
}
