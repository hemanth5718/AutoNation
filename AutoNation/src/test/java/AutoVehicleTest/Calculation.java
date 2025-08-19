package AutoVehicleTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.FordExplorerXLTPage;
import ObjectRepositoryUtility.FordPage;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.VehiclePage;

public class Calculation extends BaseClass{
	@Test(groups = "RegressionTest")
	public void calculation() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp  =new VehiclePage(driver);
		String data = elib.getStringDataFromExcel("TestData4", 1, 0);
		WebElement searchbar = vp.getSearchBar();
		wlib.waitForElementPresent(driver, searchbar);
		searchbar.sendKeys(data);
		vp.getSeatchBarGoBtn().click();
		wlib.scrollByAmount(driver, 0,600);
		FordPage fp= new FordPage(driver);
		fp.getFordExplorerXLTIcon().click();
		wlib.scrollByAmount(driver, 0,800);
		FordExplorerXLTPage fxp = new FordExplorerXLTPage(driver);
		fxp.getPaymentDD().click();
		WebElement freqDD = fxp.getFrequencyDD();
		wlib.select(freqDD, 1);
		double dP = elib.getNumericDataFromExcel("TestData4", 1, 1);
		String downPayment = Double.toString(dP);
		fxp.getDownpaymentTxt().sendKeys(downPayment);
		double intr = elib.getNumericDataFromExcel("TestData4", 1, 2);
		String  intrest= Double.toString(intr);
		fxp.getIntrestRateTxt().sendKeys(intrest);
		fxp.getCalculateBtn().click();
		double ED = elib.getNumericDataFromExcel("TestData4", 1, 3);
		String  expectedResult= Double.toString(ED);
		WebElement A = fxp.getFinalResult();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = (String) js.executeScript("return arguments[0].textContent;", A);
		System.out.println(value);
		String ar = A.getDomAttribute("innerHTML");
		System.out.println(ar);
		//boolean status = ar.contains(expectedResult);
		//Assert.assertEquals(status, true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
