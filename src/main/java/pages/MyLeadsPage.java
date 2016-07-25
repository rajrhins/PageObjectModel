package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {

	public MyLeadsPage() {
		if (!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Lead Page", "FAIL");
	}

	public CreateLeadPage clickCreateLead() {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("MyLeads.CreateLead.Link")));
		
		clickByLink(prop.getProperty("MyLeads.CreateLead.Link"));
		return new CreateLeadPage();
	}

	public FindLeadsPage clickFindLeads() {
		clickByLink(prop.getProperty("MyLeads.FindLead.Link"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new FindLeadsPage();
	}

	public MergeLeadPage clickMergeLeads() {
		clickByLink(prop.getProperty("MyLeads.MergeLead.Link"));
		return new MergeLeadPage();
	}

}