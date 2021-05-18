package service;

public interface CalcService {
	
	public String getSymbol();
	public void setSymbol(String symbol);
	public double executeCalc();
	public void input(Object input);
}
