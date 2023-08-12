package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _20_IframesHandle_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		 // Mainpage -->Frame1 --->Mainpage
        //Mainpage--Frame1--->Mainpage ---Frame2
		
	    //driver.switchto().frame();
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
    //Frame 0     
        //driver.switchTo().frame(0); // index 
        driver.switchTo().frame(frame1); // WebElement element 
        
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame 1 : aniket@99");
        
        driver.switchTo().defaultContent(); // Switch mainpage 
    //Frame 1       
        driver.switchTo().frame(1); // 
        
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame 2 : aniket@99");

        driver.switchTo().defaultContent();
   //Frame 2     
        driver.switchTo().frame(2);
      //div[@class='rseUEf nQOrEb'])[2]
        WebElement frame2_Ele_1=driver.findElement(By.xpath("//input[@name='mytext3']"));
        Reusable_Methods.sendValueToElement(frame2_Ele_1, "Frame 3 : aniket@99");
        
        driver.switchTo().defaultContent();
   //Frame 3      
        driver.switchTo().frame(3);
        
          WebElement frame2_Ele_2=driver.findElement(By.xpath("//input[@name='mytext4']"));
          Reusable_Methods.sendValueToElement(frame2_Ele_2, "Frame 4 : aniket@99");
   
        driver.switchTo().defaultContent();
   //Frame 4     
        driver.switchTo().frame(4);
          
          WebElement frame2_Ele_3=driver.findElement(By.xpath("//input[@name='mytext5']"));
          Reusable_Methods.sendValueToElement(frame2_Ele_3, "Frame 5 : aniket@99");
        
	}

}
