/**
 * 
 */
package Axa__Filnet_TesT;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.SavePageAndQuit;
import FullActionpage.deleteActionPage;
import FullActionpage.refreshPage;
import annotationHandler.PolygoneannotationHandler;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.annotationdrawBase;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.freeHandAnnotationtHandler;
import annotationHandler.freeTextAnnotationHandler;
import annotationHandler.hideAnnotationPage;
import annotationHandler.polylineAnnotationHandler;
import fileHandler.AFileUploadBase;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class MP4_File___AXA__  extends pageObject.TestBase implements ARender____FactoryPage, File____FactoryPage {
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
		@Test(priority = 1 , alwaysRun = true ,enabled= true)
	    public void MP4_File____Upload (Method method) throws InterruptedException, IOException {
		
			 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\TestARender.mp4");
			 page.waitForElementPresent(thumbimage);
			Thread.sleep(1000);
		// TODO check notification message is not wrong
		// TODO check page container is not null
	    // TODO check sub number of page is not null
		try {
		    Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileContainer(),0, "error accurred file counter");
		    Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileSubNum(),0, "error accurred file SubNum counter");
			}
		catch(Exception e) {
			e.printStackTrace();
		    }
//		finally { 
//			 page.clickOnElement(annotationExplorerButton);
//			  List <WebElement> elements = driver.findElements(delete);
//			  	   for (int i=0 ; i < elements.size() ; i++) {
//							elements.get(i).click(); }
//			  	 page.clickOnElement(ThumExplorerButton); 
//	            }	
       }
	  /**
	   * 
	   * @param method
	   * @throws InterruptedException
	   */
		@Test (priority = 2,  enabled= true)
		public void Handle_StickyNote___On_MP4 (Method method) throws InterruptedException{ page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
	    // TODO Check notification message is not wrong
		// TODO Check annotation is displayed 
	    // TODO Check style barre is displayed 
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Text");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(StickyeannotationDisplayed),"ERROR ACCURRED : STICKYNOTE IS NOT DIPLAYDED");
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
		 */
		@Test (priority = 3 ,enabled= true)	
	    public void Handle_FreeText___On_MP4 (Method method) throws InterruptedException { page.getInstance(freeTextAnnotationHandler.class).doDrowfreetext(); 	
	    // TODO Check notification message is not wrong
	 	// TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
	    try {
	        Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Freetext");
	        Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");
	        page.getInstance(freeTextAnnotationHandler.class).doStylefreetext();
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
		 */
		@Test(priority = 4 ,enabled= true)
		public void Handle_Circle___On_MP4 (Method method) throws InterruptedException { page.getInstance(circleAnnotationHandler.class).doDrowcircle();	
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Circle");
		    Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1,"ERROR ACCURRED : CICRLE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
	        page.getInstance(circleAnnotationHandler.class).doStylecircle();
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
		 */
		@Test (priority = 5 ,enabled= true)
		public void Handle_Arrow___On_MP4(Method method) throws InterruptedException { page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Line");
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : ARROW IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		    page.getInstance(arrowAnnotationHandler.class).doStylearrow();
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
		 */
		@Test (priority = 6 ,enabled= true)
		public void Handle_Underline___On_MP4(Method method) throws InterruptedException {page.getInstance(UnderLineHandler.class).doDrowUnderline();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Square");
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		     page.getInstance(UnderLineHandler.class).doStyleunderLine();
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
		 */
		@Test (priority = 7 ,enabled= true)
		public void Handle_freeHand___On_MP4(Method method) throws InterruptedException { page.getInstance(freeHandAnnotationtHandler.class).doDrowfreehand();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Ink");
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : FREEHAND IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
	        page.getInstance(freeHandAnnotationtHandler.class).doStylefreehand();
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
		 */
		@Test (priority = 8 ,enabled= true)
		public void Handle_polyline___On_MP4(Method method) throws InterruptedException { page.getInstance(polylineAnnotationHandler.class).doDrowpolyline();	
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Polyline");
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
	        page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
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
		 */
		@Test (priority = 9 ,enabled= true)
		public void Handel_Polygone___On_MP4(Method method) throws InterruptedException { page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Polygon");
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : POLYGONE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");
	        page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
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
		 */
		@Test (priority = 10 ,enabled= true )
		public void Handle_Stamp___On_MP4(Method method) throws InterruptedException {	    
		//TODO Draw an approved stamp

	    Thread.sleep(1000);
	    
	    
		} 
		/**
		 * 
		 * @throws InterruptedException
		 */
		@Test (priority =11 , alwaysRun = true )
		public void Simple_Hide_Annotation_fonction_On_MP4(Method method) throws InterruptedException {
			
			driver.navigate().refresh();		
			Alert alert =driver.switchTo().alert();		    
			alert.accept();

			 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\TestARender.mp4");
	   try {
		   page.getInstance(circleAnnotationHandler.class).doDrowcircle();
		   page.getInstance(annotationdrawBase.class).clickOnElement(cancelAnnotationButton); 
		   //TODO CLick to Hide annotation
		   page.getInstance(hideAnnotationPage.class).showAnnotations();
		   //TODO check hide button change icon
		   Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(hideAnnotation),"ERROR ACCURRED : HIDE ICONE IS NOT DISPLAYED ;-( ");
		   //TODO CLick to Show annotation
		   Thread.sleep(500);
		   page.getInstance(hideAnnotationPage.class).hideAnnotations(); 
		   //TODO check annotation present on file
		   Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
		   Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(showAnnotation),"ERROR ACCURRED : SHOW ICONE IS NOT DISPLAYED  ;-(");
		   Thread.sleep(500);
		   }
	   catch(Exception e) {
			e.printStackTrace();
		} 
	  }
		/**
		 * 
		 * @throws InterruptedException
		 */
		@Test (priority =12 , alwaysRun = true )
		public void Multiple_Hide_Annotation_fonction_OnJpeg(Method method) throws InterruptedException {
			try {
				page.getInstance(hideAnnotationPage.class).showAnnotations();
				//TODO Draw a new annotation 
				page.getInstance(UnderLineHandler.class).doDrowUnderline();
				page.getInstance(annotationdrawBase.class).clickOnElement(cancelAnnotationButton);
				//TODO check one annotation exist the second not
		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
		 		//TODO click to save 
		 		page.getInstance(SavePageAndQuit.class).getSaveClick();
				//TODO check one annotation exist the second not
		 		Thread.sleep(700);
		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
				//TODO click to show annotation and check that two annotations is showen
				page.getInstance(hideAnnotationPage.class).hideAnnotations();
				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
				//TODO click to Hide annotation and check that two annotations is hided
				Thread.sleep(1000);
				page.getInstance(hideAnnotationPage.class).showAnnotations();
				page.getInstance(refreshPage.class).getRefresh();
				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathFillNone(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION SHOULD NOT BE DISPLAYED ON THE FILE !!");
			}
			 catch(Exception e) {
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