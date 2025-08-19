package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeepPage {
	WebDriver driver;
	public JeepPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//span[@class='av-button-refresh__button-text'])[2]")
	private WebElement freeTrade;
	@FindBy(xpath ="//iframe[@class='av_report__iframe']")
	private WebElement frame;
	
	

	@FindBy(xpath ="//input[@aria-controls='autoComplete_list_4']")
	private WebElement yearDD;
	
	@FindBy(id="makeId")
	private WebElement makeDD;
	
	@FindBy(id="modelId")
	private WebElement modelDD;
	@FindBy(id="autoComplete_result_7")
	private WebElement year;
	@FindBy(id="autoComplete_result_31")
	private WebElement make;
	@FindBy(id="autoComplete_result_4")
	private WebElement model;
	
	
	



	public WebElement getFrame() {
		return frame;
	}
	public WebElement getYear() {
		return year;
	}




	public WebElement getMake() {
		return make;
	}




	public WebElement getModel() {
		return model;
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
