/**
 * 
 */
package pageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



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
    public static ExtentReports extent;
    public static ExtentTest logger;
	public static int PAGE_LOAD_TIMEOUT =20 ;
	public static int IMPLICIT_WAIT =20 ;
	
    public TestBase() {
    	
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
	
	@BeforeTest
    public void setExtent()  {
		
         extent = new ExtentReports(System.getProperty("user.dir")+"./Reports/ARenderReports.html",true);
		 extent.addSystemInfo("Host Name", "ARIDHI");
		 extent.addSystemInfo("Departement", "ARONDOR QA Auotmation");
		 extent.addSystemInfo("Environement", "ARender localHost HautDispo");
    }
	
    @AfterTest
    public void endReport()  {
     extent.flush();
     extent.close();
    }
  
	 @BeforeMethod
	 public void startReport(Method method) throws Exception   {	 
		 logger = extent.startTest(method.getName());
	 }
	 
	 @AfterMethod 
	 public void reporteResu(ITestResult result) throws Exception {
	   String screenshotPath = pageObject.MediaBase.takesScreenShots(driver, result.getName());
	   
		 if (result != null && result.getStatus()== ITestResult.SUCCESS) {

			 logger.log(LogStatus.PASS,  result.getName() +"PASS : " );
			 logger.log(LogStatus.PASS, logger.addScreenCapture(screenshotPath)); //to add screendhot in extent report
			 logger.log(LogStatus.PASS, "<a href='"+ result.getName()+ ".mov" +"'><spa, class='lable info'>Download gif</span></a>");
		 }
		 
		 else if (result != null && result.getStatus()==ITestResult.FAILURE) {
			 
	    	 logger.log(LogStatus.FAIL, result.getName() +"FAIL ! : "  );		
			 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath)); //to add screendhot in extent report
			 logger.log(LogStatus.FAIL, "<a href='"+ result.getName()+ ".mov" +"'><spa, class='lable info'>Download gif</span></a>");
			 logger.log(LogStatus.FAIL, "TEST FAILED : "  +result.getThrowable());
		 }
		
		 else {	
			 
			 logger.log(LogStatus.SKIP, "TEST SKIPED : "+result.getName());
			 logger.log(LogStatus.SKIP, "TEST FAILED : " +result.getSkipCausedBy());
		 }	
		 
		 extent.endTest(logger);
	 }	    	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
