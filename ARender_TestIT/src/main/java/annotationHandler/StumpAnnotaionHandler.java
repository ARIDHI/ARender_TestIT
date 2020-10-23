package annotationHandler;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class StumpAnnotaionHandler extends annotationdrawBase implements ARender____FactoryPage {

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

