package service;

import java.util.HashMap;

import bean.InputBean;
import exception.CannotRootNegativeException;

public class CalcServiceImpl implements CalcService{
	
	private String symbol;
	private InputBean inputBean = new InputBean();
	private HashMap<String, CalcType> typeMap = new HashMap<>();
	{
		for(CalcType type : CalcType.values()) {
			typeMap.put(type.getSymbol(), type);
		}
	}

	public CalcServiceImpl() {}
	

	public String getSymbol() {	return symbol; }
	public void setSymbol(String symbol) { this.symbol = symbol; }
	
	
	public String executeCalc() {
		try {
			String result = typeMap.get(symbol).function(inputBean.getInputNum1(), inputBean.getInputNum2()).toString();
			inputBean.setResult(result); 
			inputBean.setInputNum1(result);
			return result;
		} catch(CannotRootNegativeException e) {
			return e.getMessage();
		}
		
	}
	
	public void input(Object input) {
		if(input.getClass() == Double.class) {
			if(inputBean.getIsNewInput()) {
				inputBean.setInputNum1(Double.toString((double)input));
				inputBean.setIsNewInput(false);
			}else {
				inputBean.setInputNum2(Double.toString((double)input));
			}
		}else if(input.getClass() == String.class) {
			this.symbol = (String)input;
		}
	}
	
}


