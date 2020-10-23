/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class rotation extends HandlerBasePage implements ARender____FactoryPage{

	public rotation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement getLeftRotate() {
		for(int i=0; i<4; i++) {
		    clickOnElement(turnLeft);	
		}
		return null;
	  }
	public WebElement getRightRotate() {
		for(int i=0; i<4 ; i++) {
		   clickOnElement(turnRight);	
		}
		return null;
	  }
}
