/**
 * 
 */
package Axa__Filnet_TesT;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.filtreAction;
import annotationHandler.hideAnnotationPage;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class AXA__NavigaterPanel extends pageObject.TestBase implements ARender____FactoryPage , File____FactoryPage{
	
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 */

	
	@Test (priority =1 , alwaysRun = true )
	public void Filtre__On_Zip(Method method) throws InterruptedException {

		driver.get("http://18.203.215.159:8080/arondor-arender-axa-war-4.1.0/?bean=urlParserExternalAccessorProxy&id=%7B28895431-343F-C345-8F8D-74FE5D600000%7D&objectStoreName=OS1&documentId=28895431-343F-C345-8F8D-74FE5D600000");		
	    page.waitForElementPresent(thumbimage);
		Thread.sleep(1000);
		
	
			 page.clickOnElement(annotationExplorerButton);
			  List <WebElement> elements = driver.findElements(delete);
			  	   for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click(); }
			  	 page.clickOnElement(ThumExplorerButton); 
	            
		
		try {
			page.getInstance(filtreAction.class).HandleAnno();page.getInstance(filtreAction.class).getFiltreOption();
			Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(filtrePannel),"ERROR ACCURRED : FILTRE PANNEL IS NOT DISPLAYED ;-( ");
			page.getInstance(filtreAction.class).selectCircleFiltre();page.clickOnElement(filtreValidate);		
			Assert.assertTrue(page.getInstance(filtreAction.class).isDisplayed(commentCircleIcon));
			Assert.assertFalse(page.getInstance(filtreAction.class).isDisplayed(commentSquareIcon));
			page.getInstance(filtreAction.class).selectToutFiltre();page.clickOnElement(filtreValidate);
			Assert.assertTrue(page.getInstance(filtreAction.class).isDisplayed(commentCircleIcon));
			Assert.assertTrue(page.getInstance(filtreAction.class).isDisplayed(commentSquareIcon));
			Thread.sleep(500);
		}
		 catch(Exception e) {
				e.printStackTrace();
			} 
		try {
			
	
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
	@Test (priority =2 , alwaysRun = true )
	public void FiltreBy_resolu__On_Zip(Method method) throws InterruptedException {
		
		 page.clickOnElement(annotationExplorerButton);
		  List <WebElement> elements = driver.findElements(delete);
		  	   for (int i=0 ; i < elements.size() ; i++) {
						elements.get(i).click(); }
		  	 page.clickOnElement(ThumExplorerButton); 
		Thread.sleep(1000);

		// TODO Draw 2 sticky note 
		try {
			page.getInstance(filtreAction.class).HandleSticky();
			Assert.assertEquals(page.getInstance(filtreAction.class).getcontentPanel(),2,"ERROR ACCURRED : No CONTENT PANEL EXIST !!");
		    }
		 catch(Exception e) {
				e.printStackTrace();
			} 
		try {
			// TODO Open filtre pannel
			page.getInstance(filtreAction.class).getFiltreOption();
			Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(filtrePannel),"ERROR ACCURRED : FILTRE PANNEL IS NOT DISPLAYED ;-( ");
			//TODO Check switch Button Container "résolué" 
			page.clickOnElement(switchButtonContainer);
			Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Filtrer par : Résolu", "ERROR ACCURRED :SWITCH BUTTON DOSENT WORK !!");
			Assert.assertEquals(page.getInstance(filtreAction.class).getcontentPanel(),2,"ERROR ACCURRED :SWITCH BUTTON DOSENT WORK !!");
			page.clickOnElement(switchButtonContainer);;
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
      }

}  
