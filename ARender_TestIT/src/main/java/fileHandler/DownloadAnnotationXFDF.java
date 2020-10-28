package fileHandler;

import org.openqa.selenium.WebDriver;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class DownloadAnnotationXFDF  extends HandlerBasePage implements FileFactoryLocator{
	
	public DownloadAnnotationXFDF(WebDriver driver) {
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