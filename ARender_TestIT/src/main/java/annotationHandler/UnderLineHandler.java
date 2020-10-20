package annotationHandler;

import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;




public class UnderLineHandler  extends annotationdrawBase implements ARender____FactoryPage   {

	 /**
	  * 
	  * @param driver
	  */
    public UnderLineHandler(WebDriver driver) {
		super(driver);
	}	
   
    
    
    
    
    public void doDrowUnderline() {	getInstance(annotationdrawBase.class).doDraw(RectangleannotationIcon);
	   waitViewIconPresent();  } 
    /**
     * 
     * 
     * 
     * @throws InterruptedException
     */
    public void doStyleunderLine() throws InterruptedException {getInstance(RichStyleToolbar.class).addAnnotation();
    	getInstance(RichStyleToolbar.class).backcolorsButton();getInstance(RichStyleToolbar.class).borderWidthButton();
    	getInstance(RichStyleToolbar.class).bordercolorsButton(); getInstance(RichStyleToolbar.class).stylesbordureButton();
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
