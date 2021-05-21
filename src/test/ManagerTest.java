package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import bean.InputBean;
import manager.*;

public class ManagerTest {
	
	private String inputNum1 = "2.25";
	private String inputNum2 = "2";
	private String inputNum3 = "99";
	private String inputNum4 = "100";
	
	private InputBean inputBean;
	private CalcManager cmgr;
	
	
//	public void main() {	}
	
	@Before
	public void setUp() {
		inputBean = new InputBean(inputNum1, inputNum2);
		cmgr = new CalcManagerImpl();
	}
	
//	@Test
	public void beanTest() {
		
		assertThat(inputBean.getInputNum1().toString(), is("0"));
		assertThat(inputBean.getInputNum2().toString(), is("0"));
		
		inputBean.setInputNum1(inputNum3);
		inputBean.setInputNum2(inputNum4);
		
		assertThat(inputBean.getInputNum1().toString(), is(inputNum3));
		assertThat(inputBean.getInputNum2().toString(), is(inputNum4));
	}
	
	@Test
	public void calcTest() {
		
		assertThat(cmgr.addition(inputBean.getInputNum1(), inputBean.getInputNum2()).toString(), is("4.25"));
		assertThat(cmgr.substraction(inputBean.getInputNum1(), inputBean.getInputNum2()).toString(), is("0.25"));
		assertThat(cmgr.multiplication(inputBean.getInputNum1(), inputBean.getInputNum2()).toString(), is("4.5"));
		assertThat(cmgr.division(inputBean.getInputNum1(), inputBean.getInputNum2()).toString(), is("1.125"));
		assertThat(cmgr.power(inputBean.getInputNum1(), inputBean.getInputNum2()).toString(), is("5.0625"));
		assertThat(cmgr.root(inputBean.getInputNum1(), inputBean.getInputNum2()).toString(), is("1.5"));
	}

}
