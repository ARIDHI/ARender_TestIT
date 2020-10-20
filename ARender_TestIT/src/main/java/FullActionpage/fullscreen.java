/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * @author Lenovo
 *
 */
public class fullscreen extends HanlerBasePage implements ARender____FactoryPage{
	/**
	 * 
	 * @param driver
	 */
	public fullscreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 */
	
	public WebElement getFullScreen() {	
	    clickOnElement(fullScreen);	
         builder.moveByOffset(100, 0).build().perform();
		return null;
	  }
	/**
	 * 
	 * @see
	 */
	public void EscapeFullScreen() {
		builder.sendKeys(Keys.ESCAPE).build().perform();
		}
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

