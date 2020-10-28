/**
 * 
 */
package EnvirementClient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class LogInToNuxio  extends  HandlerBasePage implements FactoryLocator {
	

		public LogInToNuxio(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
		/**
		 * 
		 * 
		 * @return
		 */
		   public WebElement username() {
				  return findElement(userNameNuxeo);
				  }	
		   
		   public WebElement password() {
				  return findElement(passeWordNuxeo);}	
		   
		   public WebElement loginButton() {
				  return findElement(loginButtonNuxeo);}	
		
		   /**
		    * 
		    * @param un
		    * @param pwd
		    */
		public void login(String un , String pwd) {
			
			username().sendKeys(un);
			password().sendKeys(pwd);
			loginButton().click();	
		}
//		
//		public void pick__File() throws InterruptedException {
//			
//			for(int i=0 ; i<3 ;i++) {
//				builder.sendKeys(Keys.TAB).build().perform();
//			}
//			builder.sendKeys(Keys.ENTER).build().perform();   
//			Thread.sleep(2000);
//			
//			for(int i=0 ; i<3 ;i++) {
//				builder.sendKeys(Keys.TAB).build().perform();
//			}
//					
//			builder.sendKeys(Keys.ENTER).build().perform();  
//			Thread.sleep(2000);
//			
//			for(int i=0 ; i<4 ;i++) {
//				builder.sendKeys(Keys.TAB).build().perform();
//			}
//					
//			builder.sendKeys(Keys.ENTER).build().perform();  
//			Thread.sleep(2000);
//			
//        	for(int i=0 ; i<2 ;i++) {
//			builder.sendKeys(Keys.TAB).build().perform();
//	    	}
//				
//		    builder.sendKeys(Keys.ENTER).build().perform();  
// 		    Thread.sleep(2000);
//	       }
}
