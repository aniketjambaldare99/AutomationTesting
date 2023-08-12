package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _17_PromtAlertHandle {

	public static void main(String[] args) throws Exception {
		
          WebDriverManager.chromedriver().setup();
          ChromeDriver driver=new ChromeDriver();
          driver.get("https://the-internet.herokuapp.com/javascript_alerts");
          driver.manage().window().maximize();
          
          driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
          
          Thread.sleep(3000);
          System.out.println(Reusable_Methods.handleAlert(driver).getText());
          
          Thread.sleep(3000);
          Reusable_Methods.handleAlert(driver).sendKeys("Hey Promt");
          
          Thread.sleep(3000);
          Reusable_Methods.handleAlert(driver).accept();
          
          driver.quit();
	}

}
