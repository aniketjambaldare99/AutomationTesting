package auto_Testng;

import org.testng.annotations.Test;

public class _7_CritAndRegrHaveSameTestCase {

	@Test(groups= {"CriticalRegression","Regression"})
	public void CriticalRegressionRegression() {
		System.out.println("Test CriticalRegression-Regression");
	}
	
	@Test(groups= {"Regression"})
	public void Regression_1() {
		System.out.println("Test Regression");
	}
	
	@Test(groups= {"Regression"})
	public void Regression() {
		System.out.println("Test Regression");
	}
	
	@Test(groups= {"CriticalRegression"})
	public void CriticalRegression() {
		System.out.println("Test CriticalRegression");
	}

}
