package Observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SistemaDeReferenciaTest {

	private SistemaDeReferenciasYPublis sistema;
	private Miembro miembro1;

	@BeforeEach
	void setUp() throws Exception {
		sistema = new SistemaDeReferenciasYPublis();
		miembro1 = mock(Miembro.class);
		when(miembro1.getTítulosInteresado()).thenReturn(Arrays.asList("World Of Warcraft"));
//		sistema.cargarArtículo("World Of Warcraft", Arrays.asList("Pepe"), Arrays.asList("Labo", "Uni", "Oficina"),
//				"Investigativo", "Sardegna", Arrays.asList("Juegos, Gaming, Jóven"));
		sistema.registrarInteresado(miembro1);

	}

	@Test
	void testSistemaRecibeNotificaciónDelInterésDelMiembro() {
		sistema.cargarArtículo("World Of Warcraft", Arrays.asList("Pepe"), Arrays.asList("Labo", "Uni", "Oficina"),
				"Investigativo", "Sardegna", Arrays.asList("Juegos, Gaming, Jóven"));
		Mockito.verify(miembro1, Mockito.times(1)).recibirMensajeDeAviso();
	}

	@Test
	void testMiembroNoRecibeNotifSiNoLeInteresa() {
		sistema.cargarArtículo("World Of Starcraft", Arrays.asList("Pepe"), Arrays.asList("Labo", "Uni", "Oficina"),
				"Investigativo", "Sardegna", Arrays.asList("Juegos, Gaming, Jóven"));
		Mockito.verify(miembro1, Mockito.times(0)).recibirMensajeDeAviso();
	}

}
