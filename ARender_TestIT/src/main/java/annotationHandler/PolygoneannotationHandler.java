package annotationHandler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;
import style.Page.RichStyleToolbar;



public class PolygoneannotationHandler extends annotationdrawBase implements ARender____FactoryPage {
	
	    public PolygoneannotationHandler(WebDriver driver) {
			super(driver);
		}	
	    
	    public boolean doDrowpolygone() {
	    	
	    	// TODO Draw annotation 
	        // TODO Wait view icone to present
	    	
			 getInstance(annotationdrawBase.class).doDraw(polygoneannotationIcon);
		     builder.moveByOffset(200, 47).doubleClick().build().perform();
		     waitViewIconPresent();
		 return false;     
	    } 	          
		
	    
	  public boolean doStylepolygone() throws InterruptedException { 
		    	
		    	// TODO change back color
		        // TODO change border with 
		        // TODO change border color  
		        // TODO change font style
		    	
		    getInstance(RichStyleToolbar.class).addAnnotation();
		    getInstance(RichStyleToolbar.class).borderWidthButton();
		    getInstance(RichStyleToolbar.class).bordercolorsButton();   
		    getInstance(RichStyleToolbar.class).stylesbordureButton();
		  return false ;
		    } 
		
	  public void checkPolygoneTest() {
		  
		    // TODO Check NOTIF MSG isDisplayed 
		 	// TODO Check ANNOTATION isDisplayed 
		 	// TODO Check STYLE TOOLBAR isDisplayed 
		 	// TODO Check RESIZE TOOLBAR isDisplayed
		  
			getInstance(PolygoneannotationHandler.class).doDrowpolygone();			
		try {
		    try {
		 		 Assert.assertEquals(getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),
		 				 "Prêt pour la création d'annotation : Polygon");
		 		} catch(Exception e) {
		     	     System.out.println("[ERROR] : NOTIFICATION MESSAGE IS NOT DISPLAYED OR ERROR ON TEXT");
		 	    } 
		 	    
		    try {
		 	     Assert.assertTrue(findElement(styleBarre).isDisplayed());
		 	    } catch(Exception e) {
		 	    	 System.out.println("[ERROR] : POLYGONE STYLE TOOLBAR IS NOT DISLAYDED");
		 	    }
		 	    
		 	try {
		 		 Assert.assertTrue(findElement(annotationViewIcon).isDisplayed());
		 	    } catch(Exception e) {
		 		   System.out.println("[ERROR] : POLYGONE VIEW ICON IS NOT DISLAYDED");
		 	    }
		 	
		 	try {
		 		 Assert.assertTrue(findElement(arrowBar).isDisplayed());
		 		} catch(Exception e) {
		 		  	System.out.println("[ERROR] : POLYGONE IS NOT DISLAYDED");
		 		}
		 		    
		    try {
		 	     Assert.assertTrue(findElement(resizePoint).isDisplayed());
		 	    } catch(Exception e) {
		 		   System.out.println("[ERROR] : POLYGONE RISIZE POINT IS NOT DISLAYDED");
		 		}
		 	 try {   		 		 
				  getInstance(polylineAnnotationHandler.class).doStylepolyline();
		 	    }catch(Exception e) {
		 			System.out.println("[ERROR] : POLYGONE STYLE ERROR");
		 		 }    
		   }
		
	       catch(Exception e) {
				e.printStackTrace();
			} 
	  }
		    
}
		    /**
		     * 
		     * 
		     * @version staging 1.35
		     * @validate review by ARIDHI Hichem 
		     * {@docRoot} c:/
		     * 
		     * 
		     */
	