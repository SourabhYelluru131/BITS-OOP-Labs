package softest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		assertEquals(Calculator.findMax(arr),9);
		assertEquals(343, Calculator.cube(7));
		assertEquals("racecar",Calculator.reverseWord("racecar"));
	}

}
