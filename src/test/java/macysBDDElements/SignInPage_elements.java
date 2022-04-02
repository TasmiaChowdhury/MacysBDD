package macysBDDElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage_elements {
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailId;
	
	@FindBy (xpath = "//input[@id='pw-input']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='sign-in']")
	public WebElement clickSubmit;
	
	@FindBy(xpath="//div[@class='fixed-container notification-error']")
	public WebElement errorMsg;
	
	@FindBy (xpath="//input[@id='globalSearchInputField']")
	public WebElement searchBox;
	
	@FindBy (xpath="//*[@id=\"autosuggest\"]/div[1]/li[4]/a/div")
	public WebElement mensShirt;
	 
	
	@FindBy(xpath="//button[@aria-label='Open Women flyout' and @class=\"show-for-sr\"]")           //span[normalize-space()='Women']
	public WebElement hoverovertowomen;
	
	@FindBy(xpath="//div[@class='accordion-body-wrapper initial']//a[contains(text(),'Dresses')]")
	public WebElement clickonDressess;
	
	
	@FindBy(xpath="//*[@id=\"74714\"]/div[2]/div/a/div[2]")
	public WebElement selectDress;
	
	@FindBy(xpath="//img[@alt='Indigo']")
	public WebElement chooseColor;
	
	@FindBy (xpath="//li[normalize-space()='4']")
	public WebElement ChooseSize;
	
	@FindBy (xpath="//button[@id='bag-add-5922629']")
	public WebElement addToBag;
	
	@FindBy (xpath="//*[@id=\"atbIntViewBagAndCheckout\"]")
	public WebElement ViewBag;
	
	@FindBy(xpath="//*[@id=\"servicError\"]/button")
	public WebElement serviceerror;                                 // may appear sometimes 
	
	@FindBy(xpath="//*[@id=\"onetrust-close-btn-container\"]/button")
	public WebElement cookies;
	
	@FindBy (xpath="//*[@id=\"cta-notification-order-panel-1622049\"]/div/div/div[2]/button")
	public WebElement technicalError;
	
	

}
