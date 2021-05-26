package manager;

import java.math.BigDecimal;

import exception.CannotRootNegativeException;

public interface CalcManager {
	public BigDecimal addition(BigDecimal n1, BigDecimal n2);
	public BigDecimal substraction(BigDecimal n1, BigDecimal n2);
	public BigDecimal multiplication(BigDecimal n1, BigDecimal n2);
	public BigDecimal division(BigDecimal n1, BigDecimal n2);
	public BigDecimal power(BigDecimal n1, BigDecimal n2);
	public BigDecimal root(BigDecimal n1, BigDecimal n2) throws CannotRootNegativeException;
	public BigDecimal factorial(BigDecimal n);
}
