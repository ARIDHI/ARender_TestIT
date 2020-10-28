/**
 * 
 */
package FullActionpage;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class signetFonction extends HandlerBasePage implements FactoryLocator {

	public signetFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 
	
	public boolean addAncre() {
		
		try {
		for(int i=0 ; i < 4 ; i++) {
			clickOnElement(bookmarkExplorerButton);
		    	clickOnElement(addBookmark);
			       findElement(insertBookmarkText).sendKeys("ARENDER ANCRE TEST");			   
			builder.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(600);	
		 }
		}
		catch(Exception e) {
			e.getCause();
		}
		return false;
	}

	public boolean deletAncre() {
	 try {	
		 if(findElement(bookmarkDisplayed) != null) {
		 
	        for(int i=0 ; i < 3 ; i++) {
	          Thread.sleep(1000);
		       clickOnElement(bookmarkDisplayed);
	             clickOnElement(deleteBookmark);	           
		         }
		 }
	      	else {
			   System.out.println("ANCRE NOT EXISTING");
		         }
	   }
	   catch(Exception e){
		   e.getCause();
	   }
		return false;

	}	
	
	  public int treeItemSize() {
		   List<WebElement> Items = findElements(treeItems);
		   return Items.size();
	    }
	
}
