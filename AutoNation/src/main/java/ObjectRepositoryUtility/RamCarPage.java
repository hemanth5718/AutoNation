package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RamCarPage {
	WebDriver driver;
	public RamCarPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[@aria-controls='accordionSpecifications']")
	private WebElement specificationsBtn;
	@FindBy(xpath = "(//span[contains(text(),'4WD')])[2]")
	private WebElement fourWD;
	
	
	
	public WebElement getSpecificationsBtn() {
		return specificationsBtn;
	}
	public WebElement getFourWD() {
		return fourWD;
	}
	
	
	
	
}
