/**
 * 
 */
package annotationHandler;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HanlerBasePage;
/**
 * 
 * @author ARIDHI HICHEM
 *
 */
public class annotationdrawBase  extends  HanlerBasePage implements ARender____FactoryPage , File____FactoryPage{
	/**
	 * 
	 * @param driver
	 */  
	public annotationdrawBase(WebDriver driver) {
		super(driver);
	}
    /**
     * 
     * @return Elements
     */
	  public WebElement getAnnotationMenu() {
	return findElement(annotationMenu); }  
	  
	  public WebElement getAnnotation(By locator) {
	return findElement (locator);  }
		    
	  public WebElement getDrawLocationPath() {
    return findElement(drawLocationPath); }
	  
	  
	  public WebElement waitViewIconPresent() {
    return  waitForElementPresent(annotationViewIcon);
	  }
	  /**
	   *   
	   * @param locator
	   */
	  public void doDraw (By locator) { findElement(annotationMenu).click(); getAnnotation(locator).click(); 
	  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); }	  
	  /**
	   * 
	   */
	  public void doDrop () { findElement(deleteAnnotation).click();
	  }
	  /**
	   * 
	   * @return
	   */
	  public int getEllipses() {
		  List <WebElement> Ellipeses = findElements(ellipses);
		  return Ellipeses.size();
	  }
	  /**
	   * 
	   * @return
	   */
	  public int getPathfill() {
		  List <WebElement> PathFill = findElements(rectDisplay);
		  return PathFill.size();
	  }
	  /**
	   * 
	   * @return
	   */
	  public int getAnnotationNum () {
		  List <WebElement> annotationNum = findElements(annatoationPath);
		  return annotationNum.size();
	  }
	  /**
	   * 
	   * @return
	   */
	  public int getEllipsesNone() {
		  List <WebElement> EllipseNone = findElements(ellipsesNone);
		  return EllipseNone.size();
	  }
	  /**
	   * 
	   * @return
	   */
	  public int getPathFillNone () {
		  List <WebElement> PathFillNone = findElements(pathFillsNone);
		  return PathFillNone.size();
	  }
	  
	  public int getAllPathfill() {
		  List <WebElement> PathFill = findElements(annotationpathFills);
		  return PathFill.size();
	  }
	  
}	  
	  /**
	     * 
	     * 
	     * @version staging 1.35
	     * @validate review by ARIDHI Hichem 
	     * {@docRoot} c:/
	     * 
	     * 
	     */

