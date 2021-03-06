/**
 * 
 */
package EnvirementClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class LogInToFileNet extends  HandlerBasePage implements FactoryLocator {

	public LogInToFileNet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * 
	 * @return
	 */
	   public WebElement username() {
			  return findElement(userNameFilenet);}	
	   
	   public WebElement password() {
			  return findElement(passeWordFilenet);}	
	   
	   public WebElement loginButton() {
			  return findElement(loginButtonFilenet);}	
	   
	   public WebElement filesStoreButton() {
			  return clickOnElement(filesStoreFilenet);}	
   
	   public WebElement getfilesUp(By locator) {
			  return findElement(locator);
			  }
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
	/**
	 * 
	 * @param locator
	 * @throws InterruptedException
	 */
	
	public void locateFile() throws InterruptedException {
		filesStoreButton();
		   Thread.sleep(1000);}
	/**
	 *  
	 * @param locator
	 */	
	public void logToFile(By locator) {
		
		 builder.doubleClick(getfilesUp(locator)).build().perform();
	}
}
