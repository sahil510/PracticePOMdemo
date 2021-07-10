package TestCase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\PracticeProject\\Browser\\chromedriver111.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://traderroom.azurewebsites.net/");
		driver.findElement(By.partialLinkText("Let's Get Start")).click();
	driver.findElement(By.xpath("//label[contains(text(), \"                                I confirm that I've read the \")]")).click();;
		
     // WebElement e=driver.findElement(By.xpath("//label[@class='custom-control-label'][@for='check_cust_terms1']"));
     // Actions actions = new Actions(driver);

     // actions.moveToElement(e).click().perform();
}

}
