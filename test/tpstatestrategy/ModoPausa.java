package tpstatestrategy;

public class ModoPausa implements Modo {

	@Override
	public void play(Song canción, MP3 mp3) {
		throw new Error("No se puede");

	}

	@Override
	public void pause(MP3 mp3) {
		mp3.getCurrentSong().play();
		mp3.setModo(new ModoReproducción());
	}

	@Override
	public void stop(MP3 mp3) {
		mp3.getCurrentSong().stop();
		mp3.setModo(new ModoSelección());

	}

}
