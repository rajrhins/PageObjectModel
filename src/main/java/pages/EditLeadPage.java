package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {

	public EditLeadPage() {
		if (!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Edit Lead Page", "FAIL");
	}

	public EditLeadPage selectNewDataSource(String source) {
		selectById(prop.getProperty("Edit.selectsource.id"), source);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return this;
	}

	public EditLeadPage addSource() {
		clickByXpath(prop.getProperty("Edit.addsource.xpath"));
		return this;

	}

	public EditLeadPage selectNewmarkettingcampaign(String mcampaign) {
		selectById(prop.getProperty("Edit.selectnewmcampaign.id"), mcampaign);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public EditLeadPage addMcampaign() {
		clickByXpath(prop.getProperty("Edit.addcampaign.xpath"));
		return this;

	}

	public ViewLeadPage updateButton() {
		clickByXpath(prop.getProperty("Edit.update.xpath"));
		return new ViewLeadPage();
	}

}
