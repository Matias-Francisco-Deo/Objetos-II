package tpsolid.banco;

public class SolicitudDeCréditoHipotecario extends SolicitudDeCrédito {

	private PropiedadInmobiliaria propiedadInmobiliaria;

	SolicitudDeCréditoHipotecario(Cliente cliente, float monto, int plazoMeses, PropiedadInmobiliaria propiedadInmobiliaria) {
		super(cliente, monto, plazoMeses);
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}

	@Override
	public boolean realizarChequeo() {
		boolean garantíaVálida = !(this.getMontoTotal() > this.propiedadInmobiliaria.getValor() * 0.7);
		boolean sueldoMensualVálido = !(this.getMontoMensual() > this.getCliente().getSueldoNeto() * 0.5 );
		boolean edadVálida = this.getCliente().getEdad() <= 65;
		return garantíaVálida && sueldoMensualVálido && edadVálida ;

	}

}
