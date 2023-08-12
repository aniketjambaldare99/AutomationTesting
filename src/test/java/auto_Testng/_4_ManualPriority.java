package auto_Testng;

import org.testng.annotations.Test;

public class _4_ManualPriority extends _0_BrowserOpeningAndClosing{

	@Test
	public void xyz() {
		System.out.println("1.Browser Open And Close At Once");
	}
	
	@Test(priority=1)
	public void pqr() {
		System.out.println("2.Browser Open And Close At Twice");
	}
	
	@Test
	public void abc() {
		System.out.println("3.Browser Open And Close At Thrice");
	}

}
