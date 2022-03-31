package macysBDDActions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import macysBDDElements.SignInPage_elements;
import macysBDDUtilities.SetupDriver;



public class SignIn_actions {
	
	SignInPage_elements elementTas;
		
	public SignIn_actions(){
		elementTas = new SignInPage_elements();
		PageFactory.initElements(SetupDriver.driver, elementTas);
	
	}
	public void openMacysSignin() {
		SetupDriver.driver.get("https://www.macys.com/account/signin");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened ==>");
	}
	
	public void clearEmailID() {
		elementTas.emailId.clear();
	}
	
	public void inputEmail(){
		//elementTas.emailId.sendKeys("TestEMail@gmail.com");
		System.out.println("Passing email ==>");
		elementTas.emailId.sendKeys("TeamGalaxy@gmail.com");
	}
	public void clearPassword() {
		elementTas.password.clear();
	}
	
	
	public void inputPass(){

		System.out.println("Passing password ==>");
		elementTas.password.sendKeys("Test123");
	}
	public void clickSignin(){
		System.out.println("clicked on sign in button ==>");
		
		elementTas.clickSubmit.click();
	}
	
	public boolean errormessage(){
		System.out.println("output signin/error ==>");
		
		//System.out.println("unable to login for system issue: " + s);
		
		boolean bool = false;
		String errorMsg = elementTas.errorMsg.getText();
		if (errorMsg.contains("it looks like there's a problem") || errorMsg.contains("Sorry") || errorMsg.contains("a problem")) {
			bool = true;
		}

		return true;
	}
	public String getErrorMessage() {
		String error;
		error = elementTas.errorMsg.getText();
		return error;
	}
	
	}


