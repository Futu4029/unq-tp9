package shapeShifter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SSTest {
	public IShapeShifter Ss1 = new ShapeShifter();
	public IShapeShifter Ss2 = new ShapeShifter();
	public IShapeShifter Ss3 = new ShapeShifter();
	public IShapeShifter Ss4 = new ShapeShifter();
	public IShapeShifter Ss5 = new ShapeShifter();
	public IShapeShifter Ss6 = new ShapeShifter();
	public IShapeShifter Ss7 = new ShapeShifter();
	
	@BeforeEach
	public void setUp() {
	Ss3 = Ss1.compose(Ss2);
	Ss4 = Ss3.compose(Ss2);
	Ss5 = Ss1.compose(Ss4);
	Ss6 = Ss5.compose(Ss4);
	Ss7 = Ss6.compose(Ss5);
	
	}
	
	@Test
	void deepest() {
		assertEquals(2, Ss3.deepest());
	}
	
	@Test
	void deepest0() {
		assertEquals(0, Ss4.deepest());
	}

	@Test
	void deepestA() {
		assertEquals(0, Ss7.flat());
	}
}
