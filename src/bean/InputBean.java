package bean;

import java.math.BigDecimal;

public class InputBean {
	
	final static BigDecimal ZERO = BigDecimal.ZERO;
	final static BigDecimal ONE = BigDecimal.ONE;
	final static BigDecimal TEN	= BigDecimal.TEN;
	
	private BigDecimal inputNum1 = ZERO;
	private BigDecimal inputNum2 = ZERO;
	private BigDecimal result = ZERO;
	private boolean isNewInput = true;
	
	public InputBean(){}
	public InputBean(String inputNum1, String inputNum2){
		this.inputNum1 = new BigDecimal(inputNum1);
		this.inputNum2 = new BigDecimal(inputNum2);
	}
	
	public BigDecimal getInputNum1() { return inputNum1; }
	public void setInputNum1(String inputNum1) { this.inputNum1 = new BigDecimal(inputNum1); }
	
	public BigDecimal getInputNum2() { return inputNum2; }
	public void setInputNum2(String inputNum2) { this.inputNum2 = new BigDecimal(inputNum2); }
	
	public boolean getIsNewInput() { return isNewInput; }
	public void setIsNewInput(boolean isNewInput) { this.isNewInput = isNewInput;}
	
	public BigDecimal getResult() {	return result; }
	public void setResult(String result) { this.result = new BigDecimal(result); }
}
