/**
 * 
 */
package StandAlone;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.deleteFonction;
import annotationHandler.PolygoneannotationHandler;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.approvedStampHandler;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.draftStampHandler;
import annotationHandler.freeStampHandler;
import annotationHandler.freeTextAnnotationHandler;
import annotationHandler.polylineAnnotationHandler;
import annotationHandler.signatureStampHandler;
import annotationHandler.urgentStampHandler;
import fileHandler.AFileUploadBase;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */
public class Word_File___Full_RegressionTest extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator {
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
		@Test(priority = 1 , alwaysRun = true ,enabled= true)
	    public void Word_File____Upload (Method method) throws InterruptedException, IOException {

			 page.getInstance(AFileUploadBase.class).doDownloadfile();
			 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\Bonnes_pratiques.docx");
			 page.waitForElementPresent(thumbimage);
			Thread.sleep(1000);
		// TODO check notification message is not wrong
		// TODO check page container is not null
	    // TODO check sub number of page is not null
		try {
		    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Document courant : Bonnes_pratiques.docx", "error accurred file can not uploaded");
		    
		    if(page.findElement(thumbimage).isDisplayed()) {
			    
		    	Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileContainer(),0, "error accurred file counter");
		        Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileSubNum(),0, "error accurred file SubNum counter");
		    }
		   }
		catch(Exception e) {
			e.printStackTrace();
		    }
       }
		@Test (priority = 2 , dependsOnMethods="Word_File____Upload")
		public void Handle_StickyNote___On_Word(Method method) throws InterruptedException{ 
		
		try {
			page.getInstance(StickyNoteAnnotationHandler.class).checkTestNote();
		 }		
		 finally { 		
		    page.clickOnElement(stkRemove);
	       }	
        }		
		@Test (priority = 3 , dependsOnMethods="Word_File____Upload")	
	    public void Handle_FreeText___On_Word(Method method) throws InterruptedException { 
    	 try {
		 page.getInstance(freeTextAnnotationHandler.class).checkFreeTextTest();
     	 }  
		finally { 
			 page.getInstance(deleteFonction.class).deleteFromStyleBar();
	            }	
		}			
		@Test(priority = 4 , dependsOnMethods="Word_File____Upload")
		public void Handle_Circle___On_Word(Method method) throws InterruptedException { 
		  try {
			 page.getInstance(circleAnnotationHandler.class).checkCircleTest();
		     }				
	     finally { 
	    	  page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
		}     			
		@Test (priority = 5 , dependsOnMethods="Word_File____Upload")
		public void Handle_Arrow___On_Word(Method method) throws InterruptedException {
			try {
				page.getInstance(arrowAnnotationHandler.class).CheckArrowTest();
			 }
	       finally { 
	    	   page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
		} 			
		@Test (priority = 6  , dependsOnMethods="Word_File____Upload")
		public void Handle_Underline___On_Word(Method method) throws InterruptedException {
		  try {
			  page.getInstance(UnderLineHandler.class).checkUnderLineTest();
		  }    
	      finally { 
	    	  page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
	     	}      			
		@Test (priority = 7 , dependsOnMethods="Word_File____Upload")
		public void Handle_freeHand___On_Word(Method method) throws InterruptedException { 
		   try {
			 page.getInstance(freeTextAnnotationHandler.class).checkFreeTextTest();
		     }			
	       finally { 
	    	   page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
		}   			
		@Test (priority = 8 , dependsOnMethods="Word_File____Upload")
		public void Handle_polyline___On_Word(Method method) throws InterruptedException { 
		try {
		    page.getInstance(polylineAnnotationHandler.class).checkPolylineTest();	
		}			  
	    finally { 
	    	 page.getInstance(deleteFonction.class).deleteFromStyleBar();
		       }	
		}  			
		@Test (priority = 9 ,dependsOnMethods="Word_File____Upload")
		public void Handel_Polygone___On_Word(Method method) throws InterruptedException { 
        
		try {
        	page.getInstance(PolygoneannotationHandler.class).checkPolygoneTest();
        }
    	   finally { 
    		   page.getInstance(deleteFonction.class).deleteFromStyleBar();
		       }	
		} 		
		 @Test (priority = 10 ,dependsOnMethods="Word_File____Upload")
			public void Urgent_Stamp___On_Word() throws InterruptedException { 
			try {
				page.getInstance(urgentStampHandler.class).checkUrgentStamp();
		    	}	  
			 finally { 
				page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				page.clickOnElement(thumbExplorerButton);
			 }
		   }
			
			@Test (priority = 11 , dependsOnMethods="Word_File____Upload")
			public void Approved_Stamp___On_Word() throws InterruptedException  { 
			try {
				page.getInstance(approvedStampHandler.class).drawApprovedStamp();			
			    }  
			 finally { 
				 page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				 page.clickOnElement(thumbExplorerButton);
			 }
		    	}
			@Test (priority = 12 ,dependsOnMethods="Word_File____Upload")
			public void Draft_Stamp___On_Word() throws InterruptedException  { 
			 try {
				 page.getInstance(draftStampHandler.class).checkDraftStampTest();
				 }
			 finally { 
				 page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				 page.clickOnElement(thumbExplorerButton);
			     }
		    	}						
			@Test (priority = 13 ,dependsOnMethods="Word_File____Upload")
			public void Signature_Stamp___On_Word() throws InterruptedException  { 
		     try {
		    	 page.getInstance(signatureStampHandler.class).checkSignatureStampTest();
		     }  
			 finally { 
				    page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				    page.clickOnElement(thumbExplorerButton);
			     }     
		    	}
			@Test (priority = 14 ,dependsOnMethods="Word_File____Upload")
			public void Free_Stamp___On_Word() throws InterruptedException  { 
			   try {
				   page.getInstance(freeStampHandler.class).checkFreeStamp();
			   }
			  finally { 
					 page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
					 page.clickOnElement(thumbExplorerButton);
			     }	        
		    	}
			
			
			@Test (priority = 15 ,dependsOnMethods={"Word_File____Upload","Handel_Polygone___On_Word","Handle_StickyNote___On_Word"})
			public void delete__Anotation___On_Word(Method method) throws InterruptedException {
				
				//TODO Draw an approved stamp
				page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
				//TODO Draw an draft stamp
				page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
				
			    
				try {
					page.getInstance(deleteFonction.class).deleteFromExplorerThumb();			
				  	 
			  	Assert.assertTrue(page.findElement(sadEmptyIcon).isDisplayed(),"ERROR ACCURRED : ANNOTATION ARE DELETED");   		
			}
			
		   catch(Exception e) {
			 e.printStackTrace();
		  }
	   }
     }
