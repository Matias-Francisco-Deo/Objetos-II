package tpstatestrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MP3Test {

	private MP3 mp3;

	@BeforeEach
	void setUp() throws Exception {
		mp3 = new MP3();
	}

	@Test
	void testCuandoSeIniciaEstáEnModoSelección() {
		assertEquals(mp3.getModo().getClass(), ModoSelección.class);
	}

	@Test
	void testDeSelecciónAReproducción() {
		Song canción = mock(Song.class);
		mp3.play(canción);
		assertEquals(mp3.getModo().getClass(), ModoReproducción.class);
	}

	@Test
	void testPausarLlevaAModoPausa() {
		Song canción = mock(Song.class);
		mp3.play(canción);
		mp3.pause();
		assertEquals(mp3.getModo().getClass(), ModoPausa.class);
	}

	@Test
	void testPausarDeNuevoLlevaAModoReproducción() {
		Song canción = mock(Song.class);
		mp3.play(canción);
		mp3.pause();
		mp3.pause();
		assertEquals(mp3.getModo().getClass(), ModoReproducción.class);
	}

	@Test
	void testStopVuelveAlModoSelección() {
		Song canción = mock(Song.class);
		mp3.play(canción);
		mp3.pause();
		mp3.pause();
		mp3.stop();
		assertEquals(mp3.getModo().getClass(), ModoSelección.class);
	}

}
