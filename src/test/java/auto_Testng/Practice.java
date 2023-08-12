package auto_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	WebDriver driver;
	@BeforeMethod
	public void browserOpeningMethod() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();	
	}
    @Test
    public void navigate() {
    
		System.out.println("ehdjuhb");
    }
    @AfterMethod
    public void closeCureentDrirverFocusedWindow() {
    	driver.quit();
    }
}
