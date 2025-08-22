package AutoNation;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.VehiclePage;

public class CarTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void carTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp = new VehiclePage(driver);
		vp.getCarsBtn().click();
		String actualResult = driver.getTitle();
		String expectedResult = elib.getStringDataFromExcel("smoke", 1, 3);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
