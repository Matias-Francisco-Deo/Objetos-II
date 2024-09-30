package tp6;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration<String> {
	private Iterator<String> it;

	IteratorAdapter(Iterator<String> iterator) {
		this.it = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return it.hasNext();
	}

	@Override
	public String nextElement() {
		return it.next();
	}
}
