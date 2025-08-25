package AutoVehicleTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.VehiclePage;
import WebDriverUtility.WebDriverUtility;

public class VehicleAffordablilityTest extends BaseClass {
	@Test(groups = "regressionTest")
	public void vehicleAffTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp = new VehiclePage(driver);
		vp.getCarsBtn().click();
		vp.getAchensonCB().click();
		vp.getApplyBtn().click();
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.scrollByAmount(driver, 0, 600);
		vp.getFuelBtn().click();
		vp.getGasCB().click();
		vp.getApplyBtn1().click();
		vp.getCalculatePayment().click();
		WebElement fele = vp.getFrame();
		wlib.switchToFrame(driver, fele);
		vp.getAutomotiveBtn().click();
		vp.getContinuebtn().click();
		int suffix = jlib.getRandomNumber(10000);
		String rnum1 = String.format("%04d", suffix);
		//char rchar = jlib.getRandomLetters();
		String firstName = elib.getStringDataFromExcel("VehicleAffordable", 1,0 );
		String lastName = elib.getStringDataFromExcel("VehicleAffordable", 1, 1) ;
		long pn = (long) (elib.getNumericDataFromExcel("VehicleAffordable", 1, 2));	
		String phoneNum = pn+rnum1;		
		String email = elib.getStringDataFromExcel("VehicleAffordable", 1, 3);
		vp.getFirstNameTxt().sendKeys(firstName);
		vp.getLastNameTxt().sendKeys(lastName);
		vp.getPhoneNoTxt().sendKeys(phoneNum);
		vp.getEmailTxt().sendKeys(email);
		WebElement click = vp.getBycheckingCb();
		wlib.javaScriptExecutor(driver, click);
		vp.getContinuebtn().click();
		int suffix2 = jlib.getRandomNumber(101);
		int rnum2 = 1900+suffix2;	
		String birthDate = elib.getStringDataFromExcel("VehicleAffordable", 1, 4) + rnum2;
		String streetAddress = elib.getStringDataFromExcel("VehicleAffordable", 1, 5);
		String city = elib.getStringDataFromExcel("VehicleAffordable", 1, 6);
		vp.getBirthDatetxt().sendKeys(birthDate);
		vp.getStreetAddressTxt().sendKeys(streetAddress);
		vp.getCityTxt().sendKeys(city);
		WebElement province = vp.getProvinceDD();
		province.click();
		wlib.select(province, 2);
		province.click();
		String postalCode = elib.getStringDataFromExcel("VehicleAffordable", 1, 7);
		vp.getPostalCodeTxt().sendKeys(postalCode);
		vp.getContinueBtn2().click();
		wlib.scrollByAmount(driver, 0, 400);
		vp.getContinueBtn3().click();
		String annual = elib.getNumericDataFromExcel("VehicleAffordable", 1, 8) + rnum1;
		vp.getAnnualTxt().sendKeys(annual);
		int month = (int) (elib.getNumericDataFromExcel("VehicleAffordable", 1, 9) + rnum2);
		String monthly = Integer.toString(month);
		vp.getMonthlyTxt().sendKeys(monthly);
		vp.getContinuebtn4().click();
		wlib.scrollByAmount(driver, 0, 600);
		vp.getViewMyVehicleBtn().click();
		WebElement result = vp.getWeCouldtxt();
		String actualResult = result.getText();
		String expectedResult = elib.getStringDataFromExcel("VehicleAffordable", 1, 10);
		Assert.assertEquals(actualResult, expectedResult);

	}

}
