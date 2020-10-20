package annotationHandler;


import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import style.Page.RichStyleToolbar;
import style.Page.SpecificStyle;

/**
 *  @author ARIDHI Hichem
 *
 */
public class arrowAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage{

	  
	public arrowAnnotationHandler(WebDriver driver)  {
		super(driver);
	}
    /**
     *  
     *  @throws wait to notification message appear
     *  @draw a Arrow annotation 
     *  @throws InterruptedException
     * 
     */
	
    public void doDrowArrow() {	getInstance(annotationdrawBase.class).doDraw(ArrowannotationIcon);
	    waitViewIconPresent();} 
    /**
     * 
     *  @change style of the Arrow annotation 
     *  @throws InterruptedException
     * 
     * 
     */
    public void doStylearrow() throws InterruptedException {getInstance(SpecificStyle.class).ChangeArrowHead();
    	getInstance(SpecificStyle.class).ChangeArrowTeal();	getInstance(RichStyleToolbar.class).backcolorsButton();
    	getInstance(RichStyleToolbar.class).ArrowLineWidthButton();getInstance(RichStyleToolbar.class).stylesbordureButton();
    	getInstance(SpecificStyle.class).echelle();
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


