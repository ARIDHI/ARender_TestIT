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
public class DownloadAnnotationFDF extends HandlerBasePage  implements FileFactoryLocator{
	
	/**
	 * 
	 * @param driver
	 */

	public DownloadAnnotationFDF(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return
	 */
	public void Dodownloadfdf() {
		clickOnElement(FileMenu); clickOnElement(fdfButton);
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

