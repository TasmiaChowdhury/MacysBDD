package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import macysBDDElements.Elements_Rubyat;
import macysBDDUtilities.SetupDriver;

public class Reg_Macys_actions {

	Elements_Rubyat Ruby_elements;

	public Reg_Macys_actions() {
		Ruby_elements = new Elements_Rubyat();
		PageFactory.initElements(SetupDriver.driver, Ruby_elements);

	}

	public void getmacy_signup_page() {
		SetupDriver.driver.get("https://www.macys.com/account/createaccount");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public void firstname() {
		System.out.println("entering any name");
		Ruby_elements.FirstName.sendKeys("Galaxy");
	}

	public void lastname() {
		System.out.println("entering anything for lastname");
		Ruby_elements.lastname.sendKeys("Galaxyyy");
	}

	public void Email() {
		System.out.println("entering a valid but used email address");
		Ruby_elements.email.sendKeys("frubyat@yahoo.com");
	}

	public void Password() {
		
		System.out.println("entering a password");
		Ruby_elements.password.sendKeys("Talentech");
	}

	public void Birthmonth() {
		System.out.println("Selecting a month");
		WebElement ele = Ruby_elements.month;
		Select drpmonth = new Select(ele);
		drpmonth.selectByVisibleText("January");

	}

	public void Birthday() {

		System.out.println("Selecting a day");
		WebElement elm = Ruby_elements.day;
		Select drpday = new Select(elm);
		drpday.selectByVisibleText("10");
		

	}

	public void Signup() {
		System.out.println("click the create account button");
		Ruby_elements.signup.click();
	}

	public boolean getErrorMessage() {
		boolean bool=false;
		String error= Ruby_elements.error.getText();
		if (error.contains("This email address is")|| error.contains("We're sorry")) {
			bool=true;
		}
		return bool;
		
		/*if (txt.contains("This email address is associated with another account")) {
			System.out.println("Test passed. user could not login with a used email address");
		}
		else if (txt.contains("We're sorry, but we cannot display your information at this time.")) {
			System.out.println("Test passed. Facing Macys security issue ");
		} else {
			System.out.println("Test failed");
		}*/
	}
}
