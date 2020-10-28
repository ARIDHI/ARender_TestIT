/**
 * 
 */
package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.FactoryLocator;

/**
 * @author Lenovo
 *
 */
public class draftStampHandler extends annotationdrawBase implements FactoryLocator {

	public draftStampHandler(WebDriver driver) {
		super(driver);
	}

  public void drowDraftStamp() throws InterruptedException {
	getInstance(StumpAnnotaionHandler.class).doDrowStamp();		
    if(findElement(stampList).isDisplayed()) {

	    try {
	    clickOnElement(draftButton);
    	builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
	    Thread.sleep(500);
       }catch(RuntimeException e) {
			System.out.println("[ERROR] : URGENT BUTTON NOT DISPlAYED");
		}
     } 
	 else {
	 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
	 }  
 }
	
  
  public void checkDraftStampTest() throws InterruptedException {
	
	    // TODO Check ANNOTATION isDisplayed 
	 	// TODO Check STYLE TOOLBAR isDisplayed 
	 	// TODO Check RESIZE TOOLBAR isDisplayed
        // TODO Check STAMP LIST isDisplayed 
	  
	  getInstance(draftStampHandler.class).drowDraftStamp();
	   try {
	 		 Assert.assertTrue(findElement(StamList).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : STAMP DRAFT IS NOT DISLAYDED");
	 	    }
	   
	   try {
		     clickOnElement(StamList);
	 	     Assert.assertTrue(findElement(styleBarre).isDisplayed());
	 	    } catch(RuntimeException e) {
	 	    	 System.out.println("[ERROR] : STAMP DRAFT STYLE TOOLBAR IS NOT DISLAYDED");
	 	    }
	 	    
	   try {
	 		 Assert.assertTrue(findElement(rotatePoint).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : STAMP DRAFT ROTATE POINT IS NOT DISLAYDED");
	 	    }
	   
	 	try {
	 		 Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : STAMP DRAFT VIEW ICON IS NOT DISLAYDED");
	 	    }
	 	  
  }
}
