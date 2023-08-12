package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _5_2_IsSelected_And_GetText_Methods {

	public static void main(String[] args){
		

		//Check box isSelected or not
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();	
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			driver.manage().window().maximize();
			
			
			WebElement gender=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span"));
			
			if(gender.isSelected()) {
				System.out.println("It is Selected");
			}
			else {
				System.out.println("It is not Selected");
			}
			driver.quit();
		
		//getText() to get the text of element
		
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver1=new EdgeDriver();
			driver1.get("https://www.facebook.com/login.php");
			driver1.manage().window().maximize();
			
			WebElement firstName=driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[4]/a[2]"));
			
			System.out.println(firstName.getText());
		
	}

}
