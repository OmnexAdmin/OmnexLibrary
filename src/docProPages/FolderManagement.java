package docProPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import CommonMethods.ProjectMethods;

public class FolderManagement extends ProjectMethods {

	
	@FindBy(how=How.ID,using="txtSearchTree_TOCDoclvl")
	private WebElement  eleEnterSearchCriteria;
	
	@FindBy(how=How.ID,using="dpSearch'")
	private WebElement  eleClickOnSearch;
	
	
	//@FindBy(how=How.XPATH,using="//span[text()='01.QCL']")
	//private WebElement eleClickOnLevel;
	
	@FindBy(how=How.ID,using="chkInUse")
	private WebElement  eleClickOnInUse;
	

	@FindBy(how=How.XPATH,using="//iframe[@id='iframeTree']")
	private WebElement eleRHSFrame;
	
	
	@FindBy(how=How.XPATH,using="//iframe[@id='Detailview']")
	private static WebElement  eleLHSFrame;
	
	/*
	 * @FindBy(how=How.ID,using="drpDocNumOpt") private WebElement
	 * eleSelectDocNumOption;
	 */
	

	
	
	@FindBy(how=How.ID,using="drpDocNumOpt_chzn_o_1")
	private static WebElement  eleClickOnDocNumAutoInc;
	

	@FindBy(how=How.ID,using="drpDocNumOpt_chzn")
	private WebElement eleClickOnDocNumOptionDropdown;
	
	

	@FindBy(how=How.ID,using="txtAutoDocNumStart")
	private WebElement eleEnterStartingDocNum;
	
	
	@FindBy(how=How.ID,using="txtAutoDocNumUnit")
	private WebElement eleEnterIncUnitofDocNum;
	
	@FindBy(how=How.XPATH,using="//span[text()='OK']")
	private WebElement eleClickOnOkButtoninDocNumPopup;
	
	
	@FindBy(how=How.ID,using="drpDocNumOpt_chzn_o_2")
	private WebElement eleClickUseInternalidasDocNUMOption;
	
	@FindBy(how=How.XPATH,using="//span[text()='DocPro automatically increments by 1']")
	private WebElement eleSelectRevisionNumberOption;
	
	@FindBy(how=How.ID,using="drpRevOpt_chzn_o_2")
	private WebElement eleSelectCustomRevision;

	@FindBy(how=How.ID,using="drpRevOpt_chzn_o_0")
	private WebElement eleClickOnUserDefinedRev;
	
