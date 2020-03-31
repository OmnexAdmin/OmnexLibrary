package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonMethods.ProjectMethods;
import suitePages.LoginPage;

public class DummyTestcase extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		
		excelName = "TestingExcel";
		dataSheetName="Sheet1";

		test = startTestCase("Smoketesttarts", "Browser launched successfully");
		
		category= "Smoke";
		authors	="Bhuvana";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData",groups="regression")
	
	public void requestDraft(String userName, String passWord ,String routeName,String routedesc,String code, String minNumofApproversReqd , String position) throws Throwable {
		
		testCaseName = "TC010 ";
		testDescription = "New draft request";
		test = startTestCase(testCaseName, testDescription);
	
		
		new LoginPage(driver, test)
		.moduleLandingPageLogin(userName, passWord)
		.clickOnRoutesMenu()
		.createRoute(routeName, routedesc, code, minNumofApproversReqd, position);
		
	}

}
