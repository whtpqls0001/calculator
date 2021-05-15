package manager;

import bean.InputBean;

public class CalcManager {

	public CalcManager(){}
	
	public double addition(double n1, double n2) {
		return n1 + n2;
	}
	
	public double substraction(double n1, double n2) {
		return n1 - n2;
	}
	
	public double multiplication(double n1, double n2) {
		return n1 * n2;
	}
	
	public double division(double n1, double n2) {
		return n1 / n2; // check division by 0!
	}
	
	public void newInput(double n, InputBean inputBean) {
		if(inputBean.getIsNewInput()) {
			inputBean.setInputNum1(n);
			inputBean.setIsNewInput(false);
		}else {
			inputBean.setInputNum2(n);
		}
	}
	
}
