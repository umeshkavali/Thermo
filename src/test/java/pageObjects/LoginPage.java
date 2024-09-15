package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

//	public WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		super();
	}
	
	@FindBy(xpath="//span[@id='sign-in-toggle']")
	@CacheLookup
	WebElement btnSignInToggle;	
	
	@FindBy(xpath="//li[@id='sign-in']//span[@class='cmp-ctaitem__text'][normalize-space()='Sign in']")
	@CacheLookup
	WebElement li2SignIn;
	
	@FindBy(xpath="//span[@id='sign-in-toggle']")
	@CacheLookup
	WebElement txtUser;
	
	@FindBy(xpath="//input[@id='next-button']")
	@CacheLookup
	WebElement btnNxt;
	
	@FindBy(xpath="//input[@id='password-field']")
	@CacheLookup
	WebElement txtPass;
	
	@FindBy(xpath="//input[@id='signin-button']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(xpath="//span[@id='logged-in-toggle']")
	@CacheLookup
	WebElement btnLogedInToggle;
	
	@FindBy(xpath="//div[@class='create-account']//a[normalize-space()='Sign Out']")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void enterUserName(String username)
	{
		txtUser.clear();
		txtUser.sendKeys(username);
	}
	
	public void clickOnNextButton()
	{
		btnNxt.click();
	}
	
	public void enterPassword(String password)
	{
		txtPass.clear();
		txtPass.sendKeys(password);
	}
	
	public void clickOnSubmit()
	{
		btnSubmit.click();
	}
	
	public void clickSignInToggle()
	{
		btnSignInToggle.click();
	}
	
	public void clickSignInLink()
	{
		li2SignIn.click();
	}
	
	
	public void clickOnLogInToggle()
	{
		btnLogedInToggle.click();
	}
	
	public void clickOnLogout()
	{
		lnkLogout.click();
	}
	
	public void verifyLogout()
	{
		boolean display = lnkLogout.isDisplayed();
		System.out.println(display);
	}
	
	

}
