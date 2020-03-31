package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonMethods.ProjectMethods;
import suitePages.LoginPage;

public class PreRequsite extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		excelName = "MultipleTestData";
		dataSheetName="MultipleUsers";
		test = startTestCase("Browser Invoked", "TC Execuion");
		category = "Smoke";
		authors = "Bhuvana";
		browserName = "chrome";
	}

	
	@Test(dataProvider = "fetchData")
	public void login( String iteration,String userName, String passWord, String code,
			String fName, String lName, String eMail, String uName, String pwd, String confirmPassword,String levelName, String prefix, String reviewDue, String searchCriteria, String subLevelName, String subPrefix, String subReviewDue, String groupName,String position, String desc,String routeName, String routedesc,String minNumofApproversReqd )throws Throwable {
	
		 int iteration1 = Integer.parseInt(iteration);
		 

	/*if(iteration1<=11) {
		//Create Multiple Users
			new LoginPage(driver, test).login(userName, passWord).clickOnUersTab().clickOnUsersMenu().addUsers(code,
					fName, lName, eMail, uName, pwd, confirmPassword);
		}
		
		else if(iteration1>11 && iteration1<=22) {
			//Set Landing Page as Doc Pro 
			new LoginPage(driver, test).login(userName, passWord).clickOnUersTab().clickOnUserPrefrencesMenu()
			.setDocProasLandingPage();
			}
		else if(iteration1>22 && iteration1<=27) {
			//Create Multiple parent levels
			new LoginPage(driver,test)
			.login(userName, passWord)
			.clickOnLevelsMenu()
			.createParentLevels( levelName, prefix, reviewDue);
		}
		
		else if(iteration1>27 && iteration1<=32) {
			//Create Multiple sub levels
			new LoginPage(driver,test)
			.login(userName, passWord)
			.clickOnLevelsMenu()
			.createSubLevels(searchCriteria, levelName,subLevelName, subPrefix, subReviewDue);
		}
		
		else if(iteration1>32 && iteration1<=37) {
			//Create multiple groups

			new LoginPage(driver,test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnGroupsMenu()
			.createGroup(groupName, code);
		}
	
		else if(iteration1 == 38) {
			//Create a position
			
			new LoginPage(driver, test)
			.login(userName, passWord)
			.clickOnSystemTab()
			.clickOnPositionsMenu()
			
			.createPosition(position, desc, code);	
			
			
		}*/
		 if(iteration1>38 && iteration1<=42) {
			new LoginPage(driver, test)
			.moduleLandingPageLogin(userName, passWord)
			.clickOnRoutesMenu()
			.createRoute(routeName, routedesc, code, minNumofApproversReqd, position);
			
		}
	
	
	
	
	
	
	}
	
	
}

