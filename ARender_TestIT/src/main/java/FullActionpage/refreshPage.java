package FullActionpage;

import org.openqa.selenium.WebDriver;

import pageObject.ARender____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class refreshPage extends HanlerBasePage implements ARender____FactoryPage{
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