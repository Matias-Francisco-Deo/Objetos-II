package tp5;

public abstract class Factura implements Pagable {
	private float precio;
	Factura(float precio){
		this.precio = precio;
	}
	public float getPrecio() {
		return precio;
	}
	@Override
	public void registrar(Caja caja) {
		caja.notificar(this);
	}
}
