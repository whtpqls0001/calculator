package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import bean.InputBean;
import service.CalcService;
import service.CalcType;


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
	
	private CalcService csvc;
	private InputBean inputBean;
	
	@Before
	public void setUp(){
		csvc = new CalcService();
		inputBean = new InputBean(inputNum1, inputNum2);
	}
	
	@Test
	public void ExecuteCalcTest() {
		csvc.setSymbol(symbol1);
		assertThat(csvc.executeCalc(), is(0d));
	}
	
	@Test(expected = NullPointerException.class)
	public void ExecuteCalcExceptionTest() {
		csvc.setSymbol("=");
		assertThat(csvc.executeCalc(), is(inputNum1 + inputNum2));
	}
	
	@Test
	public void mainTest() {
		csvc.input(1d);
		csvc.input(symbol5);
		csvc.input(0d);
		assertThat(csvc.executeCalc(), is(1d));
		csvc.input(symbol1);
		csvc.input(inputNum4);
		assertThat(csvc.executeCalc(), is(1d + inputNum4));
		
	}
}
