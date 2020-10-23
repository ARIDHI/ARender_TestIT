/**
 * 
 */
package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObject.ARender____FactoryPage;

/**
 * @author Lenovo
 *
 */
public class approvedStampHandler extends annotationdrawBase implements ARender____FactoryPage {

	public approvedStampHandler(WebDriver driver) {
		super(driver);
	}

  public void drawApprovedStamp() throws InterruptedException {
		
		getInstance(StumpAnnotaionHandler.class).doDrowStamp();		
	     if(findElement(stampList).isDisplayed()) {
	 
		    try {
		    clickOnElement(approvedbutton);
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

  public void checkApprovedTest() throws InterruptedException {
    // TODO Check ANNOTATION isDisplayed 
	// TODO Check STYLE TOOLBAR isDisplayed 
	// TODO Check RESIZE TOOLBAR isDisplayed
    // TODO Check STAMP LIST isDisplayed 
   getInstance(approvedStampHandler.class).drawApprovedStamp();
     try {
		 Assert.assertTrue(findElement(StamList).isDisplayed());
	     } catch(RuntimeException e) {
		   System.out.println("[ERROR] : STAMP APPROVED IS NOT DISLAYDED");
	     }
 
     try {
	     clickOnElement(StamList);
	     Assert.assertTrue(findElement(styleBarre).isDisplayed());
	    } catch(RuntimeException e) {
	    	 System.out.println("[ERROR] : STAMP APPROVED STYLE TOOLBAR IS NOT DISLAYDED");
	    }
	    
    try {
		 Assert.assertTrue(findElement(rotatePoint).isDisplayed());
	    } catch(RuntimeException e) {
		   System.out.println("[ERROR] : STAMP APPROVED ROTATE POINT IS NOT DISLAYDED");
	    }
 
	try {
		 Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
	    } catch(RuntimeException e) {
		   System.out.println("[ERROR] : STAMP APPROVED VIEW ICON IS NOT DISLAYDED");
	    }
   } 
}
