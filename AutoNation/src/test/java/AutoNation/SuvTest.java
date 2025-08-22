package AutoNation;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.VehiclePage;

public class SuvTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void suvTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp = new VehiclePage(driver);
		vp.getSuvBtn().click();
		String actualResult = driver.getTitle();
		String expectedResult = elib.getStringDataFromExcel("smoke", 1, 2);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
