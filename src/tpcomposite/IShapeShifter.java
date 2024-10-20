package tpcomposite;

import java.util.List;

public interface IShapeShifter {
	public IShapeShifter compose(IShapeShifter shapeShifter);

	public int deepest();

	public IShapeShifter flat();

	public List<Integer> values();

	public List<IShapeShifter> getSs();

	public int getValue();
}
