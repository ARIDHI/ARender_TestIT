package fileHandler;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import annotationHandler.annotationdrawBase;
import pageObject.File____FactoryPage;

public class AFileUploadBase extends annotationdrawBase implements File____FactoryPage  {
	

	public AFileUploadBase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 * @param file
	 */
	  public void doDownloadfile() {
		  clickOnElement(FileMenu);clickOnElement(upLoadfileButton); 
//	  getElement(PopupfileUpload).sendKeys(file); waitForElementPresent(thumbimage);
	  return;
		    }
	  /**
	   * 
	   * @category file container check
	   * @return
	   */
	  public int getFileContainer() {
		  List <WebElement> FileContainer = findElements(fileContainer);
		  return FileContainer.size();
	  }
	  /**
	   * 
	   * @return
	   */
	  public int getFileSubNum() {
		  List<WebElement> FileSubNum = findElements(subNum);
		  return FileSubNum.size();
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




