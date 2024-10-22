package Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferenciasYPublis {

	List<String> artículos = new ArrayList<String>();
	List<Miembro> miembros = new ArrayList<Miembro>();

	public void registrarInteresado(Miembro miembro) {
		miembros.add(miembro);
	}

	public void cargarArtículo(String título, List<String> asList, List<String> asList2, String string2, String string3,
			List<String> asList3) {
		artículos.add(título);
		for (Miembro miembro : miembros) {
			for (String títuloInterés : miembro.getTítulosInteresado()) {
				if (título == títuloInterés) {
					miembro.recibirMensajeDeAviso();
				}
			}
		}
	}

}
