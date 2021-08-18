package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
	Calculator calc;
	@BeforeEach
	void init() {
		calc = new Calculator(); //arrange
		System.out.println("init");
	}

	@Test
	void testAdd() {
		int result = calc.add(1, 3); //act
		assertEquals(4, result);
		//fail("Not yet implemented");
	}
	@Test
	void testAddNegetiveNumbers() {
		int result = calc.add(-1, 6);
		assertEquals(5, result);
		//fail("Not yet implemented");
	}
	@Test
	void tesAddFloat() {
		float result = calc.add(1.2f, 3.1f);
		assertEquals(4.3, result, 0.00000190734863);
	}
	
	@Test
	void tesAddFloatGreaterThan2() {
		float result = calc.add(3.2f, 3.1f);
		assertEquals(6.3, result, 0.00000190734863);
	}
//	@Test
//	void tesDivide() {
//		Calculator calc = new Calculator();
//		float result = calc.divide(7.0f, 2.0f);
//		assertEquals(3.5f, result);
//	}
	
	@Test
	void tesDivideWhenDenominatorIsZero() {
			float result = calc.divide(7, 2);
			assertEquals(3.0, result);
		
	}

}
