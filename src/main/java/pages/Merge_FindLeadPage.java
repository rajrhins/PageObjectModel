package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class Merge_FindLeadPage extends OpentapsWrappers {

	public Merge_FindLeadPage() {
		if (!verifyTitle("Find Leads"))
			Reporter.reportStep("This is not Merge-Find Lead Page", "FAIL");
	}

	public Merge_FindLeadPage enterLead(String data) {

		enterByName(prop.getProperty("Merge_Find.LeadId.Name"), data);
		return this;
	}

	public Merge_FindLeadPage clickFindLeadsButton() {
		clickByXpath(prop.getProperty("Find.FindLeadsButton.XPath"));
		return this;
	}

	public MergeLeadPage clickFirstLead() {
		wait(prop.getProperty("Merge_Find.Wait.XPath"));
		clickByXpath(prop.getProperty("Find.FirstLead.XPath"));
		switchToParent();
		return new MergeLeadPage();
	}

}
