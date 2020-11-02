/**
 * 
 */
package EndToEnd;

import java.lang.reflect.Method;

import org.testng.Assert;
import FullActionpage.zoomFonction;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */
public class ZoomTest extends pageObject.TestBase implements FactoryLocator, FileFactoryLocator {
	
	 
	public void zoomIn (Method method) throws InterruptedException {
		   
		  page.getInstance(zoomFonction.class).getZoomIn();  
		  try {
	       Assert.assertTrue((page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :") ,"error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }  
	
	  public void zoomOut(Method method) throws InterruptedException {
		  		  page.getInstance(zoomFonction.class).getZoomOut(); 
		  try {
	       Assert.assertTrue((page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :"),"error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	 
	  public void zoomIn_Zone(Method method) throws InterruptedException {
		  //
		  page.getInstance(zoomFonction.class).ZoomInZone();  
		  try {
	       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	
	  public void zoomAdjust(Method method) throws InterruptedException {
		  
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
	
	  public void zoomTextBox(Method method) throws InterruptedException {
		  
		  page.getInstance(zoomFonction.class).setZoomBox(); 
		 
		  try {   
	      Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Zoom Courant :100.00%", "error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
}
