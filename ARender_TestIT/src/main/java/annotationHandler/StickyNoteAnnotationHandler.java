package annotationHandler;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;


/**
 * @author ARIDHI Hichem
 *
 */

public class StickyNoteAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage {	
    /**
     * 
     * 
     * @param driver
     */	
    public StickyNoteAnnotationHandler(WebDriver driver) {
		super(driver);
	}	   
    /**
     * 
     * 
     * @return
     */
    public WebElement getstickynotermove() {
   return findElement(dropAnnotationReply);
    }
    
    
	 public void doDrowSticky() { getInstance(annotationdrawBase.class).doDraw(StickyeannotationIcon);
		   waitViewIconPresent();  
     }
	    /**
	     * 
	     * 
	     * 
	     * @throws InterruptedException
	     */
	    public void doStylestickynote() throws InterruptedException {getInstance(RichStyleToolbar.class).backcolorsButton();  
	    	getInstance(RichStyleToolbar.class).speciFontStyle();getInstance(RichStyleToolbar.class).fontColors();
	    	}  	
	    
	    public void dodropstickynote() { 
	    	getstickynotermove().click();
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
