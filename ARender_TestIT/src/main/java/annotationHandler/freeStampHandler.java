/**
 * 
 */
package annotationHandler;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObject.ARender____FactoryPage;

/**
 * @author Lenovo
 *
 */
public class freeStampHandler extends annotationdrawBase implements ARender____FactoryPage {

	public freeStampHandler(WebDriver driver) {
		super(driver);
	}

	public void drawFreeStamp() throws InterruptedException {
		getInstance(StumpAnnotaionHandler.class).doDrowStamp();		
	     if(findElement(stampList).isDisplayed()) {
	    	try {
	    	 builder.doubleClick(findElement(tamponpersoField)).
	    	 sendKeys(Keys.DELETE).sendKeys( "Glade With ARender").perform();
	    	 clickOnElement(tamponpersoButton);
	    	 clickOnElement(drawLocationPath);   
	    	 waitViewIconPresent(); 
	    	 Thread.sleep(500);	
	    	}
	         catch(RuntimeException e) {
				System.out.println("[ERROR] : URGENT BUTTON NOT DISPlAYED");
			   }
	      } 
		 else {
		 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
		     }  
	     }
	
	public void checkFreeStamp() throws InterruptedException {
		
		 // TODO Check ANNOTATION isDisplayed 
	 	 // TODO Check STYLE TOOLBAR isDisplayed 
	 	 // TODO Check RESIZE TOOLBAR isDisplayed
         // TODO Check STAMP LIST isDisplayed 
		
	  getInstance(freeStampHandler.class).drawFreeStamp();
	  
	   try {
	 		 Assert.assertTrue(findElement(StamList).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : FREE STAMP IS NOT DISLAYDED");
	 	    }
	   
	   try {
	 		 Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : FREE STAMP VIEW ICON IS NOT DISLAYDED");
	 	    }
	   
	   try {
		     clickOnElement(StamList);
	 	     Assert.assertTrue(findElement(styleBarre).isDisplayed());
	 	    } catch(RuntimeException e) {
	 	    	 System.out.println("[ERROR] : FREE STAMP STYLE TOOLBAR IS NOT DISLAYDED");
	 	    }
	 	    
	   try {
	 		 Assert.assertTrue(findElement(rotatePoint).isDisplayed());
	 	    } catch(RuntimeException e) {
	 		   System.out.println("[ERROR] : FREE STAMP ROTATE POINT IS NOT DISLAYDED");
	 	    } 	  
	   }
	}

