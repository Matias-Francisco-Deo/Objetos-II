package tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	public void recibirIngreso(int mes, String concepto, float monto) {
		ingresos.add(new Ingreso(mes, concepto, monto));
	}
	
	public void recibirIngresoHorasExtra(int mes, String concepto, float monto, int horas) {
		ingresos.add(new IngresoHorasExtra(mes, concepto, monto, horas));
	}

	public float getMontoImponible() {
		int valor = 0; 
		for (Ingreso ing : ingresos) {
			valor += ing.getMontoImponible();
		}
		return valor;
	}

	public float getTotalPercibido() {
		int valor = 0; 
		for (Ingreso ing : ingresos) {
			valor += ing.getMonto();
		}
		return valor;
	}

	public float getImpuestoAPagar() {
		int valor = 0; 
		for (Ingreso ing : ingresos) {
			valor += ing.getImpuestoTotal();
		}
		return valor;
	}

}
