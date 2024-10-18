package tpcomposite;

import java.util.Arrays;
import java.util.List;

public class Subdivisión extends PorciónProductiva {

	List<PorciónProductiva> porciones;

	public Subdivisión(PorciónProductiva porción1, PorciónProductiva porción2, PorciónProductiva porción3,
			PorciónProductiva porción4) {
		this.porciones = Arrays.asList(porción1, porción2, porción3, porción4);
	}

	@Override
	public float gananciaAnual() {
		return (float) porciones.stream().mapToDouble(PorciónProductiva::gananciaAnual).sum() / 4;
	}

}
