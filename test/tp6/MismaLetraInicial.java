package tp6;

public class MismaLetraInicial extends Filtro {

	public boolean sonSimilares(WikipediaPage page, WikipediaPage otherpage) {
		return page.getTitle().charAt(0) == otherpage.getTitle().charAt(0);
	}

	

}
