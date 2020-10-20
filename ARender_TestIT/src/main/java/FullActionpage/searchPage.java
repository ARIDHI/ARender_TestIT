/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * @author Lenovo
 *
 */
public class searchPage extends HanlerBasePage implements ARender____FactoryPage{

	public searchPage(WebDriver driver) {
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
	/**
	 * 
	 * 
	 * @return
	 */
	public Boolean getSearchresult() {
	
		return isDisplayed(searchResult);
	}
}
