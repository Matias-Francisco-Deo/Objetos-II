package tpsolid.banco;

import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dirección;
	private int edad;
	private float sueldoNeto;
	private float saldo;
	private List<SolicitudDeCrédito> solicitudes;
	private List<PropiedadInmobiliaria> propiedades;
	private Banco bancoAfiliado;
	
	
	Cliente(String nombre, String apellido, String dirección, int edad, float sueldoNeto, float saldo, List<PropiedadInmobiliaria> propiedades, Banco bancoAfiliado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
		this.saldo = saldo;
		this.bancoAfiliado = bancoAfiliado;
		this.propiedades = propiedades;
	}
	
	public float getSueldoNetoAnual() {
		return sueldoNeto * 12;
	}
	
	public void solicitarCréditoHipotecario(float monto, int plazoMeses, PropiedadInmobiliaria propiedad) {
		SolicitudDeCrédito crédito = new SolicitudDeCréditoHipotecario(this, monto, plazoMeses, propiedad);
		bancoAfiliado.otorgarCrédito(crédito);
	}
	
	public void solicitarCréditoPersonal(float monto, int plazoMeses) {
		SolicitudDeCrédito crédito = new SolicitudDeCréditoPersonal(this, monto, plazoMeses);
		bancoAfiliado.otorgarCrédito(crédito);
	}

	public float getSueldoNeto() {
		return sueldoNeto;
	}

	public int getEdad() {
		return edad;
	}

	public void enviarSaldo(float saldo) {
		this.saldo += saldo;
	}

	
	
}
