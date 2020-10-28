/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class SaveCancelFonction extends HandlerBasePage implements FactoryLocator {
/**
 * 
 * @param driver
 * 
 * 
 */
	public SaveCancelFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public WebElement saveData() {
		  return clickOnElement(saveBtn);	  
	  }
 
	 public WebElement cancelStyleBar() {
		  return clickOnElement(cancelAnnotationButton);	  
	  }
	
}
