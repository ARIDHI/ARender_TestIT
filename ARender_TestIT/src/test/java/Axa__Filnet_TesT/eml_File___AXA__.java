/**
 * 
 */
package Axa__Filnet_TesT;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import FullActionpage.SavePageAndQuit;
import FullActionpage.deleteFonction;
import FullActionpage.refreshFonction;
import annotationHandler.PolygoneannotationHandler;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.StumpAnnotaionHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.annotationdrawBase;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.freeHandAnnotationtHandler;
import annotationHandler.freeTextAnnotationHandler;
import annotationHandler.hideAnnotationPage;
import annotationHandler.polylineAnnotationHandler;
import fileHandler.AFileUploadBase;
import fileHandler.DownLoadWithAnnotationCSV;
import fileHandler.DownloadAnnotationFDF;
import fileHandler.DownloadAnnotationXFDF;
import fileHandler.DownloadDocumentwithAnnotationFDF;
import fileHandler.DownloadPDF;
import pageObject.FactoryLocator;
import pageObject.FileFactoryLocator;

/**
 * @author ARIDHI HICHEM
 *
 */
public class eml_File___AXA__  extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator {
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
		@Test(priority = 1 , alwaysRun = false ,enabled= true)
	    public void eml_File____Upload (Method method) throws InterruptedException, IOException {
			driver.get("http://18.203.215.159:8080/arondor-arender-axa-war-4.1.0/?bean=urlParserExternalAccessorProxy&id=%7B3D61AAF6-89F4-CD49-A7D6-74FE5DF00000%7D&objectStoreName=OS1&documentId=3D61AAF6-89F4-CD49-A7D6-74FE5DF00000");		
		    page.waitForElementinvisible(waiterImg);
		    page.waitForElementPresent(thumbimage);
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
			@Test (priority = 2,  enabled= true)
			public void Handle_StickyNote___Oneml (Method method) throws InterruptedException{ 
		    page.clickOnElement(annotationExplorerButtonFull);     
			Thread.sleep(500);	  	 
				page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
			
		    // TODO Check notification message is not wrong
			// TODO Check annotation is displayed 
		    // TODO Check style barre is displayed 
			try {
			    Assert.assertTrue(page.findElement(StickyeannotationDisplayed).isDisplayed(),"ERROR ACCURRED : STICKYNOTE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");	    
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
			 */
			@Test (priority = 3 ,enabled= true)	
		    public void Handle_FreeText___Oneml(Method method) throws InterruptedException { page.getInstance(freeTextAnnotationHandler.class).doDrowfreetext(); 	
		    // TODO Check notification message is not wrong
		 	// TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
		    try {  
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
		        page.getInstance(freeTextAnnotationHandler.class).doStylefreetext();
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
			 */
			@Test(priority = 4 ,enabled= true)
			public void Handle_Circle___Oneml(Method method) throws InterruptedException { page.getInstance(circleAnnotationHandler.class).doDrowcircle();	
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1,"ERROR ACCURRED : CICRLE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
		        page.getInstance(circleAnnotationHandler.class).doStylecircle();
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
			 */
			@Test (priority = 5 ,enabled= true)
			public void Handle_Arrow___Oneml(Method method) throws InterruptedException { page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : ARROW IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
			    page.getInstance(arrowAnnotationHandler.class).doStylearrow();
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
			 */
			@Test (priority = 6 ,enabled= true)
			public void Handle_Underline___Oneml(Method method) throws InterruptedException {page.getInstance(UnderLineHandler.class).doDrowUnderline();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
			    page.getInstance(UnderLineHandler.class).doStyleunderLine();
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
			 */
			@Test (priority = 7 ,enabled= true)
			public void Handle_freeHand___Oneml(Method method) throws InterruptedException { page.getInstance(freeHandAnnotationtHandler.class).doDrowfreehand();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : FREEHAND IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
			    page.getInstance(freeHandAnnotationtHandler.class).doStylefreehand();
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
			 */
			@Test (priority = 8 ,enabled= true)
			public void Handle_polyline___Oneml(Method method) throws InterruptedException { page.getInstance(polylineAnnotationHandler.class).doDrowpolyline();	
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : POLYLINE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
			    page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
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
			 */
			@Test (priority = 9 ,enabled= true)
			public void Handel_Polygone___Oneml(Method method) throws InterruptedException { page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : POLYGONE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed(),"ERROR ACCURRED : VIEW ICON IS NOT DISPLAYED");
			    page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
			}
		    catch(Exception e) {
					e.printStackTrace();
				}    
		   finally { 
				    page.getInstance(deleteFonction.class).deleteFromStyleBar();
			       }	
			} 
			 @Test (priority = 10 ,enabled= true,timeOut = 6000)
				public void Urgent_Stamp___On_eml() throws InterruptedException { 
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
					   page.clickOnElement(annotationExplorerButtonFull);
					   List <WebElement> elements = driver.findElements(delete);
				  	 for (int i=0 ; i < elements.size() ; i++) {
								elements.get(i).click();}	
				        }	
				 Thread.sleep(500);
				}  
				
				/**
				 * 
				 * @param method
				 * @throws InterruptedException
				 */
				@Test (priority = 11 ,enabled= true,timeOut = 6000)
				public void Approved_Stamp___On_eml() throws InterruptedException  { 
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
					   List <WebElement> elements = driver.findElements(delete);
				  	 for (int i=0 ; i < elements.size() ; i++) {
								elements.get(i).click();}	
				        }
				 Thread.sleep(500);
				}  
				
				/**
				 * 
				 * @param method
				 * @throws InterruptedException
				 */
				@Test (priority = 12 ,enabled= true,timeOut = 6000)
				public void Draft_Stamp___On_eml() throws InterruptedException  { 
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
					   List <WebElement> elements = driver.findElements(delete);
				  	 for (int i=0 ; i < elements.size() ; i++) {
								elements.get(i).click();}	
				        }
				 Thread.sleep(500);
				}  
				
				/**
				 * 
				 * @param method
				 * @throws InterruptedException
				 */
				@Test (priority = 13 ,enabled= true,timeOut = 6000)
				public void Signature_Stamp___On_eml() throws InterruptedException  { 
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
					   List <WebElement> elements = driver.findElements(delete);
				  	 for (int i=0 ; i < elements.size() ; i++) {
								elements.get(i).click();}	
				        }
				} 
				
				/**
				 * 
				 * @param method
				 * @throws InterruptedException
				 */
				@Test (priority = 14 ,enabled= true)
				public void delete__Anotation___On_eml(Method method) throws InterruptedException {
					//TODO Draw an approved stamp
					page.getInstance(circleAnnotationHandler.class).doDrowcircle();
					//TODO Draw an draft stamp
				    page.getInstance(arrowAnnotationHandler.class).doDrowArrow();	
					//TODO Draw an signature stamp
				    page.getInstance(UnderLineHandler.class).doDrowUnderline();

			driver.get("http://18.203.215.159:8080/arondor-arender-axa-war-4.0.9-2-rc1/?bean=urlParserExternalAccessorProxy&"
					+ "id=%7BC55A5ED6-EAFC-C8AC-85D3-73FB89800000%7D&objectStoreName=OS1&documentId=C55A5ED6-EAFC-C8AC-85D3-73FB89800000");		
		    page.waitForElementinvisible(waiterImg);
		    page.waitForElementPresent(thumbimage);
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
		finally { 
			 page.clickOnElement(annotationExplorerButton);
			  List <WebElement> elements = driver.findElements(delete);
			  	   for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click(); }
			  	 page.clickOnElement(ThumExplorerButton); 
	            }	
       }
		  
				/**
				 * 
				 * @throws InterruptedException
				 */
				@Test (priority =15 , alwaysRun = true )
				public void Simple_Hide_Annotation_fonction_On_eml(Method method) throws InterruptedException {
					
			   try {
				   Thread.sleep(1000);
				   page.getInstance(circleAnnotationHandler.class).doDrowcircle();
				   page.getInstance(annotationdrawBase.class).clickOnElement(cancelAnnotationButton); 
				   //TODO CLick to Hide annotation
				   page.getInstance(hideAnnotationPage.class).showAnnotations();
				   //TODO check hide button change icon
				   Assert.assertTrue(page.findElement(hideAnnotation).isDisplayed(),"ERROR ACCURRED : HIDE ICONE IS NOT DISPLAYED ;-( ");
				   //TODO CLick to Show annotation
				   Thread.sleep(500);
				   page.getInstance(hideAnnotationPage.class).hideAnnotations(); 
				   //TODO check annotation present on file
				   Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 0, "ERROR ACCURRED : THE CIRCLE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
				   Assert.assertTrue(page.findElement(showAnnotation).isDisplayed(),"ERROR ACCURRED : SHOW ICONE IS NOT DISPLAYED  ;-(");
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
				@Test (priority =16 , alwaysRun = true )
				public void Multiple_Hide_Annotation_fonction_On_eml(Method method) throws InterruptedException {
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
						page.getInstance(refreshFonction.class).getRefresh();
						Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
						Assert.assertEquals(page.getInstance(annotationdrawBase.class).getPathFillNone(), 1, "ERROR ACCURRED : THE UNDERLINE ANNOTATION SHOULD NOT BE DISPLAYED ON THE FILE !!");
					}
					 catch(Exception e) {
							e.printStackTrace();
						}
					finally { 
						   List <WebElement> elements = driver.findElements(delete);
					  	 for (int i=0 ; i < elements.size() ; i++) {
									elements.get(i).click();}	
					        }
					 Thread.sleep(500);
					}  
/**
 * 
 * @param method
 * @throws InterruptedException
 */

	        @Test (priority = 17 ,timeOut = 10000)
	       public void Download_PDF_File_via_eml (Method method) throws InterruptedException{
	        page.getInstance(DownloadPDF.class).DodownloadPdf();
	        Assert.assertTrue(true);
	        Thread.sleep(1000);
	        }	
	        @Test (priority = 18  ,timeOut = 10000)
	        public void DownloadAnnotation_FDF_File_via_eml(Method method) throws InterruptedException{
		     page.getInstance(circleAnnotationHandler.class).doDrowcircle();
	         page.getInstance(SavePageAndQuit.class).getquitClick();
	         Thread.sleep(500);
	         page.getInstance(SavePageAndQuit.class).getSaveClick(); 
	         Thread.sleep(3000);
	         page.getInstance(DownloadAnnotationFDF.class).Dodownloadfdf();
	         Assert.assertTrue(true);
	        }
	       @Test (priority = 19 ,timeOut = 10000)
	       public void DownloadAnnotation_XFDF_File_via_eml(Method method) throws InterruptedException{ page.getInstance(DownloadAnnotationXFDF.class).Dodownloadxfdf();
	       Assert.assertTrue(true);
	       Thread.sleep(1000);
	        }
	       @Test (priority = 20  ,timeOut = 10000)
	       public void Download_Document_withAnnotation_FDF_File_via_eml(Method method) throws InterruptedException{ page.getInstance(DownloadDocumentwithAnnotationFDF.class).DodownloadwithAnnotationFdf();
	        Assert.assertTrue(true);
	       Thread.sleep(1000);
	       }
	       @Test (priority = 21 ,timeOut = 10000)
	       public void DownLoad_With_Annotation_CSV_File_via_eml(Method method) throws InterruptedException{ page.getInstance(DownLoadWithAnnotationCSV.class).DodownloadWithAnnotationCSV();
	       Assert.assertTrue(true);
	       Thread.sleep(1000);
	       }

	       @Test(priority = 22 )
	       public void Upload__File_via_eml(Method method) throws InterruptedException  {
		
		     page.getInstance(AFileUploadBase.class).doDownloadfile();
		     page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\ARenderTest.zip");
	       page.waitForElementPresent(thumbimage);
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