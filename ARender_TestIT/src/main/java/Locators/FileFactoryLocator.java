/**
 * 
 */
package Locators;

import org.openqa.selenium.By;

/**
 * @author ARIDHI HICHEM
 *
 */
public interface FileFactoryLocator {
	
	
	
	public static final By FileMenu = By.cssSelector("img.documentManagerButton");
	public static final By upLoadfileButton = By.cssSelector("img.fileUploadButton");
	public static final By PopupfileUpload = By.className("gwt-FileUpload");
	public static final By thumbimage = By.xpath("//img[@class='thumbimage']");
	public static final By fileContainer = By.className("thumbimage");
	public static final By csvButton = By.cssSelector("img.downloadAnnotationAsCSVButton");
	public static final By xfdfButton = By.cssSelector("img.downloadXFDFAnnotationsButton");
	public static final By fdfButton = By.cssSelector("img.downloadFDFAnnotationButton");
	public static final By withFdfButton = By.cssSelector("img.downloadAnnotationButton");
	public static final By pdfButton = By.cssSelector("img.downloadPDFButton");
	public static final By fileTitle = By.cssSelector("img.downloadPDFButton");
    public static final By subNum = By.className("thumblabel_container");
    public static final By ThumExplorerButton = By.cssSelector("img.thumbExplorerButton");


 //TODO STICKY NOTE RESULT 
    
    public static final By stkNoteState  =By.xpath("//select[@class='status']");
    public static final By AddReply  = By.className("add-reply");
    public static final By stkTextBox = By.className("postit-mainView");
    public static final By stkRemove = By.cssSelector("img.remove-image");
    public static final By stkNotePin = By.cssSelector("img.stickyNotePinButton");
	public static final By annotationViewIcon = By.cssSelector("img.annotationViewIcon");
	
 //TODO STICKY FREE TEXT RESULT
    
    public static final By resizeSquareIcon  =By.cssSelector("img.resizeSquareIcon");
    public static final By arrowCrossIcon  =By.cssSelector("img.arrowCrossIcon");   

//TODO CICRLE RESULT 
    
    public static final By ellipses = By.xpath("//*[name()='ellipse' and contains(@fill,'#EAF39C')]");
    public static final By resizePoint = By.xpath("//*[name()='div' and contains(@class,'WindowPanelDND-resize-edge WindowPanelDND-resize-se dragdrop-draggable dragdrop-handle')]");
    
  //TODO ARROW RESULT 
    
    public static final By arrowBar =   By.xpath("//*[name()='path' and contains(@stroke,'#2A4869')]");
    public static final By ArrowHead = By.xpath("//*[name()='path' and contains(@fill,'#2A4869')]");
    public static final By resizeArrow = By.xpath("//*[name()='circle' and contains(@fill,'red')]");
    
  //TODO UNDERLINE RESULT 
    
    public static final By underLineDisp = By.xpath("//*[name()='rect' and contains(@fill,'#EAF39C')]");
    
 //TODO UNDERLINE RESULT 
    
    public static final By stampList = By.xpath("//div[contains(text(),'Sélection du type de tampon')]");  
    public static final By urgentDisp = By.xpath("//div[contains(text(),'Urgent')]");  
	public static final By approvedDisp = By.xpath("//*[contains(text(), 'Approved on')]");
	public static final By draftDisp = By.xpath("//*[contains(text(), 'Draft')]");
	public static final By signatureDisp  =By.cssSelector("img.imageStampView"); 
	public static final By rotatePoint =By.className("WindowPanelDND-rotate");
	public static final By freeStampDisp = By.xpath("//*[contains(text(),'Glade With ARender')]");
	
	
	
  
}