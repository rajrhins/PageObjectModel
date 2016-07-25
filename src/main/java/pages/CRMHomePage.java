package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers {

	public CRMHomePage() {
		if (!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM HomePage", "FAIL");

	}

	public CreateLeadPage clickCreateLead() {
		clickByXpath(prop.getProperty("CRM.CreateLead.Xpath"));
		return new CreateLeadPage();
	}

	public MyLeadsPage clickLeadsTab() {
		clickByLink(prop.getProperty("CRM.LeadsTab.Link"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MyLeadsPage();

	}

}
