/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import annotationHandler.annotationdrawBase;
import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class zoomFonction  extends HandlerBasePage implements FactoryLocator {

	/**
	 * 
	 * @param driver
	 */
	public zoomFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return zoom fonction Button
	 */
	
	public WebElement getZoomIn() {
		for(int i=0; i<9; i++) {
		    clickOnElement(zoomInButton);	
		}
		return null;
	  }
	public WebElement getZoomOut() {
		for(int i=0; i<5 ; i++) {
		   clickOnElement(zoomOutButton);	
		}
		return null;
	  }
	public WebElement getzoomInZoneButton() {
		  return clickOnElement(zoomInZoneButton);	  
	  }
	public WebElement getFullHeightButton() {
		  return clickOnElement(FullHeightButton);	  
	  }
	public WebElement getFullWidthButton() {
		  return clickOnElement(FullWidthButton);	  
	  }
	public WebElement getFullPageButton() {
		  return clickOnElement(FullPageButton);	  
	  }
	public WebElement getzoomBox() {
		  return findElement(zoomBox);	  
	  }
	/**
	 * 
	 * @throws InterruptedException
	 */
	public void setZoomBox() throws InterruptedException { 
 	      builder.doubleClick(getzoomBox()).build().perform();
 	 	   Thread.sleep(2000);
    	    getzoomBox().sendKeys(Keys.DELETE);
		     getzoomBox().sendKeys("100");	  
		      getzoomBox().sendKeys(Keys.ENTER);
	  }
	public void ZoomInZone() {
		getzoomInZoneButton();
		  builder.dragAndDropBy(getInstance(annotationdrawBase.class)
				  .getDrawLocationPath(), 190, 127).build().perform();
	}
}
