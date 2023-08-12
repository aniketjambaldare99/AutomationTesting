package auto_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _5_DecisionsForTest {
     WebDriver driver;
	
	@BeforeMethod
	public  void openBrow() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/#google_vignette");
		driver.manage().window().maximize();	
		
	}
	
	@Test
	public void test_1() {
		System.out.println("First Test Case");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("aniket");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aniket@123");	
	}
	
	@Test(invocationCount=3)
	public void test_2() {
		System.out.println("Second Test Case ---> Invocation Count ");
	}
	
	@Test(enabled=false)
	public void test_3() {
		System.out.println("Third Test Case ---> enabled To Skip Test Case ");
	}
	
	@Test(dependsOnMethods= {"test_1"})
	public void test_4() {
		System.out.println("Fourth Test Case ---> dependsOnMethods Interconnection bet methods ");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@AfterMethod
	public void closeBrow() {
		driver.quit();
	}
	
}
