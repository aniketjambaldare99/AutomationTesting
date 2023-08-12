package demoAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _2_NevigationInterfaceMethods {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		  
		
		  if(getTitle.equals("Log in to Facebook")) { 
			  System.out.println("Test case Pass"); 
			  } 
		  else {
			  System.out.println("Test case Fail"); 
			  }
		
		Thread.sleep(3000);
		// Add "throws InterruptedException" Which through from Main Method
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		
		 
		  driver.navigate().back();
		  Thread.sleep(3000);
		  
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  
		  driver.quit();
		
	}
 
}
