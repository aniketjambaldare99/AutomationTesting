package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _3_FB_Login_IDLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		WebElement text_EmailAdd=driver.findElement(By.id("email"));
		text_EmailAdd.sendKeys("aniketjambaldare99@gmail.com");
		
		WebElement text_Pass=driver.findElement(By.id("pass"));
		text_Pass.sendKeys("xyz");
		
		
		
		WebElement btn_LoginBtn=driver.findElement(By.id("loginbutton"));
		btn_LoginBtn.click();
		
		//Verify
		String home_page=driver.getTitle();
		System.out.println(home_page);
		
		if (home_page.equals("(20+) Facebook")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case Fail");
		}
	}

}
