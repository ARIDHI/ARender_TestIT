/**
 * 
 */
package Axa__Filnet_TesT;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.zoomFonction;
import FullActionpage.fullscreenFonction;
import FullActionpage.imageProcessinFonction;
import FullActionpage.logoFonction;
import FullActionpage.naviagationFonction;
import FullActionpage.printFonction;
import FullActionpage.rotationFonction;
import pageObject.FactoryLocator;
import pageObject.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */

public class AXA_Full_Fonction___onSmall_file extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator{
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
  @Test(priority = 0 , alwaysRun = true ,enabled= true)
 public void Small_file____Upload (Method method) throws InterruptedException, IOException {
	  driver.get("http://18.203.215.159:8080/arondor-arender-axa-war-4.1.0/?bean=urlParserExternalAccessorProxy&id=%7BB779AD7A-D8F9-CB0D-860A-74FE5D600000%7D&objectStoreName=OS1&documentId=B779AD7A-D8F9-CB0D-860A-74FE5D600000");		
	 page.waitForElementPresent(thumbimage);
		Thread.sleep(2000);
			 page.clickOnElement(annotationExplorerButton);
			  List <WebElement> elements = driver.findElements(delete);
			  	   for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click(); }
			  	 page.clickOnElement(ThumExplorerButton); 
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
   @Test(priority = 13)
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
  	  }
}
