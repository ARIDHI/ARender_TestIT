package EnvirementClient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

public class LogInToAlfresco extends  HandlerBasePage implements FactoryLocator {
	
	public LogInToAlfresco(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * 
	 * @return
	 */
	   public WebElement username() {
			  return findElement(userNameAlfresco);}	
	   
	   public WebElement password() {
			  return findElement(passeWordAlfresco);}	
	   
	   public WebElement loginButton() {
			  return findElement(loginButtonAlfresco);}	
	   
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
	
	public void getMouse() {
		
		 int getCX = findElement(imageProcessin).getLocation().getX();
		 int getCY = findElement(imageProcessin).getLocation().getY();
		builder.moveByOffset(getCX, getCY).build().perform();
	}
}
