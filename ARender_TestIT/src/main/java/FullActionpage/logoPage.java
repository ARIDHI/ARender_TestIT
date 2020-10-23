/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */
public class logoPage extends HandlerBasePage implements ARender____FactoryPage {

	public logoPage(WebDriver driver) {
		super(driver);
	}
	 /**
     *  
     *  @throws wait to notification message appear
     *  @draw a polygone annotation 
     *  @throws InterruptedException
     * 
     */
   public String VersionCheck() {
	   clickOnElement(ARenderLogo);
	   return findElement (ARenderversion).getText();
   }
   /**
    * 
    * 
    * @version staging 1.35
    * @validate review by ARIDHI Hichem 
    * {@docRoot} c:/
    * 
    * 
    */
}
