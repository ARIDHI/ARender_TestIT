/**
 * 
 */
package File_Management_____Testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.deleteActionPage;
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
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class MP4_File___Full_RegressionTest  extends pageObject.TestBase implements ARender____FactoryPage, File____FactoryPage {
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */	 
		@Test(priority = 1 , alwaysRun = true ,enabled= true)
	    public void MP4_File____Upload (Method method) throws InterruptedException, IOException {
			 page.getInstance(AFileUploadBase.class).doDownloadfile();
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
       }
		@Test (priority = 2 , dependsOnMethods="MP4_File____Upload")
		public void Handle_StickyNote___On_MP4(Method method) throws InterruptedException{ 
		
		try {
			page.getInstance(StickyNoteAnnotationHandler.class).checkTestNote();
		 }		
		 finally { 		
		    page.clickOnElement(stkRemove);
	       }	
        }		
		@Test (priority = 3 , dependsOnMethods="MP4_File____Upload")	
	    public void Handle_FreeText___On_MP4(Method method) throws InterruptedException { 
    	 try {
		 page.getInstance(freeTextAnnotationHandler.class).checkFreeTextTest();
     	 }  
		finally { 
			 page.getInstance(deleteActionPage.class).deleteFromStyleBar();
	            }	
		}			
		@Test(priority = 4 , dependsOnMethods="MP4_File____Upload")
		public void Handle_Circle___On_MP4(Method method) throws InterruptedException { 
		  try {
			 page.getInstance(circleAnnotationHandler.class).checkCircleTest();
		     }				
	     finally { 
	    	  page.getInstance(deleteActionPage.class).deleteFromStyleBar();
		        }	
		}     			
		@Test (priority = 5 , dependsOnMethods="MP4_File____Upload")
		public void Handle_Arrow___On_MP4(Method method) throws InterruptedException {
			try {
				page.getInstance(arrowAnnotationHandler.class).CheckArrowTest();
			 }
	       finally { 
	    	   page.getInstance(deleteActionPage.class).deleteFromStyleBar();
		        }	
		} 			
		@Test (priority = 6  , dependsOnMethods="MP4_File____Upload")
		public void Handle_Underline___On_MP4(Method method) throws InterruptedException {
		  try {
			  page.getInstance(UnderLineHandler.class).checkUnderLineTest();
		  }    
	      finally { 
	    	  page.getInstance(deleteActionPage.class).deleteFromStyleBar();
		        }	
	     	}      			
		@Test (priority = 7 , dependsOnMethods="MP4_File____Upload")
		public void Handle_freeHand___On_MP4(Method method) throws InterruptedException { 
		   try {
			 page.getInstance(freeTextAnnotationHandler.class).checkFreeTextTest();
		     }			
	       finally { 
	    	   page.getInstance(deleteActionPage.class).deleteFromStyleBar();
		        }	
		}   			
		@Test (priority = 8 , dependsOnMethods="MP4_File____Upload")
		public void Handle_polyline___On_MP4(Method method) throws InterruptedException { 
		try {
		    page.getInstance(polylineAnnotationHandler.class).checkPolylineTest();	
		}			  
	    finally { 
	    	 page.getInstance(deleteActionPage.class).deleteFromStyleBar();
		       }	
		}  			
		@Test (priority = 9 ,dependsOnMethods="MP4_File____Upload")
		public void Handel_Polygone___On_MP4(Method method) throws InterruptedException { 
        
		try {
        	page.getInstance(PolygoneannotationHandler.class).checkPolygoneTest();
        }
    	   finally { 
    		   page.getInstance(deleteActionPage.class).deleteFromStyleBar();
		       }	
		} 		
		 @Test (priority = 10 ,dependsOnMethods="MP4_File____Upload")
			public void Urgent_Stamp___On_MP4() throws InterruptedException { 
			try {
				page.getInstance(urgentStampHandler.class).checkUrgentStamp();
		    	}	  
			 finally { 
				page.getInstance(deleteActionPage.class).deleteFromExplorerThumb();
				page.clickOnElement(thumbExplorerButton);
			 }
		   }
			
			@Test (priority = 11 , dependsOnMethods="MP4_File____Upload")
			public void Approved_Stamp___On_MP4() throws InterruptedException  { 
			try {
				page.getInstance(approvedStampHandler.class).drawApprovedStamp();			
			    }  
			 finally { 
				 page.getInstance(deleteActionPage.class).deleteFromExplorerThumb();
				 page.clickOnElement(thumbExplorerButton);
			 }
		    	}
			@Test (priority = 12 ,dependsOnMethods="MP4_File____Upload")
			public void Draft_Stamp___On_MP4() throws InterruptedException  { 
			 try {
				 page.getInstance(draftStampHandler.class).checkDraftStampTest();
				 }
			 finally { 
				 page.getInstance(deleteActionPage.class).deleteFromExplorerThumb();
				 page.clickOnElement(thumbExplorerButton);
			     }
		    	}						
			@Test (priority = 13 ,dependsOnMethods="MP4_File____Upload")
			public void Signature_Stamp___On_MP4() throws InterruptedException  { 
		     try {
		    	 page.getInstance(signatureStampHandler.class).checkSignatureStampTest();
		     }  
			 finally { 
				    page.getInstance(deleteActionPage.class).deleteFromExplorerThumb();
				    page.clickOnElement(thumbExplorerButton);
			     }     
		    	}
			@Test (priority = 14 ,dependsOnMethods="MP4_File____Upload")
			public void Free_Stamp___On_MP4() throws InterruptedException  { 
			   try {
				   page.getInstance(freeStampHandler.class).checkFreeStamp();
			   }
			  finally { 
					 page.getInstance(deleteActionPage.class).deleteFromExplorerThumb();
					 page.clickOnElement(thumbExplorerButton);
			     }	        
		    	}
			
			
			@Test (priority = 15 ,dependsOnMethods={"MP4_File____Upload","Handel_Polygone___On_MP4","Handle_StickyNote___On_MP4"})
			public void delete__Anotation___On_MP4(Method method) throws InterruptedException {
				
				//TODO Draw an approved stamp
				page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
				//TODO Draw an draft stamp
				page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
				
			    
				try {
					page.getInstance(deleteActionPage.class).deleteFromExplorerThumb();			
				  	 
			  	Assert.assertTrue(page.findElement(sadEmptyIcon).isDisplayed(),"ERROR ACCURRED : ANNOTATION ARE DELETED");   		
			}
			
		   catch(Exception e) {
			 e.printStackTrace();
		  }
	   }
     }
