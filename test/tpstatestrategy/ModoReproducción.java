package tpstatestrategy;

public class ModoReproducción implements Modo {

	@Override
	public void play(Song canción, MP3 mp3) {
		throw new Error("No se puede");

	}

	@Override
	public void pause(MP3 mp3) {
		mp3.getCurrentSong().pause();
		mp3.setModo(new ModoPausa());
	}

	@Override
	public void stop(MP3 mp3) {
		mp3.getCurrentSong().stop();
		mp3.setModo(new ModoSelección());

	}

}
