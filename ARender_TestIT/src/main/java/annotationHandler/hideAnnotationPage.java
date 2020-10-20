/**
 * 
 */
package annotationHandler;

import org.openqa.selenium.WebDriver;

import pageObject.ARender____FactoryPage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class hideAnnotationPage extends annotationdrawBase implements ARender____FactoryPage  {
/**
 * 
 * @param driver
 */
public hideAnnotationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * @return
 * 	
 */
	public void showAnnotations() { clickOnElement(annotationMenu);
	  clickOnElement(showAnnotation);
	  return;
}
    public void hideAnnotations() { clickOnElement(annotationMenu);
	  clickOnElement(hideAnnotation);
	  return;
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