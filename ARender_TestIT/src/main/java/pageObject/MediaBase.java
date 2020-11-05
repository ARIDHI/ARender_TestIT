/**
 * 
 */
package pageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author ARIDHI HICHEM
 *
 */
public class MediaBase extends TestBase {
	
	public MediaBase()  {
		super();
	} 
	
	   public static String takesScreenShots (WebDriver driver, String name) throws IOException {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destination =System.getProperty("user.dir")+"/Snapshots/"+name  +".png";
		    FileUtils.copyFile(srcFile, new File(destination));		 
		    return destination ;
		}
	   
	   public static String getReportName() {
			String fileName = "ARenderReport.html";
			return fileName;	 
		 }
	   
	   
}
