/**
 * 
 */
package style.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;


/**
 * @author ARIDHI HICHEM
 *
 */
public class SpecificStyle extends HandlerBasePage implements ARender____FactoryPage{

	
	public SpecificStyle(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * findElement and check that the button are clickable and visible
	 * @return
	 * 
	 */
    public WebElement getHeadArrowButton() {
		  return clickOnElement(headArrowButton);	  
	  }
    public WebElement getTealArrowButton() {
		  return clickOnElement(tealArrowButton);	  
	  } 
    public WebElement getArrowSquareButton() {
		  return clickOnElement(arrowSquareButton);	  
	  } 
    public WebElement getArrowCircleButton() {
		  return clickOnElement(arrowCircleButton);	  
	  }
    public WebElement getArrowButtButton() {
		  return clickOnElement(arrowButtButton);	  
	  }
    public WebElement getArrowDiamondButton() {
		  return clickOnElement(arrowDiamondButton);	  
	  }
    public WebElement getopenArrowButton() {
		  return clickOnElement(openArrowButton);	  
	  }
    public WebElement getrOpenArrowButton() {
		  return clickOnElement(rOpenArrowButton);	  
	  }
    public WebElement getcloseArrowButton() {
		  return clickOnElement(closeArrowButton);	  
	  }
    public WebElement getrcloseArrowButton() {
		  return clickOnElement(rCloseArrowButton);	  
	  }
    public WebElement getNoneArrowButton() {
		  return clickOnElement(noneArrowButton);	  
	  }
    public WebElement getStylesbordureButton() {
		  return clickOnElement(StylesbordureButton);
    }  
		  
     public WebElement getDistanceTextBox() {
			  return findElement(ditanceTextBox);	  
		  }	  
     public WebElement getDistanceTypeBox() {
		  return findElement(selectTypeBox);	  
	  }	    

     /**
      * 
      * ArrowHead
      * ArrowTeal
      * select from list all arrow head/teal style
      * used just on arrow style
      * 
      */
    public void ChangeArrowHead() throws InterruptedException {
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getArrowSquareButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getArrowCircleButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getArrowButtButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getArrowDiamondButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getopenArrowButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getrOpenArrowButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getcloseArrowButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getrcloseArrowButton();
    	Thread.sleep(200);
    	getHeadArrowButton();
    	Thread.sleep(200);
    	getNoneArrowButton();
    } 
    public void ChangeArrowTeal() throws InterruptedException {
    	getTealArrowButton();
    	Thread.sleep(200);
    	getArrowSquareButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getArrowCircleButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getArrowButtButton() ;
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getArrowDiamondButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getopenArrowButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getrOpenArrowButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getcloseArrowButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getrcloseArrowButton();
    	Thread.sleep(200);
    	getTealArrowButton();
    	Thread.sleep(200);
    	getNoneArrowButton();
    }
    /**
     * 
     * select from list the special stype cloudy .
     * used just on circle, polygone and underline annotation
     * 
     */
    public void Cloudytyle() {
    	Select selectbar =new Select(getStylesbordureButton());
	    selectbar.selectByIndex(3);		    	   	 
    }
    /**
     * 
     * Send a value to the distance text box and check it
     * select from list all unit distance type
     * used just on arrow style
     * 
     */
    public void echelle() {
    	Select distanceTypelist =new Select(getDistanceTypeBox());
    	getDistanceTextBox().sendKeys("250");
    	distanceTypelist.selectByIndex(0);
    	distanceTypelist.selectByIndex(1);
    	distanceTypelist.selectByIndex(2);
    	distanceTypelist.selectByIndex(3);
    	distanceTypelist.selectByIndex(4);
    	distanceTypelist.selectByIndex(5);
    	distanceTypelist.selectByIndex(6);
    	distanceTypelist.selectByIndex(7);
    	distanceTypelist.selectByIndex(8);
    	distanceTypelist.selectByIndex(9);
    	distanceTypelist.selectByIndex(10);
    	distanceTypelist.selectByIndex(11);
    	distanceTypelist.selectByIndex(12);
    	distanceTypelist.selectByIndex(13);
    }
    
   /**
    * feature 
    * change taille and style of the text 
    * used on stickynote and freetext 
    * 
    */
    
    public void textTaille() {
    	
    }
    public void fontText() {
    	
    }
}

