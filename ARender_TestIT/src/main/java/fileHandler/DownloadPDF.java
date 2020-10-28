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
public class DownloadPDF extends HandlerBasePage implements FileFactoryLocator{
/**
 * 
 * @param driver
 */
	public DownloadPDF(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @return 
 * @throws InterruptedException
 */
	public void DodownloadPdf() throws InterruptedException { clickOnElement(FileMenu);
		Thread.sleep(500);clickOnElement(pdfButton);
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