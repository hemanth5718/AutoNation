package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeepPage {
	WebDriver driver;

	public JeepPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='av-button-refresh__button-text'])[2]")
	private WebElement freeTrade;
	@FindBy(xpath = "//iframe[@class='av_report__iframe']")
	private WebElement frame;

	@FindBy(xpath = "//input[@aria-controls='autoComplete_list_4']")
	private WebElement yearDD;

	@FindBy(xpath = "//div[@aria-owns='autoComplete_list_5']/input")
	private WebElement makeDD;

	@FindBy(xpath = "//div[@aria-owns='autoComplete_list_6']/input")
	private WebElement modelDD;
	@FindBy(xpath = "//div[@class='push-down-desktop']/button")
	private WebElement continueBtn;
	@FindBy(xpath = "//div[@aria-owns='autoComplete_list_12']/input")
	private WebElement trimDD;
	@FindBy(id = "firstName")
	private WebElement firstNametxt;
	@FindBy(id = "lastName")
	private WebElement lastNametxt;
	@FindBy(id = "phoneNumber")
	private WebElement phnoTxt;
	@FindBy(id = "emailAddress")
	private WebElement emailTxt;
	@FindBy(id = "mileage")
	private WebElement milageTxt;
	@FindBy(xpath  = "//input[@data-cy='tAndC']")
	private WebElement BycheckingCb;
	@FindBy(xpath  = "//button[@data-cy='submit']")
	private WebElement seeEstimateTradeInBtn;
	@FindBy(xpath  = "//div[@data-test='estimated-value']/h4")
	private WebElement EstimatedTradeInValue;
	
	
	

	
	

	public WebElement getContinueBtn() {
		return continueBtn;
	}


	public WebElement getTrimDD() {
		return trimDD;
	}


	public WebElement getFirstNametxt() {
		return firstNametxt;
	}


	public WebElement getLastNametxt() {
		return lastNametxt;
	}


	public WebElement getPhnoTxt() {
		return phnoTxt;
	}


	public WebElement getEmailTxt() {
		return emailTxt;
	}


	public WebElement getMilageTxt() {
		return milageTxt;
	}


	public WebElement getBycheckingCb() {
		return BycheckingCb;
	}


	public WebElement getSeeEstimateTradeInBtn() {
		return seeEstimateTradeInBtn;
	}


	public WebElement getEstimatedTradeInValue() {
		return EstimatedTradeInValue;
	}


	public WebElement getFrame() {
		return frame;
	}

	
	public WebElement getFreeTrade() {
		return freeTrade;
	}

	public WebElement getYearDD() {
		return yearDD;
	}

	public WebElement getMakeDD() {
		return makeDD;
	}

	public WebElement getModelDD() {
		return modelDD;
	}

}
