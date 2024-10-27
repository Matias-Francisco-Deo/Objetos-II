package parciales;

import java.util.ArrayList;
import java.util.List;

public class MinisterioDePlanificación {
	private List<Secretaría> secretarías;

	public MinisterioDePlanificación() {
		secretarías = new ArrayList<Secretaría>();
	}

	public float montoTotalAInvertir() {
		return (float) this.getSecretarías().stream().mapToDouble(secretaría -> secretaría.montoTotal()).sum();
	}

	private List<Secretaría> getSecretarías() {
		// TODO Auto-generated method stub
		return this.secretarías;
	}
}
