package FullActionpage;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Locators.FactoryLocator;
import pageObject.HandlerBasePage;



public class deleteFonction extends HandlerBasePage implements FactoryLocator{
	
	public deleteFonction(WebDriver driver) {
		super(driver);
	}
	
	
  
	public boolean deleteFromExplorerThumb() {
		
		try {
			clickOnElement(annotationExplorerButtonFull);
			   List <WebElement> elements = driver.findElements(delete);
			   
		  	   for (int i=0 ; i < elements.size() ; i++) {
						elements.get(i).click();
						}
	       }
		 catch(Exception e) {
			 e.printStackTrace();
		  }
		return false;
	}
	
	
	public boolean deleteFromStyleBar() {
		try {
			  findElement(deleteAnnotation).click();
		    }
		    catch(Exception e) {
			 e.printStackTrace();
		    }
		return false;
	  }
}

