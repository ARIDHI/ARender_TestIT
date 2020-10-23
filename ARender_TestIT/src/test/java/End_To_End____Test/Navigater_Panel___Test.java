/**
 * 
 */
package End_To_End____Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.reflect.Method;

import org.openqa.selenium.Alert;
import FullActionpage.filtreAction;
import annotationHandler.hideAnnotationPage;
import fileHandler.AFileUploadBase;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class Navigater_Panel___Test extends pageObject.TestBase implements ARender____FactoryPage , File____FactoryPage{
	
	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 */
	@Test (priority =1 , alwaysRun = true )
	public void Filtre__On_Zip(Method method) throws InterruptedException {

		page.getInstance(AFileUploadBase.class).doDownloadfile();
	    page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\ARender.pdf");
		Thread.sleep(3000);
		
		try {
			page.getInstance(filtreAction.class).HandleAnno();
			page.getInstance(filtreAction.class).getFiltreOption();
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
		
		driver.navigate().refresh();		
		Alert alert =driver.switchTo().alert();		    
		alert.accept();
		page.getInstance(AFileUploadBase.class).doDownloadfile();
	    page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\ARender.pdf");
		Thread.sleep(3000);

		
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
