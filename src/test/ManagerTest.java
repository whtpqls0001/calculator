package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import bean.InputBean;
import manager.CalcManager;

public class ManagerTest {
	
	private double inputNum1 = 0;
	private double inputNum2 = 1;
	private double inputNum3 = 99;
	private double inputNum4 = 100;
	
	private InputBean inputBean;
	private CalcManager cmgr;
	
	
//	public void main() {	}
	
	@Before
	public void setUp() {
		inputBean = new InputBean();
		cmgr = new CalcManager();
	}
	
	@Test
	public void beanTest() {
		
		assertThat(inputBean.getInputNum1(), is(0d));
		assertThat(inputBean.getInputNum2(), is(0d));
		
		inputBean.setInputNum1(inputNum1);
		inputBean.setInputNum2(inputNum2);
		
		assertThat(inputBean.getInputNum1(), is(inputNum1));
		assertThat(inputBean.getInputNum2(), is(inputNum2));
	}
	
	@Test
	public void calcTest() {
		
		assertThat(cmgr.addition(inputNum1, inputNum2), is(inputNum1 + inputNum2));
		assertThat(cmgr.substraction(inputNum1, inputNum2), is(inputNum1 - inputNum2));
		assertThat(cmgr.multiplication(inputNum1, inputNum2), is(inputNum1 * inputNum2));
		assertThat(cmgr.division(inputNum1, inputNum2), is(inputNum1 / inputNum2));
	}
	
	@Test
	public void newInputTest() {
		cmgr.newInput(inputNum1, inputBean);
		assertThat(inputBean.getInputNum1(), is(inputNum1));
		assertThat(inputBean.getInputNum2(), is(0d));
		
		cmgr.newInput(inputNum2, inputBean);
		assertThat(inputBean.getInputNum1(), is(inputNum1));
		assertThat(inputBean.getInputNum2(), is(inputNum2));
	}
}
