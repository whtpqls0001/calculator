package manager;

import java.math.BigDecimal;

import exception.CannotRootNegativeException;

import java.math.*;

public class CalcManagerImpl implements CalcManager{

	final static BigDecimal ZERO = BigDecimal.valueOf(0.0);
	final static BigDecimal ONE = BigDecimal.valueOf(1.0);
	final static BigDecimal TEN	= BigDecimal.valueOf(10.0);
	
	public CalcManagerImpl(){}
	
	public BigDecimal addition(BigDecimal n1, BigDecimal n2) {
		return n1.add(n2);
	}
	
	public BigDecimal substraction(BigDecimal n1, BigDecimal n2) {
		return n1.subtract(n2);
	}
	
	public BigDecimal multiplication(BigDecimal n1, BigDecimal n2) {
		return n1.multiply(n2).stripTrailingZeros();
	}
	
	public BigDecimal division(BigDecimal n1, BigDecimal n2) {
		return n1.divide(n2, 7, RoundingMode.HALF_EVEN).stripTrailingZeros(); // check division by 0!
	}
	
	public BigDecimal power(BigDecimal n1, BigDecimal n2) {
		BigDecimal result = ONE;
		for(int i = 0; i < Math.abs(n2.intValue()); i++) {
			result = result.multiply(n1);
		}
		if(n2.compareTo(ZERO) >= 0) {
			return result;	
		}else {
			return ONE.divide(result, 7, RoundingMode.HALF_EVEN);
		}
		
	}
	
	public BigDecimal root(BigDecimal n1, BigDecimal n2) throws CannotRootNegativeException {
		if(n1.compareTo(ZERO) < 0 || n2.compareTo(ZERO) < 0) throw new CannotRootNegativeException("Cannot Root with Negative Numbers");
		BigDecimal result = ZERO;
		BigDecimal operator = ONE;
		final BigDecimal minOperator = power(TEN, new BigDecimal("-4"));
		while(operator.compareTo(minOperator) > 0) {
			while(power(result , n2).compareTo(n1) < 0) {
				result = result.add(operator);
				System.out.println(result);
				System.out.println(operator);
			}
			if(power(result, n2).equals(n1)) {
				break;
			}
			
			result = result.subtract(operator);
			operator = operator.multiply(new BigDecimal("0.1"));
			
		}
		
		
		return result;
	}
	
	
}
