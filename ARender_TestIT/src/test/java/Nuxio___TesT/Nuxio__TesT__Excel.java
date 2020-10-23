package Nuxio___TesT;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.deleteActionPage;
import GED_____Base.logIn__Nuxio;
import annotationHandler.StumpAnnotaionHandler;
import annotationHandler.annotationdrawBase;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;

public class Nuxio__TesT__Excel extends pageObject.TestBase implements ARender____FactoryPage, File____FactoryPage {
	
/**
 * 
 * @param method
 * @throws InterruptedException
 * @throws IOException
 */
	@Test(priority = 1, alwaysRun = true ,enabled= true)
    public void Login (Method method) throws InterruptedException, IOException {
		
		 page.getInstance(logIn__Nuxio.class).login(prop.getProperty("usernameNuxeo"), prop.getProperty("passwordNuxeo"));
		 Thread.sleep(2000);
		 driver.get("https://valmy12.arender.fr/nuxeo-arender/?documentId=default,da8cc950-6ba0-47f8-b831-5706a1fd97d6,file:content,5f33d4adf85d0d799516d1efcf03da0e");		
	     Thread.sleep(2500);
		
		 List <WebElement> elements = driver.findElements(delete);	
		 
			for (int i=0 ; i < elements.size() ; i++) {
				elements.get(i).click();}	
			}		 
/**
 * 
 * @param method
 * @throws InterruptedException
 */
	@Test (priority = 2,  enabled= true)
	public void Handle_StickyNote___On_excel (Method method) throws InterruptedException{
		page.clickOnElement(StickyeannotationIcon);
		page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
		Thread.sleep(2000);
    // TODO Check notification message is not wrong
	// TODO Check annotation is displayed 
    // TODO Check style barre is displayed 
	try {
	    Assert.assertTrue(page.findElement(postitContentView).isDisplayed(),"ERROR ACCURRED : STICKYNOTE IS NOT DIPLAYDED");
	    Assert.assertTrue(page.findElement(infoButton).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
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
    public void Handle_FreeText___On_excel (Method method) throws InterruptedException { 
		page.clickOnElement(freetextannotationIcon);
		page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
		Thread.sleep(2000);
    // TODO Check notification message is not wrong
 	// TODO Check annotation is displayed 
    // TODO Check style barre is displayed
    try {
        Assert.assertTrue(page.findElement(infoButton).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");           
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
	public void Handle_Circle___On_excel (Method method) throws InterruptedException { 
		page.clickOnElement(circleAnnotationRepeatButton);
		page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 

	// TODO Check notification message is not wrong
    // TODO Check annotation is displayed 
    // TODO Check style barre is displayed
	try {
	    Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1,"ERROR ACCURRED : CICRLE IS NOT DIPLAYDED");          
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
	@Test (priority = 5 ,enabled= true)
	public void Handle_Arrow___On_excel(Method method) throws InterruptedException { 
		page.clickOnElement(ArrowannotationIconNuxio);
		page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
	// TODO Check notification message is not wrong
    // TODO Check annotation is displayed 
    // TODO Check style barre is displayed
	try {
	    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : ARROW IS NOT DIPLAYDED");
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
	@Test (priority = 6 ,enabled= true)
	public void Handle_Underline___On_excel(Method method) throws InterruptedException {
		page.clickOnElement(rectangleAnnotationRepeatButton);
		page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
		Thread.sleep(2000);
	// TODO Check notification message is not wrong
    // TODO Check annotation is displayed 
    // TODO Check style barre is displayed
	try {
	    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
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
	@Test (priority = 7 ,enabled= true)
	public void Handle_freeHand___On_excel(Method method) throws InterruptedException { 
		page.clickOnElement(freehandAnnotationRepeatButton);
		page.builder.dragAndDropBy(page.findElement(drawLocationPath), 190, 127).build().perform(); 
		Thread.sleep(2000);
	// TODO Check notification message is not wrong
    // TODO Check annotation is displayed 
    // TODO Check style barre is displayed
	try {
	    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : FREEHAND IS NOT DIPLAYDED");
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
	@Test (priority = 8 ,enabled= true)
	public void Urgent_Stamp___On_excel(Method method) throws InterruptedException { 
		page.clickOnElement(stumpannotationIcon);
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
	@Test (priority = 9 ,enabled= true)
	public void Approved_Stamp___On_excel(Method method) throws InterruptedException { 
		page.clickOnElement(stumpannotationIcon);
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
	}  
	
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 */
	@Test (priority = 10 ,enabled= true)
	public void Draft_Stamp___On_excel(Method method) throws InterruptedException { 
		page.clickOnElement(stumpannotationIcon);
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
	}  
	
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 */
	@Test (priority = 10 ,enabled= true)
	public void Signature_Stamp___On_excel(Method method) throws InterruptedException { 
		page.clickOnElement(stumpannotationIcon);
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
}
