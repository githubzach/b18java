package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		int expectOutPut = 30;
		int acutal = Calculator.add(10,20);
		assertEquals(expectOutPut, acutal);
		
	}

}
