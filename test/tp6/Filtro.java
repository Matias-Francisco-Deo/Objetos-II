package tp6;

import java.util.ArrayList;
import java.util.List;

import tp7.WikipediaPage;

public abstract class Filtro {
	abstract public boolean sonSimilares(WikipediaPage page, WikipediaPage otherpage);
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipediaPages) {
		List<WikipediaPage> filteredPages = new ArrayList<WikipediaPage>();
		for (WikipediaPage pageToCompare : wikipediaPages) {
			if (this.sonSimilares(pageToCompare, page)) {
				filteredPages.add(pageToCompare);
			};
		}
		return filteredPages;
	}
}
