package Observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SuscriptorFiltroContrincanteTest {

	private SuscriptorFiltroContincante susFiltro;
	private SuscriptorDeContrincantes sus;
	private Partido partido;

	@BeforeEach
	void setUp() throws Exception {
		partido = mock(Partido.class);
		sus = mock(SuscriptorDeContrincantes.class);
		susFiltro = new SuscriptorFiltroContincante(sus, "Juanito");

	}

	@Test
	void testCuandoElPartidoEsDelContrincanteEspecíficoElFiltroAvisaAlSuscriptor() {
		when(partido.getContrincantes()).thenReturn(Arrays.asList("Juanito", "Pepe", "Francisco"));
		susFiltro.recibirPartido(partido);
		Mockito.verify(sus, Mockito.times(1)).enviarPartido(partido);
	}

}
