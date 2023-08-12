package demoAutomation;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class _9_1_TakeAScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//Suppose we have reference of Interface then we need to Type cast
      
			WebDriverManager.edgedriver().setup();
			WebDriver driver1 =new EdgeDriver();
			
			driver1.get("https://www.facebook.com/login/");
			driver1.manage().window().maximize();
			
			TakesScreenshot ts0 = (TakesScreenshot) driver1;
			ts0.getScreenshotAs(OutputType.FILE);
			
		// ScreenShot Capture For Full Page

			TakesScreenshot ts = driver;
			File scr = ts.getScreenshotAs(OutputType.FILE);
	
			File dtsn = new File("C:\\Users\\anike\\Desktop\\Software testing\\JAVA Testing\\AutomationProject\\ScreenShots\\fb.png");
	
			FileUtils.copyFile(scr, dtsn);
		
		//If you want capture multiple screenShot Then
		
			TakesScreenshot ts1 = driver;
			File scr0 = ts1.getScreenshotAs(OutputType.FILE);
			
			String rm=RandomString.make(4);
			File dtsn0 = new File("C:\\Users\\anike\\Desktop\\Software testing\\JAVA Testing\\AutomationProject\\ScreenShots\\"+rm+".png");
	
			FileUtils.copyFile(scr0, dtsn0);

		// ScreenShot Capture For Specific Element

			WebElement fb_UserName = driver.findElement(By.xpath("//input[@name='email']"));
			File src1 = fb_UserName.getScreenshotAs(OutputType.FILE);
	
			File dtsn1 = new File("C:\\\\Users\\\\anike\\\\Desktop\\\\Software testing\\\\JAVA Testing\\\\AutomationProject\\\\ScreenShots\\\\userNameFeild.png");
	
			FileUtils.copyFile(src1, dtsn1);	

	}
}
