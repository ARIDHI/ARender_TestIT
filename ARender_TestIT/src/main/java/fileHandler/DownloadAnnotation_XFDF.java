package fileHandler;

import org.openqa.selenium.WebDriver;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class DownloadAnnotation_XFDF  extends HandlerBasePage implements File____FactoryPage{
	
	public DownloadAnnotation_XFDF(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 *@return
	 */
	public void Dodownloadxfdf() {
		clickOnElement(FileMenu);clickOnElement(xfdfButton);		
		return;
	}
	 /**
     * 
     * 
     * @version staging 1.35
     * @validate review by ARIDHI HICHEM
     * {@docRoot} c:/
     * 
     * 
     */
}