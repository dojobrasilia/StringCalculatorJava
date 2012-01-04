
public class Calculator {

	public int eval(String formula) {
		String[] operands = formula.split("(\\+|\\-)");
		if(formula.contains("+")){
			return Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]);
		}else if (formula.contains("-"))  {
			return Integer.parseInt(operands[0]) - Integer.parseInt(operands[1]);
		}else {
			return Integer.parseInt(formula);
		}
	}

}
