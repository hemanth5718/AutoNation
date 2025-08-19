package AutoVehicleTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.VehiclePage;
import WebDriverUtility.WebDriverUtility;

public class VehicleAffordablilityTest extends BaseClass{
	@Test(groups = "regressionTest")
	public void vehicleAffTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp = new VehiclePage(driver);
		vp.getCarsBtn().click();
		vp.getNorthEdmontonCB().click();
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
		int rnum1 = jlib.getRandomNumber(5000);
		char rchar=jlib.getRandomLetters();
		String firstName = elib.getStringDataFromExcel("TestData2", 1, 0) + rchar;
		String lastName = elib.getStringDataFromExcel("TestData2", 1,1) + rchar;
		String phoneNum = elib.getStringDataFromExcel("TestData2", 1,2)+rnum1 ;
		String email = elib.getStringDataFromExcel("TestData2", 1,3) ;
		vp.getFirstNameTxt().sendKeys(firstName);
		vp.getLastNameTxt().sendKeys(lastName);
		vp.getPhoneNoTxt().sendKeys(phoneNum);
		vp.getEmailTxt().sendKeys(email);
		WebElement click = vp.getBycheckingCb();
		wlib.javaScriptExecutor(driver, click);
		vp.getContinuebtn().click();
		int rnum2 = jlib.getRandomNumber(20);
		String birthDate = elib.getStringDataFromExcel("TestData2", 1, 4)+rnum2;
		String streetAddress = elib.getStringDataFromExcel("TestData2", 1, 5);
		String city = elib.getStringDataFromExcel("TestData2", 1, 6);
		vp.getBirthDatetxt().sendKeys(birthDate);
		vp.getStreetAddressTxt().sendKeys(streetAddress);
		vp.getCityTxt().sendKeys(city);
		 WebElement province = vp.getProvinceDD();
		 province.click();
		 wlib.select(province, 2);
		 province.click();
		String postalCode = elib.getStringDataFromExcel("TestData2", 1, 7);
		 vp.getPostalCodeTxt().sendKeys(postalCode);
		 vp.getContinueBtn2().click();
		 wlib.scrollByAmount(driver, 0, 400);
		 vp.getContinueBtn3().click();
		 String annual = elib.getStringDataFromExcel("TestData2", 1, 8)+rnum1;
		 vp.getAnnualTxt().sendKeys(annual);
		String monthly = elib.getStringDataFromExcel("TestData2", 1, 9)+rnum2;
		vp.getMonthlyTxt().sendKeys(monthly);
		vp.getContinuebtn4().click();
		wlib.scrollByAmount(driver, 0, 600);
		vp.getViewMyVehicleBtn().click();
		WebElement result = vp.getWeCouldtxt();
		String actualResult = result.getText();
		String expectedResult = elib.getStringDataFromExcel("TestData2", 1, 10);
		Assert.assertEquals(actualResult, expectedResult);
		
		
		




		
	}
	
}
