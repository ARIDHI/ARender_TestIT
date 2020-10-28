/**
 * 
 */
package End_To_End____Test;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.rightClickFonction;
import FullActionpage.deleteFonction;
import annotationHandler.annotationdrawBase;
import fileHandler.AFileUploadBase;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;

/**
 * @author ARIDHI HICHEM
 *
 */
public class RightClickMouseTest extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator{
	

	@Test(priority = 1 , alwaysRun = false ,enabled= true)
    public void context_Highlight___Test(Method method) throws InterruptedException, IOException {

		page.getInstance(AFileUploadBase.class).doDownloadfile();
	    page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\ARender.pdf");
	    page.waitForElementPresent(thumbimage);
	    page.getInstance(rightClickFonction.class).contextHighlight();
 
		try {
			Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteFonction.class).deleteFromStyleBar();
	        }	
	}
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test(priority = 2 , alwaysRun = false ,enabled= true)
    public void contextCrossed___Test(Method method) throws InterruptedException, IOException {
	
		page.getInstance(rightClickFonction.class).contextCrossed();
		try {
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteFonction.class).deleteFromStyleBar();
	        }	
	}
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test(priority = 3 , alwaysRun = false ,enabled= true)
    public void context__Highlighted___Test(Method method) throws InterruptedException, IOException {
	
		page.getInstance(rightClickFonction.class).contextHighlighted();
		try {
			Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteFonction.class).deleteFromStyleBar();
	        }	
	}
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test(priority = 4 , alwaysRun = false ,enabled= true)
    public void context__HighlightZone___Test(Method method) throws InterruptedException, IOException {
	
		page.getInstance(rightClickFonction.class).contextHighlightZone();
		try {
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteFonction.class).deleteFromStyleBar();
	        }	
	}
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test(priority = 5 , alwaysRun = false ,enabled= true)
    public void contextAddCircle___Test(Method method) throws InterruptedException, IOException {
	
		page.getInstance(rightClickFonction.class).contextAddCircle();
		try {
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
        page.getInstance(deleteFonction.class).deleteFromStyleBar();
	        }	
	}
}
