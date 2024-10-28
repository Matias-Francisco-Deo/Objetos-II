package parcial2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Póliza {
	private BonificationService sistemaDeBonificaciones;
	private EstadoPóliza estado;
	private List<ÍtemPóliza> ítems;
	private ArrayList<GastoAdministrativo> gastosAdministrativos;
	private String mailTitular;

	public Póliza(BonificationService sistemaDeBonificaciones, String mailTitular) {
		this.setSistemaDeBonificaciones(sistemaDeBonificaciones);
		this.setEstado(new Abierto());
		this.setÍtems(new ArrayList<ÍtemPóliza>());
		this.setGastosAdministrativos(new ArrayList<GastoAdministrativo>());
		this.setMailTitular(mailTitular);
	}

	public BonificationService getSistemaDeBonificaciones() {
		return sistemaDeBonificaciones;
	}

	public void setSistemaDeBonificaciones(BonificationService sistemaDeBonificaciones) {
		this.sistemaDeBonificaciones = sistemaDeBonificaciones;
	}

	public void aplicarBonificación(int código) {
		if (this.getSistemaDeBonificaciones().códigoVálido(código)) {
			this.getEstado().aplicarDescuento(this);
			this.getSistemaDeBonificaciones().anularCódigo(código);
			this.getSistemaDeBonificaciones().notificarTitular(this.getMailTitular(), código);
		}
	}

	public EstadoPóliza getEstado() {
		return estado;
	}

	public void setEstado(EstadoPóliza estado) {
		this.estado = estado;
	}

	public void cerrarInventario() {
		this.getEstado().cerrarInventario(this);
	}

	public void cancelar() {
		this.getEstado().cancelar(this);
	}

	public void pagar() {
		this.getEstado().pagar(this);
	}

	public void finalizarAgregarÍtem(ÍtemPóliza ítem) {
		this.getÍtems().add(ítem);
	}

	public void añadirÍtem(ÍtemPóliza ítem) {
		this.getEstado().agregarÍtem(this, ítem);
	}

	public List<ÍtemPóliza> getÍtems() {
		return ítems;
	}

	private void setÍtems(List<ÍtemPóliza> ítems) {
		this.ítems = ítems;
	}

	public ArrayList<GastoAdministrativo> getGastosAdministrativos() {
		return gastosAdministrativos;
	}

	public void setGastosAdministrativos(ArrayList<GastoAdministrativo> gastosAdministrativos) {
		this.gastosAdministrativos = gastosAdministrativos;
	}

	public void añadirGastoAdministrativo(GastoAdministrativo gasto) {
		this.getGastosAdministrativos().add(gasto);
	}

	public float precioMensual() {
		return (float) (this.montoAsegurado() * 0.075
				+ this.getGastosAdministrativos().stream().mapToDouble(gasto -> gasto.getMonto()).sum());
	}

	public float montoAsegurado() {

		return (float) this.getÍtems().stream().mapToDouble(item -> item.getValorTotal()).sum();
	}

	public void eliminarGastosAdministrativos() {
		this.gastosAdministrativos.clear();
	}

	public void recargoPorExtensión(ÍtemPóliza ítem) {
		this.añadirGastoAdministrativo(new GastoAdministrativo("Recargo por extensión", ítem.getValorTotal() * 0.03f));

	}

	public String getMailTitular() {
		return mailTitular;
	}

	public void setMailTitular(String mailTitular) {
		this.mailTitular = mailTitular;
	}

	public void agregarBonificaciónAdministrativa() {
		this.añadirGastoAdministrativo(new GastoAdministrativo("Bonificación Administrativa", -500));

	}

	public void eliminarGastoAdministrativoDeMayorValor() {
		GastoAdministrativo max = this.getGastosAdministrativos().stream()
				.max(Comparator.comparing(GastoAdministrativo::getMonto)).orElseThrow();
		this.getGastosAdministrativos().remove(max);

	}

}
