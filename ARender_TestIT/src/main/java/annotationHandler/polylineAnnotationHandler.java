package annotationHandler;

import org.openqa.selenium.WebDriver;

import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;

/**
 *  @author ARIDHI Hichem
 *
 */
public class polylineAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage {
	/**
	 * 
	 * @param driver
	 */
    public polylineAnnotationHandler(WebDriver driver) {
		super(driver);
	}	
  
    
    
	 public void doDrowpolyline() {getInstance(annotationdrawBase.class).doDraw(polylineannotationIcon);
	    builder.moveByOffset(200, 47).doubleClick().build().perform(); waitViewIconPresent();} 
	/**
	 * 
	 * 
	 * @throws InterruptedException
	 */
	    public void doStylepolyline() throws InterruptedException {getInstance(RichStyleToolbar.class).addAnnotation();
	    	getInstance(RichStyleToolbar.class).borderWidthButton(); getInstance(RichStyleToolbar.class).bordercolorsButton();   
	    	getInstance(RichStyleToolbar.class).stylesbordureButton();	
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



