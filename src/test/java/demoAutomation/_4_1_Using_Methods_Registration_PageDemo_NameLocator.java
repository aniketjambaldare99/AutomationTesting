package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _4_1_Using_Methods_Registration_PageDemo_NameLocator {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		 WebElement text_FirstName=driver.findElement(By.name("firstName"));
		 SendValueToElement.sendValueToElement(text_FirstName, "Aniket");
		  
		  WebElement text_LastName=driver.findElement(By.name("lastName"));
		  SendValueToElement.sendValueToElement(text_LastName, "Jambaldare");
		  
		  WebElement text_PhoneNo=driver.findElement(By.name("phone"));
		  SendValueToElement.sendValueToElement(text_PhoneNo, "9545460959");
		  
		  WebElement text_Email=driver.findElement(By.name("userName"));
		  SendValueToElement.sendValueToElement(text_Email, "aniketjambaldare99@gmail.com");
		 
		  WebElement text_Address=driver.findElement(By.name("address1"));
		  SendValueToElement.sendValueToElement(text_Address, "LIC Colony");
		  
		  WebElement text_City=driver.findElement(By.name("city"));
		  SendValueToElement.sendValueToElement(text_City, "Latur");
		  
		  WebElement text_State=driver.findElement(By.name("state"));
		  SendValueToElement.sendValueToElement(text_State, "MH");
		  
		  WebElement text_PostalCode=driver.findElement(By.name("postalCode"));
		  SendValueToElement.sendValueToElement(text_PostalCode, "413512");
		  
		  WebElement text_UserName=driver.findElement(By.name("email"));
		  SendValueToElement.sendValueToElement(text_UserName, "aniketjambaldare99@gmail.com");
		  
		  WebElement text_Pass=driver.findElement(By.name("password"));
		  SendValueToElement.sendValueToElement(text_Pass, "AJ@99");
		  
		  WebElement text_ConfirmPass=driver.findElement(By.name("confirmPassword"));
		  SendValueToElement.sendValueToElement(text_ConfirmPass, "AJ@99");
		  
		  WebElement btn_Submit=driver.findElement(By.name("submit"));
		  ClickOnElement.clickOnElement(btn_Submit);
	}

}
