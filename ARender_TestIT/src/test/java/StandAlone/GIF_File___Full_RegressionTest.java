/**
 * 
 */
package StandAlone;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import FullActionpage.deleteFonction;
import annotationHandler.PolygoneannotationHandler;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.StumpAnnotaionHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.annotationdrawBase;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.freeHandAnnotationtHandler;
import annotationHandler.freeTextAnnotationHandler;
import annotationHandler.polylineAnnotationHandler;
import fileHandler.AFileUploadBase;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;

/**
 * @author ARIDHI HICHEM
 *
 */
public class GIF_File___Full_RegressionTest  extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator {
	/**
	 * 
	 * @param method
	 * @throws Exception 
	 */
		@Test(priority = 1 , alwaysRun = true ,enabled= true)
	    public void Upload_Gif(Method method) throws Exception {
			
			page.getInstance(AFileUploadBase.class).doDownloadfile();
		 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\chat.gif");
		 page.waitForElementPresent(thumbimage);
		 System.out.println(page.findElement(videoLocation).getLocation());
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
       }
	  /**
	   * 
	   * @param method
	   * @throws InterruptedException
	   */
		@Test (priority = 2,  dependsOnMethods = { "Upload_Gif" })
		public void Handle_StickyNote___On_Gif (Method method) throws InterruptedException{ page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
	    // TODO Check notification message is not wrong
		// TODO Check annotation is displayed 
	    // TODO Check style barre is displayed 
		try {
		    Assert.assertTrue(page.findElement(StickyeannotationDisplayed).isDisplayed(),"ERROR ACCURRED : STICKYNOTE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
		   
	    	}
		catch(Exception e) {
			e.printStackTrace();
		}    
		finally { 
		      page.getInstance(deleteFonction.class).deleteFromStyleBar();
		    page.builder.moveToElement(page.findElement(VDragger))
		    .click(page.findElement(dropDown))
		    .build().perform();
	            }	
        }
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 3 ,enabled= true,dependsOnMethods = { "Upload_Gif" })	
	    public void Handle_FreeText___On_Gif (Method method) throws InterruptedException { page.getInstance(freeTextAnnotationHandler.class).doDrowfreetext(); 	
	    // TODO Check notification message is not wrong
	 	// TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
	    try {
	        Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");
	        page.getInstance(freeTextAnnotationHandler.class).doStylefreetext();
	            }
		catch(Exception e) {
			e.printStackTrace();
		}    
		finally { 
		         page.getInstance(deleteFonction.class).deleteFromStyleBar();
		       page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
	            }	
		}

		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test(priority = 4 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Handle_Circle___On_Gif (Method method) throws InterruptedException { page.getInstance(circleAnnotationHandler.class).doDrowcircle();	
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {

		    Assert.assertTrue(page.findElement(annotationBarView).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
	        page.getInstance(circleAnnotationHandler.class).doStylecircle();
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
			      page.getInstance(deleteFonction.class).deleteFromStyleBar();
			    page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
		        }	
		}     
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 5 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Handle_Arrow___On_Gif(Method method) throws InterruptedException { page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : ARROW IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		    page.getInstance(arrowAnnotationHandler.class).doStylearrow();
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
			      page.getInstance(deleteFonction.class).deleteFromStyleBar();
			    page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
		        }	
		} 
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 6 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Handle_Underline___On_Gif(Method method) throws InterruptedException {page.getInstance(UnderLineHandler.class).doDrowUnderline();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
		     page.getInstance(UnderLineHandler.class).doStyleunderLine();
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
			      page.getInstance(deleteFonction.class).deleteFromStyleBar();
			    page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
		        }	
		}      
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 7 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Handle_freeHand___On_Gif(Method method) throws InterruptedException { page.getInstance(freeHandAnnotationtHandler.class).doDrowfreehand();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : FREEHAND IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
	        page.getInstance(freeHandAnnotationtHandler.class).doStylefreehand();
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
			      page.getInstance(deleteFonction.class).deleteFromStyleBar();
			    page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
		        }	
		}   
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 8 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Handle_polyline___On_Gif(Method method) throws InterruptedException { page.getInstance(polylineAnnotationHandler.class).doDrowpolyline();	
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
	        page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
		   page.getInstance(deleteFonction.class).deleteFromStyleBar();
			    page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
		       }	
		}  
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 9 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Handel_Polygone___On_Gif(Method method) throws InterruptedException { page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : POLYGONE IS NOT DIPLAYDED");
		    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");
	        page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
		   page.getInstance(deleteFonction.class).deleteFromStyleBar();
			    page.builder.moveToElement(page.findElement(VDragger))
			    .click(page.findElement(dropDown))
			    .build().perform();
		       }	
		} 
	    /**
	     * 
	     * @throws InterruptedException
	     */
	    @Test (priority = 10 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Urgent_Stamp___On_Gif(Method method) throws InterruptedException { 
			page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			page.clickOnElement(Urgentbutton);
			page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
			Thread.sleep(2000);
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(StumpAnnotaionHandler.class).StampList(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
		 finally { 
			   page.clickOnElement(annotationExplorerButton);
			   List <WebElement> elements = driver.findElements(delete);
		  	 for (int i=0 ; i < elements.size() ; i++) {
						elements.get(i).click();}	
		        }	
		 page.builder.moveToElement(page.findElement(VDragger))
		    .click(page.findElement(dropDown))
		    .build().perform();
		 Thread.sleep(500);
		}  
		
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 11 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Approved_Stamp___On_Gif(Method method) throws InterruptedException  { 
			page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			page.clickOnElement(approvedbutton);
			page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
			Thread.sleep(2000);
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(StumpAnnotaionHandler.class).StampList(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
		 finally { 
			   page.clickOnElement(annotationExplorerButton);
			   List <WebElement> elements = driver.findElements(delete);
		  	 for (int i=0 ; i < elements.size() ; i++) {
						elements.get(i).click();}	
		        }
		 page.builder.moveToElement(page.findElement(VDragger))
		    .click(page.findElement(dropDown))
		    .build().perform();
		 Thread.sleep(500);
		}  
		
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 12 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Draft_Stamp___On_Gif(Method method) throws InterruptedException  { 
			page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			page.clickOnElement(draftButton);
			page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
			Thread.sleep(2000);
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(StumpAnnotaionHandler.class).StampList(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
		 finally { 
			   page.clickOnElement(annotationExplorerButton);
			   List <WebElement> elements = driver.findElements(delete);
		  	 for (int i=0 ; i < elements.size() ; i++) {
						elements.get(i).click();}	
		        }
		 page.builder.moveToElement(page.findElement(VDragger))
		    .click(page.findElement(dropDown))
		    .build().perform();
		 Thread.sleep(500);
		}  
		
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 13 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void Signature_Stamp___On_Gif(Method method) throws InterruptedException  { 
			page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			page.clickOnElement(signatureButton);
			page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
			Thread.sleep(2000);
		// TODO Check notification message is not wrong
	    // TODO Check annotation is displayed 
	    // TODO Check style barre is displayed
		try {
		    Assert.assertNotEquals(page.getInstance(StumpAnnotaionHandler.class).StampList(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
		 finally { 
			   page.clickOnElement(annotationExplorerButton);
			   List <WebElement> elements = driver.findElements(delete);
		  	 for (int i=0 ; i < elements.size() ; i++) {
						elements.get(i).click();}	
		        }
		 page.builder.moveToElement(page.findElement(VDragger))
		    .click(page.findElement(dropDown)).build().perform();
		 Thread.sleep(500);
		} 
		
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 14 ,enabled= true,dependsOnMethods = { "Upload_Gif" })
		public void delete__Anotation___On_Gif(Method method) throws InterruptedException {
			//TODO Draw an approved stamp
			page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
			//TODO Draw an draft stamp
			page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
		    
			try {
		
				   List <WebElement> elements = driver.findElements(delete);
			  	   for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click(); }
			  	 
			  	Assert.assertTrue(page.findElement(sadEmptyIcon).isDisplayed(),"ERROR ACCURRED : ANNOTATION ARE DELETED");   		
		}
		
	catch(Exception e) {
		e.printStackTrace();
	}
	}

//	    
//		/**
//		 * 
//		 * @throws InterruptedException
//		 */
//		@Test (priority =11 , alwaysRun = true )
//		public void Simple_Hide_Annotation_fonction_On_Gif(Method method) throws InterruptedException {
//			
//			driver.navigate().refresh();		
//			Alert alert =driver.switchTo().alert();		    
//			alert.accept();
//			page.getInstance(AFileUploadBase.class).doDownloadfile();
//			 page.getElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\chat.gif");
//	   try {
//		   page.getInstance(circleAnnotationHandler.class).doDrowcircle();
//		   page.getInstance(annotationdrawBase.class).clickOnElement(cancelAnnotationButton); 
//		   //TODO CLick to Hide annotation
//		   page.getInstance(hideAnnotationPage.class).showAnnotations();
//		   //TODO check hide button change icon
//		   Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(hideAnnotation),"ERROR ACCURRED : HIDE ICONE IS NOT DISPLAYED ;-( ");
//		   //TODO CLick to Show annotation
//		   Thread.sleep(500);
//		   page.getInstance(hideAnnotationPage.class).hideAnnotations(); 
//		   //TODO check annotation present on file
//		   Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
//		   Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(showAnnotation),"ERROR ACCURRED : SHOW ICONE IS NOT DISPLAYED  ;-(");
//		   Thread.sleep(500);
//		   }
//	   catch(Exception e) {
//			e.printStackTrace();
//		} 
//	  }
//		/**
//		 * 
//		 * @throws InterruptedException
//		 */
//		@Test (priority =12 , alwaysRun = true )
//		public void Multiple_Hide_Annotation_fonction_OnJpeg(Method method) throws InterruptedException {
//			try {
//				page.getInstance(hideAnnotationPage.class).showAnnotations();
//				//TODO Draw a new annotation 
//				page.getInstance(UnderLineHandler.class).doDrowUnderline();
//				page.getInstance(annotationdrawBase.class).clickOnElement(cancelAnnotationButton);
//				//TODO check one annotation exist the second not
//		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
//		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
//		 		//TODO click to save 
//		 		page.getInstance(SavePageAndQuit.class).getSaveClick();
//				//TODO check one annotation exist the second not
//		 		Thread.sleep(700);
//		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
//		 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
//				//TODO click to show annotation and check that two annotations is showen
//				page.getInstance(hideAnnotationPage.class).hideAnnotations();
//				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
//				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
//				//TODO click to Hide annotation and check that two annotations is hided
//				Thread.sleep(1000);
//				page.getInstance(hideAnnotationPage.class).showAnnotations();
//				page.getInstance(refreshFonction.class).getRefresh();
//				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
//				Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathFillNone(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION SHOULD NOT BE DISPLAYED ON THE FILE !!");
//			}
//			 catch(Exception e) {
//					e.printStackTrace();
//				} 
//            }
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