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

import FullActionpage.Zoom_In_Out;
import FullActionpage.fullscreen;
import FullActionpage.image_____ProcessinPage;
import FullActionpage.logoPage;
import FullActionpage.naviagationPage;
import FullActionpage.printPage;
import FullActionpage.rotation;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */

public class AXA_Full_Fonction___onSmall_file extends pageObject.TestBase implements ARender____FactoryPage , File____FactoryPage{
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
  @Test(priority = 0 , alwaysRun = true ,enabled= true)
 public void Small_file____Upload (Method method) throws InterruptedException, IOException {
	  driver.get("http://18.203.215.159:8080/arondor-arender-axa-war-4.0.9-2-rc1/?"
		 		+ "bean=urlParserExternalAccessorProxy&id=%7B726198CD-7C1C-C2BA-8649-7405CBB00000%7D&objectStoreName=OS1&documentId=726198CD-7C1C-C2BA-8649-7405CBB00000");		
	 page.waitForElementPresent(thumbimage);
		Thread.sleep(2000);
			 page.clickOnElement(annotationExplorerButton);
			  List <WebElement> elements = driver.findElements(delete);
			  	   for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click(); }
			  	 page.clickOnElement(ThumExplorerButton); 
	            }	
       
 /**
  * @see image_____ProcessinPage.class
  * @throws InterruptedException
  * @throws AWTException
  */
  @Test(priority = 1)
	public void Brightness___onSmall_file (Method method) throws InterruptedException, AWTException {  
	  	//TODO change contrast and check that contrast Element exist on DOM && isNot equal to null
	  	 	page.getInstance(image_____ProcessinPage.class).playBrightness();
	  	 	try {
	  	 		Assert.assertNotEquals(page.getInstance(image_____ProcessinPage.class).BrightnessResult(), 0);
	  	 	   }
	  	  catch(Exception e) {
	  		  e.printStackTrace();
	  	  }
	  	}
