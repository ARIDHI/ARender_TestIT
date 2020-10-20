/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;
import pageObject.ARender____FactoryPage;
import pageObject.HanlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class RightClick______List  extends HanlerBasePage implements ARender____FactoryPage {

	public RightClick______List(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @throws InterruptedException
 */
	public void contextHighlight() throws InterruptedException {
		Thread.sleep(2000);
		builder.contextClick(findElement(drawLocationPath)).perform();
     		clickOnElement(contextSurligner);
     		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
	}
	/**
	 * 
	 * @throws InterruptedException
	 */
	public void contextCrossed() throws InterruptedException {
		Thread.sleep(2000);
		builder.contextClick(findElement(drawLocationPath)).perform();
     		clickOnElement(contextBarré);
     		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
	}
/**
 * 
 * @throws InterruptedException
 */
public void contextHighlighted() throws InterruptedException {
	Thread.sleep(2000);
	builder.contextClick(findElement(drawLocationPath)).perform();
 		clickOnElement(contextSouligné);
 		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
}
/**
 * 
 * @throws InterruptedException
 */
public void contextHighlightZone() throws InterruptedException {
	Thread.sleep(2000);
	builder.contextClick(findElement(drawLocationPath)).perform();
 		clickOnElement(contextSurlignerZone);
 		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
}
/**
 * 
 * @throws InterruptedException
 */
public void contextAddCircle() throws InterruptedException {
	Thread.sleep(2000);
	builder.contextClick(findElement(drawLocationPath)).perform();
 		clickOnElement(contextAddCercle);
 		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
}
/**
 * 
 * @throws InterruptedException
 */
public void contextAddArrow() throws InterruptedException {
	Thread.sleep(2000);
	builder.contextClick(findElement(drawLocationPath)).perform();
 		clickOnElement(contextAddflèche);
 		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
}
/**
 * 
 * @throws InterruptedException
 */
public void contextAddSticky() throws InterruptedException {
	Thread.sleep(2000);
	builder.contextClick(findElement(drawLocationPath)).perform();
 		clickOnElement(contextAddStickynote);
 		  builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
}
}