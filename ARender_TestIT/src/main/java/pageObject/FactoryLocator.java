/**
 * 
 */
package pageObject;

import org.openqa.selenium.By;

/**
 * @author ARIDHi Hichem
 *
 */
public interface ARender____FactoryPage   {
	
	
	public static final By ARenderLogo = By.cssSelector("img.ARenderLogo");		
	public static final By ARenderversion = By.xpath("//div[contains(text(),'Version ')]");
	public static final By saveBtn = By.cssSelector("img.saveAnnotationsButton");
	public static final By refreshBtn = By.cssSelector("img.refreshAnnotationButton");	
	public static final By fullScreen = By.cssSelector("img.fullScreenButton");
	public static final By thumbExplorerButton = By.cssSelector("img.thumbExplorerButton");
	public static final By verticalSlider = By.xpath("//div[@class='verticalSlider-thumb']");
	public static final By notificationmsg = By.xpath("//div[@class='ntf-message']");
	public static final By videoLocation = By.tagName("video");
	public static final By dropDown = By.xpath("//img[@src='arender-icones-svg/resizeBottom.svg']");
	public static final By VDragger  = By.className("gwt-SplitLayoutPanel-VDragger");
	public static final By waiterImg  = By.xpath("//img[contains(@src,'http://18.203.215.159:8080/arondor-arender-axa-war-4.0.9-2-rc1/images/loadingRipple.svg')]");
	
	/**
	 * {@value = Annotation locator}
	 *   
	 */	
	public static final By annotationMenu = By.cssSelector("img.annotationManagerButton");
	public static final By circleannotationIcon = By.cssSelector("img.circleAnnotationButton");
	public static final By ArrowannotationIcon = By.cssSelector("img.arrowAnnotationButton");
	public static final By StickyeannotationIcon = By.cssSelector("img.addAnnotationButton");
	public static final By StickyeannotationDisplayed  = By.xpath("//select[@class='status']");
	public static final By postitContentView  = By.className("postit-contentView");
	public static final By RectangleannotationIcon = By.cssSelector("img.rectangleAnnotationButton");
	public static final By polygoneannotationIcon = By.cssSelector("img.polygonAnnotationButton");
	public static final By freehandannotationIcon = By.cssSelector("img.freehandAnnotationButton");
	public static final By stumpannotationIcon = By.cssSelector("img.stampAnnotationButton");
	public static final By polylineannotationIcon = By.cssSelector("img.polylineAnnotationButton");
	public static final By freetextannotationIcon = By.cssSelector("img.freetextAnnotationButton");
	public static final By drawLocationPath = By.xpath("//div[@class='DocSplitter']");
	public static final By annotationExplorerButton = By.xpath("//img[contains(@title,'d'annotation')]");
	public static final By annotationExplorerButtonFull = By.cssSelector("img.annotationExplorerButtonFull");
	public static final By styleBarre = By.xpath("//table[@class='gwt-RichTextToolbar']");
	public static final By infoButton = By.cssSelector("img.infosButton");
	public static final By deleteAnnotation = By.cssSelector("img.dropAnnotationButton");
	public static final By Urgentbutton = By.xpath("//table[@class='stampPanel-content']//div[contains(text(),'Urgent')]");
	public static final By approvedbutton = By.xpath("//*[contains(text(), 'Approved on')]");
	public static final By draftButton = By.xpath("//div[contains(text(),'Draft')]");
	public static final By signatureButton = By.cssSelector("img.imageStampView");
	public static final By tamponpersoField = By.xpath("//input[@class='gwt-TextBox']");
	public static final By tamponpersoButton= By.xpath("//div[contains(text(),'Glade With ARender')]");
	public static final By dropAnnotationReply = By.cssSelector("img.dropAnnotationReply");
	public static final By cancelAnnotationButton = By.cssSelector("img.cancelChangesButton");
	public static final By ellipse = By.xpath("//body[@class='portrait dragdrop-dropTarget dragdrop-boundary']"
			+ "/div/div/div/div/div/div/div[@id='mainScreenSplitDisplay']/div[@id='embeddedScreenSplitView']/div/div/div/div[@class='DocSplitter']/div/div[@id='ViewPort1']/div/div[@class='scrolldocumentview']/div/div[@id='ScrollDocumentView1']/div[@class='PageView dragdrop-dropTarget dragdrop-boundary']/div[1]//*[local-name()='svg']//*[name()='ellipse'][1]");
	public static final By rectDisplay = By.xpath("//*[name()='rect' and contains(@fill,'#EAF39C')]");
	public static final By annotationpathFills = By.xpath("//*[name()='path' and contains(@stroke,'#2A4869')]");
	public static final By pathFillsNone = By.xpath("//*[name()='rect' and contains(@style,'display: none;')]");
	public static final By ellipsesNone = By.xpath("//*[name()='ellipse' and contains(@style,'display: none;')]");
	public static final By annatoationPath = By.xpath("//*[@id=\"ScrollDocumentView1\"]/div[4]/div[1]/svg/path");
	public static final By hideAnnotation = By.cssSelector("img.hideAnnotationButton");
	public static final By showAnnotation = By.cssSelector("img.showAnnotationButton");
	public static final By annotationBarView = By.className("annotationBarView-creatorLabel");
	public static final By sadEmptyIcon = By.cssSelector("img.sadEmptyIcon");
	public static final By mesureArrow = By.xpath("//*[contains(text(), '56926.48le')]");
	/**
	 * 
	 * {@value= Print locator }    
	 * 
	 */	
	public static final By printBtn = By.cssSelector("img.printButton");
	public static final By printallfiles = By.id("gwt-uid-4");
	public static final By printoncefile = By.id("gwt-uid-2");
	public static final By printWithAnno = By.id("gwt-uid-5");
	public static final By printConfirmButon = By.xpath("//div[contains(text(),'OK')]");
	public static final By printIconButon = By.id("print");
	/**
	 * 
	 * {@value= Zoom locator }
	 * 
	 */	
	public static final By zoomOutButton = By.cssSelector("img.zoomOutButton");
	public static final By zoomInButton = By.cssSelector("img.zoomInButton");
	public static final By zoomBox = By.xpath("//input[@class='gwt-TextBox zoomBox']");
	public static final By zoomInZoneButton = By.cssSelector("img.zoomInZoneButton");
	public static final By FullWidthButton = By.cssSelector("img.zoomFullWidthButton");
	public static final By FullHeightButton = By.cssSelector("img.zoomFullHeightButton");	
	public static final By FullPageButton = By.cssSelector("img.zoomFullPageButton");
	
