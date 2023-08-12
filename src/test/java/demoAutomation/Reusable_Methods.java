package demoAutomation;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

		public class Reusable_Methods {
		
//----------------------Click On Element--------------------------------------------	
			
			public static void clickOnElement(WebElement element) {
					
					if(element.isDisplayed() && element.isEnabled()) {
						element.click();
					}
					else {
						System.out.println("Button is not Clickable");
					}
				}
	
//---------------------Send Value to Element-----------------------------------------
		
			public static void sendValueToElement(WebElement element,String value) {
						
						if(element.isDisplayed() && element.isEnabled()) {
							
							element.sendKeys(value);
							
						}
						else {
							System.out.println("Feild is Disable");
						}
				}
	
//---------------------Drag And Drop Element--------------------------------------------
		
			public static void dragAndDrop(WebDriver driver,WebElement src,WebElement dtns) {
				
				Actions act=new Actions(driver);
				act.dragAndDrop(src, dtns).build().perform();
			}
		
//-----------------------Keyboard Actions------------------------------------------------
		
			public static void kayboardActions(WebDriver driver,WebElement element,String text,WebElement element2) {
				
			//Lower to Upper Case given String
				
				Actions act=new Actions(driver);
				act.keyDown(element, Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).build().perform();
				
			// ctrl A to select a value 
				
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				
			// ctrl C to copy the value in Box
				
				act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
				
				
		    //select a new feild to paste 
				
				element2.click();
				  
				
		    // ctrl V to paste copied value
				
				  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
				 
				 
			}
			
//--------------------------Handle Alert-----------------------------------------------------------------
			
			public static Alert handleAlert(WebDriver driver) {
				
				return driver.switchTo().alert();
						
			}
			
//------------------------Handle Frames------------------------------------------------------------------			
			
			public static void HandleFrame(WebDriver driver,WebElement element) {
				try {
				     driver.switchTo().frame(element); // Mainapge -->Frame
				
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
			
//-----------------------Fetch data from Excel String and numeric--------------------------------------------
			
			public static XSSFCell fetchStringDataFromExcel(String sheetName,int rowNo,int cellNo ) throws Exception {
				
				String filePath=("user.dir")+"\\TestData\\Data.xlsx";
				FileInputStream fis =new FileInputStream(filePath); 
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				
				return wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
				
						
			}
			
			public static String fetchConNumToStringDataFromExcel(String sheetNameNum,int rowNoNum,int cellNoNum ) throws Exception {
							
							String filePath=("user.dir")+"\\TestData\\Data.xlsx";
							FileInputStream fis =new FileInputStream(filePath); 
							XSSFWorkbook wb=new XSSFWorkbook(fis);
							
							XSSFCell data= wb.getSheet(sheetNameNum).getRow(rowNoNum).getCell(cellNoNum);
							return String.valueOf(data).replace(".0", "");	
							
						}
}
