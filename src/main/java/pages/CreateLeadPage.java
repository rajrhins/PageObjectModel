package pages;



import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers {

	public CreateLeadPage() {
		
		if (!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}

	public CreateLeadPage entercompanyname(String data) {
		enterById(prop.getProperty("Create.CompanyName.id"), data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("Create.FirstName.id"), data);
		return this;
	}

	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("Create.LastName.id"), data);
		return this;
	}

	public ViewLeadPage clickCreateLeadbutton() {
		clickByClassName(prop.getProperty("Create.CreateLead.class"));
		return new ViewLeadPage();
	}

	public CreateLeadPage selectNewDataSource(String source) {
		selectById(prop.getProperty("Create.Source.id"), source);
		return this;
	}

	public CreateLeadPage selectNewmarkettingcampaign(String mcampaign) {
		selectById(prop.getProperty("Create.Marketingcampaign.id"), mcampaign);
		return this;
	}

	public CreateLeadPage enterPhoneNumber(String PhoneNo) {
		enterById(prop.getProperty("Create.Phone.id"), PhoneNo);
		return this;
	}

}
