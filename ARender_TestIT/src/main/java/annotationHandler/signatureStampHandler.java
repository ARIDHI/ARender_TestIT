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
public class signatureStampHandler extends annotationdrawBase implements ARender____FactoryPage {

	public signatureStampHandler(WebDriver driver) {
		super(driver);
	}
    
	public void drawSignatureStamp() throws InterruptedException {
		getInstance(StumpAnnotaionHandler.class).doDrowStamp();		
	    if(findElement(stampList).isDisplayed()) {

		    try {
		    clickOnElement(signatureButton);
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
	
	public void checkSignatureStampTest() throws InterruptedException {
		
	    // TODO Check ANNOTATION isDisplayed 
	 	// TODO Check STYLE TOOLBAR isDisplayed 
	 	// TODO Check RESIZE TOOLBAR isDisplayed
        // TODO Check STAMP LIST isDisplayed 
	
		getInstance(signatureStampHandler.class).drawSignatureStamp();
	   try {
	 		 Assert.assertTrue(findElement(signatureDisp).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : STAMP SIGNATURE IS NOT DISLAYDED");
	 	    }
	   
	   try {
	 		 Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : STAMP SIGNATURE VIEW ICON IS NOT DISLAYDED");
	 	    }
	   
	   try {
		     clickOnElement(signatureDisp);
	 	     Assert.assertTrue(findElement(styleBarre).isDisplayed());
	 	    } catch(RuntimeException e) {
	 	    	 System.out.println("[ERROR] : STAMP SIGNATURE STYLE TOOLBAR IS NOT DISLAYDED");
	 	    }
	 	    
	   try {
	 		 Assert.assertTrue(findElement(rotatePoint).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : STAMP SIGNATURE ROTATE POINT IS NOT DISLAYDED");
	 	    }
	}
	}

