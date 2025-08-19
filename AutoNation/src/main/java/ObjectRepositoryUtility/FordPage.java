package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FordPage {
	WebDriver driver;
	public FordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='v7list-vehicle__image-group'])[5]")
	private WebElement fordExplorerXLTIcon;
	
	public WebElement getFordExplorerXLTIcon() {
		return fordExplorerXLTIcon;
	}

}
