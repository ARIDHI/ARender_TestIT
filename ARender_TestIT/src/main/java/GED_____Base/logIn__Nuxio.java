/**
 * 
 */
package GED_____Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * @author Lenovo
 *
 */
public class logIn__Nuxio  extends  HanlerBasePage implements ARender____FactoryPage {
	

		public logIn__Nuxio(WebDriver driver) {
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
