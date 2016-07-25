package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers {

	public MergeLeadPage() {
		if (!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not Merge Lead Page", "FAIL");
	}

	public Merge_FindLeadPage clickFromLeadLookUp() {
		clickByXpath(prop.getProperty("Merge.FromLead.XPath"));
		switchtowindows(prop.getProperty("Merge_Find.LeadId.Name"));
		return new Merge_FindLeadPage();
	}

	public Merge_FindLeadPage clickToLeadLookUp() {

		clickByXpath(prop.getProperty("Merge.ToLead.XPath"));
		switchtowindows(prop.getProperty("Merge_Find.LeadId.Name"));
		return new Merge_FindLeadPage();
	}

	public MergeLeadPage clickMergeButton() {
		clickByLink(prop.getProperty("Merge.MergeButton.Link"));
		return this;
	}

	public ViewLeadPage switchToAlert() {
		switchToAlert_Accepts();
		return new ViewLeadPage();
	}

}
