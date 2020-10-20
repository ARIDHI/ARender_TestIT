/**
 * 
 */
package pageObject;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author ARIDHI HICHEM 
 *
 */
public class ExtentManager {
	
	
	private static ExtentReports extent;
	      
	
	
 public static ExtentReports createInstance() {
	 String fileName = getReportName();
	 String directory = System.getProperty("user.dir")+"/Reports/";
	 new File(directory).mkdirs();
	 String path = directory + fileName ;
	 
	 
	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
//	 htmlReporter.config().setEncoding("utf-8");
	 htmlReporter.config().setDocumentTitle("ARender Test Reports");
	 htmlReporter.config().setTheme(Theme.DARK);
	 
	 extent = new ExtentReports();
	 extent.setSystemInfo("Host Name", "ARONDOR");
	 extent.setSystemInfo("Departement", "QA Autmation");
	 extent.setSystemInfo("Environement", "ARender Web Application");
	 extent.setSystemInfo("Browser",System.getProperty("browser"));
	 extent.attachReporter(htmlReporter);
	 
	 return extent ;
 }

 public static String getReportName() {
	Date d = new Date();
	String fileName = "ARenderReport_" + "_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	return fileName;	 
 }
}