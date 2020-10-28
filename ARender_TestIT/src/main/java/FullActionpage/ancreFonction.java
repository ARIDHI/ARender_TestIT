/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;

import Locators.BaseFonctionLocators;
import pageObject.HandlerBasePage;


public class ancreFonction extends HandlerBasePage implements BaseFonctionLocators {

	public ancreFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 
	public boolean enterToContextualMenu () {
		builder.contextClick(findElement(Thumb_Image)).perform();
		return false; 
	}
	
	public boolean copyAncreTextFromLink() {
		clickOnElement(copy_Ancre);
		return false;
	}
	
	public boolean skipAncreTextLink() {
		clickOnElement(ancre_Button);
		clickOnElement(skip_Ancre);
	    return false;	
	}
}
