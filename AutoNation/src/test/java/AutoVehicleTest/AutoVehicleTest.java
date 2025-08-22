package AutoVehicleTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.JeepPage;
import ObjectRepositoryUtility.SuvPage;
import ObjectRepositoryUtility.VehiclePage;
import WebDriverUtility.WebDriverUtility;

public class AutoVehicleTest extends BaseClass {
	@Test(groups = "regressionTest")
	public void autoEstimateTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();

		VehiclePage vp = new VehiclePage(driver);
		vp.getSuvBtn().click();
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.scrollByAmount(driver, 0, 600);

		SuvPage sp = new SuvPage(driver);
		sp.getMakebtn().click();
		sp.getJeepbtn().click();
		sp.getApplybtn().click();
		wlib.scrollByAmount(driver, 0, 800);
		sp.getJeepSuvBtn().click();

		JeepPage jp = new JeepPage(driver);
		jp.getFreeTrade().click();
		WebElement fele = jp.getFrame();
		wlib.switchToFrame(driver, fele);

		int year = (int) elib.getNumericDataFromExcel("TestData1", 1, 0);
		String actYear = Integer.toString(year);
		WebElement yearDD = jp.getYearDD();
		wlib.waitForElementClickable(driver, yearDD);
		yearDD.sendKeys(actYear);
		Thread.sleep(2000);
		wlib.tab(driver, yearDD);

		String make = elib.getStringDataFromExcel("TestData1", 1, 1);
		WebElement makeDD = jp.getMakeDD();
		wlib.waitForElementClickable(driver, makeDD);
		wlib.javaScriptExecutor(driver, makeDD);
		makeDD.sendKeys(make);
		wlib.keyDownArrow(driver);
		wlib.enter(driver);

		String model = elib.getStringDataFromExcel("TestData1", 1, 2);
		WebElement modelDD = jp.getModelDD();
		wlib.waitForElementClickable(driver, modelDD);
		wlib.javaScriptExecutor(driver, modelDD);
		modelDD.sendKeys(model);
		wlib.keyDownArrow(driver);
		wlib.enter(driver);
		jp.getContinueBtn().click();

		String trim = elib.getStringDataFromExcel("TestData1", 1, 3);
		jp.getTrimDD().sendKeys(trim);
		Thread.sleep(2000);
		wlib.keyDownArrow(driver);
		wlib.enter(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		jp.getContinueBtn().click();

		String firstName = elib.getStringDataFromExcel("TestData1", 1, 4);
		jp.getFirstNametxt().sendKeys(firstName);

		String lastName = elib.getStringDataFromExcel("TestData1", 1, 5);
		jp.getLastNametxt().sendKeys(lastName);

		int pn = (int) elib.getNumericDataFromExcel("TestData1", 1, 6);
		String phno = Integer.toString(pn);
		int random = jlib.getRandomNumber(300);
		String phone = phno + random;
		jp.getPhnoTxt().sendKeys(phone);

		String email = elib.getStringDataFromExcel("TestData1", 1, 7);
		jp.getEmailTxt().sendKeys(email);

		int mi = (int) elib.getNumericDataFromExcel("TestData1", 1, 8);
		String mil = Integer.toString(mi);
		String milage = mil + random;
		jp.getMilageTxt().sendKeys(milage);

		WebElement click = jp.getBycheckingCb();
		wlib.javaScriptExecutor(driver, click);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		jp.getSeeEstimateTradeInBtn().click();

		WebElement estiPage = jp.getEstimatedTradeInValue();
		String actualResult = estiPage.getText();

		String expectedResult = "Estimated trade-in value";
		Assert.assertEquals(actualResult, expectedResult);

	}

}
