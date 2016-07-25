package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{
	int i=2;
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String companyName,String FirstName, String LastName, String Source, String mcampaign,String PhoneNo ) throws FileNotFoundException, IOException {
		{
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeadsTab()
		.clickCreateLead()
		.entercompanyname(companyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.selectNewDataSource(Source)
		.selectNewmarkettingcampaign(mcampaign)
		.enterPhoneNumber(PhoneNo)
		.clickCreateLeadbutton()
		.setCompanyName_ID(i);
		i++ ;}
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004_CreateLead";
		browserName="chrome";
		testCaseName="CreateLead(Positive)";
		testDescription="CreateLead in Opentaps using POM";
	}

	
	
	
	
	
	
}