	@FindBy(how=How.ID,using="drpRevSegOptions")
	private WebElement eleClickOnNumOfSegDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id='drpRevSegOptions']//following::option[1]")
	private WebElement eleClickSeg1;
	
	@FindBy(how=How.ID,using="drpRevSegMajor")
	private WebElement eleSelectMajorRevision;
	
	@FindBy(how=How.XPATH,using="//option[text()='A']")
	private WebElement eleSelectAasMajorRevision;
	
	@FindBy(how=How.ID,using="drpRevSegMinor")
	private WebElement eleSelectMinorRevision;
	
	@FindBy(how=How.XPATH,using="(//option[text()='I'])[2]")
	private WebElement eleSelectIasMinorRevision;
	
	@FindBy(how=How.XPATH,using="//span[text()='OK']")
	private WebElement eleclickOKtoCusRevPopup;
	

	@FindBy(how=How.ID,using="popup_ok")
	private WebElement eleclickOktoAlertMessage;

	@FindBy(how=How.ID,using="chkRevByInherit")
	private WebElement eleClickonInheritfromParentCheckbox;
	
	
	@FindBy(how=How.ID,using="drpRevDateOpt_chzn")
	private WebElement eleClickOnRevDateOptionDropdown;
	
	
	@FindBy(how=How.ID,using="drpRevDateOpt_chzn_o_1")
	private WebElement eleClickOnUserIPDate;
	
	
	
	@FindBy(how=How.ID,using="btnSave")
	private WebElement  eleClickOnSavetoActivateFolder;
	
	
	@FindBy(how=How.ID,using="aSiterights")
	private WebElement  eleClickOnAccessforSites;
	
	
	@FindBy(how=How.XPATH,using="//td[@aria-describedby='DPLevelgrid_noaccess']/input")
	private WebElement  eleCLickOnNoAccessForFolder;
	
	
	@FindBy(how=How.XPATH,using="//td[@aria-describedby='DPLevelgrid_noaccess_Doc']/input")
	private WebElement  eleCLickOnNoAccessForDocument;
	
	@FindBy(how=How.ID,using="aGrouprights")
	private WebElement  eleClickOnAccessforGroups;
	
	
	@FindBy(how=How.XPATH,using="//td[@aria-describedby='DPLevelgrid_Inherit']/input")
	private WebElement  eleUncheckInheritOptionForFolder;
	
	
	@FindBy(how=How.XPATH,using="//td[@aria-describedby='DPLevelgrid_Attachright']/input")
	private WebElement  eleClickOnAttachRightForFolder;
	

	@FindBy(how=How.ID,using="aEditRoute")
	private WebElement  eleClickOnEditRouteOptionLink;
	
	@FindBy(how=How.XPATH,using="//iframe[@id='iframeActions_top']")
	private WebElement eleRouteFrame1;
	
	@FindBy(how=How.XPATH,using="//div[@id='tddrpdownNewRoute_chzn']")
	private WebElement  eleClickOnRouteDropdownforNew;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='tddrpdownNewRoute_chzn']/div/div/input")
	private WebElement eleClickOnRouteDropdownForNew1;
	
	@FindBy(how=How.XPATH,using="//div[@id='tddrpdownExistingRoute_chzn']")
	private WebElement  eleClickOnRouteDropdownforExisting;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='tddrpdownExistingRoute_chzn']/div/div/input")
	private WebElement eleClickOnRouteDropdownForExisting1;
	
	
	@FindBy(how=How.XPATH,using="//iframe[@id='iframeRoutes']")
	private WebElement eleRouteFrame2;
	
	@FindBy(how=How.XPATH,using="//iframe[@id='iframediv']")
	private WebElement eleRouteFrame3;
	
	@FindBy(how=How.XPATH,using="//iframe[@id='iframeRoute']")
	private WebElement eleRouteFrame4;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='resetlevel']")
	private WebElement eleCheckResetDocumentRouting;
	
	@FindBy(how=How.XPATH,using="//input[@id='resetsublevel']")
	private WebElement eleCheckResetSubLevelRouting;
	
	public FolderManagement(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		
		}
	
	
	public void clickOnSearchicon() {
		
		click(eleClickOnSearch,"Clicked on search icon");
		}
	
	public void switchToRHSFrame() {
		
		switchToFrame(eleRHSFrame);
	}
	
    public  void switchToLHSFrame() {
		
		switchToFrame(eleLHSFrame);
	}
	

   public void docAutoIncrement(String startingNumber,String incrementalUnit) {
	
	click(eleClickOnDocNumOptionDropdown, "Document Number option Dropdown");
	click(eleClickOnDocNumAutoInc,"Document Number Auto Increment option");
	//switchToFrame(eleRHSFrame);
	type(eleEnterStartingDocNum,startingNumber);
	type(eleEnterIncUnitofDocNum,incrementalUnit);
	click(eleClickOnOkButtoninDocNumPopup, "Ok Button in Doc Num Option Popup");
	
    }

   public void useInternalIDasDocNum() {
	
	click(eleClickOnDocNumOptionDropdown, "Document Number option Dropdown");
	click(eleClickUseInternalidasDocNUMOption,"Use Internal id as Doc NUM Option");

   }

   public void customRevwith2Seg() {
	
//Set Revision number as custom revision with 2 segments (A.I)

		click(eleSelectRevisionNumberOption,"Revision Number Option");
		click(eleSelectCustomRevision,"Custom Revision Option");
		click(eleSelectMajorRevision,"Major revision");
		click(eleSelectAasMajorRevision,"A as Major revision");
		click(eleSelectMinorRevision," Minor revision");
		click(eleSelectIasMinorRevision,"I as Major revision");
		click(eleclickOKtoCusRevPopup,"Ok button");

   }
   
   public void customRevwith1Seg() {
	 //Set Revision number as custom revision with 1 segment A
		
	   click(eleSelectRevisionNumberOption,"Revision Number Option");
	   click(eleSelectCustomRevision,"Custom Revision Option");
	   click(eleClickOnNumOfSegDropdown, "Number of Segments Dropdown");
	   click(eleClickSeg1, "Number of Segments:1");
	   click(eleSelectMajorRevision,"Major revision");
	   click(eleSelectAasMajorRevision,"A as Major revision");
	   click(eleclickOKtoCusRevPopup,"Ok button");
	   }
		

   public void userDefinedRev() {
	
		//Set Revision number as User Defined Revision
		
		click(eleSelectRevisionNumberOption,"Revision Number Option");
		click(eleClickOnUserDefinedRev,"User defined Revision Option");
   }

		
	public void inheritFromParentRevNum(){	
		//Set Revision number as Inherit from parent
		
		//verifySelected(eleClickonInheritfromParentCheckbox);
		click(eleClickonInheritfromParentCheckbox, "Rev number as Inherit from parent");
	}
	
	public void userIPDate() {
		
	
		//Set Revision date option as User input date
		click(eleClickOnRevDateOptionDropdown, "Revision Date Option dropdown");
		click(eleClickOnUserIPDate, "User Input Date option");
	}	
		




	public FolderManagement inUseFolder(String searchCriteria) throws Throwable {
		Thread.sleep(10000);
		
		switchToLHSFrame();
		
		type(eleEnterSearchCriteria, searchCriteria);
		clickOnSearchicon();
		WebElement eleClickOnLevel=driver.findElementByXPath("//span[text()='"+searchCriteria+"']");
		click(eleClickOnLevel, "Level");
		switchToRHSFrame();
		Thread.sleep(5000);
		click(eleClickOnInUse,"In-use Checkbox");
		
		//Set Revision number as custom revision with 2 segments (A.I)
	
		click(eleSelectRevisionNumberOption,"Revision Number Option");
		click(eleSelectCustomRevision,"Custom Revision Option");
		click(eleSelectMajorRevision,"Major revision");
		click(eleSelectAasMajorRevision,"A as Major revision");
		click(eleSelectMinorRevision," Minor revision");
		click(eleSelectIasMinorRevision,"I as Major revision");
		click(eleclickOKtoCusRevPopup,"Ok button");
		click(eleClickOnSavetoActivateFolder,"Save button");
		click(eleclickOktoAlertMessage,"Ok button");
		
		return this;
	}
	
	public FolderManagement setFolderRights(String searchCriteria,String groupName) throws Throwable {
		
		//Access for sites
		
		switchToLHSFrame();
		Thread.sleep(5000);
		type(eleEnterSearchCriteria, searchCriteria);
		clickOnSearchicon();
		WebElement eleClickOnLevel=driver.findElementByXPath("//span[text()='"+searchCriteria+"']");
		rightClickAction(eleClickOnLevel);
		//Access for sites
		click(eleClickOnAccessforSites,"Access for sites");
		switchToRHSFrame();
		Thread.sleep(5000);
		click(eleCLickOnNoAccessForFolder,"No access to the folder for sites");
		click(eleCLickOnNoAccessForDocument,"No access to the document for sites");
		//Access for Groups
		//Thread.sleep(5000);
		driver.switchTo().defaultContent();
		switchToLHSFrame();
		Thread.sleep(3000);
		//WebElement eleClickOnLevel1=driver.findElementByXPath("//span[text()='"+searchCriteria+"']");
		click(eleClickOnLevel,"Level");
		rightClickAction(eleClickOnLevel);
		click(eleClickOnAccessforGroups,"Access for groups");
		switchToRHSFrame();
		Thread.sleep(10000);
		WebElement eleUncheckGroupInheritforNewdocCreation=driver.findElementByXPath("//td[text()='"+groupName+"']//following::td[1]");
		click(eleUncheckGroupInheritforNewdocCreation,"Uncheck site inherit for the group");
		
		WebElement eleCheckAttachRightsforNewdocCreation=driver.findElementByXPath("//td[text()='"+groupName+"']//following::td[3]");
		click(eleCheckAttachRightsforNewdocCreation,"Set Attach rights to the folder for groups");
		
		WebElement eleUncheckGroupInheritforNewdocAccess=driver.findElementByXPath("//td[text()='"+groupName+"']//following::td[6]");
		click(eleUncheckGroupInheritforNewdocAccess,"Uncheck  site inherit for the group");
		
		WebElement eleCheckAttachRightsforNewdocAccess=driver.findElementByXPath("//td[text()='"+groupName+"']//following::td[8]");
		click(eleCheckAttachRightsforNewdocAccess,"Set Attach rights to the folder for groups");
		
		
		
		
		return this;
	}
	
	public FolderManagement setRoute(String searchCriteria,String routeName,String existingDocRouteName) throws Throwable {
		
		switchToLHSFrame();
		Thread.sleep(5000);
		type(eleEnterSearchCriteria, searchCriteria);
		clickOnSearchicon();
		Thread.sleep(5000);
		WebElement eleClickOnLevel=driver.findElementByXPath("//span[text()='"+searchCriteria+"']");
		Thread.sleep(2000);
		click(eleClickOnLevel, "Level");
		switchToRHSFrame();
		Thread.sleep(5000);
		click(eleClickOnEditRouteOptionLink, "Edit Route Options Link");
		//System.out.println("The number of frames in this pages is"+driver.findElements(By.xpath("//iframe")).size());
		//String currentFrameName1 = (String)((JavascriptExecutor) driver).executeScript("return window.frameElement.name");
		//System.out.println(currentFrameName1);
		//switchToFrame(eleRouteFrame1);
		Thread.sleep(5000);
		
		//sSystem.out.println("F1");
		switchToFrame(eleRouteFrame2);
		Thread.sleep(5000);
		
		System.out.println("F2");
		//switchToFrame(eleRouteFrame3);
		//Thread.sleep(5000);
		//System.out.println("F3");
		
		switchToFrame(eleRouteFrame4);
		System.out.println("F4");
	
		Thread.sleep(10000);
		
		
		
		 //Set Route for New document
		 click(eleClickOnRouteDropdownforNew,"Route Dropdown for New document");
		 click(eleClickOnRouteDropdownForNew1, "Route dropdown for New Document");
		 type(eleClickOnRouteDropdownForNew1, routeName);
		 pressEnterKey(eleClickOnRouteDropdownForNew1);
		 
		//Set Route for Existing document
		
		click(eleClickOnRouteDropdownforExisting,"Route Dropdown for Existing document");
		click(eleClickOnRouteDropdownForExisting1, "Route dropdown for Existing Document");
		type(eleClickOnRouteDropdownForExisting1, existingDocRouteName);
		pressEnterKey(eleClickOnRouteDropdownForExisting1);
		
		//Reset doc and sub level routing
		
		click(eleCheckResetDocumentRouting, "Reset Document Routing checkox");
		click(eleclickOktoAlertMessage, "Ok button");
		
		click(eleCheckResetSubLevelRouting, "Reset SubLevel Routing checkox");
		click(eleclickOktoAlertMessage, "Ok button");
		
		return this;
	}
	
	
	
