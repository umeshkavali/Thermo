package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateANewUserPage extends BasePage
{
	public WebDriver driver;

	public CreateANewUserPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath = "//button[(text()='Accept All')]")
@CacheLookup
WebElement accept_Coockie;

public void accept_All() 
{
	accept_Coockie.click();
	
}
	
@FindBy(xpath="//span[@id='sign-in-toggle']")
@CacheLookup
WebElement signIn;

public void ClickOn_signIn()
{
	
	signIn.click();
}
@FindBy(xpath="//li[@id='sign-in']//a[normalize-space()='Create Account']") 
@CacheLookup private 
WebElement createAccount_Link;

public void ClickOn_CreateAccount_Link() 
{
	createAccount_Link.click();
}

@FindBy(xpath="//span[normalize-space()='Why you should create an account']")
@CacheLookup
WebElement whyYouShouldCreateAnAccou;

public boolean verify_Question_Text()
{
	boolean question_Status = whyYouShouldCreateAnAccou.isDisplayed();
	return question_Status;
}



@FindBy(xpath="//input[@role='main']")
@CacheLookup
public WebElement first_Name;

public void enterFName(String fname)
{
	first_Name.clear();
	first_Name.sendKeys(fname);
}

@FindBy(xpath="//input[@formcontrolname='lastName']")
@CacheLookup
public WebElement lastName;

public void enterLName(String lname)
{
	lastName.clear();
	lastName.sendKeys(lname);
}

@FindBy(xpath="//input[@formcontrolname='email']")
@CacheLookup
public WebElement email;

public void enterEmail(String mailId)
{
	email.clear();
	email.sendKeys(mailId);
}

@FindBy(xpath="//input[@id='reg-form-password']")
@CacheLookup
public WebElement regformpassword;

public void enterRegPassword(String pwd)
{
	regformpassword.clear();
	regformpassword.sendKeys(pwd);
}

@FindBy(xpath="//div[@class='placeholder bold']")
@CacheLookup
WebElement country_India;

public void selectCountry()
{
	
}

@FindBy(xpath="(//span[@class='checkmark'])[2]")
@CacheLookup
WebElement radio_no;

public void radio_Button_NO()
{
	radio_no.click();
}


@FindBy(xpath="//button[@id='create-account-button']")
@CacheLookup
WebElement createAccount;

public void createAccount_Button()
{
	createAccount.click();
}

@FindBy(xpath="//input[@name='otpCode']")
@CacheLookup
WebElement otpCode;

@FindBy(xpath="//button[normalize-space()='Submit']")
@CacheLookup
WebElement submit;

public void clickOnSubmitButton()
{
	submit.click();
}

@FindBy(xpath="//div[@class='title']")
@CacheLookup
WebElement thankYouForRegistration;
	
public boolean acknowledgment()
{
	boolean status = thankYouForRegistration.isDisplayed();
	return status;
}
}
