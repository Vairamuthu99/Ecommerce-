package TestDrive;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.BottomLinksPage;
import PageDrive.HomePage;

public class BottomLinksTest extends Baseclass {
	
	@Test
	public void Bottomlink1() {
		
		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));
		
		BottomLinksPage bottomlink = new BottomLinksPage();
		bottomlink.verifythedisplayofBestbuytotaltech();
		Assert.assertTrue(bottomlink.verifythedisplayofBestbuytotaltech());
	}
	
	@Test
	public void Bottomlink2() {
		
		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));
		
		BottomLinksPage bottomlink = new BottomLinksPage();
		bottomlink.verifythedisplayofCareers();
		Assert.assertTrue(bottomlink.verifythedisplayofCareers());
	}
	
	@Test
	public void Bottomlink3() {
		
		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));
		
		BottomLinksPage bottomlink = new BottomLinksPage();
		bottomlink.verifythedisplayofMemberOffers();
		Assert.assertTrue(bottomlink.verifythedisplayofMemberOffers());
	}
	
	@Test
	public void Bottomlink4() {
		
		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));
		
		BottomLinksPage bottomlink = new BottomLinksPage();
		bottomlink.verifythedisplayofLeaseToOwn();
		Assert.assertTrue(bottomlink.verifythedisplayofLeaseToOwn());
	}
}
