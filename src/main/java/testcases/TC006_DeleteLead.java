package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC006_DeleteLead extends OpentapsWrappers{
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String passWord, String phoneNumber,String infoMessage) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeadsTab()
		.clickFindLeads()
		.clickPhoneTab()
		.EnterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.clickFirstLead()
		.ClickDelete()
		.clickFindLeads()
		.clickPhoneTab()
		.EnterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.NoRecordsInFind(infoMessage);
		
		}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006_DeleteLead";
		browserName="chrome";
		testCaseName="Delete Lead - Positive";
		testDescription="Delete a new lead using POM";
	}
	

}
