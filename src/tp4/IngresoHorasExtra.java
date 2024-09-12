package tp4;

public class IngresoHorasExtra extends Ingreso {
	private int cantHorasExtra;

	public IngresoHorasExtra(int mes, String concepto, float monto, int cantHorasExtra) {
		super(mes, concepto, monto);
		this.cantHorasExtra = cantHorasExtra;
	}
	
	@Override
	protected void agregarImpuestos() { //no agrego ninguno (preguntar si está bien)
		return;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}
	
}
