package tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PorciónProductivaTest {

	private Subdivisión parcela;
	private Soja soja;
	private Trigo trigo;

	@BeforeEach
	void setUp() throws Exception {
		soja = new Soja();
		trigo = new Trigo();
//		parcela = new Subdivisión(soja, soja, soja, soja);
	}

	@Test
	void testSojaPura() {
		parcela = new Subdivisión(soja, soja, soja, soja);
		assertEquals(parcela.gananciaAnual(), 2000f);
	}

	@Test
	void testTrigoPuro() {
		parcela = new Subdivisión(trigo, trigo, trigo, trigo);
		assertEquals(parcela.gananciaAnual(), 1200f);
	}

	@Test
	void testMixto() {
		parcela = new Subdivisión(trigo, trigo, soja, soja);
		assertEquals(parcela.gananciaAnual(), 1600f);
	}

	@Test
	void testSubdivición() {
		Subdivisión subparcela = new Subdivisión(trigo, trigo, soja, soja);
		parcela = new Subdivisión(trigo, soja, soja, subparcela);
		assertEquals(parcela.gananciaAnual(), 1700f);
	}

//	@Test
//	void testSubdivición2() {
//		Subdivisión subparcela = new Subdivisión(trigo, trigo, soja, soja);
//		Subdivisión subparcela2 = new Subdivisión(subparcela, subparcela, subparcela, subparcela);
//		parcela = new Subdivisión(subparcela2, trigo, trigo, soja);
//		assertEquals(parcela.gananciaAnual(), 1700f);
//	}

}
