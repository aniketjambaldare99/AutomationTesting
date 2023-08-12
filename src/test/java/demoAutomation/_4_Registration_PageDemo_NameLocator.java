package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _4_Registration_PageDemo_NameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		  WebElement text_FirstName=driver.findElement(By.name("firstName"));
		  text_FirstName.sendKeys("Aniket");
		  
		  WebElement text_LastName=driver.findElement(By.name("lastName"));
		  text_LastName.sendKeys("Jambaldare");
		  
		  WebElement text_Email=driver.findElement(By.name("phone"));
		  text_Email.sendKeys("9545460959");
		  
		  WebElement text_PhoneNo=driver.findElement(By.name("userName"));
		  text_PhoneNo.sendKeys("aniketjambaldare99@gmail.com");
		 
		  WebElement text_Address=driver.findElement(By.name("address1"));
		  text_Address.sendKeys("LIC Colony");
		  
		  WebElement text_City=driver.findElement(By.name("city"));
		  text_City.sendKeys("Latur");
		  
		  WebElement text_State=driver.findElement(By.name("state"));
		  text_State.sendKeys("MH");
		  
		  WebElement text_PostalCode=driver.findElement(By.name("postalCode"));
		  text_PostalCode.sendKeys("413512");
		  
		  WebElement text_UserName=driver.findElement(By.name("email"));
		  text_UserName.sendKeys("aniketjambaldare99@gmail.com");
		  
		  WebElement text_Pass=driver.findElement(By.name("password"));
		  text_Pass.sendKeys("123@AJ");
		  
		  WebElement text_ConfirmPass=driver.findElement(By.name("confirmPassword"));
		  text_ConfirmPass.sendKeys("123@AJ");
		  
		  WebElement btn_Submit=driver.findElement(By.name("submit"));
		  btn_Submit.click();
	}

}
