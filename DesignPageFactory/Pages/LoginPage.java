/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * @author Sahil Patel This Class Contain All the UI component
 */
public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver Ldriver) {
		this.driver = Ldriver; // delcared that both the variable Ldriver and driver are same
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "btnCustomerLogin")
	WebElement signbtn;

	public void Login(String user, String Pass, String alert) {
		if (!user.trim().equalsIgnoreCase("")) {
			username.clear();
			username.sendKeys(user);
		}
		if (!Pass.trim().equalsIgnoreCase("")) {
			password.clear();
			password.sendKeys(Pass);
		}
		signbtn.click();

		if (!alert.trim().equalsIgnoreCase("")) {
			System.out.println("inside alert");
			
		
           if(user.trim().equalsIgnoreCase(""))
           {
        	    
        	   String unamealert=driver.findElement(By.id("username-error")).getText();
        	   Assert.assertEquals(unamealert,alert);
           }
           
           if(Pass.trim().equalsIgnoreCase(""))
           {
        	   String passalert=driver.findElement(By.id("password-error")).getText();
        	   Assert.assertEquals(passalert,alert);
           }
           
           if(!user.trim().equalsIgnoreCase("")&&!Pass.trim().equalsIgnoreCase(""))
           {
			String notify = driver.findElement(By.xpath("//div[contains(text(),'Whoops! We are unable to authenticate your login credentials. Please try again with proper credentials.')]")).getText();

			Assert.assertEquals(notify,alert);
           }
		}

	}

}
