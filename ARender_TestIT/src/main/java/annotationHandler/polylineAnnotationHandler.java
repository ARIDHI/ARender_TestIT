package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;

/**
 *  @author ARIDHI Hichem
 *
 */
public class polylineAnnotationHandler extends annotationdrawBase implements FactoryLocator {
	
    public polylineAnnotationHandler(WebDriver driver) {
		super(driver);
	}	
 
	 public boolean doDrowpolyline() {
		 
		 // TODO Draw annotation 
	     // TODO Wait view icone to present
		 
		getInstance(annotationdrawBase.class).doDraw(polylineannotationIcon);
	    builder.moveByOffset(200, 47).doubleClick().build().perform(); 
	    waitViewIconPresent();
	    return false;
	    } 
	
	 
	    public boolean doStylepolyline() throws InterruptedException {
	    	
	    	// TODO change back color
	        // TODO change border with 
	        // TODO change border color  
	        // TODO change font style 
	    	
	     getInstance(RichStyleToolbar.class).addAnnotation();
	     getInstance(RichStyleToolbar.class).borderWidthButton();
	     getInstance(RichStyleToolbar.class).bordercolorsButton();   
	     getInstance(RichStyleToolbar.class).stylesbordureButton();	
	      return false;
	   }
	    
	   public void checkPolylineTest() {
			
			// TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
			// TODO Check RESIZE TOOLBAR isDisplayed
		   
	     getInstance(polylineAnnotationHandler.class).doDrowpolyline();	
		try {
			try {
		    Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),
		    		           "Prêt pour la création d'annotation : Polyline");
		        } catch(Exception e) {
   	          System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
	            } 
	    
	    try {
	         Assert.assertTrue(findElement(styleBarre).isDisplayed());
	            } catch(Exception e) {
	    	    System.out.println("[ERROR] : POLYLINE STYLE TOOLBAR IS NOT DISLAYDED");
	            }
	    
		try {
		     Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : POLYLINE VIEW ICON IS NOT DISLAYDED");
		    }
		try {
		    Assert.assertTrue(findElement(arrowBar).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : POLYLINE IS NOT DISLAYDED");
		    }
		    
	    try {
		     Assert.assertTrue(findElement(resizePoint).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : POLYLINE RISIZE POINT IS NOT DISLAYDED");
		    }
		 try {   
	        getInstance(polylineAnnotationHandler.class).doStylepolyline();
		     }catch(Exception e) {
			    	System.out.println("[ERROR] : POLYLINE STYLE ERROR");
		     } 
		}
	    catch(Exception e) {
				e.printStackTrace();
			}   
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



