package StepDefinitons;


import org.junit.jupiter.api.Assertions;

import PageObjects.LoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginSteps extends BaseClass{
	
	//LoginPage login;
	
	
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside step - browser is open");
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step - user is on login page");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside step - user enter username and password");
		
		login=new LoginPage();
		
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		
	}

	@And("user click login button")
	public void user_click_login_button() {
		System.out.println("Inside step - user click login button");

		login.clickLoginButton();
		
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		System.out.println("Inside step - user is navigated to homepage");
		
		Assertions.assertTrue(driver.getPageSource().contains("dashboard"));
		
	}

	
}
