/**
 * 
 */
package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObject.ARender____FactoryPage;

/**
 * @author ARIDHI Hichem
 *
 */
public class urgentStampHandler extends annotationdrawBase implements ARender____FactoryPage { 
	
	public urgentStampHandler(WebDriver driver) {
		super(driver);
	}
   
	public void drawUrgentStamp() throws InterruptedException {
		
		getInstance(StumpAnnotaionHandler.class).doDrowStamp();		
	     if(findElement(stampList).isDisplayed()) {
	 
		    try {
		    clickOnElement(Urgentbutton);
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
	
	
   public void checkUrgentStamp() throws InterruptedException {
    	
	    // TODO Check ANNOTATION isDisplayed 
 	    // TODO Check STYLE TOOLBAR isDisplayed 
 	    // TODO Check RESIZE TOOLBAR isDisplayed
        // TODO Check STAMP LIST isDisplayed 
	   
	   getInstance(urgentStampHandler.class).drawUrgentStamp();;	
        try {
 		 Assert.assertTrue(findElement(StamList).isDisplayed());
 	    } catch(RuntimeException e) {
 		   System.out.println("[ERROR] : STAMP URGENT IS NOT DISLAYDED");
 	    }
        try {
	     clickOnElement(StamList);
 	     Assert.assertTrue(findElement(styleBarre).isDisplayed());
 	    } catch(RuntimeException e) {
 	    	 System.out.println("[ERROR] : STAMP URGENT STYLE TOOLBAR IS NOT DISLAYDED");
 	    }
  	    
        try {
 		 Assert.assertTrue(findElement(rotatePoint).isDisplayed());
 	    } catch(RuntimeException e) {
 		   System.out.println("[ERROR] : STAMP URGENT ROTATE POINT IS NOT DISLAYDED");
 	    }
   
    	try {
 		 Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
 	    } catch(RuntimeException e) {
 		   System.out.println("[ERROR] : STAMP URGENT VIEW ICON IS NOT DISLAYDED");
 	    }
      }	 	
}
