package Nuxio___TesT;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.Zoom_In_Out;
import FullActionpage.fullscreen;
import FullActionpage.naviagationPage;
import FullActionpage.rotation;
import GED_____Base.logIn__Nuxio;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;

/**
 * @author Lenovo
 *
 */
public class Start_nuxeo extends pageObject.TestBase implements ARender____FactoryPage, File____FactoryPage {
	
	@Test(priority = 1, alwaysRun = true ,enabled= true)
    public void Login (Method method) throws InterruptedException, IOException {
		 page.getInstance(logIn__Nuxio.class).login(prop.getProperty("usernameNuxeo"), prop.getProperty("passwordNuxeo"));
		 Thread.sleep(2000);
		 driver.get("https://valmy12.arender.fr/nuxeo-arender/?documentId=default,3da9897e-6eb6-4205-84a9-93f41c91e12c,file:content,d057ec0bc08d70bfb8531e59951a8bf2");		
		Thread.sleep(2000);

		 List <WebElement> elements = driver.findElements(delete);
		 if (elements.size() != 0) {
			for (int i=0 ; i < elements.size() ; i++) {
				elements.get(i).click();
			  }	
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
	   * 
	   * @see Zoom_In_Out.class
	   * @param
	   */
	  @Test(priority = 3 , alwaysRun=true )
	  public void zoomIn___onBulky_File (Method method) throws InterruptedException {
		  //TODO 
		   
		  try {
			  page.getInstance(Zoom_In_Out.class).getZoomIn();
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
	  @Test(priority = 4 , alwaysRun=true ,timeOut = 2000)
	  public void zoomOut___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		
		  try {
			  page.getInstance(Zoom_In_Out.class).getZoomOut(); 		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * 
	   * @see Zoom_In_Out.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 5, alwaysRun=true ,timeOut = 2000)
	  public void zoomIn_Zone___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		   
		  try {
			  page.getInstance(Zoom_In_Out.class).ZoomInZone();		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * @see HanlerBasePage.class
	   * @see Zoom_In_Out.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 6 , alwaysRun=true ,timeOut = 5000)
	  public void zoomAdjust___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		  try {
			  page.getInstance(Zoom_In_Out.class).getFullHeightButton();     
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
	  @Test(priority = 7 , alwaysRun=true ,timeOut = 5000)
	  public void zoomTextBox___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		 
		  try {   
			  page.getInstance(Zoom_In_Out.class).setZoomBox();		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   *  
	   * @see rotation.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 8, alwaysRun=true ,timeOut = 5000)
	  public void Rotation___onBulky_File(Method method) throws InterruptedException {
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
	  @Test(priority = 9, alwaysRun=true ,timeOut = 6000 , singleThreaded=true, skipFailedInvocations =true )
	  public void fullscreen___onBulky_File(Method method) throws InterruptedException { 
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
//	  /**
//		 * 
//		 * @param method
//		 * @throws InterruptedException
//		 */
//		@Test (priority =10 , alwaysRun = true )
//		public void Filtre__On_Zip(Method method) throws InterruptedException {
//			
//			try {
//				page.getInstance(Filtre___Fonction.class).HandleAnno();page.getInstance(Filtre___Fonction.class).getFiltreOption();
//				Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(filtrePannel),"ERROR ACCURRED : FILTRE PANNEL IS NOT DISPLAYED ;-( ");
//				page.getInstance(Filtre___Fonction.class).selectCircleFiltre();page.getEnabledElement(filtreValidate);		
//				Assert.assertTrue(page.getInstance(Filtre___Fonction.class).isDisplayed(commentCircleIcon));
//				Assert.assertFalse(page.getInstance(Filtre___Fonction.class).isDisplayed(commentSquareIcon));
//				page.getInstance(Filtre___Fonction.class).selectToutFiltre();page.getEnabledElement(filtreValidate);
//				Assert.assertTrue(page.getInstance(Filtre___Fonction.class).isDisplayed(commentCircleIcon));
//				Assert.assertTrue(page.getInstance(Filtre___Fonction.class).isDisplayed(commentSquareIcon));
//				Thread.sleep(500);
//			}
//			 catch(Exception e) {
//					e.printStackTrace();
//				} 
//			try {
//				
//		
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			} 
//	        }
//		/**
//		 * 
//		 * @param method
//		 * @throws InterruptedException
//		 */
//		@Test (priority = 11, alwaysRun = true )
//		public void FiltreBy_resolu__On_Zip(Method method) throws InterruptedException {
//		
//			// TODO Draw 2 sticky note 
//			try {
//				page.getInstance(Filtre___Fonction.class).HandleSticky();
//				Assert.assertEquals(page.getInstance(Filtre___Fonction.class).getcontentPanel(),2,"ERROR ACCURRED : No CONTENT PANEL EXIST !!");
//			    }
//			 catch(Exception e) {
//					e.printStackTrace();
//				} 
//			try {
//				// TODO Open filtre pannel
//				page.getInstance(Filtre___Fonction.class).getFiltreOption();
//				Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(filtrePannel),"ERROR ACCURRED : FILTRE PANNEL IS NOT DISPLAYED ;-( ");
//				//TODO Check switch Button Container "résolué" 
//				page.getEnabledElement(switchButtonContainer);
//				Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),"Filtrer par : Résolu", "ERROR ACCURRED :SWITCH BUTTON DOSENT WORK !!");
//				Assert.assertEquals(page.getInstance(Filtre___Fonction.class).getcontentPanel(),2,"ERROR ACCURRED :SWITCH BUTTON DOSENT WORK !!");
//				page.getEnabledElement(switchButtonContainer);;
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			} 
//	      }

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