    /**
     * 
     * {@value= Rotation locator }
     * 
     */	
     public static final By turnLeft = By.cssSelector("img.turnLeftButton");
     public static final By turnRight = By.cssSelector("img.turnRightButton");
     /**
      * {@value= search locator }
      * 
      */
     public static final By searchReposotor = By.cssSelector("img.advancedSearchExplorerButton");
     public static final By search = By.className("advancedSearchBox");
     public static final By searchResult = By.xpath("//div[@class='search-result']");
     public static final By searchButton = By.xpath("//body[@class='portrait dragdrop-dropTarget dragdrop-boundary']/div/div/div/div/div/div/div[@id='mainScreenSplitDisplay']/div[@id='embeddedScreenSplitView']/div/div/div/div[@class='gwt-TabLayoutPanel']/div/div[@class='gwt-TabLayoutPanelContentContainer']/div/div[@class='documentExplorerTab gwt-TabLayoutPanelContent']/div/table[@class='advancedSearchOptions-container']/tbody/tr/td/table/tbody/tr/td[2]/div[1]");
     /**
      * 
      * {@value = Navigation barre locator}
      * 
      */
     public static final By navigationTextBox = By.className("PageNavigationPanelTextBox");
 	 public static final By nextButton = By.cssSelector("img.nextButton");
 	 public static final By prevButton = By.cssSelector("img.prevButton");	
 	 public static final By firstPageButton = By.cssSelector("img.firstPageButton");
     public static final By lastPageButton = By.cssSelector("img.lastPageButton");
     public static final By nodeContent = By.className("NodeContent");
     public static final By docSelect = By.xpath("//*[name()='div' and contains(@class,'documentexplorer_treeview_thumbview documentexplorer_treeview_thumbview-odd documentexplorer_treeview_thumbview-selected')]");
     /**
      * 
      * {@value = Filtre locator}
      * 
      */
     public static final By commentExplorer = By.cssSelector("img.annotationExplorerButtonFull");
 	 public static final By filterIcon = By.cssSelector("img.filterIcon");	
 	 public static final By filtrePannel = By.className("filterOptions");
     public static final By selectFiltreAnnotationOption = By.xpath("//tr[5]//td[2]//select[1]");
     public static final By filtreValidate = By.className("buttonSample");
     public static final By filtreReset = By.className("filterReset");
     public static final By switchButtonContainer = By.className("switchButton-container");
     public static final By sortIcon = By.cssSelector("img.sortIcon");
     public static final By sortAscending = By.className("sortAscendingArrowIconSelected");
     public static final By sortDescending = By.className("sortDescendingArrowIconSelected");
     public static final By sortDateAscending = By.className("sortAscendingArrowIcon");
     public static final By sortDateDescending = By.className("sortDescendingArrowIconSelected");
     public static final By commentContentPanel = By.className("comment-contentPanel");
     public static final By commentCircleIcon = By.xpath("//img[@class='gwt-Image comment-annotationTypeImage circleIcon']");
     public static final By commentSquareIcon = By.xpath("//img[@class='gwt-Image comment-annotationTypeImage squareIcon']");
     /**
      * 
      * {@value = opacity locator}
      * 
      */
     public static final By imageProcessin = By.cssSelector("img.imageProcessingButton");	
 	 public static final By contrastButton = By.xpath("//tr[1]//td[1]//table[1]//tbody[1]//tr[1]//td[1]//table[1]//tbody[1]"
 			+ "//tr[2]//td[1]//table[1]//tbody[1]//tr[1]//td[2]//div[1]//div[1]//div[1]");
 	 public static final By brightnessButton = By.xpath("//tr[2]//td[1]//table[1]//tbody[1]//tr[1]//td[1]//table[1]//tbody[1]"
 			+ "//tr[2]//td[1]//table[1]//tbody[1]//tr[1]//td[2]//div[1]//div[1]//div[1]");	
 	 public static final By brightnessResultPath =By.xpath("//*[name()='img' and contains(@style,'filter: brightness(200%)')]");
   	 public static final By contrastResultPath =By.xpath("//*[name()='img' and contains(@style,'filter: contrast(200%)')]");
   	 public static final By slider = By.className("TopPanel-Slider-pointer");
   	 
