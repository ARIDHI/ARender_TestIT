package annotationHandler;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class StumpAnnotaionHandler extends annotationdrawBase implements ARender____FactoryPage {
	/**
	 * 
	 * @param driver
	 */
	public StumpAnnotaionHandler(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		  
    public void doDrowStamp() {clickOnElement(annotationMenu);
       clickOnElement(stumpannotationIcon) ;} 
 
         /**
          * 
          * 
          * @throws InterruptedException
          */
    	 public void doDrawFreeStamp() throws InterruptedException { 
    	 builder.doubleClick(findElement(tamponpersoField)).
    	 sendKeys(Keys.DELETE)	
    	 .sendKeys( "Glade With ARender").
    	 perform();
    	 clickOnElement(tamponpersoButton);
    	 clickOnElement(drawLocationPath);   
    	 waitViewIconPresent(); 
    	 Thread.sleep(500);	 
       } 
    	 
    	 public int StampList() {
    		 List<WebElement> stamList= findElements(StamList);
			return stamList.size();	 
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
