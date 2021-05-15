package bean;

public class InputBean {
	private double inputNum1;
	private double inputNum2;
	private boolean isNewInput;
	
	public InputBean(){
		this.inputNum1 = 0;
		this.inputNum2 = 0;
		this.isNewInput = true;
	};
	public InputBean(double inputNum1, double inputNum2){
		this.inputNum1 = inputNum1;
		this.inputNum2 = inputNum2;
	}
	
	public double getInputNum1() { return inputNum1; }
	public void setInputNum1(double inputNum1) { this.inputNum1 = inputNum1; }
	
	public double getInputNum2() { return inputNum2;	}
	public void setInputNum2(double inputNum2) { this.inputNum2 = inputNum2; }
	
	public boolean getIsNewInput() { return isNewInput; }
	public void setIsNewInput(boolean isNewInput) { this.isNewInput = isNewInput;}
	
}
