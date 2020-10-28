/**
 * 
 */
package End_To_End____Test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;

import FullActionpage.signetFonction;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;

/**
 * @author ARIDHI HICHEM
 *
 */
public class SignetTest extends pageObject.TestBase implements FactoryLocator, FileFactoryLocator {

    public void ADD_A_SIGNET(Method method) throws InterruptedException, IOException {
		
		// TODO Add some ancre on ARender Page
		// TODO test if ancre are displayed on ARender List
		// TODO test if ancre numbre is true 
		
	   page.getInstance(signetFonction.class).addAncre();
		  
		 try {
			  Assert.assertTrue(page.findElement(bookmarkDisplayed).isDisplayed(),"TEST ADD ANCRE FAIL :: IS NOT DISPLAYED ON FILE");
		      }catch(Exception i) {
		      }
		  try {
			  Assert.assertEquals(page.getInstance(signetFonction.class).treeItemSize(), 4);
			  }catch(Exception i) {
		      }
          }
  
   public void DELETE_A_SIGNET(Method method) throws InterruptedException, IOException {
	     
	     // TODO delete for ancre on ARender Page
		 // TODO test if ancre are deleted from ARender List
	   
	    page.getInstance(signetFonction.class).deletAncre();

	        try {
			  Assert.assertTrue(page.findElement(bookmarkDisplayed).isDisplayed(),"TEST DELETE ANCRE FAIL");
		      }catch(Exception i) {
            }
	        try {
				  Assert.assertEquals(page.getInstance(signetFonction.class).treeItemSize(), 1);
				  }catch(Exception i) {
			      }
       }
}