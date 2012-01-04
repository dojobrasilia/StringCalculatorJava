import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class _StringCalculatorTest {

	private Calculator calc;
	
	@Before
	public void setUp(){
		calc = new Calculator();
	}
	
	@Test
	public void returnsTheEvalOfASimpleNumber(){
		assertEquals(1,calc.eval("1"));
		assertEquals(4,calc.eval("4"));
		assertEquals(60,calc.eval("60"));
	}
	
	@Test
	public void evaluatesSumExpressions(){
		assertEquals(2,calc.eval("1+1"));
		assertEquals(8,calc.eval("4+4"));
		assertEquals(120,calc.eval("60+60"));
	}
	
	@Test
	public void evaluatesSubExpressions(){
		assertEquals(0,calc.eval("1-1"));
		assertEquals(0,calc.eval("60-60"));
		assertEquals(-50,calc.eval("50-100"));
	}
	
	@Test
	public void evaluatesMultiplicationExpressions(){
		assertEquals(2,calc.eval("1*2"));
		assertEquals(36,calc.eval("6*6"));
		assertEquals(5000,calc.eval("50*100"));
	}
	
	@Test
	public void evaluatesDivisionExpressions(){
		assertEquals(2,calc.eval("4/2"));
		assertEquals(1,calc.eval("6/6"));
		assertEquals(2,calc.eval("100/50"));
	}
	
}
