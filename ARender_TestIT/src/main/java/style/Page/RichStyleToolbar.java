/**
 * 
 */
package style.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI Hichem
 *
 */
public class RichStyleToolbar extends HandlerBasePage implements FactoryLocator{
	
	public RichStyleToolbar(WebDriver driver) {
		super(driver);
	}
  
	 public WebElement getresizerButton() {
		  return findElement(resizerButton);	  
	  }
	 public WebElement getboldButton() {
		  return findElement(boldButton);	  
	  }
	 public WebElement getitalicButton() {
		  return findElement(italicButton);	  
	  }
	 public WebElement getunderlineButton() {
		  return findElement(underlineButton);	  
	  }
	 public WebElement getupoliceListBox() {
		  return findElement(policeListBox);	  
	  }
	 public WebElement gettailleListBox() {
		  return findElement(tailleListBox);	  
	  }
	 public WebElement getforeColorsButton() {
		  return findElement(foreColorsButton);	  
	  }
	 public WebElement getbackColorsButton() {
		  return findElement(backColorsButton);	  
	  }
	 public WebElement getincreaseBorderWidthButton() {
		  return findElement(increaseBorderWidthButton);	  
	  }
	 public WebElement getdecreaseBorderWidthButton() {
		  return findElement(decreaseBorderWidthButton);	  
	  }
	 public WebElement getborderColorsButton() {
		  return findElement(borderColorsButton);	  
	  }
	 public WebElement getopacityCursorSliderBar() {
		  return findElement(opacityCursorSliderBar);	  
	  }
	 public WebElement getinfosButton() {
		  return findElement(infosButton);	  
	  }
	 public WebElement getcancelChangesButton() {
		  return findElement(cancelChangesButton);	  
	  }
	 public WebElement getRedColorButton() {
		  return findElement(RedColorButton);	  
	  }
	 public WebElement getGreenColorButton() {
		  return findElement(GreenColorButton);	  
	  }
	 public WebElement getStylesbordureButton() {
		  return findElement(StylesbordureButton);	  
	  }
	 public WebElement getstickyannotation() {
		  return findElement(StickyeannotationIcon);	  
	  }
	 public WebElement getHeadStyleButton() {
		  return findElement(changeHeadStyleButton);	  
	  }
	 public WebElement getTailStyleButton() {
		  return findElement(StickyeannotationIcon);	  
	  }
	 public WebElement getincreaseArrowLine() {
		  return findElement(increaseArrowLineWidthButton);	  
	  }
	 public WebElement getdecreaseArrowLine() {
		  return findElement(decreaseArrowLineWidthButton);	  
	  }
	 
	 public void fontColors() {
		 getforeColorsButton().click();
	      getRedColorButton().click();
     }
	 
	 public void addAnnotation() {
		         getstickyannotation().click();
	 }
	 
	 public void speciFontStyle() {
		         getboldButton().click();
	             getitalicButton().click();
	             getunderlineButton().click();}
	      
	 public void backcolorsButton() { 
		         getbackColorsButton().click();
		         getRedColorButton().click();
	             
	 }
	 
	 public void bordercolorsButton() { 
		         getborderColorsButton().click();
		         getRedColorButton().click();
	 }
	 public void fontcolorsButton() { 
		         getforeColorsButton().click();
		         getGreenColorButton().click();
     }	 
	 public void borderWidthButton() 
	 {
	      for (int i=0 ; i<5; i++)
	      { 
	    	  getincreaseBorderWidthButton().click();
	      }
	      for (int i=0 ; i<5; i++)
	      { 
	    	  getdecreaseBorderWidthButton().click();
	      }
     }
	 
	 public void stylesbordureButton () throws InterruptedException
	 {
			Select selectbar =new Select(getStylesbordureButton());
		       selectbar.selectByVisibleText("Dash"); 
 			    Thread.sleep(1000);
 			   selectbar.selectByVisibleText("Solid");	
			    Thread.sleep(1000);
	 }	
	 
	 public void ArrowLineWidthButton() { 
		 for (int i=0 ; i<5; i++)
	      { 
			 getincreaseArrowLine().click();
	      }
	      for (int i=0 ; i<5; i++)
	      { 
	    	  getdecreaseArrowLine().click();
	      }
      }	 
}
