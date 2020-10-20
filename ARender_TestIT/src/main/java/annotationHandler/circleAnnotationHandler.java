package annotationHandler;
/**
 * 
 * 
 */
import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;
   /**
    * 
    *  @author ARIDHI Hichem
    *
    */
public class circleAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage {
	/**
	 * 
	 * 
	 * @param driver
	 * 
	 */
    public circleAnnotationHandler(WebDriver driver) {
		super(driver);
	}	   
    /**
     * 
     * @throws InterruptedException
     */
    public void doDrowcircle() throws InterruptedException {getInstance(annotationdrawBase.class).doDraw(circleannotationIcon);
    waitViewIconPresent();} 	       
    /**
     * 
     * 
     * @throws InterruptedException
     */
    public void doStylecircle() throws InterruptedException {getInstance(RichStyleToolbar.class).addAnnotation();
    	getInstance(RichStyleToolbar.class).backcolorsButton();getInstance(RichStyleToolbar.class).borderWidthButton();
    	getInstance(RichStyleToolbar.class).bordercolorsButton(); getInstance(RichStyleToolbar.class).stylesbordureButton();
//    	getInstance(SpecificStyle.class).Cloudytyle();
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
	
    
