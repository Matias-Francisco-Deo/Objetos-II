package Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferenciasYPublis {

	List<Artículo> artículos = new ArrayList<Artículo>();
	List<Miembro> miembros = new ArrayList<Miembro>();

	public void registrarInteresado(Miembro miembro) {
		miembros.add(miembro);
	}

	public void cargarArtículo(Artículo artículo) {
		artículos.add(artículo);
		for (Miembro miembro : miembros) {
			if (miembro.estáInteresadoEn(artículo)) {
				miembro.enviarMensajeDeAviso();
			}
		}
	}

}
