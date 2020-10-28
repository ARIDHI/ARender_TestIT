/**
 * 
 */
package FullActionpage;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class imageProcessinFonction extends HandlerBasePage implements FactoryLocator {
	  Actions  move = new Actions (driver);   

	public imageProcessinFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @throws AWTException
 * @throws InterruptedException
 */
	public void playContrast() throws AWTException, InterruptedException {
		 clickOnElement(imageProcessin);
		   int getCX = findElement(contrastButton).getLocation().getX();
	         int getCY = findElement(contrastButton).getLocation().getY();
	  
	      move.moveByOffset(getCX+130, getCY).click().release().build().perform();
	     return;
	}
/**
 * 
 * @throws AWTException
 * @throws InterruptedException 
 */
    public void playBrightness() throws AWTException, InterruptedException { 
   	clickOnElement(imageProcessin);	

 	   int getX = findElement(brightnessButton).getLocation().getX();
         int getY = findElement(brightnessButton).getLocation().getY();
         
      move.moveByOffset(getX+130, getY).click().release().build().perform();
   return;
}

    public int ContrastResult () {
    	List<WebElement> contrastResult = findElements(contrastResultPath);
		return contrastResult.size();	
    }
    
    
    public int BrightnessResult () {
    	List<WebElement> brightnessResult = findElements(brightnessResultPath);
		return brightnessResult.size();	
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