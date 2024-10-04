package tpsolid.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dirección;
	private int edad;
	private float sueldoNeto;
	private float saldo;
	private List<SolicitudDeCrédito> solicitudes = new ArrayList<SolicitudDeCrédito>();
	private List<PropiedadInmobiliaria> propiedades;
//	private Banco bancoAfiliado;

	Cliente(String nombre, String apellido, String dirección, int edad, float sueldoNeto, float saldo,
			List<PropiedadInmobiliaria> propiedades) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
		this.saldo = saldo;
		this.propiedades = propiedades;
	}

	public float getSueldoNetoAnual() {
		return sueldoNeto * 12;
	}

//	public void solicitarCrédito(SolicitudDeCrédito solicitud) {
//
//		bancoAfiliado.otorgarCrédito(solicitud);
//		solicitudes.add(solicitud);
//	}

	public float getSueldoNeto() {
		return sueldoNeto;
	}

	public int getEdad() {
		return edad;
	}

	public void recibirSaldo(float saldo) {
		this.saldo += saldo;
	}

}
