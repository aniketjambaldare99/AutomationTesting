package auto_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_TestAnnotations {

	@BeforeTest
	public void beforeSuit_1() {
		System.out.println("Before Test");
	}
	
	@BeforeSuite
	public void BS() {
		System.out.println("Before Suit");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}
	
	@Test
	public void BrowserOpen() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}
	
}
