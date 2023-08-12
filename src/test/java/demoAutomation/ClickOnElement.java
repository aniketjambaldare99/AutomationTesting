package demoAutomation;

import org.openqa.selenium.WebElement;

public class ClickOnElement {

	public static void clickOnElement(WebElement element) {
		
		if(element.isDisplayed() && element.isEnabled()) {
			element.click();
		}
		else {
			System.out.println("Button is not Clickable");
		}
	}
	
}
