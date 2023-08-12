package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _5_1_Loactor_Xpath_Ab_Re {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		/*
		 * Locator--->Xpath---->Absolute Xpath 
		 * Start with /
		 * It is parent to its immidiate child 
		 */
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("test@123");

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")).sendKeys("123@");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook")) {
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("test case Fail");
		}
	}

}
