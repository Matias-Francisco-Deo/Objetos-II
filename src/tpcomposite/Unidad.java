package tpcomposite;

import java.time.LocalDate;

public interface Unidad {

	public int getPeso();

	public LocalDate getFecha();

	public Unidad lastModified();

	public Unidad oldestElement();

	public void printStructure(int depth);

}
