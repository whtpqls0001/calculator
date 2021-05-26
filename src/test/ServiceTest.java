package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import bean.InputBean;
import service.*;


public class ServiceTest {

	private double inputNum1 = 0;
	private double inputNum2 = 1;
	private double inputNum3 = 99;
	private double inputNum4 = 100;
	
	private String symbol1 = "+";
	private String symbol2 = "-";
	private String symbol3 = "*";
	private String symbol4 = "/";
	private String symbol5 = "^";
	private String symbol6 = "R";
	private String symbol7 = "!";
	
	private CalcService csvc; 
	private InputBean inputBean;
	
	@Before
	public void setUp(){
		csvc = new CalcServiceImpl();
	}
	
	@Test
	public void ExecuteCalcTest() {
		csvc.input(symbol1);
		assertThat(csvc.executeCalc(), is("0"));
	}
	
	@Test(expected = NullPointerException.class)
	public void ExecuteCalcExceptionTest() {
		csvc.input("=");
		assertThat(csvc.executeCalc(), is("0"));
	}
	
	@Test
	public void mainTest() {
		csvc.input(156d);
		csvc.input(symbol1);
		csvc.input(44d);
		assertThat(csvc.executeCalc(), is("200")); 
//		csvc.input(symbol1);
//		csvc.input(inputNum4);
//		assertThat(csvc.executeCalc(), is("101.0"));
		
	}
}
