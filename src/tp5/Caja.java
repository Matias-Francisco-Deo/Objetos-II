package tp5;

import java.util.List;

public class Caja {
	private int total = 0;
	private Agencia agencia;
	
	Caja(Agencia agencia){
		this.agencia = agencia;
	}
	
	public void registrarProductosCliente(List<Pagable> pagables) {
		for (Pagable pag : pagables) {
			total += pag.getPrecioTotal();
			pag.registrar(this);
		}
	}
	public float getTotal() {
		return total;
	}
	public void notificar(Factura factura) {
		agencia.registrarPago(factura);
	}
}
