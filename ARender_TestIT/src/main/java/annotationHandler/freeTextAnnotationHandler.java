package annotationHandler;

import org.openqa.selenium.WebDriver;

import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;





public class freeTextAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage{	
	/**
	 * 
	 * 
	 * @param driver
	 */
	    public freeTextAnnotationHandler(WebDriver driver) {
		super(driver);		
	}	    
	    /**
	     * 
	     * @throws InterruptedException
	     */
	    public void doDrowfreetext() {getInstance(annotationdrawBase.class).doDraw(freetextannotationIcon);
	    waitViewIconPresent();} 
	    /**
	     * 
	     * 
	     * @throws InterruptedException
	     */
	    public void doStylefreetext() throws InterruptedException {	getInstance(RichStyleToolbar.class).backcolorsButton();
	    	getInstance(RichStyleToolbar.class).borderWidthButton();getInstance(RichStyleToolbar.class).bordercolorsButton();   
	    	getInstance(RichStyleToolbar.class).speciFontStyle();
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
