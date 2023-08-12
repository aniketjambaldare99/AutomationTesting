package demoAutomation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
			
		 //System.setProperty("webdriver.chrome.driver", 
		 // "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
		
		/*
		 * String Filepath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		 * 
		 * String path=System.getProperty("user.dir"); System.out.println(path);
		 * //Object create FileInputStream fis=new FileInputStream(Filepath);
		 */
		String path="C:\\Users\\anike\\Desktop\\Software testing\\JAVA Testing\\AutomationProject\\Test Data\\Sample_Employee_data_xlsx.xlsx";
	      
		FileInputStream fis =new FileInputStream(path);
		
		//Object Create XSSFWorkbook
	      @SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	      
	      String Data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	      
	      System.out.println(Data_0_0);
	      
	      String Data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	      
	       System.out.println(Data_0_1);
	       
	       String data_0_2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	       System.out.println(data_0_2);
	       
	       double data_0_3=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
	       
	       String data1=String.valueOf(data_0_3);
	       System.out.println(data_0_3);
	       
	       System.out.println(data1);

	       String data2=data1.replace(".0", "");
	       System.out.println(data2);
	       //Browser Open
	     //Browser Open
	     		//WebDriverManager.chromedriver().setup();
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe"
			 * );
			 * 
			 * WebDriver driver=new ChromeDriver(); driver.get("https://www.facebook.com/");
			 * driver.manage().window().maximize();
			 */
	              
	              // Email
	              driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data1);
	              
	              //Password
	              driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Data_0_1);

	}

}

