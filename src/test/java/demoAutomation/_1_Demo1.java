package demoAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_Demo1 {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		 */
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		  WebDriverManager.edgedriver().setup(); 
		  EdgeDriver driver1 = new EdgeDriver();
		  
		  
		  driver1.get("https://www.facebook.com/login/");
		  driver1.manage().window().maximize();
		  
		  Thread.sleep(3000); 
		  driver1.quit();
		 
		
		
		
	}

}
