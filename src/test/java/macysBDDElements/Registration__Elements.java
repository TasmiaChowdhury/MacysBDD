package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration__Elements {
	
	@FindBy(xpath = "//*[@id=\"ca-profile-firstname\"]")
	public WebElement FirstName;
	

	@FindBy(xpath = "//*[@id=\"ca-profile-lastname\"]")
	public WebElement lastname;

	@FindBy(xpath = "//*[@id=\"ca-profile-email\"]")
	public WebElement email;

	@FindBy(xpath = "//*[@id=\"ca-profile-password\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"ca-profile-birth-month\"]")
	public WebElement month;
	
	@FindBy(xpath = "//*[@id=\"ca-profile-birth-day\"]")
	public WebElement day;
	
	@FindBy(id = "ca-profile-submit")
	public WebElement signup;
	
	@FindBy(xpath = "//*[@id=\"ca-page-level-error\"]/div/div/div[2]/div/p")
	public WebElement error;
	
	
    
	
	@FindBy(xpath ="//*[@id=\"categoryTree\"]/ul/li[3]/div[2]/h5/div[1]")
	public WebElement brand_expnd;
	
	
	
	@FindBy(xpath= "//li[@class='children']//a[contains(text(),'GUESS')]")
	public WebElement Guess;
	
	
	@FindBy(xpath="//*[@id=\"13264284\"]/div[3]/div[2]/a")
	public WebElement product ;
	
	@FindBy(xpath="//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/ul/li[2]")
	public WebElement color ;
	
	@FindBy(xpath="//*[@id=\"bag-add-13264284\"]")
	public WebElement add_Bag;
	
	@FindBy(xpath="//*[@id=\"atbIntCheckout\"]")
	public WebElement checkout ;
	
	
	@FindBy(xpath="//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/table/tbody/tr/td/span/div/div/div[2]/table/tbody/tr/td/a/span[2]/span[1]")
	public WebElement reccomend;
	
	@FindBy(xpath="//span[@class='tfc-if-shopping-for-self']")
	public WebElement Continue;
	
	@FindBy(id="atbIntViewBagAndCheckout")
	public WebElement alertViewBag;
	
	
	
	

}
