package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonMethods.ProjectMethods;
import suitePages.LoginPage;

public class DummyTestcase extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		
		excelName = "TestingExcel";
		dataSheetName="pos";

		test = startTestCase("Smoketesttarts", "Browser launched successfully");
		
		category= "Smoke";
		authors	="Bhuvana";
		browserName ="chrome";
	}
	
	

	
	@Test(dataProvider="fetchData",groups="regression")
	
public void requestDraft(String userName, String passWord, String code,
		String fName, String lName, String eMail, String uName, String pwd,
		String confirmPassword,String levelName, String prefix, String reviewDue,
		String searchCriteria, String subLevelName, String subPrefix, String subReviewDue,
		String groupName,String position, String desc) throws Throwable {
	
		testCaseName = "Dummy ";
		testDescription = "Dummy testcase";
		test = startTestCase(testCaseName, testDescription);
	
		new LoginPage(driver,test)
		.login(userName, passWord) 
		  .clickOnSystemTab()
		  .clickOnPositionsMenu()
		  .createPosition(position, desc, code);
		
	
	}

}
