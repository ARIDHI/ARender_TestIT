/**
 * 
 */
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * @author ARIDHI HICHEM
 *
 */
public class LocatorListner implements WebDriverEventListener  {
	
	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("[INFO: Before navigating to] " +url +"'");
	}
	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("[LOG: Navigated to] " +url );
	}
	public void beforeChangeValueOf(WebElement ele , WebDriver driver) {
		System.out.println("[INFO: Value of the] " +ele +"before any changes made");
	}
	public void afterChangeValueOf(WebElement ele , WebDriver driver) {
		System.out.println("[LOG: Element value change to] " +ele );
	}
	@Override
	public void beforeClickOn(WebElement ele , WebDriver driver) {
		System.out.println("[INFO: Trying To click on] " +ele );
	}
	@Override
	public void afterClickOn(WebElement ele , WebDriver driver) {
		System.out.println("[LOG: Clicked on]" +ele );
	}
	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("[INFO: Navigating back to previous page]");
	}
	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("[LOG:Navigated back to previous page]");
	}
	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("[INFO: Navigating Forward to next page]");
	}
	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("[LOG: Navigated Forward to next page]");
	}
	public void OnException(Throwable error, WebDriver driver) {
		System.out.println("[INFO: Exception occured] " +error);
	}
	@Override
	public void beforeFindBy(By by , WebElement ele ,WebDriver driver) {
		System.out.println("[INFO: Try to find Element By] " +by );
	}
	@Override
	public void afterFindBy(By by , WebElement ele ,WebDriver driver) {
		System.out.println("[LOG:Found Element By] " +by );
	}
	
	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("[INFO: Trying To get a text] " +element  );
		
	}
	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("[LOG: Founded text] " +element );
		
	}
	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}	
	
	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("[INFO: Trying To switch to window] " +windowName);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("[LOG : Switched to window] " +windowName);
		// TODO Auto-generated method stub
		
	}
	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		
	}
	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		
	}
	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


}
