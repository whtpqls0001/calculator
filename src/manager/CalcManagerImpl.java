package manager;

import bean.InputBean;

public class CalcManagerImpl implements CalcManager{

	public CalcManagerImpl(){}
	
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
		if(n2 == 0) return 0d;
		return n1 / n2; // check division by 0!
	}
	
	public double power(double n1, int n2) {
		double result = 1;
		for(int i = 0; i < n2; i++) { result *= n1;}
		if(n2 >= 0) {
			return result;
		}else {
			return 1 / result;
		}
	}
	
	
	
}
