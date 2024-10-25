package Observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AplicaciónDistributivaTest {

	private AplicaciónDistributiva app;
	private Partido partido;

	@BeforeEach
	void setUp() throws Exception {
		app = new AplicaciónDistributiva();
		partido = mock(Partido.class);
//		sus = mock(SuscriptorDeDeportes.class);
//		app.registrarSuscriptorDeDeportes(sus, Arrays.asList(deporte1));
	}

	@Test
	void testAlIngresarUnPartidoDelDeporteElEventoSeEntera() {
		EventoDeporte evt = mock(EventoDeporte.class);
		Deporte deporte1 = mock(Deporte.class);
		when(evt.esDelMismoDeporteQue(deporte1)).thenReturn(true);
		app.registrarNuevoDeporte(evt);

		when(partido.getDeporte()).thenReturn(deporte1);
		app.ingresarPartido(partido);
		Mockito.verify(evt, Mockito.times(1)).notificar(partido);
		;
	}

	@Test
	void testAlIngresarUnPartidoDelContrincanteElFiltroSeEntera() {
		SuscriptorFiltroContincante sus = mock(SuscriptorFiltroContincante.class);
		app.registrarSuscriptorDeContrincantes(sus);
		app.ingresarPartido(partido);
		Mockito.verify(sus, Mockito.times(1)).recibirPartido(partido);
		;
	}

}
