package Observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
		sistema.registrarInteresado(miembro1);

	}

	@Test
	void testSistemaRecibeNotificaciónDelInterésDelMiembro() {
		Artículo artículo = mock(Artículo.class);
		when(miembro1.estáInteresadoEn(artículo)).thenReturn(true);
		sistema.cargarArtículo(artículo);
		Mockito.verify(miembro1, Mockito.times(1)).enviarMensajeDeAviso();
	}

	@Test
	void testMiembroNoRecibeNotifSiNoLeInteresa() {
		Artículo artículo = mock(Artículo.class);
		when(miembro1.estáInteresadoEn(artículo)).thenReturn(false);
		sistema.cargarArtículo(artículo);
		Mockito.verify(miembro1, Mockito.times(0)).enviarMensajeDeAviso();
	}

}
