/**
 * 
 */
package Axa__Filnet_TesT;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.Filtre___Fonction;
import annotationHandler.hideAnnotationPage;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HanlerBasePage;

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

		driver.get("http://18.203.215.159:8080/arondor-arender-axa-war-4.0.9-2-rc1/?bean=urlParserExternalAccessorProxy&id="
				+ "%7BE5D34741-8178-CE38-AF13-718852900000%7D&objectStoreName=OS1&documentId=E5D34741-8178-CE38-AF13-718852900000");		
	    page.waitForElementPresent(thumbimage);
		Thread.sleep(1000);
		
	
			 page.clickOnElement(annotationExplorerButton);
			  List <WebElement> elements = driver.findElements(delete);
			  	   for (int i=0 ; i < elements.size() ; i++) {
							elements.get(i).click(); }
			  	 page.clickOnElement(ThumExplorerButton); 
	            
		
		try {
			page.getInstance(Filtre___Fonction.class).HandleAnno();page.getInstance(Filtre___Fonction.class).getFiltreOption();
			Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(filtrePannel),"ERROR ACCURRED : FILTRE PANNEL IS NOT DISPLAYED ;-( ");
			page.getInstance(Filtre___Fonction.class).selectCircleFiltre();page.clickOnElement(filtreValidate);		
			Assert.assertTrue(page.getInstance(Filtre___Fonction.class).isDisplayed(commentCircleIcon));
			Assert.assertFalse(page.getInstance(Filtre___Fonction.class).isDisplayed(commentSquareIcon));
			page.getInstance(Filtre___Fonction.class).selectToutFiltre();page.clickOnElement(filtreValidate);
			Assert.assertTrue(page.getInstance(Filtre___Fonction.class).isDisplayed(commentCircleIcon));
			Assert.assertTrue(page.getInstance(Filtre___Fonction.class).isDisplayed(commentSquareIcon));
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
			page.getInstance(Filtre___Fonction.class).HandleSticky();
			Assert.assertEquals(page.getInstance(Filtre___Fonction.class).getcontentPanel(),2,"ERROR ACCURRED : No CONTENT PANEL EXIST !!");
		    }
		 catch(Exception e) {
				e.printStackTrace();
			} 
		try {
			// TODO Open filtre pannel
			page.getInstance(Filtre___Fonction.class).getFiltreOption();
			Assert.assertTrue(page.getInstance(hideAnnotationPage.class).isDisplayed(filtrePannel),"ERROR ACCURRED : FILTRE PANNEL IS NOT DISPLAYED ;-( ");
			//TODO Check switch Button Container "résolué" 
			page.clickOnElement(switchButtonContainer);
			Assert.assertEquals(page.getInstance(HanlerBasePage.class).getNotificationMsg(notificationmsg),"Filtrer par : Résolu", "ERROR ACCURRED :SWITCH BUTTON DOSENT WORK !!");
			Assert.assertEquals(page.getInstance(Filtre___Fonction.class).getcontentPanel(),2,"ERROR ACCURRED :SWITCH BUTTON DOSENT WORK !!");
			page.clickOnElement(switchButtonContainer);;
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
      }

}  
