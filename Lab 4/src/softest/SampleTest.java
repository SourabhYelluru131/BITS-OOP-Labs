package softest;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class SampleTest {

	@Test
	public void test() {
		MyClass1 m1 = new MyClass1(); 
		org.junit.Assert.assertEquals(6, m1.multiply(2, 3));
	}

}
