/**
 * 
 */
package StandAlone;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import FullActionpage.zoomFonction;
import FullActionpage.signetFonction;
import FullActionpage.fullscreenFonction;
import FullActionpage.imageProcessinFonction;
import FullActionpage.logoFonction;
import FullActionpage.naviagationFonction;
import FullActionpage.printFonction;
import FullActionpage.rotationFonction;
import fileHandler.AFileUploadBase;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */

public class ARender_Full_Fonction___onSmall_file extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator{
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
  @Test(priority = 0 , alwaysRun = true ,enabled= true)
 public void Small_file____Upload (Method method) throws InterruptedException, IOException {
	  page.getInstance(AFileUploadBase.class).doDownloadfile();
		 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\TestARender.xlsx");
		 Thread.sleep(2000);
       }
 /**
  * @see imageProcessinFonction.class
  * @throws InterruptedException
  * @throws AWTException
  */
  @Test(priority = 1)
	public void Brightness___onSmall_file (Method method) throws InterruptedException, AWTException {  
	  	//TODO change contrast and check that contrast Element exist on DOM && isNot equal to null
	  	 	page.getInstance(imageProcessinFonction.class).playBrightness();
	  	 	try {
	  	 		Assert.assertNotEquals(page.getInstance(imageProcessinFonction.class).BrightnessResult(), 0);
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
  * @see printFonction.class
  * @throws InterruptedException
  */
  @Test(priority = 3, enabled =false)
  public void Check_Print_WithoutAnnotation_fonctions (Method method) throws InterruptedException {
	  try {
	  page.getInstance(printFonction.class).printfileWithoutannotation();   
	  }
	catch(Exception e){ 
		 e.printStackTrace();
		 }
  }
  @Test(priority = 4, enabled =false)
  public void Check_Print_WithAnnotation_fonctions (Method method) throws InterruptedException { 
	  try {
		  page.getInstance(printFonction.class).printfileWithannotation();  
	  }
	  catch(Exception e){ 
			 e.printStackTrace();
			 }    
  }
  @Test(priority = 5 , enabled =false)
  public void Check_Print_allFiles_fonctions (Method method) throws InterruptedException {
	 try { 
	     page.getInstance(printFonction.class).printallfile(); 
	 }
	 catch(Exception e){ 
		 e.printStackTrace();
		 }
  }
  /**
   * 
   * @see zoomFonction.class
   * @param
   */
  @Test(priority = 6 , alwaysRun=true )
  public void zoomIn___onSmall_file (Method method) throws InterruptedException {
	  //TODO 
	  page.getInstance(zoomFonction.class).getZoomIn();  
	  try {
       Assert.assertTrue((page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :") ,"error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }  
  /**
   * 
   * @see zoomFonction.class
   * @throws InterruptedException
   */
  @Test(priority = 7 , alwaysRun=true ,timeOut = 2000)
  public void zoomOut___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(zoomFonction.class).getZoomOut(); 
	  try {
       Assert.assertTrue((page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :"),"error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * 
   * @see zoomFonction.class
   * @throws InterruptedException
   */
  @Test(priority =8, alwaysRun=true ,timeOut = 2000)
  public void zoomIn_Zone___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(zoomFonction.class).ZoomInZone();  
	  try {
       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * @see HandlerBasePage.class
   * @see zoomFonction.class
   * @throws InterruptedException
   */
  @Test(priority = 9, alwaysRun=true ,timeOut = 5000)
  public void zoomAdjust___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(zoomFonction.class).getFullHeightButton();  
	  try {
       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok"); 
       page.getInstance(zoomFonction.class).getFullWidthButton();
       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
       page.getInstance(zoomFonction.class).getFullPageButton();
       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");   
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * 
   * @see zoomFonction.class
   * @throws InterruptedException
   */
  @Test(priority = 10 , alwaysRun=true ,timeOut = 5000)
  public void zoomTextBox___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(zoomFonction.class).setZoomBox(); 
	  try {   
      Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Zoom Courant :100.00%", "error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   *  
   * @see rotationFonction.class
   * @throws InterruptedException
   */
  @Test(priority = 11, alwaysRun=true ,timeOut = 5000)
  public void Rotation___onSmall_file(Method method) throws InterruptedException {
	  //TODO
	  try {
	   page.getInstance(rotationFonction.class).getLeftRotate();   
       page.getInstance(rotationFonction.class).getRightRotate();
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
 /**
  * 
  * @see fullscreenFonction.class
  * @throws InterruptedException
  */
  @Test(priority = 12, alwaysRun=true ,timeOut = 6000 , singleThreaded=true, skipFailedInvocations =true )
  public void fullscreen___onSmall_file(Method method) throws InterruptedException { 
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
   @Test(priority = 14)
    public void logoVersion___onSmall_file (Method method) throws InterruptedException {
  	 //TODO getText version and compare it with ARenderversion on prop.getProperty()
      try {
  	    String ActuelResult = page.getInstance(logoFonction.class).VersionCheck();
  	    String ExpectedResult = (prop.getProperty("ARenderversion"));
  	    Assert.assertEquals(ActuelResult,ExpectedResult, "ERROR ACCURRED : ARENDER VERSION IS NOT TRUE");        
  		  }
  	catch(Exception e){ 
  		 e.printStackTrace();
  		 }
      
  	  }@Test(priority = 13)
      public void ancre___onSmall_file (Method method) throws InterruptedException {
  	  	 //TODO getText version and compare it with ARenderversion on prop.getProperty()
  	      try {
  	    	page.getInstance(signetFonction.class).addAncre();
  	       Assert.assertTrue(page.findElement(bookmarkDisplayed).isDisplayed(), "ANCRE IS NOT DISPLAYED");  

  	      }
  	  	catch(Exception e){ 
  	  		 e.printStackTrace();
  	  		 }
  	    try {
  	    	page.getInstance(signetFonction.class).deletAncre();
  	       Assert.assertEquals(page.getInstance(signetFonction.class).treeItemSize(), 0 , "IN CASE DELETE OF ANCRE.IT MUST NOT BE DISPLAYED");  

  	      }
  	  	catch(Exception e){ 
  	  		 e.printStackTrace();
  	  		 }
  	      
  	  	  }
}
