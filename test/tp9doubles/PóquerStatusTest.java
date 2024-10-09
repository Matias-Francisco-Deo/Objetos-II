package tp9doubles;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PóquerStatusTest {
	PóquerStatus ps;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		// setup
		ps = new PóquerStatus();
		carta1 = Mockito.mock(Carta.class);
		carta2 = Mockito.mock(Carta.class);
		carta3 = Mockito.mock(Carta.class);
		carta4 = Mockito.mock(Carta.class);
		carta5 = Mockito.mock(Carta.class);

	}

	@Test
	void testVerificarEsPóquer() {
		// Exercise
//		Carta carta1 = new Carta("10", "P");
//		Carta carta2 = new Carta("10", "C");
//		Carta carta3 = new Carta("10", "D");
//		Carta carta4 = new Carta("10", "T");
//		Carta carta5 = new Carta("1", "T");
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(5);
		Jugada jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertTrue(jugada.esPoker());
	}

	@Test
	void testVerificarEsTrío() {
		// Exercise
//		Carta carta1 = new Carta("10", "P");
//		Carta carta2 = new Carta("10", "C");
//		Carta carta3 = new Carta("10", "D");
//		Carta carta4 = new Carta("2", "T");
//		Carta carta5 = new Carta("1", "T");

		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(3);
		when(carta5.getValor()).thenReturn(5);
		Jugada jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertTrue(jugada.esTrío());
	}

	@Test
	void testVerificarEsColor() {
		// Exercise
//		Carta carta1 = new Carta("10", "P");
//		Carta carta2 = new Carta("2", "P");
//		Carta carta3 = new Carta("3", "P");
//		Carta carta4 = new Carta("5", "P");
//		Carta carta5 = new Carta("10", "P");
		when(carta1.esMismoPalo(carta1)).thenReturn(true);
		when(carta2.esMismoPalo(carta1)).thenReturn(true);
		when(carta3.esMismoPalo(carta1)).thenReturn(true);
		when(carta4.esMismoPalo(carta1)).thenReturn(true);
		when(carta5.esMismoPalo(carta1)).thenReturn(true);
		// está bien esto? capaz tenía que cambiar el getPalo
		Jugada jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertTrue(jugada.esColor());
	}

	@Test
	void testVerificarEsNada() {

		// Exercise
//		Carta carta1 = new Carta("10", "P");
//		Carta carta2 = new Carta("2", "C");
//		Carta carta3 = new Carta("10", "D");
//		Carta carta4 = new Carta("2", "T");
//		Carta carta5 = new Carta("1", "T");
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(6);
		when(carta3.getValor()).thenReturn(2);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(5);
		Jugada jugada = ps.verificar(carta1, carta2, carta3, carta4, carta5);

		// verify
		assertTrue(jugada.esNada());
	}

	// no hay código para limpiar

}

// 1 con .thenReturn.thenReturn
// 2 no sé  ????????
// 3 devolviendo un mock con el método de otro mock, que a su vez tiene otro método mock
// 4 la verificación con mockito se hace con verify y la cantidad de veces que se hace la llamada
