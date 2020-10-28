/**
 * 
 */
package End_To_End____Test;

import java.lang.reflect.Method;

import org.testng.Assert;

import FullActionpage.ancreFonction;
import Locators.BaseFonctionLocators;

/**
 * @author ARIDHI Hichem
 *
 */
public class AncreTest  extends pageObject.TestBase implements BaseFonctionLocators{
	
	
    public void Copy_Ancre(Method method) {
		
		try {
			page.getInstance(ancreFonction.class).enterToContextualMenu();
		
			Assert.assertTrue(page.findElement(ancre_Button).isDisplayed(), "CONTEXTUEL MENU NOT DISPLAYED");
		    }catch(Exception e) {
		    }
	   if(page.findElement(ancre_Button).isDisplayed()) {
		   
		   try {
			   page.clickOnElement(ancre_Button);
			
			   Assert.assertTrue(page.findElement(ancre_link).isDisplayed(), "ANCRE LINK IS NOT DISPLAYED");
			   Assert.assertTrue(page.findElement(copy_Ancre).isDisplayed(), "COPY BUTTON IS NOT DISPLAYED");
			   Assert.assertTrue(page.findElement(skip_Ancre).isDisplayed(), "SKIP BUTTON IS NOT DISPLAYED");
	       
	    	   }catch(Exception e) {
             }
		   try {
			   page.getInstance(ancreFonction.class).copyAncreTextFromLink();
			   Thread.sleep(500);
			   Assert.assertFalse(page.findElement(ancre_link).isDisplayed(), "LINK IS NOT COPIED");
			   
	    	   }catch(Exception e) {
             } 
	       }  
	}
	
    public void Skip_Ancre(Method method) {
		
		try {
			page.getInstance(ancreFonction.class).enterToContextualMenu();
		
			Assert.assertTrue(page.findElement(ancre_Button).isDisplayed(), "CONTEXTUEL MENU NOT DISPLAYED");
		    }catch(Exception e) {
		    }
	if(page.findElement(ancre_Button).isDisplayed()) {
		try {
			page.getInstance(ancreFonction.class).skipAncreTextLink();
			
			Thread.sleep(500);
			Assert.assertFalse(page.findElement(ancre_link).isDisplayed(), "LINK IS NOT COPIED");
	       
	    	}catch(Exception e) {
          }
	   }
	}
}
