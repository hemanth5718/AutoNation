package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@src='/images/car-cta.png']")
	private WebElement vehiclesBtn;
	
	@FindBy(xpath = "//img[contains(@alt,'Rv')]")
	private WebElement rvBtn;
	
	@FindBy(xpath = "//button[@class='cc-nb-okagree']")
	private WebElement okBtn;
	
	
	
	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getVehiclesBtn() {
		return vehiclesBtn;
	}

	public WebElement getRvBtn() {
		return rvBtn;
	}


	

}
