package auto_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _2_InheritateOtherClass extends _0_BrowserOpeningAndClosing{

	@Test
	public void guru99RegistrationPage() {
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
		  
		  WebElement drop_Down=driver.findElement(By.xpath("//select[@name='country']"));
			
			// We need to create object of "Select class" and in that we need to pass parameter in which xpath is stored
			
		  Select sl=new Select(drop_Down);
			
			//Select cotains 3 methods to handle drop down
			
		  sl.selectByIndex(4);
			
		  
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
