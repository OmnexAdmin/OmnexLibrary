package TestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonMethods.ProjectMethods;
import suitePages.LoginPage;

public class DocProBasicFunctionality extends ProjectMethods {

	@BeforeClass
	public void setData() {
		
		System.out.println("before class1");
		
		excelName = "DocProTestData";
		dataSheetName="TC006to23";
		test = startTestCase("SmokeTest_Suite", "DocPro Basic Functionality(17TCs)");
		category= "Smoke";
		authors	="Bhuvana";
		browserName ="chrome";
		
	}

	@Test(dataProvider="fetchData")
	
	
	public void createParentLevels(String TestcaseNumber,String Runmode,String Scenario, String userName, String passWord,String levelName,String prefix,String reviewDue,String searchCriteria,String subLevelName,String subPrefix,String subReviewDue,String documentNumber,String documentName,String attachment,String code,String groupName,String draftComments, String reasonForRequest,String changesRequired, String revision, String docOwner,String routeName,String routedesc,String minNumofApproversReqd, String position,String approverPwd,
			  String newApproverPwd, String confirmApproverPwd,String existingDocRouteName) throws Throwable {
		
		
		
		
		
		testCaseName = Scenario;
		testDescription =TestcaseNumber;
	
		test = startTestCase(testCaseName, testDescription);

		
	
		//if(!Runmode.contains("Y")) {
		if(Runmode.contains("N")) {	
		throw new SkipException("Run mode set as No");
		}

		
		  if(TestcaseNumber.contains("TC015")|| TestcaseNumber.contains("TC0021")) {
			  new LoginPage(driver,test) 
			  .moduleLandingPageLogin(userName, passWord)
		      .clickonDocumentstab() 
		      .clickOnDocumentsMenu() 
		      .reviseDocument(levelName,documentNumber, attachment, reasonForRequest, changesRequired); }
		 
		
		
		switch(TestcaseNumber) {
		
		

		case"TC006":


			new LoginPage(driver,test)
			.login(userName, passWord)
			.clickOnLevelsMenu()
			.createParentLevels(levelName, prefix, reviewDue);
			break;

		case"TC007":


			new LoginPage(driver,test)
			.login(userName, passWord)
			.clickOnLevelsMenu()
			.createSubLevels(searchCriteria, levelName,subLevelName, subPrefix, subReviewDue);
			break;

		case "TC008":


			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnFolderManagement() 
			.inUseFolder(searchCriteria);
			break;


		case "TC009":


			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnGroupsMenu()
			.createGroup(groupName, code);
			break;


		case "TC010":


			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnFolderManagement() 
			.setFolderRights(searchCriteria,groupName);
			break;


		case "TC011":


			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickonDocumentstab()
			.clickonNewDocumentRequestmenu()
			.uploadNewDocument(searchCriteria,documentNumber,documentName,attachment);
			break;

		case "TC012":


			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickonDocumentstab()
			.clickOnNewDocDraftmenu()
			.uploadNewDraft(searchCriteria,documentNumber,documentName,attachment,code) ;
			break;

		case "TC013":
			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickonDocumentstab()
			.clickOnActionsMenu()
			.draftRequestsNeedingViewing(documentName, attachment, draftComments);
			break;

		case "TC014":
			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickonDocumentstab()
			.clickOnActionsMenu()
			.pendingDocumentDrafts(documentName, attachment, reasonForRequest, changesRequired);
			break;
			
		
			
		/*
		 * case "TC015": new LoginPage(driver,test) .moduleLandingPageLogin(userName,
		 * passWord) .clickonDocumentstab() .clickOnDocumentsMenu()
		 * .reviseDocument(levelName, documentNumber, attachment, reasonForRequest,
		 * changesRequired); break;
		 */
			
		case "TC016":
			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickonDocumentstab()
			.clickOnDocumentsMenu()
			.validateDocISRevised(levelName, documentNumber, documentName, revision, docOwner);	
			break;
			
		case "TC017":
			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickonDocumentstab()
			.clickOnDocumentsMenu()
			.deleteDocument(levelName, documentNumber, reasonForRequest, changesRequired);
			break;
			
		case "TC018":
			new LoginPage(driver, test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnRoutesMenu()
			.createRoute(routeName, routedesc, code,minNumofApproversReqd, position);
			break;
			
		case "TC019":
			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnFolderManagement()
			.setRoute(searchCriteria, routeName,existingDocRouteName);
			break;
			
		
		  case "TC020":
		  
		  new LoginPage(driver,test)
		  .moduleLandingPageLogin(userName, passWord)
		  .clickOnDocProSettingsMenu() 
		  .disable2ndPwd();
		  break;
		  
		/*
		 * case "TC021":
		 * 
		 * new LoginPage(driver,test) .moduleLandingPageLogin(userName, passWord)
		 * .clickonDocumentstab() .clickOnDocumentsMenu()
		 * .reviseDocument(levelName,documentNumber, attachment, reasonForRequest,
		 * changesRequired); break;
		 */
		  
		  
		  
		  case "TC022":
		  
		  new LoginPage(driver,test) .moduleLandingPageLogin(userName, passWord)
		  .clickOnActionsMenu() .requestsNeedingApproval(documentName, approverPwd,
		  newApproverPwd, confirmApproverPwd); break;
		  
		  case "TC023":
		  
		  new LoginPage(driver,test) .moduleLandingPageLogin(userName,passWord)
		  .clickonDocumentstab() .clickOnDocumentsMenu()
		  .validateDocISRevised(levelName, documentNumber, documentName,
		  revision,docOwner); break;
		  
		  
		 		default:
			break;



		}

	}


}
