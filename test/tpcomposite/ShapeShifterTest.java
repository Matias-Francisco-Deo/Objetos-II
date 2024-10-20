package tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTest {

	private ShapeShifter shapeShifter1;

	@BeforeEach
	void setUp() throws Exception {
		shapeShifter1 = new ShapeShifter(1);
		ShapeShifter shapeShifter2 = new ShapeShifter(2);
		ShapeShifter shapeShifter3 = new ShapeShifter(3);
		ShapeShifter shapeShifter4 = new ShapeShifter(4);
		shapeShifter2.compose(shapeShifter3);
		shapeShifter4.compose(shapeShifter2);
		shapeShifter1.compose(shapeShifter2).compose(shapeShifter3).compose(shapeShifter4);
	}

	@Test
	void testDeepest() {
		assertEquals(4, shapeShifter1.deepest());
	}

	@Test
	void testFlat() {
		shapeShifter1.flat();
		assertEquals(1, shapeShifter1.deepest());
	}

	@Test
	void testValues() {
		// [1,2,3,3,4,2,3]
		shapeShifter1.values();
	}

}
