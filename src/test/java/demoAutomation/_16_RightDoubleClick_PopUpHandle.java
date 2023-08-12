package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _16_RightDoubleClick_PopUpHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
	
	//Right Click Popup	Handle
		
		WebElement rightClickOneElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement quite=driver.findElement(By.xpath("//span[text()='Quit']"));
		action.contextClick(rightClickOneElement).click(quite).build().perform();
		
		
		Thread.sleep(3000);
		System.out.println(Reusable_Methods.handleAlert(driver).getText());
		 
		Reusable_Methods.handleAlert(driver).accept();
		
	//Double Click Popup Handle	
		
		WebElement doubleClickOnElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(doubleClickOnElement).build().perform();
		
		Thread.sleep(3000);
		System.out.println(Reusable_Methods.handleAlert(driver).getText());
		Reusable_Methods.handleAlert(driver).accept();
	}

}