   	 /**
   	  * {@value = ContextClick locator}
   	  */
   	public static final By contextList = By.id("ContextualMenuView");
   	public static final By contextSurligner = By.xpath("//div[contains(text(),'Surligner le texte')]"); 
   	public static final By contextBarré = By.xpath("//div[contains(text(),'Barré')]");
   	public static final By contextSouligné = By.xpath("//div[contains(text(),'Souligné')]");
   	public static final By contextSupprimer = By.xpath("//div[contains(text(),'Supprimer le surlignage')]");
   	public static final By contextSurlignerZone = By.xpath("//div[contains(text(),'Surligner une zone')]");
   	public static final By contextAddCercle = By.xpath("//div[contains(text(),'Ajouter un cercle')]");
   	public static final By contextAddflèche = By.xpath("//div[contains(text(),'Ajouter une flèche')]");
   	public static final By contextAddStickynote = By.xpath("//div[contains(text(),'Ajouter une note textuelle')]");
   	public static final By contextLink = By.xpath("//div[contains(text(),'Créer un lien')]");
 	public static final By contextAncre = By.xpath("//div[contains(text(),'Créer une ancre à cette page')]");
 	public static final By contextCopy = By.xpath("//div[contains(text(),'Copier (texte sélectionné)')]");
 	
    /**
     * 
     * {@value = Filnet locator}
     * 
     */
     public static final By userNameFilenet = By.id("ecm_widget_layout_NavigatorMainLayout_0_LoginPane_username");
     public static final By passeWordFilenet = By.id("ecm_widget_layout_NavigatorMainLayout_0_LoginPane_password");
     public static final By loginButtonFilenet = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]");
     public static final By filesStoreFilenet = By.cssSelector("img.dijitIconFolderClosed");
     public static final By PPTfilesFilenet = By.xpath("//td[contains(@class,'gridxCell gridxCellFocus')]");
     public static final By  PdfFilnet = By.xpath("//td[contains(text(),'arender-en-2021pdf')]");

     
     /**
      * 
      * {@value = Nuxeo locator}
      * 
      */
     public static final By userNameNuxeo = By.id("username");
     public static final By passeWordNuxeo = By.id("password");
     public static final By loginButtonNuxeo = By.className("login_button");
     public static final By rippleButton = By.id("ink");
     public static final By text = By.xpath("/html/body/div[3]/div[2]/div/div[2]/table/tbody/tr/td[7]/div/img");   
     public static final By zoom =By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[14]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/img[1]");
 	 public static final By circleAnnotationRepeatButton = By.cssSelector("img.circleAnnotationRepeatButton");
	 public static final By ArrowannotationIconNuxio = By.cssSelector("img.arrowAnnotationRepeatButton");
	 public static final By delete = By.cssSelector("img.comment-removeImage");
	 public static final By strikethroughAnnotationButton = By.cssSelector("img.strikethroughAnnotationButton");
	 public static final By highlightAnnotationButton = By.cssSelector("img.highlightAnnotationButton");
	 public static final By rectangleAnnotationRepeatButton = By.cssSelector("img.rectangleAnnotationRepeatButton");
	 public static final By freehandAnnotationRepeatButton = By.cssSelector("img.freehandAnnotationRepeatButton");
	 public static final By commentContentView = By.cssSelector("img.comment-contentView");
	 public static final By StamList = By.className("stampAnnotation");
	 /**
      * 
      * {@value = Alfresco locator}
      * 
      */
	 public static final By userNameAlfresco = By.name("username");
     public static final By passeWordAlfresco = By.name("password");
     public static final By loginButtonAlfresco = By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button");
     public static final By dossier = By.xpath("//a[contains(text(),'Najm')]");
     public static final By File = By.xpath("//a[contains(text(),'Baujagd.pdf')]");
     
     /**
      * 
      * {@value = AXA locator}
      * 
      */

     
     
     
     /**
      * 
      * {@value = Style}
      * 
      */
