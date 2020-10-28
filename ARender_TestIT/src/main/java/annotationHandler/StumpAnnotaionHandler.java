package annotationHandler;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.FactoryLocator;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class StumpAnnotaionHandler extends annotationdrawBase implements FactoryLocator {

	public StumpAnnotaionHandler(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		  
    public boolean doDrowStamp() {
    	  clickOnElement(annotationMenu);
          clickOnElement(stumpannotationIcon) ;
        return false;
        } 
 	 
     public int StampList() {
    	 List<WebElement> stamList= findElements(StamList);
		return stamList.size();	 
    	 }
}

