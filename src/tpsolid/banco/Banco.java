package tpsolid.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private float saldo;
	private List<Cliente> clientes;
	private List<SolicitudDeCrédito> solicitudesDeCrédito;

	Banco(float saldo) {
		this.saldo = saldo;
		solicitudesDeCrédito = new ArrayList<SolicitudDeCrédito>();
	}

	private void otorgarCrédito(SolicitudDeCrédito solicitud) {
		// dice "agregar nuevas sol de crédito", pero tipo, ya es bastante general, no?
		if (solicitud.realizarChequeo()) {
			// aprobado
			solicitud.enviarSaldo();
			this.saldo -= solicitud.getMontoMensual();
		}
	}

	public void registrarCrédito(SolicitudDeCrédito solicitud) {
		this.solicitudesDeCrédito.add(solicitud);
	}

	public void realizarCréditos() {
//		new ArrayList<>(this.solicitudesDeCrédito).forEach(sol -> otorgarCrédito(sol));
		// no me deja por modificar la lista mientras
		List<SolicitudDeCrédito> copia = new ArrayList<SolicitudDeCrédito>(this.solicitudesDeCrédito);
		for (SolicitudDeCrédito solicitud : copia) {
			if (solicitud.realizarChequeo()) {
				this.otorgarCrédito(solicitud);
			}
		}
	}

	public void afiliarCliente(Cliente cliente) {
		// relaciones recursivas nope
		clientes.add(cliente);
//		cliente.setBancoAfiliado(this);
	}

	public float saldoADesembolsar() {
		float saldo = 0;
		for (SolicitudDeCrédito solicitud : this.solicitudesDeCrédito) {
			if (solicitud.realizarChequeo()) {
				saldo += solicitud.getMontoTotal();
			}
		}
		return saldo;
	}

}
