package annotationHandler;
/**
 * 
 * 
 */
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;
  /**
   * 
   * @author ARIDHI Hichem
   *
   */
public class circleAnnotationHandler extends annotationdrawBase implements FactoryLocator {
	
    public circleAnnotationHandler(WebDriver driver) {
		super(driver);
	}	   
    
    public boolean doDrowcircle() throws InterruptedException {
    	
    	// TODO Draw annotation 
        // TODO Wait view icone to present 
    	
    	getInstance(annotationdrawBase.class).doDraw(circleannotationIcon);
        waitViewIconPresent();
       return false;   
    } 	       
    
    
    public boolean doStylecircle() throws InterruptedException {
    	
    	// TODO change back color
        // TODO change border with 
        // TODO change border color  
        // TODO change font style

    	getInstance(RichStyleToolbar.class).addAnnotation();
    	getInstance(RichStyleToolbar.class).backcolorsButton();
    	getInstance(RichStyleToolbar.class).borderWidthButton();
    	getInstance(RichStyleToolbar.class).bordercolorsButton(); 
    	getInstance(RichStyleToolbar.class).stylesbordureButton();
//    	getInstance(SpecificStyle.class).Cloudytyle();
    	return false;
    	}  	
    
    public void checkCircleTest() throws InterruptedException {
    	
    	  // TODO Check NOTIF MSG isDisplayed 
	      // TODO Check ANNOTATION isDisplayed 
	      // TODO Check STYLE TOOLBAR isDisplayed 
	      // TODO Check STYLE RESIZE POINT isDisplayed
	      // TODO Check VIEW ICON isDisplayed
    	  
    	
    	  getInstance(circleAnnotationHandler.class).doDrowcircle();	
		try {
			try {
		    Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),
		    		             "Prêt pour la création d'annotation : Circle");
			}
			catch(Exception e) {
		    	System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		        }
			try {
		    Assert.assertEquals(getInstance(annotationdrawBase.class).getEllipses(), 1);
			}
			catch(Exception e) {
		    	System.out.println("[ERROR] : CICRLE IS NOT DIPLAYDED");
		        }
			try {
		         Assert.assertTrue(findElement(styleBarre).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : CIRCLE STYLE TOOLBAR IS NOT DISLAYDED");
		        }
			try {
			    Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : CIRCLE VIEW ICON IS NOT DISLAYDED");
			    }
			try {
		         Assert.assertTrue(findElement(resizePoint).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : CIRCLE RISIZE POINT IS NOT DISLAYDED");
		        }
			try {
	            getInstance(circleAnnotationHandler.class).doStylecircle();
			}
			catch(Exception e) {
		    	System.out.println("[ERROR] : CIRCLE STYLE FONCTION");
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
	
    
