package Locators;

import org.openqa.selenium.By;

public interface BaseFonctionLocators {
	
	
/**
 * @category ancre loctor
 */
	public static final By ancre_Button = By.xpath("//div[contains(text(),'Créer une ancre à cette page')]");
	public static final By ancre_link = By.cssSelector("input.gwt-TextBox-readonly");
	public static final By copy_Ancre = By.xpath("//button[contains(text(),'Copier (texte sélectionné)')]");
	public static final By skip_Ancre = By.xpath("//button[contains(text(),'Fermer')]");
	public static final By Contextual_Menu = By.id("ContextualMenuView");	
	public static final By Thumb_Image = By.cssSelector("img.thumbimage");
	
	/**
	 * @category Multiview loctor
	 */
	public static final By multiview_Button = By.xpath("//div[contains(text(),'Ouvrir comme nouveau document')]");
	public static final By delete_img1_Button = By.id("deleteImage1");
	public static final By delete_img2_Button = By.id("deleteImage2");
	public static final By verticalSlider_Bar = By.className("verticalSlider-bar");
}