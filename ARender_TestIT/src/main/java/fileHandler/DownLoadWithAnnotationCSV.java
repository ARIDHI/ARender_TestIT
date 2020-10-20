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
public class DownLoadWithAnnotationCSV extends HanlerBasePage implements File____FactoryPage{
	/**
	 * 
	 * @param driver
	 */
	public DownLoadWithAnnotationCSV(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 */
	public void DodownloadWithAnnotationCSV() {
		clickOnElement(FileMenu);clickOnElement(csvButton);
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

