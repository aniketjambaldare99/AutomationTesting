package demoAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _19_WindoeHandleBy_Iterator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentWindowID=driver.getWindowHandle();
		System.out.println("Parent Window ID : "+parentWindowID);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		System.out.println("All Window ID :");
		Set<String> allID=driver.getWindowHandles();	
		System.out.println(allID);
		
		Iterator<String> it=allID.iterator();
		//System.out.println(it); 
		//java.util.LinkedHashMap$LinkedKeyIterator@7e97551f	
		
		  while(it.hasNext()) { 
			  
			  String childWindowID=it.next();
			  
			  if(!parentWindowID.equals(childWindowID)) {
		  
				driver.switchTo().window(childWindowID);  
		  } 
		}
		  
		  driver.switchTo().window(parentWindowID);
		  
	}

}
