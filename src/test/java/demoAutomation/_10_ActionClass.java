package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _10_ActionClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//Actoin Class
		
			Actions action=new Actions(driver);
		
		//Move to element
		
			WebElement moveToElement=driver.findElement(By.xpath("//a[text()='Selenium']"));
			action.moveToElement(moveToElement).click().build().perform();
			 
			Thread.sleep(3000);
			//driver.quit();
		
		//Navigate to new URL
			
			driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
			Thread.sleep(3000);
			
		//Right Click and Click
		
			//WebDriverManager.chromedriver().setup();
			//ChromeDriver driver=new ChromeDriver();
			//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			//driver.manage().window().maximize();
			
			WebElement rightClickOneElement=driver.findElement(By.xpath("//span[text()='right click me']"));
			WebElement quite=driver.findElement(By.xpath("//span[text()='Quit']"));
			action.contextClick(rightClickOneElement).click(quite).build().perform();
			
			Thread.sleep(3000);
			//driver.close();
		//refresh current URL
			
			//driver.navigate().refresh();
			//driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
			//Thread.sleep(3000);
			
		//Double Click On Element
			
		
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver1=new
		 * ChromeDriver();
		 * driver1.get("https://demo.guru99.com/test/simple_context_menu.html");
		 * driver1.manage().window().maximize();
		 */
		
		//UnhandledErrorException 	
			driver.switchTo().alert().accept();
			
		//Double Click On Element
			
			WebElement doubleClickOnElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			action.doubleClick(doubleClickOnElement).build().perform();
	}

}
