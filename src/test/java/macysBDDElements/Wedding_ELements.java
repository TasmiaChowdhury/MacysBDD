package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wedding_ELements {

	@FindBy(xpath = "//a[@href='/wgl/registry/create-registry/?cm_sp=registry_sign_in-create_registry-sign-in&lid=registrytopreasons_topnav-createyourregistry']")
	public WebElement createRegistry;
	
	@FindBy(xpath = "//input[@id='accountEmail']")
	public WebElement emailEntry;
	
	@FindBy(xpath="//input[@id='accountPassword']")
	public WebElement passwordEntry;
	
	@FindBy(xpath="//input[@id='accountVerifyPassword']")
	public WebElement verifyPass;
	
	@FindBy(xpath="//*[@id=\"securityQuestion\"]")             //*[@id="securityQuestion"]
	public WebElement drpmenu;
	
	@FindBy(xpath="//input[@id='securityAnswer']")
	public WebElement answer;
	
	@FindBy(xpath="//div[@id='createAccountSection']//button[@type='button'][normalize-space()='continue']")
	public WebElement Continue;
	
	@FindBy(xpath="//*[@id=\"additionalInfoSection\"]/h2")
	public WebElement additionalInfo;
}
