package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.Utilityclass;

public class BottomLinksPage extends Utilityclass {
	
	WebDriver driver;
	
	public void BottomlinksPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
   }
	
	@FindBy(linkText="Best Buy Totaltech")
	WebElement bestbuytotaltech;
	
	@FindBy(linkText="Careers")
	WebElement careers;
	
	@FindBy(linkText="Member Offers")
	WebElement memberOffers;
	
	@FindBy(linkText="Lease to Own")
	WebElement LeaseToOwn;
	
    public boolean verifythedisplayofBestbuytotaltech() {
		
    	return bestbuytotaltech.isDisplayed();
	}
	
    public boolean verifythedisplayofCareers() {
		
    	return bestbuytotaltech.isDisplayed();
	}
    
    public boolean verifythedisplayofMemberOffers() {
		
    	return bestbuytotaltech.isDisplayed();
	}
    
    public boolean verifythedisplayofLeaseToOwn() {
		
    	return bestbuytotaltech.isDisplayed();
	}

}
