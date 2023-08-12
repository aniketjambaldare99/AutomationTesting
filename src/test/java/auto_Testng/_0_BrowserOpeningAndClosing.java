package auto_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _0_BrowserOpeningAndClosing {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browerOpening() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void browerclose() {
		driver.quit();
	}
}
