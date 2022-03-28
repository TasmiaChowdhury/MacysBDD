package macysBDDElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

}
