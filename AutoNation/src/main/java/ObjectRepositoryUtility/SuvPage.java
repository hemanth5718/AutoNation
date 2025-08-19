package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuvPage {

	WebDriver driver;
	public SuvPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@aria-controls='filtersCollapseMake']")
	private WebElement makebtn;
	@FindBy(xpath ="//label[@title='Jeep®']")
	private WebElement jeepbtn;
	@FindBy(xpath = "(//a[@class='filter-group__apply-button'])[4]")
	private WebElement applybtn;
	@FindBy(xpath="//a[@title='2021 Jeep®  Grand Cherokee Laredo E 4WD']")
	private WebElement jeepSuvBtn;


	
	
	
	public WebElement getJeepbtn() {
		return jeepbtn;
	}
	public WebElement getJeepSuvBtn() {
		return jeepSuvBtn;
	}

	public WebElement getApplybtn() {
		return applybtn;
	}





	public WebElement getMakebtn() {
		return makebtn;
	}

	
	
	
	
}
