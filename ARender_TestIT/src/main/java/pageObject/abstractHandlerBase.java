/**
 * 
 */
package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author ARIDHI Hichem
 *
 */
public abstract class abstractHandlerBase {
	
    public final Actions builder;
    protected final WebDriver driver ;
    protected final WebDriverWait wait;
   /**
    * 
    * @param driver
    */
	    public abstractHandlerBase(WebDriver driver) {
		this.driver = driver ; 
		this.wait = new WebDriverWait(driver, 15);
	    builder =new Actions(driver);
	}
	/**
	 * 
	 * @param locator
	 * @return
	 */
     public abstract WebElement findElement (By locator);
	 public abstract WebElement clickOnElement(By locator);
     public abstract WebElement waitForElementPresent(By locator);
     public abstract String getNotificationMsg(By locator);
     public abstract Boolean isDisplayed(By locator);
     public abstract void sendText(By locator,String text);
     public abstract List<WebElement> findElements(By locator);
     public abstract WebElement waitForElementinvisible(By locator);
     public abstract WebElement waitForElementvisible(By locator);
     public abstract WebElement waitForElement(By locator);
    /**
     * 
     * @param <TabstractannotationHandlerBase>
     * @param abstractannotationHandlerBaseClass
     * @return
     */
     public <TabstractannotationHandlerBase extends HandlerBasePage> 
     TabstractannotationHandlerBase getInstance(Class<TabstractannotationHandlerBase> abstractannotationHandlerBaseClass ) {
     	
     	try {
     		return abstractannotationHandlerBaseClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
     	}
     	catch(Exception e) {
     		
     		e.printStackTrace();
     		return null;
     	   }	
     	}	
}
