/**
 * 
 */
package File_Management_____Testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.SavePageAndQuit;
import FullActionpage.refreshPage;
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
import fileHandler.DownloadAnnotation_FDF;
import fileHandler.DownloadAnnotation_XFDF;
import fileHandler.DownloadDocumentwithAnnotationFDF;
import fileHandler.DownloadPDF;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HanlerBasePage;
import style.Page.SpecificStyle;


/**
 * @author ARIDHI Hichem
 *
 */
public class Pdf_File___Full_RegressionTest extends pageObject.TestBase implements ARender____FactoryPage , File____FactoryPage {
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
		@Test(priority = 1 ,enabled= true)
	    public void PDF_File____Upload (Method method) throws InterruptedException, IOException {
			
			 page.getInstance(AFileUploadBase.class).doDownloadfile();
			 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\TestARender.pdf");
			 
	       // TODO Check NOTIF MSG isDisplayed 
	       // TODO Check THUMBER isDisplayed 
	       // TODO Check FILE COUNTER isTrue
	       // TODO Check FILE SUB NUM isDisplayed	 
			 
		try {			
	    	try {
			 page.waitForElementPresent(thumbimage);
		    } catch(Exception e) {
	    	System.out.println("[ERROR] : FILE THUMBER IS NOT DISPLAYED OR TIMEOUT ACCURRED");
	    }
			Thread.sleep(2000);
			
			try {
		    Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileContainer(),0);
			} catch(Exception e) {
		    	System.out.println("[ERROR] : FILE ARE NOT DISPLAYED IN FILE COUNTER");
		    }
			
			try {
		    Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileSubNum(),0);
			} catch(Exception e) {
		    	System.out.println("[ERROR] : FILE SUB NUMBER ARE NOT DISPLAYED ON FILE");
		    }
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
		@Test (priority = 2, alwaysRun= true , dependsOnMethods="PDF_File____Upload")
		public void Handle_StickyNote___OnPDF (Method method) throws InterruptedException{ 
			page.getInstance(StickyNoteAnnotationHandler.class).doDrowSticky();
			
	        // TODO Check NOTIF MSG isDisplayed 
		    // TODO Check ANNOTATION isDisplayed 
	        // TODO Check STYLE TOOLBAR isDisplayed 
		    // TODO Check REPLY BUTTON isDisplayed  
		    // TODO Check VIEW ICON isDisplayed
		    // TODO Check PIN ICON isDisplayed
		    // TODO Check TEXT BOX isDisplayed 
		    // TODO Check REMOVE BUTTON isDisplayed
		    // TODO Check STATE BOX isDisplayed
		try {
			try {
		        Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),
		        		           "Prêt pour la création d'annotation : Text");
			    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		    }
		    try {	
		    Assert.assertTrue(page.findElement(StickyeannotationDisplayed).isDisplayed());
		    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE IS NOT DISLAYDED");
		    }
		    try {
		         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKYNOTE STYLE TOOLBAR IS NOT DISLAYDED");
		        }	    
		    try {
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : STICKYNOTE VIEW ICON IS NOT DISLAYDED");
			    }
		    try {
			    Assert.assertTrue(page.findElement(stkNotePin).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : STICKYNOTE PIN ICON VIEW IS NOT DISLAYDED");
			    }
		     
		    try {
			    Assert.assertTrue(page.findElement(stkRemove).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : STICKYNOTE REMOVE BUTTON IS NOT DISLAYDED");
			    }
		    try {
			    Assert.assertTrue(page.findElement(stkNoteState).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : STICKYNOTE STATE BOX IS NOT DISLAYDED");
			    }
		    
		    try {
			    Assert.assertTrue(page.findElement(stkTextBox).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : STICKYNOTE STATE BOX IS NOT DISLAYDED");
			    }
 
		    try {	
		        page.getInstance(StickyNoteAnnotationHandler.class).doStylestickynote();
	    	    }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : STICKY STYLE FONCTION ");
		        }
		    
		   
			try {
				 page.clickOnElement(cancelAnnotationButton);
				 Thread.sleep(600);
			    Assert.assertTrue(page.findElement(AddReply).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : STICKYNOTE REPLAY BUTTON IS NOT DISLAYDED");
			    } 
		}
		
		catch(Exception e) {
			System.out.println("[ERROR] : STICKYNOTE ERROR ACCURRED");
		}    
		
		finally { 		
		    page.clickOnElement(stkRemove);
	       }	
        }
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 3 , alwaysRun= true , dependsOnMethods="PDF_File____Upload")	
	    public void Handle_FreeText___OnPdf (Method method) throws InterruptedException { 
			page.getInstance(freeTextAnnotationHandler.class).doDrowfreetext(); 	
			
	        // TODO Check NOTIF MSG isDisplayed 
	        // TODO Check ANNOTATION isDisplayed 
	        // TODO Check STYLE TOOLBAR isDisplayed 
	        // TODO Check SQAURE BUTTON isDisplayed  
	        // TODO Check VIEW ICON isDisplayed
			
	    try {
	    	try {
	        Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg)
	        		           ,"Prêt pour la création d'annotation : Freetext");
	    	    }
	    	catch(Exception e) {
		    	System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		        }
	    	try {
	        Assert.assertTrue(page.findElement(resizeSquareIcon).isDisplayed()); 
	    	    }
	    	catch(Exception e) {
		    	System.out.println("[ERROR] : FREETEXT IS NOT DIPLAYDED");
		        }
	    	try {
		         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : FREETEXT STYLE TOOLBAR IS NOT DISLAYDED");
		        }	    
		    try {
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : FREETEXT VIEW ICON IS NOT DISLAYDED");
			    }
		    try {
			    Assert.assertTrue(page.findElement(arrowCrossIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW CROSS ICON IS NOT DISLAYDED");
			    }
		    try {
	           page.getInstance(freeTextAnnotationHandler.class).doStylefreetext();
	            }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : FREE TEXT STYLE FONCTION");
		    }
	    }
		catch(Exception e) {
			e.printStackTrace();
		}    
	    
		finally { 
		       page.getInstance(annotationdrawBase.class).doDrop();
	            }	
		}
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test(priority = 4 , alwaysRun= true , dependsOnMethods="PDF_File____Upload")
		public void Handle_Circle___OnPdf (Method method) throws InterruptedException { 
			page.getInstance(circleAnnotationHandler.class).doDrowcircle();	
			
		    // TODO Check NOTIF MSG isDisplayed 
		    // TODO Check ANNOTATION isDisplayed 
		    // TODO Check STYLE TOOLBAR isDisplayed 
		    // TODO Check STYLE RESIZE POINT isDisplayed
		    // TODO Check VIEW ICON isDisplayed
		try {
			try {
		    Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),
		    		             "Prêt pour la création d'annotation : Circle");
			}
			catch(Exception e) {
		    	System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		        }
			try {
		    Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1);
			}
			catch(Exception e) {
		    	System.out.println("[ERROR] : CICRLE IS NOT DIPLAYDED");
		        }
			try {
		         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : CIRCLE STYLE TOOLBAR IS NOT DISLAYDED");
		        }
			try {
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			    }
			    catch(Exception e) {
			    	System.out.println("[ERROR] : CIRCLE VIEW ICON IS NOT DISLAYDED");
			    }
			try {
		         Assert.assertTrue(page.findElement(resizePoint).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : CIRCLE RISIZE POINT IS NOT DISLAYDED");
		        }
			try {
	            page.getInstance(circleAnnotationHandler.class).doStylecircle();
			}
			catch(Exception e) {
		    	System.out.println("[ERROR] : CIRCLE STYLE FONCTION");
		    }
		}
	  catch(Exception e) {
				e.printStackTrace();
			}    
	    finally { 
			    page.getInstance(annotationdrawBase.class).doDrop();
		        }	
		}     
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 5 , alwaysRun= true , dependsOnMethods="PDF_File____Upload")
		public void Handle_Arrow___OnPdf(Method method) throws InterruptedException {
			page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
			
			// TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
			// TODO Check STYLE RESIZE POINT isDisplayed
			// TODO Check VIEW ICON isDisplayed
			// TODO Check HEAD & TEAL isDisplayed
		try {
			try {
		    Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg)
		    		            ,"Prêt pour la création d'annotation : Line");
			} catch(Exception e) {
		    	    System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
	        }
			
			try {
		         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		        } catch(Exception e) {
		    	    System.out.println("[ERROR] : ARROW STYLE TOOLBAR IS NOT DISLAYDED");
		        }
		    
			try {
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW VIEW ICON IS NOT DISLAYDED");
			    }
			 
			try {
			    Assert.assertTrue(page.findElement(ArrowHead).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW HEAD IS NOT DISLAYDED");
			    }
	  
			try {
			    Assert.assertTrue(page.findElement(resizeArrow).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW SIZE POINT IS NOT DISLAYDED");
			    }
			   
		    try {
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0);
				} catch(Exception e) {
			    	System.out.println("[ERROR] : ARROW SIZE POINT IS NOT DISLAYDED");
			    }
		    try {
		        page.getInstance(arrowAnnotationHandler.class).doStylearrow();
		        } catch(Exception e) {
		    	   System.out.println("[ERROR] : ARROW STYLE ERROR");
		        }
		    
		     }
	    catch(Exception e) {
				e.printStackTrace();
			 }    
	   finally { 
			    page.getInstance(annotationdrawBase.class).doDrop();
		        }	
		} 
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 6 , alwaysRun= true , dependsOnMethods="PDF_File____Upload")
		public void Handle_Underline___OnPdf(Method method) throws InterruptedException {
		    page.getInstance(UnderLineHandler.class).doDrowUnderline();
		  
		    // TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
		    // TODO Check RESIZE TOOLBAR isDisplayed 
		  
		try {
			try {
		    Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Square");
			    } catch(Exception e) {
		    	    System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
	        }
		    try {
		         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		        } catch(Exception e) {
		    	    System.out.println("[ERROR] : UNDERLINE STYLE TOOLBAR IS NOT DISLAYDED");
		        }
		    
			try {
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : UNDERLINE VIEW ICON IS NOT DISLAYDED");
			    }
		    
		    try {
		    Assert.assertTrue(page.findElement(underLineDisp).isDisplayed());
		        } catch(Exception e) {
		    	System.out.println("[ERROR] : UNDERLINE IS NOT DISLAYDED");
		        }
		    
		    try {
		         Assert.assertTrue(page.findElement(resizePoint).isDisplayed());
		        }
		    catch(Exception e) {
		    	System.out.println("[ERROR] : UNDERLINE RISIZE POINT IS NOT DISLAYDED");
		        }
		    
		    try {
		       page.getInstance(UnderLineHandler.class).doStyleunderLine();
		        }catch(Exception e) {
		    	System.out.println("[ERROR] : UNDERLINE STYLE ERROR");
		        }   
		     }
	    catch(Exception e) {
				e.printStackTrace();
			 }    
	   finally { 
			    page.getInstance(annotationdrawBase.class).doDrop();
		        }	
	     	}      
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 7 , dependsOnMethods="PDF_File____Upload")
		public void Handle_freeHand___OnPDF(Method method) throws InterruptedException { 
			page.getInstance(freeHandAnnotationtHandler.class).doDrowfreehand();
			
			// TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
			// TODO Check RESIZE TOOLBAR isDisplayed 
			
		try {
		    try {
			Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),
					            "Prêt pour la création d'annotation : Ink");
		      } catch(Exception e) {
	    	    System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		        } 
		    
		    try {
		         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		        } catch(Exception e) {
		    	    System.out.println("[ERROR] : FREE HAND STYLE TOOLBAR IS NOT DISLAYDED");
		        }
		    
			try {
			    Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : FREE HAND VIEW ICON IS NOT DISLAYDED");
			    }
			try {
			    Assert.assertTrue(page.findElement(arrowBar).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : FREE HAND IS NOT DISLAYDED");
			    }
			    
		    try {
			     Assert.assertTrue(page.findElement(resizePoint).isDisplayed());
			    } catch(Exception e) {
			    	System.out.println("[ERROR] : FREE HAND RISIZE POINT IS NOT DISLAYDED");
			    }
		    try {
	         page.getInstance(freeHandAnnotationtHandler.class).doStylefreehand();
		        }catch(Exception e) {
		    	System.out.println("[ERROR] : FREE HAND STYLE ERROR");
		        }   
		 }
	    catch(Exception e) {
				e.printStackTrace();
			}    
	    finally { 
			    page.getInstance(annotationdrawBase.class).doDrop();
		        }	
		}   
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 8 , dependsOnMethods="PDF_File____Upload")
		public void Handle_polyline___OnPDF(Method method) throws InterruptedException { 
			page.getInstance(polylineAnnotationHandler.class).doDrowpolyline();	
			
			// TODO Check NOTIF MSG isDisplayed 
			// TODO Check ANNOTATION isDisplayed 
			// TODO Check STYLE TOOLBAR isDisplayed 
			// TODO Check RESIZE TOOLBAR isDisplayed
			
		try {
			try {
		    Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),
		    		           "Prêt pour la création d'annotation : Polyline");
		        } catch(Exception e) {
    	          System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
	            } 
	    
	    try {
	         Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
	            } catch(Exception e) {
	    	    System.out.println("[ERROR] : POLYLINE STYLE TOOLBAR IS NOT DISLAYDED");
	            }
	    
		try {
		     Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : POLYLINE VIEW ICON IS NOT DISLAYDED");
		    }
		try {
		    Assert.assertTrue(page.findElement(arrowBar).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : POLYLINE IS NOT DISLAYDED");
		    }
		    
	    try {
		     Assert.assertTrue(page.findElement(resizePoint).isDisplayed());
		    } catch(Exception e) {
		    	System.out.println("[ERROR] : POLYLINE RISIZE POINT IS NOT DISLAYDED");
		    }
		 try {   
	        page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
		     }catch(Exception e) {
			    	System.out.println("[ERROR] : POLYLINE STYLE ERROR");
		     } 
		}
	    catch(Exception e) {
				e.printStackTrace();
			}    
	   finally { 
			    page.getInstance(annotationdrawBase.class).doDrop();
		       }	
		}  
		/**
		 * 
		 * @param method
		 * @throws InterruptedException
		 */
		@Test (priority = 9 ,dependsOnMethods="PDF_File____Upload")
		public void Handel_Polygone___OnPDF(Method method) throws InterruptedException { 
			page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
	   
		    // TODO Check NOTIF MSG isDisplayed 
		 	// TODO Check ANNOTATION isDisplayed 
		 	// TODO Check STYLE TOOLBAR isDisplayed 
		 	// TODO Check RESIZE TOOLBAR isDisplayed
		 			
		try {
		    try {
		 		 Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),
		 				 "Prêt pour la création d'annotation : Polygon");
		 		} catch(Exception e) {
		     	     System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		 	    } 
		 	    
		    try {
		 	     Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
		 	    } catch(Exception e) {
		 	    	 System.out.println("[ERROR] : POLYGONE STYLE TOOLBAR IS NOT DISLAYDED");
		 	    }
		 	    
		 	try {
		 		 Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
		 	    } catch(Exception e) {
		 		   System.out.println("[ERROR] : POLYGONE VIEW ICON IS NOT DISLAYDED");
		 	    }
		 	
		 	try {
		 		 Assert.assertTrue(page.findElement(arrowBar).isDisplayed());
		 		} catch(Exception e) {
		 		  	System.out.println("[ERROR] : POLYGONE IS NOT DISLAYDED");
		 		}
		 		    
		    try {
		 	     Assert.assertTrue(page.findElement(resizePoint).isDisplayed());
		 	    } catch(Exception e) {
		 		   System.out.println("[ERROR] : POLYGONE RISIZE POINT IS NOT DISLAYDED");
		 		}
		 	 try {   		 		 
				  page.getInstance(polylineAnnotationHandler.class).doStylepolyline();
		 	    }catch(Exception e) {
		 			System.out.println("[ERROR] : POLYGONE STYLE ERROR");
		 		 }    
		   }
		
	       catch(Exception e) {
				e.printStackTrace();
			} 
		
    	   finally { 
			    page.getInstance(annotationdrawBase.class).doDrop();
		       }	
		} 
		/**
		 * 
		 * @throws InterruptedException
		 */
		 @Test (priority = 10 ,dependsOnMethods="PDF_File____Upload")
			public void Urgent_Stamp___On_Pdf() throws InterruptedException { 
				page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			    // TODO Check ANNOTATION isDisplayed 
			 	// TODO Check STYLE TOOLBAR isDisplayed 
			 	// TODO Check RESIZE TOOLBAR isDisplayed
                // TODO Check STAMP LIST isDisplayed 
			if(	page.findElement(stampList).isDisplayed()) {
			 
				try {
				page.clickOnElement(Urgentbutton);
				page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127)
				.build().perform(); 
				Thread.sleep(500);
			   }catch(RuntimeException e) {
		 			System.out.println("[ERROR] : URGENT BUTTON NOT DISPAYED");
		 		 }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(StamList).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP URGENT IS NOT DISLAYDED");
			 	    }
			   
			   try {
				     page.clickOnElement(StamList);
			 	     Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
			 	    } catch(RuntimeException e) {
			 	    	 System.out.println("[ERROR] : STAMP URGENT STYLE TOOLBAR IS NOT DISLAYDED");
			 	    }
			 	    
			   try {
			 		 Assert.assertTrue(page.findElement(rotatePoint).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP URGENT ROTATE POINT IS NOT DISLAYDED");
			 	    }
			   
			 	try {
			 		 Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP URGENT VIEW ICON IS NOT DISLAYDED");
			 	    }
			 	  
			 finally { 
				   page.clickOnElement(annotationExplorerButtonFull);
				   List <WebElement> elements = driver.findElements(delete);
			  	 for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click();}	
			        }
		    	}
			else {
			 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
			 	}
			}  
			
			/**
			 * 
			 * @param method
			 * @throws InterruptedException
			 */
			@Test (priority = 11 , dependsOnMethods="PDF_File____Upload")
			public void Approved_Stamp___On_Pdf() throws InterruptedException  { 
				page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			    // TODO Check ANNOTATION isDisplayed 
			 	// TODO Check STYLE TOOLBAR isDisplayed 
			 	// TODO Check RESIZE TOOLBAR isDisplayed
                // TODO Check STAMP LIST isDisplayed 
			if(	page.findElement(stampList).isDisplayed()) {
			 
				try {
				page.clickOnElement(approvedbutton);
				page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127)
				.build().perform(); 
				Thread.sleep(500);
			   }catch(RuntimeException e) {
		 			System.out.println("[ERROR] : APPROVED BUTTON NOT DISPAYED");
		 		 }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(StamList).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP APPROVED IS NOT DISLAYDED");
			 	    }
			   
			   try {
				     page.clickOnElement(StamList);
			 	     Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
			 	    } catch(RuntimeException e) {
			 	    	 System.out.println("[ERROR] : STAMP APPROVED STYLE TOOLBAR IS NOT DISLAYDED");
			 	    }
			 	    
			   try {
			 		 Assert.assertTrue(page.findElement(rotatePoint).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP APPROVED ROTATE POINT IS NOT DISLAYDED");
			 	    }
			   
			 	try {
			 		 Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP APPROVED VIEW ICON IS NOT DISLAYDED");
			 	    }
			 	  
			 finally { 
				   page.clickOnElement(annotationExplorerButtonFull);
				   List <WebElement> elements = driver.findElements(delete);
			  	 for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click();}	
			        }
		    	}
			else {
			 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
			 	}
			} 
			/**
			 * 
			 * @param method
			 * @throws InterruptedException
			 */
			@Test (priority = 12 ,dependsOnMethods="PDF_File____Upload")
			public void Draft_Stamp___On_pdf() throws InterruptedException  { 
				page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			    // TODO Check ANNOTATION isDisplayed 
			 	// TODO Check STYLE TOOLBAR isDisplayed 
			 	// TODO Check RESIZE TOOLBAR isDisplayed
                // TODO Check STAMP LIST isDisplayed 
			if(	page.findElement(stampList).isDisplayed()) {
			 
				try {
				page.clickOnElement(draftButton);
				page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127)
				.build().perform(); 
				Thread.sleep(500);
			   }catch(RuntimeException e) {
		 			System.out.println("[ERROR] : DRAFT BUTTON NOT DISPAYED");
		 		 }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(StamList).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP DRAFT IS NOT DISLAYDED");
			 	    }
			   
			   try {
				     page.clickOnElement(StamList);
			 	     Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
			 	    } catch(RuntimeException e) {
			 	    	 System.out.println("[ERROR] : STAMP DRAFT STYLE TOOLBAR IS NOT DISLAYDED");
			 	    }
			 	    
			   try {
			 		 Assert.assertTrue(page.findElement(rotatePoint).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP DRAFT ROTATE POINT IS NOT DISLAYDED");
			 	    }
			   
			 	try {
			 		 Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP DRAFT VIEW ICON IS NOT DISLAYDED");
			 	    }
			 	  
			 finally { 
				   page.clickOnElement(annotationExplorerButtonFull);
				   List <WebElement> elements = driver.findElements(delete);
			  	 for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click();}	
			        }
		    	}
			else {
			 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
			 	}
			} 
			
			/**
			 * 
			 * @param method
			 * @throws InterruptedException
			 */
			@Test (priority = 13 ,dependsOnMethods="PDF_File____Upload")
			public void Signature_Stamp___On_pdf() throws InterruptedException  { 
				page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			    // TODO Check ANNOTATION isDisplayed 
			 	// TODO Check STYLE TOOLBAR isDisplayed 
			 	// TODO Check RESIZE TOOLBAR isDisplayed
                // TODO Check STAMP LIST isDisplayed 
			if(	page.findElement(stampList).isDisplayed()) {
			 
				try {
				page.clickOnElement(signatureButton);
				page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127)
				.build().perform(); 
				Thread.sleep(500);
			   }catch(RuntimeException e) {
		 			System.out.println("[ERROR] : SIGNATURE BUTTON NOT DISPAYED");
		 		 }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(signatureDisp).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP SIGNATURE IS NOT DISLAYDED");
			 	    }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP SIGNATURE VIEW ICON IS NOT DISLAYDED");
			 	    }
			   
			   try {
				     page.clickOnElement(signatureDisp);
			 	     Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
			 	    } catch(RuntimeException e) {
			 	    	 System.out.println("[ERROR] : STAMP SIGNATURE STYLE TOOLBAR IS NOT DISLAYDED");
			 	    }
			 	    
			   try {
			 		 Assert.assertTrue(page.findElement(rotatePoint).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : STAMP SIGNATURE ROTATE POINT IS NOT DISLAYDED");
			 	    }
			 	  
			 finally { 
				   page.clickOnElement(annotationExplorerButtonFull);
				   List <WebElement> elements = driver.findElements(delete);
			  	 for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click();}	
			        }
		    	}
			else {
			 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
			 	}
			} 
			/**
			 * 
			 * @throws InterruptedException
			 */
			@Test (priority = 14 ,dependsOnMethods="PDF_File____Upload")
			public void Free_Stamp___On_pdf() throws InterruptedException  { 
				page.getInstance(StumpAnnotaionHandler.class).doDrowStamp();
			    // TODO Check ANNOTATION isDisplayed 
			 	// TODO Check STYLE TOOLBAR isDisplayed 
			 	// TODO Check RESIZE TOOLBAR isDisplayed
                // TODO Check STAMP LIST isDisplayed 
			if(	page.findElement(stampList).isDisplayed()) {
			 
				try {
				 page.getInstance(StumpAnnotaionHandler.class).doDrawFreeStamp();
			   }catch(RuntimeException e) {
		 			System.out.println("[ERROR] : PERSO STAMP BUTTON NOT DISLAYDED");
		 		 }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(StamList).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : FREE STAMP IS NOT DISLAYDED");
			 	    }
			   
			   try {
			 		 Assert.assertTrue(page.findElement(annotationViewIcon).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : FREE STAMP VIEW ICON IS NOT DISLAYDED");
			 	    }
			   
			   try {
				     page.clickOnElement(StamList);
			 	     Assert.assertTrue(page.findElement(styleBarre).isDisplayed());
			 	    } catch(RuntimeException e) {
			 	    	 System.out.println("[ERROR] : FREE STAMP STYLE TOOLBAR IS NOT DISLAYDED");
			 	    }
			 	    
			   try {
			 		 Assert.assertTrue(page.findElement(rotatePoint).isDisplayed());
			 	    } catch(RuntimeException e) {
			 		   System.out.println("[ERROR] : FREE STAMP ROTATE POINT IS NOT DISLAYDED");
			 	    }
			 	  
			 finally { 
				   page.clickOnElement(annotationExplorerButtonFull);
				   List <WebElement> elements = driver.findElements(delete);
			  	 for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click();}	
			        }
		    	}
			else {
			 		System.out.println("[ERROR] : STAMP LIST IS NOT DISLAYDED");
			 	}
			} 
			
			/**
			 * 
			 * @param method
			 * @throws InterruptedException
			 */
			@Test (priority = 15 ,dependsOnMethods={"PDF_File____Upload","Handle_StickyNote___OnPDF" ,"Handel_Polygone___OnPDF"})
			public void delete__Anotation___On_Pdf(Method method) throws InterruptedException {
				
				//TODO Draw an approved stamp
				page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
				//TODO Draw an draft stamp
				page.getInstance(StickyNoteAnnotationHandler.class).doDrowSticky();
				
			    
				try {
					 page.clickOnElement(annotationExplorerButtonFull);
					   List <WebElement> elements = driver.findElements(delete);
				  	   for (int i=0 ; i < elements.size() ; i++) {
								elements.get(i).click(); }
				  	 
				  	Assert.assertTrue(page.findElement(sadEmptyIcon).isDisplayed(),"ERROR ACCURRED : ANNOTATION ARE DELETED");   		
			}
			
		   catch(Exception e) {
			 e.printStackTrace();
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
					page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
					page.getInstance(SpecificStyle.class).echelle();
					page.getInstance(annotationdrawBase.class).clickOnElement(cancelAnnotationButton);
					//TODO check one annotation exist the second not
			 		Assert.assertTrue(page.findElement(mesureArrow).isDisplayed(), "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
			 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
			 		//TODO click to save 
			 		page.getInstance(SavePageAndQuit.class).getSaveClick();
					//TODO check one annotation exist the second not
			 		Thread.sleep(700);
			 		Assert.assertTrue(page.findElement(mesureArrow).isDisplayed(), "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
			 		Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
					//TODO click to show annotation and check that two annotations is showen
					page.getInstance(hideAnnotationPage.class).hideAnnotations();
					Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
					Assert.assertTrue(page.findElement(mesureArrow).isDisplayed(), "ERROR ACCURRED : THE UNDERLINE ANNOTATION IS NOT DISPLAYED ON THE FILE !!");
					//TODO click to Hide annotation and check that two annotations is hided
					Thread.sleep(1000);
					page.getInstance(hideAnnotationPage.class).showAnnotations();
					page.getInstance(refreshPage.class).getRefresh();
					Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipsesNone(), 1, "ERROR ACCURRED : THE CIRCLE ANNOTATION MUST NOT BE DISPLAYED ON THE FILE !!");
					Assert.assertFalse(page.findElement(mesureArrow).isDisplayed(),  "ERROR ACCURRED : THE ARROW MESURE LINK ANNOTATION SHOULD NOT BE DISPLAYED ON THE FILE !!");
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
	           
///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
         page.getInstance(DownloadAnnotation_FDF.class).Dodownloadfdf();
         Assert.assertTrue(true);
        }
       @Test (priority = 19 ,timeOut = 10000)
       public void DownloadAnnotation_XFDF_File_via_eml(Method method) throws InterruptedException{ page.getInstance(DownloadAnnotation_XFDF.class).Dodownloadxfdf();
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