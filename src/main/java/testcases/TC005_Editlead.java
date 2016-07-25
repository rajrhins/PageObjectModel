package testcases;

import org.testng.annotations.Test;


import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_Editlead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String fname,String source,String mcampaign) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeadsTab()
		.clickFindLeads()
		.enterfirstName(fname)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickEditLead()
		.selectNewDataSource(source)
		.addSource()
		.selectNewmarkettingcampaign(mcampaign)
		.addMcampaign()
		.updateButton()
		.verifyDataSource(source)
		.verifyMarketingCampaign(mcampaign);
		
		
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005_EditLead";
		browserName="chrome";
		testCaseName="Editlead(Positive)";
		testDescription="Editlead using POM framework";
	}

	
	
	
	
	
	
}
