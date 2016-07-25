package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {

	public FindLeadsPage() {
		if (!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not FindLead Page", "FAIL");
	}

	public FindLeadsPage enterfirstName(String data) {
		enterByXPath(prop.getProperty("Find.FirstName.XPath"), data);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		clickByXpath(prop.getProperty("Find.FindLeadsButton.XPath"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		return this;
	}

	public ViewLeadPage clickFirstLead() {
		clickByXpath(prop.getProperty("Find.FirstLead.XPath"));
		return new ViewLeadPage();
	}

	public FindLeadsPage clickPhoneTab() {
		clickByXpath(prop.getProperty("Find.PhoneTab.XPath"));
		return this;
	}

	// Method to find if there are no records available
	public FindLeadsPage NoRecordsInFind(String data) {
		// getTextByXpath("FindLeads.NoResult.Xpath");
		verifyTextContainsByXpath(prop.getProperty("Find.NoResult.Xpath"), data);
		return this;
	}

	public FindLeadsPage enterLeadID(String data) {
		enterByName(prop.getProperty("Find.LeadID.Name"), data);
		return this;
	}

	// Method to enter phone number in the phone tab of Find leads Tab
	public FindLeadsPage EnterPhoneNumber(String data) {
		enterByXPath(prop.getProperty("Find.PhoneNumber.Xpath"), data);
		return this;
	}
}
