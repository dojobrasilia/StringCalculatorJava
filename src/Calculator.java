import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculator {

	private static final String OPERATOR_MATCHER = "(\\+|\\-|\\*|\\/)";

	public int eval(String formula) {
		
		String[] tokens = formula.split(OPERATOR_MATCHER);
		
		String operator = "";
		Matcher m = Pattern.compile(OPERATOR_MATCHER).matcher(formula);
		while (m.find()) {
			operator = m.group();
		}
		
		Integer[] operands = new Integer[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			operands[i] = Integer.parseInt(tokens[i]);
		}
		
		return doOp(operator, operands);
		
	}

	private int doOp(String operator, Integer[] operands) {
		if(operator.equals("+") ){
			return operands[0] + operands[1];
		}else if (operator.equals("-"))  {
			return operands[0] - operands[1];
		}else if (operator.equals("*") )  {
			return operands[0] * operands[1];
		}else if (operator.equals("/"))  {
			return operands[0] / operands[1];
		}
		return operands[0];
	}

}
