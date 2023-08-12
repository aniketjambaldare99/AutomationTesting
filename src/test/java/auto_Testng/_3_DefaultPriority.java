package auto_Testng;

import org.testng.annotations.Test;

public class _3_DefaultPriority extends _0_BrowserOpeningAndClosing{

	@Test
	public void xyz() {
		System.out.println("Browser Open And Close At Once");
	}
	
	@Test
	public void pqr() {
		System.out.println("Browser Open And Close At Twice");
	}
	
	@Test
	public void abc() {
		System.out.println("Browser Open And Close At Thrice");
	}

}
