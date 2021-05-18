package service;

import java.util.HashMap;

import bean.InputBean;
import manager.*;

public class CalcServiceImpl implements CalcService{
	
	private String symbol;
	private CalcType calcType;
	private CalcManager cmgr = new CalcManagerImpl();
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
	
	
	public double executeCalc() {
		double result = typeMap.get(symbol).function(inputBean.getInputNum1(), inputBean.getInputNum2(), cmgr);
		inputBean.setResult(result);
		inputBean.setInputNum1(result);
		return result;
	}
	
	public void input(Object input) {
		if(input.getClass() == Double.class) {
			if(inputBean.getIsNewInput()) {
				inputBean.setInputNum1((double)input);
				inputBean.setIsNewInput(false);
			}else {
				inputBean.setInputNum2((double)input);
			}
		}else if(input.getClass() == String.class) {
			this.symbol = (String)input;
		}
	}
	
}


