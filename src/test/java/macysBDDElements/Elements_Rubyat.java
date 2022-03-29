package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_Rubyat {
	
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
	
	
	/*@FindBy(xpath ="//div[normalize-space()='Brands']")
	/public WebElement brand_expnd;*/
	
	@FindBy(xpath ="//*[@id=\"categoryTree\"]/ul/li[4]/div[2]/h5/div[2]")
	public WebElement brand_expnd;
	
	//*[@id="categoryTree"]/ul/li[4]/div[2]/h5/div[2]
	
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]")
	public WebElement Guess;
	
	//*[@id="categoryTree"]/ul/li[4]/div[2]/div/div/ul/li[7]/a
	
	@FindBy(xpath="//div[@class='productDescription']//a[contains(@title,'Gillian Mini Flap Crossbody')]")
	public WebElement product ;
	//*[@id="13264284"]/div[3]/div[2]/a      for product as 
	//div[@class='productDescription']//a[contains(@title,'Gillian Mini Flap Crossbody')] for product 
	
	@FindBy(xpath="//*[@id=\"mcom-a11y-7099396\"]")
	public WebElement color ;
	
	@FindBy(xpath="//*[@id=\"bag-add-13264284\"]")
	public WebElement add_Bag;
	
	@FindBy(xpath="//*[@id=\"atbIntCheckout\"]")
	public WebElement checkout ;
	
	
	
	
	

}
