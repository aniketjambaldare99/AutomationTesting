package demoAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _18_WindowHandleBySetStringList {

	public static void main(String[] args) throws Exception {		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window ID : "+parentWindow);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> all_Wind_ID=driver.getWindowHandles();
		
		List<String> list=new ArrayList<String>(all_Wind_ID);
		
		System.out.println("All Window ID :");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		 
		Thread.sleep(3000);
		
		for(int i=0;i<list.size();i++) {
			if(parentWindow!=list.get(i)) {
				driver.switchTo().window(list.get(i));
			}
		}
		driver.close();
	}

}
