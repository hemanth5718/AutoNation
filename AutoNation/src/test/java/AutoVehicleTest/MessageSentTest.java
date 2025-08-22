package AutoVehicleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.VansPage;
import ObjectRepositoryUtility.VehiclePage;

public class MessageSentTest extends BaseClass {

	@Test
	public void messagesentest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOkBtn().click();
		hp.getVehiclesBtn().click();
		VehiclePage vp = new VehiclePage(driver);
		vp.getVansBtn().click();
		VansPage vap = new VansPage(driver);
		wlib.scrollByAmount(driver, 0, 800);
		vap.getLookAlike().click();
		vap.getCancleLookAlike().click();
		wlib.scrollByAmount(driver, 0, 1000);
		vap.getPriceRange20kTO24k().click();
		WebElement frame = vap.getTextFrame();
		wlib.switchToFrame(driver, frame);
		vap.getTextUsBtn().click();
		 int pn = (int) elib.getNumericDataFromExcel("TestData5", 1, 0);
		 String phno = Integer.toString(pn);
		int random = jlib.getRandomNumber(300);
		String phone = phno+random;	
		vap.getPhoneNoTxt().sendKeys(phone);
		vap.getTAndCAgreeBtn().click();
		String qa = elib.getStringDataFromExcel("TestData5", 1, 1);
		vap.getQuestionTxt().sendKeys(qa);
		vap.getSendMsgBtn().click();
		WebElement confirm = driver.findElement(By.xpath("//p[.='Text sent from "+phone+" We will answer you immediately']"));
		String actualResult = confirm.getDomProperty("textContent");
		String expectedResult = "Text sent from "+phone+" We will answer you immediately";
		Assert.assertEquals(actualResult, expectedResult);
	
		 

	}

}
