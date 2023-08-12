package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _20_IframesHandle_2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement elementFrame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(elementFrame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("aniket@99");
		
		driver.switchTo().defaultContent();
		
		WebElement elementFrame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(elementFrame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("aniket@99");

		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("aniket@99");

//Inner Frames in 3rd frame		
		
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
			
			//driver.switchTo().frame(1);
			driver.findElement(By.xpath("//span[text()='General Web Automation']")).click();
		
			driver.findElement(By.xpath("//span[text()='Choose']")).click();
			
			/*
			 * WebElement
			 * elementFrame=driver.findElement(By.xpath("(//span[text()='Yes']")); Actions
			 * act=new Actions(driver);
			 * act.moveToElement(elementFrame).click().build().perform();
			 */	
			/*
			 * WebElement elementFrame=driver.findElement(By.
			 * xpath("(//span[@class='l4V7wb Fxmcue'])[2]"));
			 * 
			 * Actions act=new Actions(driver);
			 * act.moveToElement(elementFrame).click().build().perform();
			 */
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//Thread.sleep(3000);
			//driver.switchTo().defaultContent();
			
			
			//Thread.sleep(3000);
			//driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("Hey");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//textarea[@jsname='YPqjbf']")).sendKeys("Hey, I am doing Automation");
			
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
			
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("aniket@99");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(4);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("aniket@99");
	}

}
