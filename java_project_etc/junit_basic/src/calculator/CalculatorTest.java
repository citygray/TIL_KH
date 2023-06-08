package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator cal; 
	
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("setup");
	}
	
	
	@Test
	public void add() {
		assertEquals(3,cal.add(1, 2));
		System.out.println("add");
		
	}
	@Test
	public void subtrack() {
		assertEquals(3,cal.subtrack(5, 2));
		System.out.println("subtrack");
		
	}
	@Test
	public void multiply() {
		assertEquals(10,cal.multiply(5, 2));
		System.out.println("multiply");
		
	}
	@Test
	public void divide() {
		assertEquals(5,cal.divide(10, 2));
		System.out.println("divide");
		
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	
	}

}
