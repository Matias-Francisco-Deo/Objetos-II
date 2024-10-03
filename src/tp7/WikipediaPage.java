package tp7;
import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	String getTitle();
	List<WikipediaPage> getLinks();
	Map<String, WikipediaPage> getInfobox();	
}
