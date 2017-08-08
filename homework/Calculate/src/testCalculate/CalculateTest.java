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
		assertEquals("�����ӷ�����", 4, cal.add(2,2));
		assertEquals("�������ӷ�����", 0, cal.add(2,-2));
		assertEquals("�����ӷ�����", -4, cal.add(-2,-2));
	}
	
	@Test
	public void testMinus() {
		assertEquals("������������", 0, cal.minus(2,2));
		assertEquals("��������������", 4, cal.minus(2,-2));
		assertEquals("������������", 0, cal.minus(-2,-2));
	}
	
	@Test
	public void testDivide() throws Exception {
		assertEquals("������������", 1, cal.divide(2,2));
		assertEquals("��������������", -1, cal.divide(2,-2));
		assertEquals("������������", 1, cal.divide(-2,-2));
	}
	
	@Test
	public void testMulti() {
		assertEquals("�����˷�����", 4, cal.multi(2,2));
		assertEquals("�������˷�����", -4, cal.multi(2,-2));
		assertEquals("�����˷�����", 4, cal.multi(-2,-2));
		assertEquals("��0�˷�����", 0, cal.multi(-2,0));
	}
}
