package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _6_Locator_Xpath_RelativeWithAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//locator----->Relative Xpath---->By Attribute
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234@12");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}

