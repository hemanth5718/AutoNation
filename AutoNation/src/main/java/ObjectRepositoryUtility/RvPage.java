package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RvPage {
	WebDriver driver;

	public RvPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='/images/toy-hauler-new.png']")
	private WebElement trailersBtn;

	public WebElement getTrailersBtn() {
		return trailersBtn;
	}

}
