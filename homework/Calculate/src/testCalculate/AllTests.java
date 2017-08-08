package testCalculate;
import junit.framework.*;
public class AllTests {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		junit.textui.TestRunner.run(suite());
	}
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit Tests");
	//	suite.addTest(VectorTest.suite());
		suite.addTest(new JUnit4TestAdapter(CalculateTest.class));
		return suite;
	}

}
