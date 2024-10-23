package Observer;

public interface Miembro {
	public void enviarMensajeDeAviso();

	public Artículo getArtículoSuscripto();

	public boolean estáInteresadoEn(Artículo artículo);

	/*
	 * if (artículo.título == artículoSuscripto.título &&
	 * artículoSuscripto.autores.contains(artículo.autores)&& filiaciones &&
	 * tipoDeArtículo == && publicadoEn == && palabrasClave contains *
	 *
	 * para cada caso, es igual a eso o vacío -> art.título == artsus.título ||
	 * artsus.título == ""
	 */
}
