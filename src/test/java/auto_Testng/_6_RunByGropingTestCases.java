package auto_Testng;

import org.testng.annotations.Test;

public class _6_RunByGropingTestCases {
		
		@Test(groups= {"CriticalRegression"})
		public void CriticalRegression_1() {
			System.out.println("Test CriticalRegression");
		}
		
		@Test(groups= {"CriticalRegression"})
		public void CriticalRegression_2() {
			System.out.println("Test CriticalRegression");
		}
		
		@Test(groups= {"Regression"})
		public void Regression_1() {
			System.out.println("Test Regression");
		}
		
		@Test(groups= {"Regression"})
		public void Regression_2() {
			System.out.println("Test Regression");
		}

}
