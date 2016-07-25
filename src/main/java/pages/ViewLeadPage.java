package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.record.pivottable.ViewDefinitionRecord;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {

	public ViewLeadPage() {
		if (!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}

	public EditLeadPage clickEditLead() {
		clickByXpath(prop.getProperty("View.EditLead.XPath"));
		return new EditLeadPage();
	}

	public FindLeadsPage clickFindLead() {
		clickByLink(prop.getProperty("MyLeads.FindLead.Link"));
		return new FindLeadsPage();
	}

	public ViewLeadPage verifyDataSource(String datasource) {

		verifyTextContainsByID(prop.getProperty("View.Source.id"), datasource);
		return this;
	}

	public ViewLeadPage verifyMarketingCampaign(String datasource) {

		verifyTextContainsByID(prop.getProperty("View.Marketingcampaign.id"), datasource);
		return this;
	}

	// Method to click on the delete lead button in the View Lead page
	public MyLeadsPage ClickDelete() {
		clickByXpath(prop.getProperty("View.Delete.Xpath"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return new MyLeadsPage();
	}

	/**
	 * This method will verify the given text
	 * 
	 * @param xpath
	 *            - The locator of the object in xpath
	 * @author Babu - TestLeaf
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public ViewLeadPage setCompanyName_ID(int i) throws FileNotFoundException, IOException{
      writeleadidtoexcel("TC007_MergeLead", 0, 1, i, prop.getProperty("View.company_ID.id"));
		return this;
		
	}
}
