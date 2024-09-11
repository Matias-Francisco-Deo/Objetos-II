package tp4;

public class ProductoPrimeraNecesidad extends Producto {
//	ProductoPrimeraNecesidad(String nombre, double precio, boolean esParteDePC) {
//		super(nombre, precio, esParteDePC);
//	}
//	
//	ProductoPrimeraNecesidad(String nombre, double precio) {
//		super(nombre, precio);
//	}
	
	ProductoPrimeraNecesidad(String nombre, double precio, int descuento) {
		super(nombre, precio*descuento / 100);
	}
	
	ProductoPrimeraNecesidad(String nombre, double precio, boolean esParteDePC, int descuento){
		super(nombre, precio*descuento / 100, esParteDePC);
	}
	
	
	public double getPrecio() {
		return this.precio; // está bien ponerlo acá?
	}
}
