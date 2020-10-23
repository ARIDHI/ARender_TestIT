package GED_____Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;

public class logIn___Alfresco extends  HandlerBasePage implements ARender____FactoryPage {
	
	public logIn___Alfresco(WebDriver driver) {
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
