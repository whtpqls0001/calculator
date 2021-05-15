package service;

import manager.CalcManager;

public enum CalcType {
	ADDITION("+"){
		double function(double inputNum1, double inputNum2, CalcManager cmgr) { 
			return cmgr.addition(inputNum1, inputNum2);}},
	SUBSTRACTION("-"){
		double function(double inputNum1, double inputNum2, CalcManager cmgr) { 
			return cmgr.substraction(inputNum1, inputNum2);}}, 
	MULTIPLICATION("*"){
		double function(double inputNum1, double inputNum2, CalcManager cmgr) { 
			return cmgr.multiplication(inputNum1, inputNum2);}}, 
	DIVISION("/"){
		double function(double inputNum1, double inputNum2, CalcManager cmgr) { 
			return cmgr.division(inputNum1, inputNum2);}};

	private String symbol;
	
	private CalcType(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	abstract double function(double inputNum1, double inputNum2, CalcManager cmgr);
}
