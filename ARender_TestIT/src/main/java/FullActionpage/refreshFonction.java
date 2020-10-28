package FullActionpage;

import org.openqa.selenium.WebDriver;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class refreshFonction extends HandlerBasePage implements FactoryLocator{
/**
 * 
 * @param driver
 */
	public refreshFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * @see
 * @return
 */
    public void getRefresh() {
    	clickOnElement(refreshBtn);
    	return;
    }
}
/**
 * 
 * 
 * @version staging 1.35
 * @validate review by ARIDHI Hichem 
 * {@docRoot} c://
 * 
 */