package TestCase;

import org.testng.annotations.Test;



import BaseClass.TestBase;
import Pages.LoginPage;
import Utils.UtilityMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;

import javax.mail.MessagingException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class LoginTestCase extends TestBase {
	LoginPage login;
	String Shetname = "login";

    
	public LoginTestCase() {
		super();// user for call parent class default constructor

	}
	@BeforeMethod
	public void beforeMethod() {
		// Call initialize method of parent class for Browser Setup
		Intialization();// static method so call directly or using class names
		// Created Page Object using Page Factory create to initialize page factory
		login = PageFactory.initElements(driver, LoginPage.class);
	}

	@DataProvider(name = "getLoginTestdata")
	public Object[][] getLoginTestdata() {
		Object data[][] = UtilityMethod.GetTestData(Shetname);
		return data;
	}

	@Test(dataProvider = "getLoginTestdata")
	public void CheckValidateuser(String uname, String Pass, String ALT) {
		login.Login(uname, Pass, ALT);

		// login.Login(prop.getProperty("username"), prop.getProperty("password"));
		// login.Login("lee@mailinator.com", "Welcome2020@");
	
	}

    @AfterMethod
    public void getResult(ITestResult result) throws MessagingException,FileNotFoundException, InterruptedException {
    	if(ITestResult.FAILURE==result.getStatus())// check whethere script fail 
		{
		UtilityMethod.captureScreenShot(driver, result.getTestClass().getName() 
				+ "." + result.getMethod().getMethodName());	

		}
        driver.quit();
    }

   
}
