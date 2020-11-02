/**
 * 
 */
package StandAlone;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.fullscreenFonction;
import FullActionpage.imageProcessinFonction;
import FullActionpage.logoFonction;
import FullActionpage.naviagationFonction;
import FullActionpage.printFonction;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;

/**
 * @author ARIDHI Hichem
 *
 */

public class ARender_Full_Fonction extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator{



  @Test(priority = 1)
	public void Brightness_Test (Method method) throws InterruptedException, AWTException {  
	  	//TODO change contrast and check that contrast Element exist on DOM && isNot equal to null
	  	 	page.getInstance(imageProcessinFonction.class).playBrightness();
	  	 	try {
	  	 		Assert.assertNotEquals(page.getInstance(imageProcessinFonction.class).BrightnessResult(), 0);
	  	 	   }
	  	  catch(Exception e) {
	  		  e.printStackTrace();
	  	  }
	  	}

 @Test(priority = 2)
  public void Navigation_Button_Test(Method method) throws InterruptedException {
		
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

  @Test(priority = 6, alwaysRun=true ,timeOut = 6000 , singleThreaded=true, skipFailedInvocations =true )
  public void Fullscreen_Test(Method method) throws InterruptedException { 
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
  
  @Test(priority = 7)	
  public void Contrast_Test (Method method) throws InterruptedException, AWTException {  
	        page.builder.moveByOffset(0, 0).perform();
	  	 	page.getInstance(imageProcessinFonction.class).playContrast();
	  	 	try {
	  	 		Assert.assertNotEquals(page.getInstance(imageProcessinFonction.class).ContrastResult(), 0);
	  	 	   }
	  	  catch(Exception e) {
	  		  e.printStackTrace();
	  	  }
	  	}
  
   @Test(priority = 8)
    public void logo_Test (Method method) throws InterruptedException {
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

