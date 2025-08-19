package AutoVehicleTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.JeepPage;
import ObjectRepositoryUtility.SuvPage;
import ObjectRepositoryUtility.VehiclePage;
import WebDriverUtility.WebDriverUtility;

public class AutoVehicleTest extends BaseClass {
	@Test(groups = "regressionTest")
	public void autoEstimateTest() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		
		VehiclePage vp = new VehiclePage(driver);
		vp.getSuvBtn().click();
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.scrollByAmount(driver, 0, 600);
		
		SuvPage sp= new SuvPage(driver);
		sp.getMakebtn().click();
		sp.getJeepbtn().click();
		sp.getApplybtn().click();
		wlib.scrollByAmount(driver, 0, 800);
		sp.getJeepSuvBtn().click();
		
		JeepPage jp = new JeepPage(driver);
		jp.getFreeTrade().click();
		WebElement fele = jp.getFrame();
		wlib.switchToFrame(driver, fele);
		
		double year = elib.getNumericDataFromExcel("TestData1", 1, 0);
		String actYear = Double.toString(year);
		Thread.sleep(2000);
		WebElement yearDD = jp.getYearDD();
		 wlib.javaScriptExecutor(driver, yearDD);
		 yearDD.sendKeys(actYear);
			Thread.sleep(2000);
		wlib.tab(driver,yearDD);
		
		
		
		
	}
	
	

}
