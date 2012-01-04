import static org.junit.Assert.*;

import org.junit.Test;


public class _StringCalculatorTest {

	@Test
	public void returnsTheEvalOfASimpleNumber(){
		Calculator c = new Calculator();
		assertEquals(1,c.eval("1"));
		assertEquals(4,c.eval("4"));
		assertEquals(60,c.eval("60"));
	}
	
	@Test
	public void evaluatesSumExpressions(){
		Calculator c = new Calculator();
		assertEquals(2,c.eval("1+1"));
		assertEquals(8,c.eval("4+4"));
		assertEquals(120,c.eval("60+60"));
	}
	
	@Test
	public void evaluatesSubExpressions(){
		Calculator c = new Calculator();
		assertEquals(0,c.eval("1-1"));
		assertEquals(0,c.eval("60-60"));
		assertEquals(-50,c.eval("50-100"));
	}
	
	
	
}
