package AutoVehicleTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.RamCarPage;
import ObjectRepositoryUtility.VehiclePage;

public class FourWheelDriveTest extends BaseClass {
	@Test(groups = "regressionTest")
	public void fourWheel() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp = new VehiclePage(driver);
		vp.getCancelOnLHS().click();
		wlib.scrollByAmount(driver, 0, 600);
		vp.getCategoryBtn().click();
		vp.getTruckCheckBox().click();
		vp.getCategoryApplyBtn().click();
		wlib.scrollByAmount(driver, 0, 600);
		vp.getRamCarBtn().click();
		wlib.scrollByAmount(driver, 0, 1800);
		RamCarPage rp = new RamCarPage(driver);
		rp.getSpecificationsBtn().click();
		WebElement fwd = rp.getFourWD();
		String actualResult = fwd.getText();
		String expectedResult = elib.getStringDataFromExcel("TestData3", 1, 0);
		boolean status = actualResult.contains(expectedResult);
		Assert.assertEquals(status, true);

	}

}
