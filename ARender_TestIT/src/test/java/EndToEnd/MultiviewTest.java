package EndToEnd;

import java.lang.reflect.Method;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import FullActionpage.ancreFonction;
import Locators.BaseFonctionLocators;


public class MultiviewTest extends pageObject.TestBase implements BaseFonctionLocators {
  	
  public void Activate_Multiview(Method method) {
		
		try {
			page.getInstance(ancreFonction.class).enterToContextualMenu();
		
			Assert.assertTrue(page.findElement(multiview_Button).isDisplayed(), "CONTEXTUEL MENU NOT DISPLAYED");
		    }catch(Exception e) {
		    }
	   if(page.findElement(multiview_Button).isDisplayed()) {
		 
		   try {
		     page.clickOnElement(multiview_Button);
		     Thread.sleep(1000);
		     page.builder.sendKeys(Keys.ENTER).perform();
		     
		     Assert.assertTrue(page.findElement(delete_img1_Button).isDisplayed());
		     Assert.assertTrue(page.findElement(delete_img2_Button).isDisplayed());
		    
		     int verticalSlider = page.findElements(verticalSlider_Bar).size();   
		     Assert.assertEquals(verticalSlider,2);
		     
		      }catch(Exception e){		    	  
		    }
	      }
    } 

    public void Desactivate_Multiview(Method method) {
	   try {
		     page.clickOnElement(delete_img1_Button);
		     
		     Assert.assertFalse(page.findElement(delete_img1_Button).isDisplayed());
         }catch(Exception e){		    	  
	     }
      } 
    
    public void Multi_Activate_Multiview(Method method) throws InterruptedException {
    
    	for(int i=0 ; i<6 ; i++) {
    	
    		try {
			 page.getInstance(ancreFonction.class).enterToContextualMenu();		
		    	Assert.assertTrue(page.findElement(multiview_Button).isDisplayed(), "CONTEXTUEL MENU NOT DISPLAYED");
		    }catch(Exception e) {
		    }
	       if(page.findElement(multiview_Button).isDisplayed()) {  
		      try {
			     page.clickOnElement(multiview_Button);
			     Thread.sleep(500);
			     page.builder.sendKeys(Keys.ENTER).perform();
	             }catch(Exception e){		    	  
	            }
              }
            }
    	  Thread.sleep(500);
    	try {
    	int verticalSlider = page.findElements(verticalSlider_Bar).size();
    		Assert.assertEquals(verticalSlider,8);
    		}catch(Exception e){		    	  
	       }
        }
}
