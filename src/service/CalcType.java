package service;

import java.math.BigDecimal;

import exception.CannotRootNegativeException;
import manager.CalcManager;
import manager.CalcManagerImpl;

public enum CalcType {
	ADDITION("+"){
				BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) { 
					return cmgr.addition(inputNum1, inputNum2);}},
	SUBSTRACTION("-"){
				BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) {
					return cmgr.substraction(inputNum1, inputNum2);}}, 
	MULTIPLICATION("*"){
				BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) { 
					return cmgr.multiplication(inputNum1, inputNum2);}}, 
	DIVISION("/"){
				BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) { 
					return cmgr.division(inputNum1, inputNum2);}},
	POWER("^"){
				BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) {
					return cmgr.power(inputNum1, inputNum2);}},
	ROOT("R"){
				BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) throws CannotRootNegativeException {
					return cmgr.root(inputNum1, inputNum2);}};

	private String symbol;
	private static CalcManager cmgr = new CalcManagerImpl();
	
	private CalcType(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	abstract BigDecimal function(BigDecimal inputNum1, BigDecimal inputNum2) throws CannotRootNegativeException;
}

