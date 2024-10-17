package tpstatestrategy;

public class MP3 {

	private Modo modo = new ModoSelección();
	private Song currentSong;

	public Modo getModo() {
		return this.modo;
	}

	public void play(Song canción) {
		modo.play(canción, this);
	}

	public void setModo(Modo modo) {
		this.modo = modo;

	}

	public void pause() {
		modo.pause(this);
	}

	public Song getCurrentSong() {
		return currentSong;
	}

	public void setCurrentSong(Song currentSong) {
		this.currentSong = currentSong;
	}

	public void stop() {
		modo.stop(this);

	}

}
