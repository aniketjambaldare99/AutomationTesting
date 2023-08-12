package demoAutomation;

import org.openqa.selenium.WebElement;

public class SendValueToElement {
	
	public static void sendValueToElement(WebElement element,String value) {
			
			if(element.isDisplayed() && element.isEnabled()) {
				
				element.sendKeys(value);
				
			}
			else {
				System.out.println("Feild is Disable");
			}
	}

}
