package factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.BasePage;

public class BaseClass
{
	
	static WebDriver driver;	
    static Properties p;
  	     
public static WebDriver initilizeBrowser() throws IOException
{
	
	if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
	{

		switch(getProperties().getProperty("browser").toLowerCase()) 
		{
		
		case "chrome":
	        driver=(WebDriver) new ChromeDriver(); break;
	    case "edge":
	    	driver=(WebDriver) new EdgeDriver(); break;
	    case "firefox":
	    	driver = (WebDriver) new FirefoxDriver(); break;

	    default:
	        System.out.println("No matching browser");
		}
	
	}
	
	driver.manage().deleteAllCookies(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 return driver;
	 
}

public static WebDriver getDriver() 
{
	return driver;
}
	

public static Properties getProperties() throws IOException
{		 
	FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");   		
    p=new Properties();
	p.load(file);
	return p;
}

}
