package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;

public class LoginPage extends BaseClass{

	private By tf_username=By.name("username");
	private By tf_password=By.name("password");
	private By btn_login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public void enterUsername(String username) {
		driver.findElement(tf_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(tf_password).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(btn_login).click();
	}
	
}
