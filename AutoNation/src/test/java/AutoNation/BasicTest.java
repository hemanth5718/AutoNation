 package AutoNation;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;

public class BasicTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void vehicleTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		String actualResult = driver.getTitle();
		String expectedResult = elib.getStringDataFromExcel("smoke", 1, 0);
		Assert.assertEquals(actualResult, expectedResult);
	}


}
