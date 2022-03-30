package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import macysBDDElements.SignInPage_elements;
import macysBDDUtilities.Helper;
import macysBDDUtilities.SetupDriver;

public class ShopByDepActions {
	SignInPage_elements element;

	public ShopByDepActions() {
		element = new SignInPage_elements();
		PageFactory.initElements(SetupDriver.driver, element);
	}

	public void gotoMacysHomePage() {

		SetupDriver.driver.get("https://www.macys.com/?lid=glbtopnav_macys_icon-us");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("chrome opened for searching item ==>");
	}

	public void mouseHover() throws InterruptedException {

		// element.hoverovertowomen.click();
		try {
			Actions hover = new Actions(SetupDriver.driver);
			hover.moveToElement(element.hoverovertowomen).perform();
			//element.hoverovertowomen.click();
		} catch (Exception e) {
			e.getStackTrace();

			System.out.println("failed to hover over");
		}

	}

	public void clickOndress() {
		try {
			element.clickonDressess.click();

		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("failed to click on dress !!");
		}
	}

	public void getURL() {
		System.out.println("current URL is "+Helper.getCurentUrl());
		//Helper.getCurentUrl();
	}

}
