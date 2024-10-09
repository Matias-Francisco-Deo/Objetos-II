package tp9doubles;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class JugadasTest {

	private Jugada jugada1;
	private Jugada jugada2;
	private Jugada jugada3;
	private Jugada jugadaNada;

	@BeforeEach
	void setUp() throws Exception {
		Carta carta1 = Mockito.mock(Carta.class);
		Carta carta2 = Mockito.mock(Carta.class);
		Carta carta3 = Mockito.mock(Carta.class);
		Carta carta4 = Mockito.mock(Carta.class);
		when(carta1.getValor()).thenReturn(10);
		when(carta2.getValor()).thenReturn(10);
		when(carta3.getValor()).thenReturn(10);
		when(carta4.getValor()).thenReturn(10);

		Carta carta6 = Mockito.mock(Carta.class);
		Carta carta7 = Mockito.mock(Carta.class);
		Carta carta8 = Mockito.mock(Carta.class);
		Carta carta9 = Mockito.mock(Carta.class);
		Carta carta10 = Mockito.mock(Carta.class);
		when(carta6.getValor()).thenReturn(6);
		when(carta7.getValor()).thenReturn(7);
		when(carta8.getValor()).thenReturn(8);
		when(carta9.getValor()).thenReturn(10);
		when(carta10.getValor()).thenReturn(9);

		Carta carta11 = Mockito.mock(Carta.class);
		Carta carta12 = Mockito.mock(Carta.class);
		Carta carta13 = Mockito.mock(Carta.class);
		when(carta11.getValor()).thenReturn(10);
		when(carta12.getValor()).thenReturn(10);
		when(carta13.getValor()).thenReturn(10);

		jugada1 = new JugadaPóquer(carta1, carta2, carta3, carta4);
		jugada2 = new JugadaColor(carta6, carta7, carta8, carta9, carta10);
		jugada3 = new JugadaTrío(carta11, carta12, carta13);
		Jugada jugadaNada = new JugadaNada();
	}

	@Test
	void testNadaNuncaEsMayor() {
		assertFalse(jugadaNada.esMayorJugadaQue(jugada1));
		assertFalse(jugadaNada.esMayorJugadaQue(jugada2));
		assertFalse(jugadaNada.esMayorJugadaQue(jugada3));
	}

	@Test
	void testMayorJugada() {
		assertTrue(jugada1.esMayorJugadaQue(jugada2));
	}

	@Test
	void testMenorJugada() {
		assertFalse(jugada2.esMayorJugadaQue(jugada1));
	}

	@Test
	void testMenorJugadaTransitiva() {
		assertFalse(jugada3.esMayorJugadaQue(jugada1));
	}

	@Test
	void testPokerMásGrandeQuePóker() {
		Carta carta1 = Mockito.mock(Carta.class);
		Carta carta2 = Mockito.mock(Carta.class);
		Carta carta3 = Mockito.mock(Carta.class);
		Carta carta4 = Mockito.mock(Carta.class);
		when(carta1.getValor()).thenReturn(13);
		when(carta2.getValor()).thenReturn(13);
		when(carta3.getValor()).thenReturn(13);
		when(carta4.getValor()).thenReturn(13);
		JugadaPóquer jugada4 = new JugadaPóquer(carta1, carta2, carta3, carta4);
		assertTrue(jugada4.esMayorJugadaQue(jugada1));
	}

	@Test
	void testColorMásGrandeQueColor() {
		Carta carta1 = Mockito.mock(Carta.class);
		Carta carta2 = Mockito.mock(Carta.class);
		Carta carta3 = Mockito.mock(Carta.class);
		Carta carta4 = Mockito.mock(Carta.class);
		Carta carta5 = Mockito.mock(Carta.class);
		when(carta1.getValor()).thenReturn(9);
		when(carta2.getValor()).thenReturn(10);
		when(carta3.getValor()).thenReturn(11);
		when(carta4.getValor()).thenReturn(12);
		when(carta5.getValor()).thenReturn(13);
		JugadaColor jugada4 = new JugadaColor(carta1, carta2, carta3, carta4, carta5);
		assertTrue(jugada4.esMayorJugadaQue(jugada2));
	}

	@Test
	void testTríoMásGrandeQueTrío() {
		// setup
		Carta carta1 = Mockito.mock(Carta.class);
		Carta carta2 = Mockito.mock(Carta.class);
		Carta carta3 = Mockito.mock(Carta.class);
		when(carta1.getValor()).thenReturn(13);
		when(carta2.getValor()).thenReturn(13);
		when(carta3.getValor()).thenReturn(13);
		JugadaTrío jugada4 = new JugadaTrío(carta1, carta2, carta3);

		// exercise
		boolean esMayorJugadaQue = jugada4.esMayorJugadaQue(jugada1);

		// verify
		assertTrue(esMayorJugadaQue);
	}

}

//sólamente usé STUB para este modelo
