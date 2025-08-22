package AutoNation;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;

public class RvTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void rvTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getRvBtn().click();
		String actualResult = driver.getTitle();
		String expectedResult = elib.getStringDataFromExcel("smoke", 1, 1);
		Assert.assertEquals(actualResult, expectedResult);
	}

}
