package annotationHandler;

import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;





public class freeHandAnnotationtHandler extends annotationdrawBase implements ARender____FactoryPage { 
	   /**
	    * 
	    * 
	    * @param driver
	    */
	    public freeHandAnnotationtHandler(WebDriver driver) {
			super(driver);
		}	
	    /**
	     * 
	     * @throws InterruptedException
	     */	    
		public void doDrowfreehand() throws InterruptedException {getInstance(annotationdrawBase.class).doDraw(freehandannotationIcon);
	    waitViewIconPresent();} 	       		
		/**
		 * 
		 * 
		 * 
		 * @throws InterruptedException
		 */
	    public void doStylefreehand() throws InterruptedException {getInstance(RichStyleToolbar.class).addAnnotation();
	    	getInstance(RichStyleToolbar.class).bordercolorsButton(); getInstance(RichStyleToolbar.class).borderWidthButton();
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

