package annotationHandler;

import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;



public class PolygoneannotationHandler extends annotationdrawBase implements ARender____FactoryPage {
	    /**
	     * 
	     * 
	     * @param driver
	     */
	    public PolygoneannotationHandler(WebDriver driver) {
			super(driver);
		}	
        
	    
	    
		 public void doDrowpolygone() {getInstance(annotationdrawBase.class).doDraw(polygoneannotationIcon);
		 builder.moveByOffset(200, 47).doubleClick().build().perform(); waitViewIconPresent();} 	          
		/**
		 * 
		 * 
		 * @throws InterruptedException
		 */
		    public void doStylepolygone() throws InterruptedException { getInstance(RichStyleToolbar.class).addAnnotation();
		    	getInstance(RichStyleToolbar.class).borderWidthButton();getInstance(RichStyleToolbar.class).bordercolorsButton();   
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
	