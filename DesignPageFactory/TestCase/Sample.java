package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.mail.MessagingException;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import BaseClass.TestBase;
import Utils.SendMail;
import Utils.UtilityMethod;

public class Sample extends TestBase{
	
	SendMail email;
	

	public Sample() {
		super();
	
	}

	@BeforeMethod
	public void setUp() throws Exception {
		
		email=new SendMail();
		Intialization();
	   
	}

	@Test
	public void test() throws FileNotFoundException {
		driver.findElement(By.id("abc")).sendKeys("sahil");
		
	}
	
	@AfterMethod
	 public void TearDOwn(ITestResult result) throws MessagingException,FileNotFoundException, InterruptedException {
		if(ITestResult.FAILURE==result.getStatus())// check whethere script fail 
		{
		//	System.setOut(new PrintStream(new FileOutputStream("D://output.txt")));
		//	System.out.println("Please Refer Console file save at D://output.txt ");


		UtilityMethod.captureScreenShot(driver,"Failcase");
		//	email.MailSend(SendMail.emailList, SendMail.emailSubjectTxt, SendMail.emailMsgTxt, SendMail.emailFromAddress);
			
		}
		
		driver.quit();
	  }


}
