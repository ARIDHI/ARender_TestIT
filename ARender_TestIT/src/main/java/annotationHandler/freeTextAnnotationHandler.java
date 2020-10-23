package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;


public class freeTextAnnotationHandler extends annotationdrawBase implements ARender____FactoryPage{	
	/**
	 * 
	 * 
	 * @param driver
	 */
	    public freeTextAnnotationHandler(WebDriver driver) {
		super(driver);		
	}	    
	    
	    public boolean doDrowfreetext() {
	    	
	        // TODO Draw annotation 
	        // TODO Wait view icone to present 
	    	
	    	getInstance(annotationdrawBase.class).doDraw(freetextannotationIcon);
	        waitViewIconPresent();
	      return false;    
	    } 
	    
	    
	    public boolean doStylefreetext() throws InterruptedException {

	        // TODO change back color
	        // TODO change border with 
	        // TODO change border color  
	        // TODO change font style   
	        
	    	
	    	getInstance(RichStyleToolbar.class).backcolorsButton();
	    	getInstance(RichStyleToolbar.class).borderWidthButton();
	    	getInstance(RichStyleToolbar.class).bordercolorsButton();   
	    	getInstance(RichStyleToolbar.class).speciFontStyle();
	    	return false;	    			
	    	}  
     public void checkFreeTextTest() {
     	
			
	        // TODO Check NOTIF MSG isDisplayed 
	        // TODO Check ANNOTATION isDisplayed 
	        // TODO Check STYLE TOOLBAR isDisplayed 
	        // TODO Check SQAURE BUTTON isDisplayed  
    	 
    	 getInstance(freeTextAnnotationHandler.class).doDrowfreetext();	
	    try {
	    	try {
	        Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)
	        		           ,"Prêt pour la création d'annotation : Freetext");
	    	    }
	    	catch(Exception e) {
		    	System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		        }
	    	try {
	        Assert.assertTrue(findElement(resizeSquareIcon).isDisplayed()); 
	    	    }
	    	catch(Exception e) {
		    	System.out.println("[ERROR] : FREETEXT IS NOT DIPLAYDED");
		        }
	    	try {
		         Assert.assertTrue(findElement(styleBarre).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : FREETEXT STYLE TOOLBAR IS NOT DISLAYDED");
		        }	    
		    try {
			    Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : FREETEXT VIEW ICON IS NOT DISLAYDED");
			    }
		    try {
			    Assert.assertTrue(findElement(arrowCrossIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW CROSS ICON IS NOT DISLAYDED");
			    }
		    try {
	            getInstance(freeTextAnnotationHandler.class).doStylefreetext();
	            }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : FREE TEXT STYLE FONCTION");
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
