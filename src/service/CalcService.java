package service;

import java.util.HashMap;

import bean.InputBean;
import manager.CalcManager;

public class CalcService {
	
	private String symbol;
	private CalcType calcType;
	private CalcManager cmgr = new CalcManager();
	private InputBean inputBean = new InputBean();
	private HashMap<String, CalcType> typeMap = new HashMap<>();
	{
		for(CalcType type : CalcType.values()) {
			typeMap.put(type.getSymbol(), type);
		}
	}

	public CalcService() {}
	

	public String getSymbol() {	return symbol; }
	public void setSymbol(String symbol) { this.symbol = symbol; }
	
	
	public double executeCalc() {
		selectType();
		
		return calcType.function(inputBean.getInputNum1(), inputBean.getInputNum2(), cmgr);
	}
	
	private CalcType selectType() {
		calcType = typeMap.get(symbol);
		return calcType;
	}
	
	public void input(Object input) {
		if(input.getClass() == Double.class) {
			cmgr.newInput((double)input, inputBean);
		}else if(input.getClass() == String.class) {
			this.symbol = (String)input;
		}
	}
}


