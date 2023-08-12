package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _7_DropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		 
		WebElement drop_Down=driver.findElement(By.xpath("//select[@name='country']"));
		
		// We need to create object of "Select class" and in that we need to pass parameter in which xpath is stored
		
		Select sl=new Select(drop_Down);
		
		//Select cotains 3 methods to handle drop down
		
		sl.selectByIndex(4);
		
		sl.selectByValue("ARGENTINA");
		
		sl.selectByVisibleText("BRAZIL");
		
		//getOptions() is method to get all elements in drp down
		
		List<WebElement> list=sl.getOptions();
		System.out.println(list.size());
		
		//list all values in drp down
		
		for(int i=0;i<list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
			
			// handle drp down without using select methods
			
			if(text.equals("BRAZIL")) {
				list.get(i).click();
				break;
			}
		}
	}

}
