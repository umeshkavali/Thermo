package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class LoginSteps
{

	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page()
	{
		lp=new LoginPage(BaseClass.getDriver());
	}

	@Then("User should enter the username as {string}")
	public void user_should_enter_the_username_as(String username)
	{
	    lp = new LoginPage(BaseClass.getDriver());
	    lp.enterUserName(username);
	    
	}

	@Then("User should enter the password as {string}")
	public void user_should_enter_the_password_as(String pwd) 
	{
		lp = new LoginPage(BaseClass.getDriver());
	    lp.enterPassword(pwd);
	}
	
	@Then("User should click on Login button")
	public void user_should_click_on_login_button()
	{
	    
	}

	@Then("User should verify the title as Thermo Fisher Scientific - IN")
	public void user_should_verify_the_title_as_thermo_fisher_scientific_in() 
	{
		String actual_title = driver.getTitle();
		String expected_title = "Pre-Clinical - Support through Pre-Clinical Phase | Thermo Fisher Scientific - IN";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("We are on the Right Path");
		}
		
		else
		{
			System.out.println("We are not in right place");
			driver.close();
		}
	}

	@Then("User should click on Account toggle")
	public void user_should_click_on_account_toggle() 
	{
	    lp.clickOnLogInToggle();
	}

	@Then("User should verify the Logout displayed on the page")
	public void user_should_verify_the_logout_displayed_on_the_page()
	{
		lp.verifyLogout();
	}

	@Then("User should click on Logout button")
	public void user_should_click_on_logout_button() 
	{
	    lp.clickOnLogout();
	}

	@Then("Finally User should click on close the browser")
	public void finally_user_should_click_on_close_the_browser() 
	{
	    driver.quit();
	}
	

}
