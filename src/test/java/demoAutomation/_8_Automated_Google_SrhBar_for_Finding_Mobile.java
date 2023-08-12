package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _8_Automated_Google_SrhBar_for_Finding_Mobile {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Isenable method to know perticuler Feild is enable or not

		WebElement srh_BarFlipkart = driver.findElement(By.xpath("//textarea[@name='q']"));
		System.out.println(srh_BarFlipkart.isEnabled());

		if (srh_BarFlipkart.isEnabled() == true) {
			srh_BarFlipkart.sendKeys("iPhone");
		} else {
			System.out.println("Feild is Unable");
		}
		
		Thread.sleep(3000);

		// All list of suggestions regarding input-->Ex:Iphone

		List<WebElement> list = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		System.out.println(list.size());

		// Printing entire list of element that are suggested

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			
			if(text.equals("iphone 13")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb ob9lvb']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
