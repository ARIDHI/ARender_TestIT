/**
 * 
 */
package Alfresco____TesT;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import EnvirementClient.LogInToAlfresco;
import FullActionpage.deleteFonction;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.annotationdrawBase;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.freeTextAnnotationHandler;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class Alfresco___Excel__TesT extends pageObject.TestBase implements FactoryLocator, FileFactoryLocator{

	/**
	 * 
	 * @param method
	 * @throws InterruptedException
	 * @throws IOException
	 */
		@Test(priority = 0, alwaysRun = true ,enabled= true)
	    public void Login__toFileNet (Method method) throws InterruptedException, IOException {
			
			 page.getInstance(LogInToAlfresco.class).login(prop.getProperty("usernameAlf"), prop.getProperty("passwordAlf"));
			 Thread.sleep(3000);
			 page.clickOnElement(dossier);
			 page.clickOnElement(File);
			 Thread.sleep(2000);
			 driver.switchTo().frame(driver.findElement(By.xpath("//*[name()='iframe' and contains(@src,'/ARenderHMI/?nodeRef=workspace://SpacesStore/d1badb74-2a74-4da4-a2e6-85961c0314d0&user=admin&alf_ticket=TICKET_8b08bcd225e2e8ea66b492760e9bf677c9607f4f&versionLabel=1.0')]")));
		}
/**
 * 
 * @param method
 * @throws InterruptedException
 */
			@Test (priority = 2,  enabled= true)
			public void Handle_StickyNote___OnPDF (Method method) throws InterruptedException{ 
				page.getInstance(LogInToAlfresco.class).getMouse();
				page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
		    // TODO Check notification message is not wrong
			// TODO Check annotation is displayed 
		    // TODO Check style barre is displayed 
			try {
			    Assert.assertEquals(page.findElement().getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Text");
//			    Assert.assertTrue(page.getElement(StickyeannotationDisplayed).isDisplayed(),"ERROR ACCURRED : STICKYNOTE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    
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
		    public void Handle_FreeText___OnExcel (Method method) throws InterruptedException { 
				page.getInstance(LogInToAlfresco.class).getMouse();
				page.getInstance(freeTextAnnotationHandler.class).doDrowfreetext(); 	
		    // TODO Check notification message is not wrong
		 	// TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
		    try {
		        Assert.assertEquals(page.findElement().getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Freetext");
		        Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");
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
			public void Handle_Circle___OnExcel (Method method) throws InterruptedException { 
				page.getInstance(LogInToAlfresco.class).getMouse();
				page.getInstance(circleAnnotationHandler.class).doDrowcircle();	
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.findElement(notificationmsg).getNotificationMsg(),"Prêt pour la création d'annotation : Circle");
			    Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1,"ERROR ACCURRED : CICRLE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
//		        page.getInstance(circleAnnotationHandler.class).doStylecircle();
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
			public void Handle_Arrow___OnExcel(Method method) throws InterruptedException { 
				page.getInstance(LogInToAlfresco.class).getMouse();
				page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.findElement().getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Line");
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : ARROW IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
//			    page.getInstance(arrowAnnotationHandler.class).doStylearrow();
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
			public void Handle_Underline___OnExcel(Method method) throws InterruptedException {
				page.getInstance(LogInToAlfresco.class).getMouse();
				page.getInstance(UnderLineHandler.class).doDrowUnderline();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.findElement().getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Square");
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement().isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
//			     page.getInstance(UnderLineHandler.class).doStyleunderLine();
			}
		    catch(Exception e) {
					e.printStackTrace();
				}    
		   finally { 
				    page.getInstance(deleteFonction.class).deleteFromStyleBar();
			        }	
			}    
}