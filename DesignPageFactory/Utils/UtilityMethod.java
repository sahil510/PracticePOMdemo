/**
 * 
 */
package Utils;

import java.io.*;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.TestBase;





/**
 * @author sahil
 *
 */
public class UtilityMethod extends TestBase{
	
	public static String Login_testdatasheet="D://Eclipse//PracticeProject//DesignPageFactory//TestDataSheet//LoginSheet.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	private static int count=0;

	public UtilityMethod() {
		
	}

	public static Object[][] GetTestData(String Sheetname) 
	{
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(Login_testdatasheet);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}  catch (IOException e) {
			e.printStackTrace();
		}
		 sheet = book.getSheet(Sheetname);
		
		 int numrow = sheet.getLastRowNum();
	        int numcol = sheet.getRow(0).getLastCellNum();
	        Object[][] data = new Object[numrow][numcol];
	        for (int i = 0; i < numrow; i++) {
	            for (int j = 0; j < numcol; j++) {
	    
	               data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
	            }
	        }
	        return data;
	       
	}
	
	public static WebElement iselementpresent(WebDriver driver,String xpath,int time) 
	{
		WebElement element=null;
		for(int i=0;i<time;i++)
		{
		try{
		element=driver.findElement(By.xpath(xpath));
		break;
		}
		catch(Exception e)
		{
		try 
		{
		Thread.sleep(1000);
		} catch (InterruptedException e1) 
		{
		System.out.println("Waiting for element to appear");
		}
		}
		}
		return element;
	}
	
	public static void captureScreenShot(WebDriver driver,String Screenshotname) {
		try {
			count++;
			TakesScreenshot tc=(TakesScreenshot)driver;
			File Source=tc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File(OUTPUT_FOLDER+Screenshotname+count+".png"));
			System.out.println("Screenshot taken");
		}
		catch(Exception st)
		{
			System.out.println("Exception while taking screenshot "+st.getMessage());

		}
	}

		   
}
