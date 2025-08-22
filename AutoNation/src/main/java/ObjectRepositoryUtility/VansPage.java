package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VansPage {
	WebDriver driver;
	public VansPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='expand-link__text']")
	private WebElement lookAlike;
	@FindBy(xpath = "//button[@class='v7list-vehicle__more-close is-open']")
	private WebElement cancleLookAlike;
	@FindBy(xpath = "//a[@title='Between $20,000 - $24,999']")
	private WebElement priceRange20kTO24k;
	@FindBy(id = "text-us-chat")
	private WebElement textUsBtn;
	@FindBy(id = "phone-number")
	private WebElement phoneNoTxt;
	@FindBy(id = "flexCheckDefault")
	private WebElement iAcceptCheckBox;
	@FindBy(id = "question")
	private WebElement QuestionTxt;
	@FindBy(id = "sendMassage-btn")
	private WebElement sendMsgBtn;
	@FindBy(id = "live-chat-widget-sparrow")
	private WebElement TextFrame;
	@FindBy(id = "buttonAgree")
	private WebElement TAndCAgreeBtn;
	@FindBy(xpath = "(//div[@class='chat-textUsConfirm']/p)[2]")
	private WebElement confirmationTxt;
	
	
	
	public WebElement getConfirmationTxt() {
		return confirmationTxt;
	}
	public WebElement getTAndCAgreeBtn() {
		return TAndCAgreeBtn;
	}
	public WebElement getTextFrame() {
		return TextFrame;
	}
	public WebElement getPriceRange20kTO24k() {
		return priceRange20kTO24k;
	}
	public WebElement getTextUsBtn() {
		return textUsBtn;
	}
	public WebElement getPhoneNoTxt() {
		return phoneNoTxt;
	}
	public WebElement getiAcceptCheckBox() {
		return iAcceptCheckBox;
	}
	public WebElement getQuestionTxt() {
		return QuestionTxt;
	}
	public WebElement getSendMsgBtn() {
		return sendMsgBtn;
	}
	public WebElement getLookAlike() {
		return lookAlike;
	}
	public WebElement getCancleLookAlike() {
		return cancleLookAlike;
	}
	
	

}
