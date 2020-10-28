package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;




public class UnderLineHandler  extends annotationdrawBase implements FactoryLocator   {

    public UnderLineHandler(WebDriver driver) {
		super(driver);
	}	
   

    public boolean doDrowUnderline() {
    	
    	// TODO Draw annotation 
	    // TODO Wait view icone to present
    	
       getInstance(annotationdrawBase.class).doDraw(RectangleannotationIcon);
	   waitViewIconPresent();  
    return false;
    } 
    
    public boolean doStyleunderLine() throws InterruptedException {
    	
    	// TODO change back color
        // TODO change border with 
        // TODO change border color  
        // TODO change font style
    	
    	getInstance(RichStyleToolbar.class).addAnnotation();
    	getInstance(RichStyleToolbar.class).backcolorsButton();
    	getInstance(RichStyleToolbar.class).borderWidthButton();
    	getInstance(RichStyleToolbar.class).bordercolorsButton(); 
    	getInstance(RichStyleToolbar.class).stylesbordureButton();
     return false;
    	}
    
    public void checkUnderLineTest() {
    	
    	// TODO Check NOTIF MSG isDisplayed 
		// TODO Check ANNOTATION isDisplayed 
		// TODO Check STYLE TOOLBAR isDisplayed 
	    // TODO Check RESIZE TOOLBAR isDisplayed 
    	
		getInstance(UnderLineHandler.class).doDrowUnderline();
		
	try {
		try {
	    Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Square");
		    } catch(Exception e) {
	    	    System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
        }
	    try {
	         Assert.assertTrue(findElement(styleBarre).isDisplayed());
	        } catch(Exception e) {
	    	    System.out.println("[ERROR] : UNDERLINE STYLE TOOLBAR IS NOT DISLAYDED");
	        }
	    
		try {
		    Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : UNDERLINE VIEW ICON IS NOT DISLAYDED");
		    }
	    
	    try {
	    Assert.assertTrue(findElement(underLineDisp).isDisplayed());
	        } catch(Exception e) {
	    	System.out.println("[ERROR] : UNDERLINE IS NOT DISLAYDED");
	        }
	    
	    try {
	         Assert.assertTrue(findElement(resizePoint).isDisplayed());
	        }
	    catch(Exception e) {
	    	System.out.println("[ERROR] : UNDERLINE RISIZE POINT IS NOT DISLAYDED");
	        }
	    
	    try {
	       getInstance(UnderLineHandler.class).doStyleunderLine();
	        }catch(Exception e) {
	    	System.out.println("[ERROR] : UNDERLINE STYLE ERROR");
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
