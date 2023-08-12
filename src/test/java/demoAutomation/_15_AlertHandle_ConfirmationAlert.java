package demoAutomation;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _15_AlertHandle_ConfirmationAlert{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement customer_ID=driver.findElement(By.xpath("//input[@name='cusid']"));
		Reusable_Methods.sendValueToElement(customer_ID, "54273");
		
		WebElement btn_Submit=driver.findElement(By.xpath("//input[@name='submit']"));
		Reusable_Methods.clickOnElement(btn_Submit);
		
		/*
		 * Alert alt=driver.switchTo().alert();
		 * 
		 * String popUp1=alt.getText(); System.out.println(popUp1); alt.accept();
		 * 
		 * String popup2=alt.getText(); System.out.println(popup2); alt.accept();
		 */
		
			
			/*
			 * String msgPopUp1=Reusable_Methods.handleAlert(driver).getText();
			 * System.out.println(msgPopUp1);
			 */
		  System.out.println(Reusable_Methods.handleAlert(driver).getText());
		  Reusable_Methods.handleAlert(driver).accept();
		  
			/*
			 * String msgPopUp2=Reusable_Methods.handleAlert(driver).getText();
			 * System.out.println(msgPopUp2);
			 */
			Thread.sleep(3000);
			
		  System.out.println(Reusable_Methods.handleAlert(driver).getText());
		  Reusable_Methods.handleAlert(driver).accept();
			 
		 
	}

}
