/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */
public class logoFonction extends HandlerBasePage implements FactoryLocator {

	public logoFonction(WebDriver driver) {
		super(driver);
	}

   public String VersionCheck() {
	   clickOnElement(ARenderLogo);
	   return findElement (ARenderversion).getText();
   }

}
