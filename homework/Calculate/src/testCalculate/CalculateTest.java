package testCalculate;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import test.Calculate;

public class CalculateTest {
	private Calculate cal;
	
	@Before
	public void setUp() throws Exception {
		cal = new Calculate(); 
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAdd() {
		assertEquals("正数加法有误", 4, cal.add(2,2));
		assertEquals("正负数加法有误", 0, cal.add(2,-2));
		assertEquals("负数加法有误", -4, cal.add(-2,-2));
	}
	
	@Test
	public void testMinus() {
		assertEquals("正数减法有误", 0, cal.minus(2,2));
		assertEquals("正负数减法有误", 4, cal.minus(2,-2));
		assertEquals("负数减法有误", 0, cal.minus(-2,-2));
	}
	
	@Test
	public void testDivide() throws Exception {
		assertEquals("正数除法有误", 1, cal.divide(2,2));
		assertEquals("正负数除法有误", -1, cal.divide(2,-2));
		assertEquals("负数除法有误", 1, cal.divide(-2,-2));
	}
	
	@Test
	public void testMulti() {
		assertEquals("正数乘法有误", 4, cal.multi(2,2));
		assertEquals("正负数乘法有误", -4, cal.multi(2,-2));
		assertEquals("负数乘法有误", 4, cal.multi(-2,-2));
		assertEquals("与0乘法有误", 0, cal.multi(-2,0));
	}
}
