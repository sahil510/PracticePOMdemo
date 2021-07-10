/**
 * 
 */
package BaseClass;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



/**
 * @author Deepak Mishra
 *
 */

public class InitMethod
{
	public static String FS = File.separator;

	public static String OSName = System.getProperty("os.name");
	public static String OSArchitecture = System.getProperty("os.arch");
	public static String OSVersion = System.getProperty("os.version");
	public static String OSBit = System.getProperty("sun.arch.data.model");

	public static String ProjectWorkingDirectory = System.getProperty("user.dir");
	
	public static String Reports = "./src/test/resources/Reports/";

	public static final String OUTPUT_FOLDER =  "./test-output/Test_Report/";
	public static final String FILE_NAME = "Extent Report.html";
	public ExtentReports extent;
	public ISuite suite;
	public ISuiteResult res;
	public ExtentTest test;	
	
}
