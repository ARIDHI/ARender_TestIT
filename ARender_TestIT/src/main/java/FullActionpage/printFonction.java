/**
 * 
 */
package FullActionpage;

import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class printFonction extends HandlerBasePage implements FactoryLocator {
	String parentWindowHandle = driver.getWindowHandle();
	Set <String> subWindow = driver.getWindowHandles();

/**
 * 
 * @param driver
 */
	public printFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @throws InterruptedException
 */
	 public void printallfile() throws InterruptedException {
		 
		 clickOnElement(printBtn); clickOnElement(printallfiles);
		    clickOnElement(printConfirmButon);
			
		for(String subWindow:driver.getWindowHandles())
		{
			if(!parentWindowHandle.equalsIgnoreCase(subWindow)) {
			driver.switchTo().window(subWindow);
			 builder.keyDown(Keys.LEFT_CONTROL).sendKeys("p").build().perform();
				Thread.sleep(2000);
			}
			break;
	}
 } 
/**
 *  
 * @throws InterruptedException
 */
	 public void printfileWithoutannotation() throws InterruptedException {	 
		 clickOnElement(printBtn);clickOnElement(printConfirmButon);
			
			for(String subWindow:driver.getWindowHandles())
			{
				if(!parentWindowHandle.equalsIgnoreCase(subWindow)) {
				driver.switchTo().window(subWindow);
				 builder.keyDown(Keys.LEFT_CONTROL).sendKeys("p").build().perform();
					Thread.sleep(2000);
				}
				break;
		}
 }
/**
 *  
 * @throws InterruptedException
 */
	 public void printfileWithannotation() throws InterruptedException { clickOnElement(printBtn);clickOnElement(printoncefile);
		 clickOnElement(printWithAnno); clickOnElement(printConfirmButon);	 
			
			for(String subWindow:driver.getWindowHandles())
			{
				if(!parentWindowHandle.equalsIgnoreCase(subWindow)) {
				driver.switchTo().window(subWindow);
				 builder.keyDown(Keys.LEFT_CONTROL).sendKeys("p").build().perform();
					Thread.sleep(2000);
				}
				break;
		}
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