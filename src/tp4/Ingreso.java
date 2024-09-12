package tp4;

import java.util.ArrayList;
import java.util.List;

public class Ingreso {
	private int mes;
	private String concepto;
	private float monto;
	private List<ImpuestoAlTrabajador> impuestos = new ArrayList<ImpuestoAlTrabajador>();

	public Ingreso(int mes, String concepto, float monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
		this.agregarImpuestos();
//		this.impuestos.add(new ImpuestoAlTrabajador());
	}

	protected void agregarImpuestos() {
		impuestos.add(new ImpuestoAlTrabajador());
		
	}

	public int getImpuestoTotal() {
		int valor = 0; 
		for (ImpuestoAlTrabajador imp : impuestos) {
			valor += monto * imp.getValor() / 100;
		};
		return valor;
	}
	
	public float getMontoImponible() {
		return monto - getImpuestoTotal();
	}
	
	public float getMonto() {
		return monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public int getMes() {
		return mes;
	}


}
