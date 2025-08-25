package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage {
	WebDriver driver;
	
	public VehiclePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='/images/car--cta.png']")
	private WebElement carsBtn;
	@FindBy(xpath = "//img[@src='/images/suv--cta-new.png']")
	private WebElement suvBtn;
	@FindBy(xpath = "//input[@value='acheson']")
	private WebElement achensonCB;
	

	@FindBy(xpath = "//a[@class='filter-group__apply-button']")
	private WebElement applyBtn;
	@FindBy(xpath = "//a[@aria-controls='filtersCollapseFuelType']")
	private WebElement fuelBtn;
	@FindBy(xpath = "//label[@title='Gas']")
	private WebElement gasCB;
	@FindBy(xpath = "(//a[@class='filter-group__apply-button'])[15]")
	private WebElement applyBtn1;
	@FindBy(xpath = "//a[@title='Get Financing']")
	private WebElement calculatePayment;
	@FindBy(xpath = "//iframe[@class='av_report__iframe']")
	private WebElement frame;
	@FindBy(xpath = "//button[@data-cy='submit']")
	private WebElement continuebtn;
	@FindBy(id = "firstName")
	private WebElement firstNameTxt;
	@FindBy(id = "lastName")
	private WebElement lastNameTxt;
	@FindBy(id = "phoneNumber")
	private WebElement phoneNoTxt;
	@FindBy(id = "emailAddress")
	private WebElement emailTxt;
	@FindBy(xpath  = "//input[@data-cy='tAndC']")
	private WebElement BycheckingCb;
	@FindBy(id = "birthdate")
	private WebElement birthDatetxt;
	@FindBy(id = "streetaddress")
	private WebElement StreetAddressTxt;
	@FindBy(id = "city")
	private WebElement cityTxt;
	@FindBy(id = "province")
	private WebElement provinceDD;
	@FindBy(id = "postalCode")
	private WebElement postalCodeTxt;
	@FindBy(xpath =  "//button[@data-cy='submitForm2']")
	private WebElement continueBtn2;
	@FindBy(xpath =  "//button[@data-cy='submitReviewForm']")
	private WebElement continueBtn3;
	@FindBy(id = "annualIncome")
	private WebElement annualTxt;
	@FindBy(id = "monthlyPayment")
	private WebElement monthlyTxt;
	@FindBy(xpath = "//button[@data-cy='continue']")
	private WebElement continuebtn4;
	@FindBy(xpath = "//label[@aria-label='radiobuttonoptions_automotive_(i.e._car,_suv)']")
	private WebElement automotiveBtn;
	@FindBy(xpath = "//button[@class='btn mt-4 mb-1 btn-lg btn-primary w-100']")
	private WebElement viewMyVehicleBtn;
	@FindBy(xpath = "//h2[@data-test='heading']")
	private WebElement weCouldtxt;
	@FindBy(xpath = "//i[@class='active-filters__clear-all-icon im im-x-mark-circle-o']")
	private WebElement cancelOnLHS;
	@FindBy(xpath = "//a[@aria-controls='filtersCollapseCategory']")
	private WebElement categoryBtn;
	@FindBy(xpath = "//label[@title='Truck']")
	private WebElement truckCheckBox;
	@FindBy(xpath = "(//a[@class='filter-group__apply-button'])[7]")
	private WebElement categoryApplyBtn;
	@FindBy(xpath = "(//a[@class='vehicle__image b-lazy b-loaded'])[2]")
	private WebElement ramCarBtn;
	@FindBy(id = "searchInput")	
	private WebElement searchBar;
	@FindBy(xpath = "//button[@class='search-button']")
	private WebElement seatchBarGoBtn;
	@FindBy(xpath = "//img[@src='/images/van--cta-new.png']")
	private WebElement vansBtn;
	
	
	
	

	public WebElement getSeatchBarGoBtn() {
		return seatchBarGoBtn;
	}
	public WebElement getAchensonCB() {
		return achensonCB;
	}


	public WebElement getSearchBar() {
		return searchBar;
	}



	public WebElement getRamCarBtn() {
		return ramCarBtn;
	}



	public WebElement getCategoryApplyBtn() {
		return categoryApplyBtn;
	}



	public WebElement getCancelOnLHS() {
		return cancelOnLHS;
	}

	public WebElement getCategoryBtn() {
		return categoryBtn;
	}

	public WebElement getTruckCheckBox() {
		return truckCheckBox;
	}

	public WebElement getWeCouldtxt() {
		return weCouldtxt;
	}

	public WebElement getViewMyVehicleBtn() {
		return viewMyVehicleBtn;
	}

	public WebElement getContinuebtn4() {
		return continuebtn4;
	}

	public WebElement getContinueBtn3() {
		return continueBtn3;
	}

	public WebElement getAnnualTxt() {
		return annualTxt;
	}

	public WebElement getMonthlyTxt() {
		return monthlyTxt;
	}

	public WebElement getContinueBtn2() {
		return continueBtn2;
	}

	public WebElement getBirthDatetxt() {
		return birthDatetxt;
	}

	public WebElement getStreetAddressTxt() {
		return StreetAddressTxt;
	}

	public WebElement getCityTxt() {
		return cityTxt;
	}

	public WebElement getProvinceDD() {
		return provinceDD;
	}

	public WebElement getPostalCodeTxt() {
		return postalCodeTxt;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getFirstNameTxt() {
		return firstNameTxt;
	}

	public WebElement getLastNameTxt() {
		return lastNameTxt;
	}

	public WebElement getPhoneNoTxt() {
		return phoneNoTxt;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getBycheckingCb() {
		return BycheckingCb;
	}

	public WebElement getFrame() {
		return frame;
	}	

	public WebElement getAutomotiveBtn() {
		return automotiveBtn;
	}

	public WebElement getCalculatePayment() {
		return calculatePayment;
	}

	public WebElement getApplyBtn1() {
		return applyBtn1;
	}

	public WebElement getFuelBtn() {
		return fuelBtn;
	}

	public WebElement getGasCB() {
		return gasCB;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}


	public WebElement getCarsBtn() {
		return carsBtn;
	}
	public WebElement getSuvBtn() {
		return suvBtn;
	}
	public WebElement getVansBtn() {
		return vansBtn;
	}
	
	
    
    
}
	
	


