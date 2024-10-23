package Observer;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EventoDeporteTest {

	private EventoDeporte ev;
	private SuscriptorDeDeportes sus;

	@BeforeEach
	void setUp() throws Exception {
		Deporte deporte1 = mock(Deporte.class);
		sus = mock(SuscriptorDeDeportes.class);
		ev = new EventoDeporte(deporte1);
		ev.registrarSuscriptor(sus);
	}

	@Test
	void testElSuscriptorSeEnteraAlNotificar() {
		Partido partido = mock(Partido.class);
		ev.notificar(partido);
		Mockito.verify(sus, Mockito.times(1)).enviarPartido(partido);

	}

}
