/**
 * 
 */
package BaseClass;

import java.util.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



import java.io.*;
import java.text.SimpleDateFormat;

/**
 * 
 * 
 */

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	//***************Extent Report USed ***********************//
	public static String FS = File.separator;

	public static String OSName = System.getProperty("os.name");
	public static String OSArchitecture = System.getProperty("os.arch");
	public static String OSVersion = System.getProperty("os.version");
	public static String OSBit = System.getProperty("sun.arch.data.model");
	public static String ProjectWorkingDirectory = System.getProperty("user.dir");
	public static final String OUTPUT_FOLDER =  "./test-output/Test_Report/";
	public static final String FILE_NAME = "Extent Report.html";
	public ExtentReports extent;
	public ISuite suite;
	public ISuiteResult res;
	public ExtentTest test;	
	//********************Extent Report End ****************************//


	
	public TestBase() {

		File file = new File("D:/Eclipse/PracticeProject/DesignPageFactory/COnfiguration/config.properties");
		try {
			//Reporter.log("Propety File Loading start");
			prop = new Properties();
			FileInputStream fileinput = new FileInputStream(file);
			prop.load(fileinput);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public   String getbrow()
                 {
		        String BrowserNAme = prop.getProperty("browser");
                 return BrowserNAme;
                   }
	public  static String getScreenhot(WebDriver driver, String Scname) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+Scname+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static void Intialization() {

		String BrowserNAme = prop.getProperty("browser");

		if (BrowserNAme.equalsIgnoreCase("chrome")) {

			 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\PracticeProject\\Browser\\chromedriver111.exe");
				driver = new ChromeDriver();
			
		} else if (BrowserNAme.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\PracticeProject\\Browser\\geckodriver.exe");
				driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	

}
