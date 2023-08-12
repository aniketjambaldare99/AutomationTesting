package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _12_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",  "C:\\Users\\anike\\Desktop\\Software testing\\JAVA Testing\\AutomationProject\\src\\test\\java");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dtns=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Reusable_Methods.dragAndDrop(driver, src, dtns);
		
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dtns1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Reusable_Methods.dragAndDrop(driver, src1, dtns1);
				
	    WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dtns2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 
		Reusable_Methods.dragAndDrop(driver, src2, dtns2);  
		
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dtns3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Reusable_Methods.dragAndDrop(driver, src3, dtns3); 
	}

}
