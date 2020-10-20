/**
 * 
 */
package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;






/**
 * @author ARIDHI Hichem
 *
 */
public class HanlerBasePage extends  abstractHandlerBase  {
/**
 * 
 * @param driver
 */
  	public HanlerBasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public WebElement findElement (By locator) {
		WebElement ele = null ;
		try {
			ele = driver.findElement(locator);
			return ele;
		}
		catch (NoSuchElementException i) {
			i.printStackTrace();
		}
		return ele ;
	}
	
	@Override
	public List<WebElement> findElements (By locator) {
		List<WebElement> ele = null ;
		try {
			ele = driver.findElements(locator);
			return ele;
		}
		catch (NoSuchElementException i) {
			i.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ele ;
	}
  
   @Override
	public WebElement clickOnElement(By locator) {
	   
		if(findElement(locator) != null && findElement(locator).isEnabled()) {
			try {
				findElement(locator).click();
			}
			catch(Exception e) {
				
			}
		}
		else {
			System.out.println(locator +"[error] : Element not Clickable" );
		}
		return null;
	}

	@Override
	
	public String getNotificationMsg(By locator) {		
		return  findElement(locator).getText();
	}
    
	
	@Override 
	public void sendText(By locator, String text) {
		
		if(findElement(locator) != null) {
			findElement(locator).sendKeys(text);
		}
		else {
			System.out.println(locator +"[error] : Element not Clickable" );
		}
		  return ;
	}
	
	@Override
	public WebElement waitForElementPresent(By locator) {
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));		
		}
		catch(Exception e) {
			System.out.println("error accurred while waiting for the element" +locator.toString());
		}
		return null;
	}
	
	@Override
	public WebElement waitForElementinvisible(By locator) {
	 
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));		
		}
		catch(Exception e) {
			System.out.println("error accurred while waiting for the element to disapear" +locator.toString());
		}
		return null;
	}
	
	@Override
		public Boolean isDisplayed (By locator)
    {
        return findElement(locator).isDisplayed();
	}

	@Override
	public WebElement waitForElementvisible(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));		
		}
		catch(Exception e) {
			System.out.println("error accurred while waiting for the element to disapear" +locator.toString());
		}
		return null;
	}

	@Override
	public WebElement waitForElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}				
}
