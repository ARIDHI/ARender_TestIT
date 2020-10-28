/**
 * 
 */
package pageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author ARIDHI HICHEM
 *
 */
public class TestBase {
 
	public static WebDriver driver = null; 
	public static Properties prop;
	public static HandlerBasePage page;
	public static EventFiringWebDriver e_driver;
    public static LocatorListner webListner;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public ExtentTest extentTest;
	public static int PAGE_LOAD_TIMEOUT =20 ;
	public static int IMPLICIT_WAIT =20 ;
    public TestBase() {
    	/**
    	 * 
    	 * 
    	 */	
    try {
    	prop = new Properties();
    	File src = new File(".\\src\\config\\config.properties");
    	FileInputStream ip = new FileInputStream(src);
    	prop.load(ip);
    	
    } catch (FileNotFoundException e) {
    	System.out.println("Properties file not found !");
    	e.printStackTrace();
    }catch (IOException e) {
    	e.printStackTrace();
    }
 } 

    @BeforeClass 
    public static void initialization()  {
    	
       //TODO init Extent Report 4.0.9
       /** @see TestListeners */
	   //TODO init driver WebDriver
    	
    	String browserName = prop.getProperty("browser");
    	 if(browserName.equals("Chrome")) { 
			 System.setProperty("webdriver.chrome.driver",
					 prop.getProperty("ChromeDriverService"));
			  driver = new ChromeDriver();	    
		 }
		 else if(browserName.equals("IE")) { 
			 System.setProperty("webdriver.edge.driver",
					 prop.getProperty("Edgewebservice"));
			  driver = new EdgeDriver();
		 }
    	 
		 else if(browserName.equals("FF")) {
			 System.setProperty("webdriver.gecko.driver", 
					 prop.getProperty("FirefoxDriverService")); 			 
			  driver = new FirefoxDriver();
		 }
		 else { 
			 System.out.println("no browser is defined in 'config.properties' file ! ");
		 }
    	 
    	 //TODO Init Window && Listeners
    	 e_driver = new EventFiringWebDriver(driver);
		 webListner = new LocatorListner();
		 e_driver.register(webListner);
		 driver = e_driver;
   	     driver.manage().window().maximize();  
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
	     driver.get(prop.getProperty("url"));
	     page = new HandlerBasePage(driver);  
	     
	     }

	@AfterClass
	 public void tearDown() {	
		  
		 driver.close();
		 driver.quit();
	 } 

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
