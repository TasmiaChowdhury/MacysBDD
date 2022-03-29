package macysBDDElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsTasmia {
	
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
	 
	
	@FindBy(xpath="//span[normalize-space()='Women']")            //or "//span[normalize-space()='Women']"// or //li[@id='flexid_118']
	public WebElement hoverovertowomen;
	
	@FindBy(xpath="//li[@class='header highlighted']//a[contains(text(),'Extra 30% Off')]")
	public WebElement clickonDressess;
	
	
	@FindBy(xpath="//img[@id='img_5922629']")
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
	
	
	

}
