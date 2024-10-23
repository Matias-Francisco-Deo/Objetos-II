package Observer;

import java.util.List;

public interface Artículo {
	public String getTítulo();

	public List<String> getAutores();

	public List<String> getFiliaciones();

	public String getTipoDeArtículo();

	public String getPublicadoEn();

	public List<String> getPalabrasClave();
}
