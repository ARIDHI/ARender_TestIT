/**
 * 
 */
package fileHandler;

import org.openqa.selenium.WebDriver;
import pageObject.File____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class DownloadPDF extends HanlerBasePage implements File____FactoryPage{
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