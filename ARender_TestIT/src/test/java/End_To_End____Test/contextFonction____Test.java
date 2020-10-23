/**
 * 
 */
package End_To_End____Test;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.RightClick______List;
import FullActionpage.deleteActionPage;
import annotationHandler.annotationdrawBase;
import fileHandler.AFileUploadBase;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class contextFonction____Test extends pageObject.TestBase implements ARender____FactoryPage , File____FactoryPage{
	

	@Test(priority = 1 , alwaysRun = false ,enabled= true)
    public void context_Highlight___Test(Method method) throws InterruptedException, IOException {

		page.getInstance(AFileUploadBase.class).doDownloadfile();
	    page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\ARender.pdf");
	    page.waitForElementPresent(thumbimage);
	    page.getInstance(RightClick______List.class).contextHighlight();
 
		try {
			Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteActionPage.class).deleteFromStyleBar();
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
	
		page.getInstance(RightClick______List.class).contextCrossed();
		try {
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteActionPage.class).deleteFromStyleBar();
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
	
		page.getInstance(RightClick______List.class).contextHighlighted();
		try {
			Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteActionPage.class).deleteFromStyleBar();
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
	
		page.getInstance(RightClick______List.class).contextHighlightZone();
		try {
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
 page.getInstance(deleteActionPage.class).deleteFromStyleBar();
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
	
		page.getInstance(RightClick______List.class).contextAddCircle();
		try {
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally { 
        page.getInstance(deleteActionPage.class).deleteFromStyleBar();
	        }	
	}
}
