package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FordExplorerXLTPage {
	WebDriver driver;
	public FordExplorerXLTPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@aria-controls='accordionPayments']")
	private WebElement paymentDD;
	@FindBy(xpath = "//select[@name='frequency']")
	private WebElement frequencyDD;
	@FindBy(xpath = "//input[@name='down']")
	private WebElement downpaymentTxt;
	@FindBy(xpath = "//input[@name='interest']")
	private WebElement intrestRateTxt;
	@FindBy(xpath = "//button[@class='paymentCalculate submit']")
	private WebElement calculateBtn;
	@FindBy(xpath = "//input[@name='monthly']")
	private WebElement FinalResult;
	
	
	public WebElement getFinalResult() {
		return FinalResult;
	}
	public WebElement getDownpaymentTxt() {
		return downpaymentTxt;
	}
	public WebElement getIntrestRateTxt() {
		return intrestRateTxt;
	}
	public WebElement getCalculateBtn() {
		return calculateBtn;
	}
	public WebElement getFrequencyDD() {
		return frequencyDD;
	}
	public WebElement getPaymentDD() {
		return paymentDD;
	}
	
	
	
}
