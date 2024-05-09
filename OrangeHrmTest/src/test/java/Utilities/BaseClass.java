package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginPage;

public class BaseClass {

	public static LoginPage login;
	
	public static WebDriver driver;
	//public static WebDriverWait wait;
	
	public void setupDriver() {
		
		 if(driver==null) {
			 String projectpath=System.getProperty("user.dir");
			    
			 System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
			    
			 driver=new ChromeDriver();

			 //wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			 
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			    
			 driver.manage().window().maximize();	    
			
		 }
	}
	
	public void teardownDriver() {
		if(driver!=null) {
			driver=null;
		}
	}
	
}