public static final By resizerButton = By.cssSelector("img.resizerButton");
public static final By boldButton = By.cssSelector("img.boldButton");
public static final By italicButton = By.cssSelector("img.italicButton");
public static final By underlineButton = By.cssSelector("img.underlineButton");
public static final By policeListBox = By.xpath("//td[6]//select[1]");
public static final By tailleListBox = By.xpath("//td[7]//select[1]");
public static final By foreColorsButton = By.cssSelector("img.foreColorsButton");
public static final By backColorsButton = By.cssSelector("img.backColorsButton");
public static final By increaseBorderWidthButton = By.cssSelector("img.increaseBorderWidthButton");
public static final By decreaseBorderWidthButton = By.cssSelector("img.decreaseBorderWidthButton");
public static final By borderColorsButton =  By.cssSelector("img.borderColorsButton");
public static final By opacityCursorSliderBar = By.xpath("//table[@class='gwt-CursorSliderBar']");
public static final By infosButton = By.cssSelector("img.infosButton");
public static final By cancelChangesButton = By.cssSelector("img.cancelChangesButton");
public static final By BlueColorButton = By.xpath("/html[1]/body[1]/div[11]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[6]/td[8]/div[1]");
public static final By RedColorButton = By.xpath("//body[@class='portrait dragdrop-dropTarget dragdrop-boundary']/div[@class='gwt-DialogBox']/div/table/tbody/tr[@class='dialogMiddle']/td[@class='dialogMiddleCenter']/div[@class='dialogMiddleCenterInner dialogContent']/table/tbody/tr/td/table[@class='gwt-ColorPickerPopup']/tbody/tr[6]/td[3]/div[1]");
public static final By GreenColorButton = By.xpath("//tr[6]//td[6]//div[1]//input[1]");
public static final By StylesbordureButton = By.xpath("//td[17]//select[1]");
public static final By changeHeadStyleButton = By.cssSelector("img.changeHeadStyleButton");
public static final By changeTailStyleButton = By.cssSelector("img.changeTailStyleButton");
public static final By increaseArrowLineWidthButton = By.cssSelector("img.increaseArrowLineWidthButton");
public static final By decreaseArrowLineWidthButton = By.cssSelector("img.decreaseArrowLineWidthButton");
public static final By StickyeannotationIconTest = By.cssSelector("img.addAnnotationButton");
public static final By SliderBarViewIcon = By.className("gwt-SliderBarView");
public static final By ditanceTextBox = By.xpath("//input[@placeholder='1']");
public static final By selectTypeBox = By.xpath("//select[@class='gwt-ListBox visible-font transparent-list']");


public static final By headArrowButton = By.cssSelector("img.changeHeadStyleButton");
public static final By tealArrowButton = By.cssSelector("img.changeTailStyleButton");
public static final By arrowSquareButton = By.cssSelector("img.squareStyleButton");
public static final By arrowCircleButton = By.cssSelector("img.circleStyleButton");
public static final By arrowButtButton = By.cssSelector("img.buttStyleButton");
public static final By arrowDiamondButton = By.cssSelector("img.diamondStyleButton");
public static final By openArrowButton = By.cssSelector("img.openArrowStyleButton");
public static final By rOpenArrowButton = By.cssSelector("img.rOpenArrowStyleButton");
public static final By closeArrowButton = By.cssSelector("img.closedArrowStyleButton");
public static final By rCloseArrowButton = By.cssSelector("img.rClosedArrowStyleButton");
public static final By noneArrowButton = By.cssSelector("img.noneStyleButton");

/**
 * 
 * {@value = ANCRE}
 * 
 */

public static final By bookmarkExplorerButton = By.cssSelector("img.bookmarkExplorerButton");
public static final By addBookmark = By.cssSelector("img.addBookmark");
public static final By deleteBookmark = By.cssSelector("img.deleteBookmark");
public static final By insertBookmarkText = By.xpath("//input[@placeholder='Insérer le titre du signet']");
public static final By bookmarkDisplay = By.cssSelector("#treeItem-label-57359a0c-bc82-4f7f-819c-34a52fd5881a");
public static final By bookmarkDisplayed = By.xpath("//*[contains(text(), 'ARENDER ANCRE TEST')]");
public static final By treeItems = By.className("treeItem");

}
 