/**
 * 
 * @see naviagationPage.class
 * @throws InterruptedException
 */
 @Test(priority = 2)
  public void  navigation___onSmall_file(Method method) throws InterruptedException {
		
 // TODO send a page number to the nav text box 	    
    try {
		 page.getInstance(naviagationPage.class).setNavText("5"); 
       }
		    catch(Exception e) {
		  		  e.printStackTrace();
		  	   }
		    
 // TODO navigate to the next 5 pages	     
    try {
		 page.getInstance(naviagationPage.class).getNext();
	   }
		    catch(Exception e) {
		  		  e.printStackTrace();
		  	   }
		    
 // TODO go to the last page   
    try {
		 page.getInstance(naviagationPage.class).getLast();	
	   }
		    catch(Exception e) {
		  		  e.printStackTrace();
		  	   }
		    
 // TODO navigate to the previous 4 pages
	 try {
		 page.getInstance(naviagationPage.class).getPrevious();
	   }
		    catch(Exception e) {
		  		  e.printStackTrace();
		  	   }
		    
 //TODO Go back to the first page   	    
     try {
		  page.getInstance(naviagationPage.class).getfirst();
	   }
		    catch(Exception e) {
		  	   }
	  }
 /**
  * @see printPage.class
  * @throws InterruptedException
  */
  @Test(priority = 3, enabled =false)
  public void Check_Print_WithoutAnnotation_fonctions (Method method) throws InterruptedException {
	  try {
	  page.getInstance(printPage.class).printfileWithoutannotation();   
	  }
	catch(Exception e){ 
		 e.printStackTrace();
		 }
  }
  @Test(priority = 4, enabled =false)
  public void Check_Print_WithAnnotation_fonctions (Method method) throws InterruptedException { 
	  try {
		  page.getInstance(printPage.class).printfileWithannotation();  
	  }
	  catch(Exception e){ 
			 e.printStackTrace();
			 }    
  }
  @Test(priority = 5 , enabled =false)
  public void Check_Print_allFiles_fonctions (Method method) throws InterruptedException {
	 try { 
	     page.getInstance(printPage.class).printallfile(); 
	 }
	 catch(Exception e){ 
		 e.printStackTrace();
		 }
  }
  /**
   * 
   * @see Zoom_In_Out.class
   * @param
   */
  @Test(priority = 6 , alwaysRun=true )
  public void zoomIn___onSmall_file (Method method) throws InterruptedException {
	  //TODO 
	  page.getInstance(Zoom_In_Out.class).getZoomIn();  
	  try {
       Assert.assertTrue((page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :") ,"error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }  
  /**
   * 
   * @see Zoom_In_Out.class
   * @throws InterruptedException
   */
  @Test(priority = 7 , alwaysRun=true ,timeOut = 2000)
  public void zoomOut___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(Zoom_In_Out.class).getZoomOut(); 
	  try {
       Assert.assertTrue((page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :"),"error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * 
   * @see Zoom_In_Out.class
   * @throws InterruptedException
   */
  @Test(priority =8, alwaysRun=true ,timeOut = 2000)
  public void zoomIn_Zone___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(Zoom_In_Out.class).ZoomInZone();  
	  try {
       Assert.assertTrue(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * @see HanlerBasePage.class
   * @see Zoom_In_Out.class
   * @throws InterruptedException
   */
  @Test(priority = 9, alwaysRun=true ,timeOut = 5000)
  public void zoomAdjust___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(Zoom_In_Out.class).getFullHeightButton();  
	  try {
       Assert.assertTrue(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok"); 
       page.getInstance(Zoom_In_Out.class).getFullWidthButton();
       Assert.assertTrue(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
       page.getInstance(Zoom_In_Out.class).getFullPageButton();
       Assert.assertTrue(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");   
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * 
   * @see Zoom_In_Out.class
   * @throws InterruptedException
   */
  @Test(priority = 10 , alwaysRun=true ,timeOut = 5000)
  public void zoomTextBox___onSmall_file (Method method) throws InterruptedException {
	  //TODO
	  page.getInstance(Zoom_In_Out.class).setZoomBox(); 
	  try {   
      Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),"Zoom Courant :100.00%", "error accurerd Test not ok");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   *  
   * @see rotation.class
   * @throws InterruptedException
   */
  @Test(priority = 11, alwaysRun=true ,timeOut = 5000)
  public void Rotation___onSmall_file(Method method) throws InterruptedException {
	  //TODO
	  try {
	   page.getInstance(rotation.class).getLeftRotate();   
       page.getInstance(rotation.class).getRightRotate();
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
 /**
  * 
  * @see fullscreen.class
  * @throws InterruptedException
  */
  @Test(priority = 12, alwaysRun=true ,timeOut = 6000 , singleThreaded=true, skipFailedInvocations =true )
  public void fullscreen___onSmall_file(Method method) throws InterruptedException { 
	  //TODO
	  page.getInstance(fullscreen.class).getFullScreen();
	  try {
       Assert.assertTrue(page.findElement(fullScreen).isDisplayed(), "FULLSCREEN BUTTON IS NOT DISPLAYED");  
       Assert.assertTrue(page.findElement(verticalSlider).isDisplayed(), "VERTICAL SLIDER BUTTON IS NOT DISPLAYED"); 
       page.getInstance(fullscreen.class).EscapeFullScreen();
       Assert.assertTrue(page.findElement(thumbExplorerButton).isDisplayed(), "THUMBER BUTTON IS NOT DISPLAYED");
	  }
	  catch(Exception e) {
  		  e.printStackTrace();
  	   }
  }
  /**
   * @see logoPage.class	
   * @see prop.getProperty("ARenderversion")
   * @throws InterruptedException
   */
   @Test(priority = 13)
    public void logoVersion___onSmall_file (Method method) throws InterruptedException {
  	 //TODO getText version and compare it with ARenderversion on prop.getProperty()
      try {
  	    String ActuelResult = page.getInstance(logoPage.class).VersionCheck();
  	    String ExpectedResult = (prop.getProperty("ARenderversion"));
  	    Assert.assertEquals(ActuelResult,ExpectedResult, "ERROR ACCURRED : ARENDER VERSION IS NOT TRUE");        
  		  }
  	catch(Exception e){ 
  		 e.printStackTrace();
  		 }
  	  }
}
