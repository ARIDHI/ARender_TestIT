/**
 * 
 */
package StandAlone;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.zoomFonction;
import FullActionpage.fullscreenFonction;
import FullActionpage.imageProcessinFonction;
import FullActionpage.logoFonction;
import FullActionpage.naviagationFonction;
import FullActionpage.rotationFonction;
import fileHandler.AFileUploadBase;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class ARender_Full_Fonction___onBulky_file  extends pageObject.TestBase implements FactoryLocator, FileFactoryLocator {
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
		@Test(priority = 0 , alwaysRun = true ,enabled= true)
	    public void Bulky_File____Upload (Method method) throws InterruptedException, IOException {
			page.getInstance(AFileUploadBase.class).doDownloadfile();
		    page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\ARender.pdf");
			Thread.sleep(3000);
       }
	 /**
	  * @see imageProcessinFonction.class
	  * @throws InterruptedException
	  * @throws AWTException
	  */	
	 @Test(priority = 1)	
	   public void Contrast___onBulky_File (Method method) throws InterruptedException, AWTException {  
		  	//TODO change contrast and check that contrast Element exist on DOM && isNot equal to null
		  	 	page.getInstance(imageProcessinFonction.class).playContrast();
		  	 	try {
		  	 		Assert.assertNotEquals(page.getInstance(imageProcessinFonction.class).ContrastResult(), 0);
		  	 	   }
		  	  catch(Exception e) {
		  		  e.printStackTrace();
		  	  }
		  	}
	 /**
	  * 
	  * @see naviagationFonction.class
	  * @throws InterruptedException
	  */
	  @Test(priority = 2)
	   public void  navigation___onSmall_file(Method method) throws InterruptedException {
	 		
	  // TODO send a page number to the nav text box 	    
	     try {
	 		 page.getInstance(naviagationFonction.class).setNavText("5"); 
	        }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  // TODO navigate to the next 5 pages	     
	     try {
	 		 page.getInstance(naviagationFonction.class).getNext();
	 	   }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  // TODO go to the last page   
	     try {
	 		 page.getInstance(naviagationFonction.class).getLast();	
	 	   }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  // TODO navigate to the previous 4 pages
	 	 try {
	 		 page.getInstance(naviagationFonction.class).getPrevious();
	 	   }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  //TODO Go back to the first page   	    
	      try {
	 		  page.getInstance(naviagationFonction.class).getfirst();
	 	   }
	 		    catch(Exception e) {
	 		  	   }
	 	  }
	 
	 
	 /**
	  * 
	  * @see fullscreenFonction.class
	  * @throws InterruptedException
	  */
	  @Test(priority = 9, alwaysRun=true ,timeOut = 6000 , singleThreaded=true, skipFailedInvocations =true )
	  public void fullscreen___onBulky_File(Method method) throws InterruptedException { 
		  //TODO
		  page.getInstance(fullscreenFonction.class).fullscreenizer();
		  try {
	       Assert.assertTrue(page.findElement(fullScreen).isDisplayed(), "FULLSCREEN BUTTON IS NOT DISPLAYED");  
	       Assert.assertTrue(page.findElement(verticalSlider).isDisplayed(), "VERTICAL SLIDER BUTTON IS NOT DISPLAYED"); 
	       page.getInstance(fullscreenFonction.class).defullscreenizer();
	       Assert.assertTrue(page.findElement(thumbExplorerButton).isDisplayed(), "THUMBER BUTTON IS NOT DISPLAYED");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * @see logoFonction.class	
	   * @see prop.getProperty("ARenderversion")
	   * @throws InterruptedException
	   */
	   @Test(priority = 10)
	    public void logoVersion___onBulky_File (Method method) throws InterruptedException {
	  	 //TODO getText version and compare it with ARenderversion on prop.getProperty()
	      try {
	  	    String ActuelResult = page.getInstance(logoFonction.class).VersionCheck();
	  	    String ExpectedResult = (prop.getProperty("ARenderversion"));
	  	    Assert.assertEquals(ActuelResult,ExpectedResult, "ERROR ACCURRED : ARENDER VERSION IS NOT TRUE");        
	  		  }
	  	catch(Exception e){ 
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