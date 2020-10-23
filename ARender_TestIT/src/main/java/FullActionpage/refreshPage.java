package FullActionpage;

import org.openqa.selenium.WebDriver;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class refreshPage extends HandlerBasePage implements ARender____FactoryPage{
/**
 * 
 * @param driver
 */
	public refreshPage(WebDriver driver) {
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