public FolderManagement setRouteforPrerequsitedataLevels(String routeName,String existingDocRouteName) throws Throwable {
		
	
		click(eleClickOnEditRouteOptionLink, "Edit Route Options Link");
		switchToFrame(eleRouteFrame2);
		Thread.sleep(3000);
		switchToFrame(eleRouteFrame4);
		//Thread.sleep(3000);
		
		//Set Route for New document
		
		click(eleClickOnRouteDropdownforNew,"Route Dropdown for New document");
		 click(eleClickOnRouteDropdownForNew1, "Route dropdown for New Document");
		 type(eleClickOnRouteDropdownForNew1, routeName);
		 pressEnterKey(eleClickOnRouteDropdownForNew1);
		 
		//Set Route for Existing document
		
		click(eleClickOnRouteDropdownforExisting,"Route Dropdown for Existing document");
		click(eleClickOnRouteDropdownForExisting1, "Route dropdown for Existing Document");
		type(eleClickOnRouteDropdownForExisting1, existingDocRouteName);
		pressEnterKey(eleClickOnRouteDropdownForExisting1);
		
		//Reset doc and sub level routing
		
		click(eleCheckResetDocumentRouting, "Reset Document Routing checkox");
		click(eleclickOktoAlertMessage, "Ok button");
		
		click(eleCheckResetSubLevelRouting, "Reset SubLevel Routing checkox");
		click(eleclickOktoAlertMessage, "Ok button");
		
		return this;
	}
	
	
	public FolderManagement inUsepreRequsiteDataLevels(String searchCriteria,String startingNumber, String incrementalUnit,String routeName,String existingDocRouteName) throws Throwable {
	
		switchToLHSFrame();
		Thread.sleep(3000);
		type(eleEnterSearchCriteria, searchCriteria);
		clickOnSearchicon();
		WebElement eleClickOnLevel=driver.findElementByXPath("//span[text()='"+searchCriteria+"']");
		click(eleClickOnLevel, "Level");
		switchToRHSFrame();
		Thread.sleep(3000);
		click(eleClickOnInUse,"In-use Checkbox");
		switch(searchCriteria) {
		
		
			case "01.Quality Manual(R1)":
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
			
			
			case "02.Quality Policy(AbA)":
			
				docAutoIncrement(startingNumber, incrementalUnit);
				userDefinedRev();
				userIPDate();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
			 
			case "03.Finance Department(PbR)":
				
				useInternalIDasDocNum();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
				
			case  "3.A.i Transfer Requests":
				
				docAutoIncrement(startingNumber, incrementalUnit);
				inheritFromParentRevNum();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
                break;
				
			case "4.i Core Data Procedures":
				
				userIPDate();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
				
			case "4i.iEmployee Requisitions":
				
				docAutoIncrement(startingNumber, incrementalUnit);
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
				
			case "4i.iiW/C Off Work Status":
				
				docAutoIncrement(startingNumber, incrementalUnit);
				inheritFromParentRevNum();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
			
			case "5a.Consolidation/Closing of Facilities":
				
				customRevwith1Seg();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
			
			case "5b.Re-Draw Attendance Boundaries Work Instructions":
				
				docAutoIncrement(startingNumber, incrementalUnit);
				customRevwith2Seg();
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				setRouteforPrerequsitedataLevels(routeName,existingDocRouteName);
				break;
				
			default:
				
				/*By default: 
					1.Document Number option: User defined document number
					2.Revision number option: Doc pro automatically increments by 1
					3.Revision date option:   Last Approval date
					4.Inherit from parent route which is auto approval*/
				click(eleClickOnSavetoActivateFolder,"Save button");
				click(eleclickOktoAlertMessage,"Ok button");
				break;
				
		}
		//click(eleClickOnSavetoActivateFolder,"Save button");
		//click(eleclickOktoAlertMessage,"Ok button");
		return this;
		
	
	}
}

	//===========================================================
	/*By default: 
	1.Document Number option: User defined document number
	2.Revision number option: Doc pro automatically increments by 1
	3.Revision date option:   Last Approval date*/
	//===========================================================
	
	//Set Doc Number option as Auto Increment
	
	/*click(eleClickOnDocNumOptionDropdown, "Document Number option Dropdown");
	click(eleClickOnDocNumAutoInc,"Document Number Auto Increment option");
	//switchToFrame(eleRHSFrame);
	type(eleEnterStartingDocNum,"startingNumber");
	type(eleEnterIncUnitofDocNum, "incrementalUnit");
	click(eleClickOnOkButtoninDocNumPopup, "Ok Button in Doc Num Option Popup");
	//===========================================================
	
	//Set Doc Number option as Use Internal ID as doc number
	
	click(eleClickOnDocNumOptionDropdown, "Document Number option Dropdown");
	click(eleClickUseInternalidasDocNUMOption,"Use Internal id as Doc NUM Option");

	//===========================================================

	//===========================================================
	
	//Set Revision number as User Defined Revision
	
	click(eleSelectRevisionNumberOption,"Revision Number Option");
	click(eleClickOnUserDefinedRev,"User defined Revision Option");
	
	//=================================================================
	
	//Set Revision number as Inherit from parent
	
	verifySelected(eleClickonInheritfromParentCheckbox);
	click(eleClickonInheritfromParentCheckbox, "Rev number as Inherit from parent");
	
	//=================================================================
	
	//Set Revision date option as User input date
	click(eleClickOnRevDateOptionDropdown, "Revision Date Option dropdown");
	click(eleClickOnUserDefinedRev, "User defined revision option");
	
	//=================================================================
	*/
	
	

	

	
	
	

       