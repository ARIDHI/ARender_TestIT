/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */
public class fullscreenFonction extends HandlerBasePage implements FactoryLocator{
	
	public fullscreenFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement fullscreenizer() {	
	    clickOnElement(fullScreen);	
         builder.moveByOffset(100, 0).build().perform();
		return null;
	  }
	
	public void defullscreenizer() {
		builder.sendKeys(Keys.ESCAPE).build().perform();
		}
  }


