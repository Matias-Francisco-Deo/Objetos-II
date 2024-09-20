package tpsolid.banco;

public class SolicitudDeCréditoPersonal extends SolicitudDeCrédito {

	SolicitudDeCréditoPersonal(Cliente cliente, float monto, int plazoMeses) {
		super(cliente, monto, plazoMeses);
	}

	@Override
	public boolean realizarChequeo() {
		boolean sueldoAnualVálido = this.getCliente().getSueldoNetoAnual()>15000;
		boolean sueldoMensualVálido = !(this.getMontoMensual() > this.getCliente().getSueldoNeto() * 0.7 );
		return sueldoAnualVálido && sueldoMensualVálido;
	}

}
