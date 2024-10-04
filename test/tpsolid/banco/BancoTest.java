package tpsolid.banco;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BancoTest {
	// Esto no rompe SOLID porque cada objeto tiene su función: el cliente es un
	// cliente (maneja el saldo de un cliente), el banco es un banco (registra
	// clientes y recibe solicitudes) y la
	// solicitud maneja la solicitud

	private Banco banco;
	private Object solicitud;

	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco(10000f);
		SolicitudDeCrédito solicitud = Mockito.mock(SolicitudDeCrédito.class);
		when(solicitud.realizarChequeo()).thenReturn(true);
		when(solicitud.getMontoTotal()).thenReturn(200f * 12f);
//		when(solicitud.getMontoMensual()).thenReturn(200f);
		banco.registrarCrédito(solicitud);
		banco.realizarCréditos();

	}

	@Test
	void test() {
		float saldoTotal = 200f * 12f;
		assertEquals(saldoTotal, banco.saldoADesembolsar(), 0.0001);
	}

}
