/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class SavePageAndQuit extends HandlerBasePage implements ARender____FactoryPage {
/**
 * 
 * @param driver
 * 
 * 
 */
	public SavePageAndQuit(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 * 
	 */
	 public WebElement getSaveClick() {
		  return clickOnElement(saveBtn);	  
	  }
    /**
     * 
     * @return
     * 
     */
	 public WebElement getquitClick() {
		  return clickOnElement(cancelAnnotationButton);	  
	  }
	 /**
	     * 
	     * 
	     * @version staging 1.35
	     * @validate review by ARIDHI Hichem 
	     * {@docRoot} c://
	     * 
	     */	
}
