package annotationHandler;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.FactoryLocator;
import style.Page.RichStyleToolbar;


/**
 * @author ARIDHI Hichem
 *
 */

public class StickyNoteAnnotationHandler extends annotationdrawBase implements FactoryLocator {	
   
  public StickyNoteAnnotationHandler(WebDriver driver) {
		super(driver);
	}	   

    public boolean drowNote() { 
    	getInstance(annotationdrawBase.class).doDraw(StickyeannotationIcon);
	    waitViewIconPresent();
	    return false;
     }  
    
   public void checkTestNote () {

	    getInstance(StickyNoteAnnotationHandler.class).drowNote();
		
        // TODO Check NOTIF MSG isDisplayed 
	    // TODO Check ANNOTATION isDisplayed 
        // TODO Check STYLE TOOLBAR isDisplayed 
	    // TODO Check REPLY BUTTON isDisplayed  
	    // TODO Check VIEW ICON isDisplayed
	    // TODO Check PIN ICON isDisplayed
	    // TODO Check TEXT BOX isDisplayed 
	    // TODO Check REMOVE BUTTON isDisplayed
	    // TODO Check STATE BOX isDisplayed
	 try {   	
		try {
	        Assert.assertEquals(getNotificationMsg(notificationmsg),
	        		           "Prêt pour la création d'annotation : Text");
		    }
	    catch(Exception e) {
	    	System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
	        }
	    try {	
	    Assert.assertTrue(findElement(StickyeannotationDisplayed).isDisplayed());
	        }
	    catch(Exception e) {
	    	System.out.println("[ERROR] : STICKYNOTE IS NOT DISLAYDED");
	        }
	    try {
	         Assert.assertTrue(findElement(styleBarre).isDisplayed());
	        }
	    catch(Exception e) {
	    	System.out.println("[ERROR] : STICKYNOTE STYLE TOOLBAR IS NOT DISLAYDED");
	        }	    
	    try {
		    Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
		    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE VIEW ICON IS NOT DISLAYDED");
		    }
	    try {
		    Assert.assertTrue(findElement(stkNotePin).isDisplayed());
		    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE PIN ICON VIEW IS NOT DISLAYDED");
		    }
	     
	    try {
		    Assert.assertTrue(findElement(stkRemove).isDisplayed());
		    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE REMOVE BUTTON IS NOT DISLAYDED");
		    }
	    try {
		    Assert.assertTrue(findElement(stkNoteState).isDisplayed());
		    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE STATE BOX IS NOT DISLAYDED");
		    }
	    
	    try {
		    Assert.assertTrue(findElement(stkTextBox).isDisplayed());
		    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE STATE BOX IS NOT DISLAYDED");
		    }

	    try {	
	    	 getInstance(RichStyleToolbar.class).backcolorsButton();  
			 getInstance(RichStyleToolbar.class).speciFontStyle();getInstance(RichStyleToolbar.class).fontColors();
    	    }
	    catch(Exception e) {
	    	System.out.println("[ERROR] : STICKY STYLE FONCTION ");
	        }	       
		try {
			 clickOnElement(cancelAnnotationButton);
			   Thread.sleep(600);
		       Assert.assertTrue(findElement(AddReply).isDisplayed());
		      }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE REPLAY BUTTON IS NOT DISLAYDED");
		      } 	           
           }
	  catch(Exception e) {
			System.out.println("[ERROR] : STICKYNOTE ERROR ACCURRED");
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
