package tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import tp7.MismaLetraInicial;
import tp7.Wikipedia;
import tp7.WikipediaPage;

class FilterTest {
	MismaLetraInicial filtro;
	WikipediaPage Bernal;
	WikipediaPage Quilmes;
	WikipediaPage BuenosAires;
	List<WikipediaPage> wikipediaPages;
	List<WikipediaPage> wikipediaPagesAnswer;

	@BeforeEach
	void setUp() throws Exception {
		filtro = new MismaLetraInicial();
		Bernal = Mockito.mock(WikipediaPage.class);
		Quilmes = Mockito.mock(WikipediaPage.class);
		BuenosAires = Mockito.mock(WikipediaPage.class);
		when(Bernal.getTitle()).thenReturn("Bernal");
		when(Quilmes.getTitle()).thenReturn("Quilmes");
		when(BuenosAires.getTitle()).thenReturn("Buenos Aires");
		
		Wikipedia wikipedia = Mockito.mock(Wikipedia.class);
		wikipediaPages = Arrays.asList(Bernal, Quilmes, BuenosAires);
		when(wikipedia.getPáginas()).thenReturn(wikipediaPages);
		
		wikipediaPagesAnswer = Arrays.asList(Bernal, BuenosAires); // lo puedo dejar en otro lugar?
	}

	@Test
	void testSonSimilares() {
		assertFalse(filtro.sonSimilares(Bernal, Quilmes));
		assertTrue(filtro.sonSimilares(Bernal, BuenosAires));
	}
	
	@Test
	void testGetSimilarPages() {
		assertEquals(filtro.getSimilarPages(Bernal, wikipediaPages), wikipediaPagesAnswer);
	}

}
