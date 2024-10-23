package Observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AplicaciónDistributivaTest {

	private AplicaciónDistributiva app;
	private SuscriptorDeDeportes sus;
	private EventoDeporte evt;
	private Deporte deporte1;

	@BeforeEach
	void setUp() throws Exception {
		app = new AplicaciónDistributiva();
		evt = mock(EventoDeporte.class);
		deporte1 = mock(Deporte.class);
		when(evt.esDelMismoDeporteQue(deporte1)).thenReturn(true);
		app.registrarNuevoDeporte(evt);
//		sus = mock(SuscriptorDeDeportes.class);
//		app.registrarSuscriptorDeDeportes(sus, Arrays.asList(deporte1));
	}

	@Test
	void testAlIngresarUnPartidoDelDeporteElEventoSeEntera() {
		Partido partido = mock(Partido.class);
		when(partido.getDeporte()).thenReturn(deporte1);
		app.ingresarPartido(partido);
		Mockito.verify(evt, Mockito.times(1)).notificar(partido);
		;
	}

}
