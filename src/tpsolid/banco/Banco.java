package tpsolid.banco;

import java.util.List;

public class Banco {
	private float saldo;
	private List<Cliente> clientes;
	
	Banco(float saldo) {
		this.saldo = saldo;
	}
	
	public void otorgarCrédito(SolicitudDeCrédito solicitud) {
		if (solicitud.realizarChequeo()) {
			//aprobado
			solicitud.enviarSaldo();
			this.saldo -= solicitud.getMontoMensual();
		}
	}
	
	public void afiliarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
