 /**
 * 
 */
package fileHandler;

import org.openqa.selenium.WebDriver;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class DownloadDocumentwithAnnotationFDF extends HandlerBasePage implements FileFactoryLocator{
	/**
	 * 
	 * 
	 * @param driver
	 * 
	 * 
	 */
	public DownloadDocumentwithAnnotationFDF(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 */
	public void DodownloadwithAnnotationFdf() {
		clickOnElement(FileMenu);clickOnElement(withFdfButton);	
		return;
	}
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

