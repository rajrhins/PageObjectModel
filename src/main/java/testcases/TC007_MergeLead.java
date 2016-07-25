package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String LeadID1,String LeadID2, String LeadIDVerify, String NoRecords ) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeadsTab()
		.clickMergeLeads()
		.clickFromLeadLookUp()
		.enterLead(LeadID1)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickToLeadLookUp()
		.enterLead(LeadID2)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickMergeButton()
		.switchToAlert()
		.clickFindLead()
		.enterLeadID(LeadIDVerify)
		.clickFindLeadsButton()
		.NoRecordsInFind(NoRecords);
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007_MergeLead";
		browserName="chrome";
		testCaseName="MergeLead(Positive)";
		testDescription="MergeLead in Opentaps using POM";
	}

	
	
	
	
	
	
}
