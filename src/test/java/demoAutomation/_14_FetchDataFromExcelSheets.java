package demoAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _14_FetchDataFromExcelSheets {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//String path="C:\\Users\\anike\\Desktop\\Software testing\\JAVA Testing\\AutomationProject\\Test Data\\Sample_Employee_data_xlsx.xlsx";
		
		String path="C:\\Users\\anike\\Desktop\\Software testing\\JAVA Testing\\AutomationProject\\Test Data\\Data For Validation.xlsx";
	
		//For ---> As per user System when any one accessing from repo..
		
		/*
		 * String Filepath=System.getProperty("user.dir")+"\\TestData\\Sample_Employee_data_xlsx.xlsx"; 
		 * String asPerUserpath=System.getProperty("user.dir");
		 * System.out.println(asPerUserpath); 
		 * FileInputStream fisSystem=new FileInputStream(Filepath);
		 */
		
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	    String data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data_0_0);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data_0_0);
		
		String data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data_0_1);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(data_0_1);
		
		/*
		 * String
		 * data_0_9=wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
		 * System.out.println(data_0_9);
		 * 
		 * driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(data_0_9);
		 */
	}
		
	
}
