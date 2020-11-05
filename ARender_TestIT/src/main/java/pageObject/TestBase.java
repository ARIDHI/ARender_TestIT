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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
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
    	
     
    	
    	String browserName = System.getProperty("browser");
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
			 System.out.println("no browser is defined in Server Jenkins! ");
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
	     driver.get(System.getProperty("URL"));
	     page = new HandlerBasePage(driver);  
	     
	     }

	@AfterClass
	 public void tearDown() {	
		  
		 driver.close();
		 driver.quit();
	 } 
	
	@BeforeTest
    public static void setExtent()  {
	
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/ARenderReport.html");
         extent = new ExtentReports();
         extent.attachReporter(reporter);
         
		 extent.setSystemInfo("Host Name", "ARONDOR");
		 extent.setSystemInfo("Departement", "QA Autmation");
		 extent.setSystemInfo("Environement", "ARender Web Application");
		 extent.setSystemInfo("Browser",System.getProperty("browser"));
		
			 
    }

    @AfterTest
    public void endReport()  {
     extent.flush();
    }
  
	 @BeforeMethod
	 public void startReport(Method method) throws Exception   {	 
		 logger = extent.createTest(method.getName());
	 }
	
	 @AfterMethod 
	 public void reporteResu(ITestResult result) throws Exception {
	   String screenshotPath = pageObject.MediaBase.takesScreenShots(driver, result.getName());
	   
		 if (result != null && result.getStatus()== ITestResult.SUCCESS) {

			 logger.log(Status.PASS,  result.getName() +"PASS : " );
			 logger.pass("<b><font color=red>"+"Screenshot of failure"+"</font></br>",
	    				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			 logger.log(Status.PASS, "<a href='"+ result.getName()+ ".mov" +"'><spa, class='lable info'>Download gif</span></a>");
		 }
		 
		 else if (result != null && result.getStatus()==ITestResult.FAILURE) {
			 
	    	 logger.log(Status.FAIL, result.getName() +"FAIL ! : "  );	
	    	 logger.fail("<b><font color=red>"+"Screenshot of failure"+"</font></br>",
	    				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			 logger.log(Status.FAIL, "<a href='"+ result.getName()+ ".mov" +"'><spa, class='lable info'>Download gif</span></a>");
			 logger.fail("TEST FAILED : " +result.getThrowable().getMessage());
		 }
		
		 else {	
			 
			 logger.log(Status.SKIP, "TEST SKIPED : "+result.getName());
			 logger.skip("<b><font color=red>"+"Screenshot of failure"+"</font></br>",
	    				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			 logger.log(Status.SKIP, "TEST FAILED : " +result.getSkipCausedBy());
		 }	
		 
	 }	    	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
