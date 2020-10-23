/**
 * 
 */
package FullActionpage;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;



/**
 * @author ARIDHI Hichem
 *
 */
public class filtreAction extends HandlerBasePage implements ARender____FactoryPage{
	/**
	 * 
	 * @param driver
	 */
	public filtreAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   /**
    * 
    * @throws InterruptedException
    */
	public void HandleSticky() throws InterruptedException {
		
		 getInstance(annotationHandler.StickyNoteAnnotationHandler.class).drowNote();
		 Thread.sleep(500);

		 try {
			 Select state = new Select(findElement(StickyeannotationDisplayed));
		      state.selectByVisibleText("Refusé");
		     }
		 catch(Exception e) {
				e.printStackTrace();
			 } 
		 clickOnElement(cancelAnnotationButton); builder.sendKeys(Keys.ARROW_RIGHT).build().perform();		 
		 getInstance(annotationHandler.StickyNoteAnnotationHandler.class).drowNote();
		 try {
			 Select state = new Select(findElement(StickyeannotationDisplayed));
			 state.selectByVisibleText("Terminé"); 
		     }
		 catch(Exception e) {
				e.printStackTrace();
			 }        
		 Thread.sleep(700);clickOnElement(cancelAnnotationButton);clickOnElement(saveBtn);
	}
	/**
	 * 
	 * @throws InterruptedException
	 */
	public void HandleAnno() throws InterruptedException {
     	 try {
			 getInstance(annotationHandler.circleAnnotationHandler.class).doDrowcircle();
			 Thread.sleep(500);
		     }
		 catch(Exception e) {
				e.printStackTrace();
			 } 
		 clickOnElement(cancelAnnotationButton); builder.sendKeys(Keys.ARROW_RIGHT).build().perform();		 
		 
		 try {
			 getInstance(annotationHandler.UnderLineHandler.class).doDrowUnderline();
			 Thread.sleep(500);
		     }
		 catch(Exception e) {
				e.printStackTrace();
			 }        
	}
	/**
	 * 
	 * @return
	 */
	public int getcontentPanel() {
		List <WebElement> commentPanel = findElements(commentContentPanel);
		return commentPanel.size();
	}
	
	public void getFiltreOption () {		
		clickOnElement(commentExplorer);clickOnElement(filterIcon);
		return;	
			}
	public void selectCircleFiltre() {
		Select selectFiltre = new Select(findElement(selectFiltreAnnotationOption));
		selectFiltre.selectByVisibleText("Cercle"); 		
	}
	
	public void selectToutFiltre() {
		Select selectFiltre = new Select(findElement(selectFiltreAnnotationOption));
		selectFiltre.selectByVisibleText("Tout"); 		
	}
}
 