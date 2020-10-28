/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class searchFonction extends HandlerBasePage implements FactoryLocator{

	public searchFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 */
	public void getSearchBox() { clickOnElement(searchReposotor);
		builder.doubleClick(findElement(search))
	       .sendKeys(Keys.DELETE).sendKeys("ARender").build().perform();
		 clickOnElement(searchButton);
	}
}
 