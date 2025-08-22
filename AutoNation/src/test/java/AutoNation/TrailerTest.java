package AutoNation;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.RvPage;

public class TrailerTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void trailersTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getRvBtn().click();
		RvPage rp = new RvPage(driver);
		rp.getTrailersBtn().click();
		String actualResult = driver.getTitle();
		String expectedResult = elib.getStringDataFromExcel("smoke", 1, 4);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
