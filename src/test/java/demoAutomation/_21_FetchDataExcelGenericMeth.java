package demoAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _21_FetchDataExcelGenericMeth {

	public static void main(String[] args) throws Exception {		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		/*
		 * XSSFCell data_0_0=Reusable_Methods.fetchStringDataFromExcel("Sheet1", 0, 0);
		 * System.out.println(data_0_0);
		 */
				
		String data_0_1=Reusable_Methods.fetchConNumToStringDataFromExcel("Sheet1", 0, 1);
		System.out.println(data_0_1);		
	}

}
