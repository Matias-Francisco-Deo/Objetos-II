package tpcomposite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShapeShifter implements IShapeShifter {

	List<IShapeShifter> shapeShifters;
	int val;

	public ShapeShifter(List<IShapeShifter> shapeShifters, int val) {
		this.shapeShifters = shapeShifters;
		this.val = val;
	}

	public ShapeShifter(int val) {
		shapeShifters = new ArrayList<IShapeShifter>();
		this.val = val;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		shapeShifters.add(shapeShifter);
		return this;
	}

	@Override
	public int deepest() {
		return 1 + shapeShifters.stream().map(ss -> ss.deepest()).max(Comparator.naturalOrder()).orElse(0);
	}

	@Override
	public IShapeShifter flat() {
		if (this.deepest() >= 1) {
			shapeShifters.forEach(ss -> ss.flat());
			shapeShifters = this.shapeShifters.stream().flatMap(ss -> ss.getSs().stream()).collect(Collectors.toList());
			return new ShapeShifter(shapeShifters, this.val);
		}
		return this;
	}

	@Override
	public List<Integer> values() {
//		List<Integer> stream = Stream.concat(this.shapeShifters.stream().map(ss -> ss.getValue()),
//				this.shapeShifters.stream().flatMap(ss -> ss.values().stream())).collect(Collectors.toList());

//		stream.add(val);
		Stream<Integer> rootValue = Stream.of(this.val);

		Stream<Integer> otherValues = this.shapeShifters.stream().flatMap(ss -> ss.values().stream());

		List<Integer> stream = Stream.concat(rootValue, otherValues).collect(Collectors.toList());
		System.out.print(stream);
		return stream;
	}

	@Override
	public List<IShapeShifter> getSs() {
		// TODO Auto-generated method stub
		return this.shapeShifters;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return this.val;
	}

}
