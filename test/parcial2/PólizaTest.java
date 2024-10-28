package parcial2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PólizaTest {
	Póliza póliza;
	private BonificationService bon;

	@BeforeEach
	void setUp() throws Exception {
		bon = mock(BonificationService.class);
		póliza = new Póliza(bon, "Pepito@mmail.com");

	}

	@Test
	void unaPólizaEsVigenteCuandoEstáCerradaYSePaga() {
		póliza.cerrarInventario();
		póliza.pagar();
		assertEquals(póliza.getEstado().getClass(), Vigente.class);
	}

	@Test
	void cargaDeBonificaciónSeAplicaEnUnaPólizaVigenteTest() {
		póliza.cerrarInventario();
		póliza.pagar();
		when(bon.códigoVálido(5000)).thenReturn(true);
		póliza.aplicarBonificación(5000);
		assertTrue(póliza.getGastosAdministrativos().isEmpty());
	}

}
