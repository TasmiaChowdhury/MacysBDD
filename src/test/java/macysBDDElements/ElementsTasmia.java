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
	
	@FindBy (xpath="//input[@id='globalSearchInputField']")
	public WebElement searchBox;
	
	@FindBy (xpath="//*[@id=\"autosuggest\"]/div[1]/li[4]/a/div")
	public WebElement mensShirt;
	 
	
	@FindBy(xpath="//li[@id='flexid_118']")            //or "//span[normalize-space()='Women']"
	public WebElement hoverovertowomen;
	
	@FindBy(xpath="//div[@aria-label='Women']//div[1]//div[1]//a[6]")
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
	
	@FindBy (xpath="(//a[contains(text(),'Toys')])[3]")
	public WebElement toys;
	
	@FindBy(xpath="//a[normalize-space()='LEGO Sets & Packs']")
	public WebElement lego;
	
	
	

}
