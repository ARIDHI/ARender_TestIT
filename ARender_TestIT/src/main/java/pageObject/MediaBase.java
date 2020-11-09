/**
 * 
 */
package pageObject;

import java.io.File;
import java.util.Date;

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

	   public static String getReportName() {
			String fileName = "ARenderReport.html";
			return fileName;	 
		 }
	  

		 public static String takesScreenShots (WebDriver driver, String methodName) {
				String fileName = getScreenshotName(methodName);
				String directory =System.getProperty("user.dir")+ "/Snapshots/";
				new File(directory).mkdirs();
				String path	= directory + fileName;	 
			  
				try {
					File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		            FileUtils.copyFile(screenshot, new File(path));		
				System.out.println("=============================================== /n");
				System.out.println("Screenshot stored at :" +path +"\n");
				System.out.println("===============================================");
				}
			    catch(Exception e) { 	
			    }
				return path;
			}
		   
		   public static String getScreenshotName(String methodName) {
			   Date d = new Date();
			   String fileName = methodName +" "+ d.toString().replace(":", "_").replace(" ", "_") +".png";
			   return fileName;
			   
		   }
}
