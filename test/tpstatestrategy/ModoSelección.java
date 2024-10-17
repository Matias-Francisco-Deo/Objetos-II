package tpstatestrategy;

public class ModoSelección implements Modo {

	@Override
	public void play(Song canción, MP3 mp3) {
		mp3.setModo(new ModoReproducción());
		mp3.setCurrentSong(canción);
		canción.play();
	}

	@Override
	public void pause(MP3 mp3) {
		throw new Error("No se puede");

	}

	@Override
	public void stop(MP3 mp3) {

	}

}
