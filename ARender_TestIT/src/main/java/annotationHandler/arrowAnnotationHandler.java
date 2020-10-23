package annotationHandler;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;
import style.Page.SpecificStyle;

/**
 *  @author ARIDHI Hichem
 *
 */
public class arrowAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage{

	  
	public arrowAnnotationHandler(WebDriver driver)  {
		super(driver);
	}
 
    public boolean doDrowArrow() {	
    	
    	// TODO Draw annotation 
        // TODO Wait view icone to present 
    	
    	getInstance(annotationdrawBase.class).doDraw(ArrowannotationIcon);
	    waitViewIconPresent();
	 return false ;   
    } 
    

    public boolean doStylearrow() throws InterruptedException {
    	
    	// TODO change back color
        // TODO change border with 
        // TODO change border color  
        // TODO change font style
    	// TODO change Teal
    	// TODO change Head
    	
    	getInstance(SpecificStyle.class).ChangeArrowHead();
    	getInstance(SpecificStyle.class).ChangeArrowTeal();	
    	getInstance(RichStyleToolbar.class).backcolorsButton();
    	getInstance(RichStyleToolbar.class).ArrowLineWidthButton();
    	getInstance(RichStyleToolbar.class).stylesbordureButton();
    	getInstance(SpecificStyle.class).echelle();
    	return false ; 
    	}
   
    public void CheckArrowTest() {
    	
			getInstance(arrowAnnotationHandler.class).doDrowArrow();
			
			// TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
			// TODO Check STYLE RESIZE POINT isDisplayed
			// TODO Check VIEW ICON isDisplayed
			// TODO Check HEAD & TEAL isDisplayed
		try {
			try {
		    Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)
		    		            ,"Prêt pour la création d'annotation : Line");
			} catch(Exception e) {
		    	    System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
	        }
			
			try {
		         Assert.assertTrue(findElement(styleBarre).isDisplayed());
		        } catch(Exception e) {
		    	    System.out.println("[ERROR] : ARROW STYLE TOOLBAR IS NOT DISLAYDED");
		        }
		    
			try {
			    Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW VIEW ICON IS NOT DISLAYDED");
			    }
			 
			try {
			    Assert.assertTrue(findElement(ArrowHead).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW HEAD IS NOT DISLAYDED");
			    }
	  
			try {
			    Assert.assertTrue(findElement(resizeArrow).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW SIZE POINT IS NOT DISLAYDED");
			    }
			   
		    try {
			    Assert.assertNotEquals(getInstance(annotationdrawBase.class).getAllPathfill(), 0);
				} catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW SIZE POINT IS NOT DISLAYDED");
			    }
		    try {
		        getInstance(arrowAnnotationHandler.class).doStylearrow();
		        } catch(Exception e) {
		    	   System.out.println("[ERROR] : ARROW STYLE ERROR");
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


