/**
 * 
 */
package annotationHandler;

import org.openqa.selenium.WebDriver;

import Locators.FactoryLocator;

/**
 * @author ARIDHI HICHEM
 *
 */
public class hideAnnotationPage extends annotationdrawBase implements FactoryLocator  {

    public hideAnnotationPage(WebDriver driver) {
	 	super(driver);
		// TODO Auto-generated constructor stub
	}
 
	public boolean showAnnotations() {
		clickOnElement(annotationMenu);
		clickOnElement(showAnnotation);
	  return false;
  }
    public boolean hideAnnotations() { 
     	clickOnElement(annotationMenu);
	    clickOnElement(hideAnnotation);
	  return false;
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