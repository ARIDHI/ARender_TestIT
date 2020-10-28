package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;





public class freeHandAnnotationtHandler extends annotationdrawBase implements FactoryLocator { 
	  
	    public freeHandAnnotationtHandler(WebDriver driver) {
			super(driver);
		}	
	      
		public boolean doDrowfreehand() throws InterruptedException {
			
			// TODO Draw annotation 
	        // TODO Wait view icone to present 
			
			getInstance(annotationdrawBase.class).doDraw(freehandannotationIcon);
	        waitViewIconPresent();
	     return false;    
		} 	       		
		
	    public boolean doStylefreehand() throws InterruptedException {
	    	
	    	// TODO change back color
	        // TODO change border with 
	        // TODO change border color  
	        // TODO change font style
	    	
	    	getInstance(RichStyleToolbar.class).addAnnotation();
	    	getInstance(RichStyleToolbar.class).bordercolorsButton();
	    	getInstance(RichStyleToolbar.class).borderWidthButton();   	
	     return false ;
	   	}
	    
	    public void checkFreeHandTest() throws InterruptedException {
	    	
	    	// TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
			// TODO Check RESIZE TOOLBAR isDisplayed 
	    	
		getInstance(freeHandAnnotationtHandler.class).doDrowfreehand();	
		try {
		    try {
			Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),
					            "Prêt pour la création d'annotation : Ink");
		      } catch(Exception e) {
	    	    System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		        } 		    
		    try {
		         Assert.assertTrue(findElement(styleBarre).isDisplayed());
		        } catch(Exception e) {
		    	    System.out.println("[ERROR] : FREE HAND STYLE TOOLBAR IS NOT DISLAYDED");
		        }
		    
			try {
			    Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : FREE HAND VIEW ICON IS NOT DISLAYDED");
			    }
			try {
			    Assert.assertTrue(findElement(arrowBar).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : FREE HAND IS NOT DISLAYDED");
			    }
			    
		    try {
			     Assert.assertTrue(findElement(resizePoint).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : FREE HAND RISIZE POINT IS NOT DISLAYDED");
			    }
		    try {
	         getInstance(freeHandAnnotationtHandler.class).doStylefreehand();
		        }catch(Exception e) {
		    	System.out.println("[ERROR] : FREE HAND STYLE ERROR");
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
	     * {@docRoot} c://
	     * 
	     */ 

