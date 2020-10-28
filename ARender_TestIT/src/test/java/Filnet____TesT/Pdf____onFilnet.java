package Filnet____TesT;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import EnvirementClient.LogInToFileNet;
import FullActionpage.deleteFonction;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.annotationdrawBase;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.freeTextAnnotationHandler;
import pageObject.FactoryLocator;
import pageObject.FileFactoryLocator;
import pageObject.HandlerBasePage;

public class Pdf____onFilnet  extends pageObject.TestBase implements FactoryLocator, FileFactoryLocator { 
/**
 * 
 * @param method
 * @throws InterruptedException
 * @throws IOException
 */
		@Test(priority = 1, alwaysRun = true ,enabled= true)
	    public void Login__toFileNet (Method method) throws InterruptedException, IOException {
			
			 page.getInstance(LogInToFileNet.class).login(prop.getProperty("username"), prop.getProperty("password"));
			 Thread.sleep(3000);
			 page.builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			 
			 for(int i=0; i<11 ;i++) {
				 page.builder.sendKeys(Keys.TAB).build().perform();
				 Thread.sleep(200);
			 }
			 
			 for(int i=0; i<14 ;i++) {
				 page.builder.sendKeys(Keys.ARROW_DOWN).build().perform();
				 Thread.sleep(200);
			 }
			 page.builder.sendKeys(Keys.ENTER).build().perform();
			 Thread.sleep(20000);
			 
			 //TODO driver get The new window 
			 String parent=driver.getWindowHandle();
			 Set<String>s=driver.getWindowHandles();
			 //TODO Now iterate using Iterator
			 Iterator<String> I1= s.iterator();
			 while(I1.hasNext())
			 {
			 String child_window=I1.next();
			 if(!parent.equals(child_window))
			 {
			 driver.switchTo().window(child_window);
			 driver.manage().window().maximize();
			 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='IframeDocViewer']")));
		    }
	       }	
		}
/**
 * 
 * @param method
 * @throws InterruptedException
 */
			@Test (priority = 2,  enabled= true)
			public void Handle_StickyNote___OnPDF (Method method) throws InterruptedException{ page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
		    // TODO Check notification message is not wrong
			// TODO Check annotation is displayed 
		    // TODO Check style barre is displayed 
			try {
			    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Text");
//			    Assert.assertTrue(page.getElement(StickyeannotationDisplayed).isDisplayed(),"ERROR ACCURRED : STICKYNOTE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.findElement(styleBarre).isDisplayed(),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");   
			    page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
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
		    public void Handle_FreeText___OnExcel (Method method) throws InterruptedException { page.getInstance(freeTextAnnotationHandler.class).doDrowfreetext(); 	
		    // TODO Check notification message is not wrong
		 	// TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
		    try {
		        Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Freetext");
		        Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED");
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
			public void Handle_Circle___OnExcel (Method method) throws InterruptedException { page.getInstance(circleAnnotationHandler.class).doDrowcircle();	
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Circle");
			    Assert.assertEquals(page.getInstance(annotationdrawBase.class).getEllipses(), 1,"ERROR ACCURRED : CICRLE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
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
			public void Handle_Arrow___OnExcel(Method method) throws InterruptedException { page.getInstance(arrowAnnotationHandler.class).doDrowArrow();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Line");
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getAllPathfill(), 0,"ERROR ACCURRED : ARROW IS NOT DIPLAYDED");
			    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
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
			public void Handle_Underline___OnExcel(Method method) throws InterruptedException {page.getInstance(UnderLineHandler.class).doDrowUnderline();
			// TODO Check notification message is not wrong
		    // TODO Check annotation is displayed 
		    // TODO Check style barre is displayed
			try {
			    Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Prêt pour la création d'annotation : Square");
			    Assert.assertNotEquals(page.getInstance(annotationdrawBase.class).getPathfill(), 0,"ERROR ACCURRED : UNDERLINE IS NOT DIPLAYDED");
			    Assert.assertTrue(page.getInstance(HandlerBasePage.class).isDisplayed(styleBarre),"ERROR ACCURRED : STYLE BARRE NOT DIPLAYDED"); 
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