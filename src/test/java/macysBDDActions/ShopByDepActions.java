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
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened for searching item ==>");
	}

	public void mouseHover() throws InterruptedException {

		// element.hoverovertowomen.click();
		try {
			Actions hover = new Actions(SetupDriver.driver);
			element.hoverovertowomen.isDisplayed();
			// hover.moveToElement(element.hoverovertowomen).perform(); //din
			// not work
			hover.clickAndHold(element.hoverovertowomen).release().perform();
			// element.hoverovertowomen.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.getStackTrace();

			System.out.println("failed to hover over");

		}

	}

	public void cookiesHandle() {
		element.cookies.click();
	}

	public void clickOndress() {
		try {
			element.clickonDressess.isDisplayed();
			Actions dress = new Actions(SetupDriver.driver);
			element.clickonDressess.isDisplayed();
			// dress.clickAndHold(element.clickonDressess).release().perform();
			dress.moveToElement(element.clickonDressess).click().build().perform();

			//element.clickonDressess.click();

		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Item sold out  !!");
		}
	}

	public void getURL() {
		System.out.println("current URL is " + Helper.getCurentUrl());
		// Helper.getCurentUrl();
	}

	public void selectaDress() {
		try{element.selectDress.isDisplayed();
		element.selectDress.click();}
		
		catch (Exception e) {
			e.getStackTrace();
			System.out.println("Access Denied  !!");

		}
		
	}

	public void dressColor() {
		element.chooseColor.click();
	}

	public void dressSize() {
		try {
			Actions color = new Actions(SetupDriver.driver);
			color.clickAndHold(element.chooseColor).click().build().perform();
			// element.ChooseSize.click();

		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("color is sold out !!");

		}
		
			
		}public void addInBag(){
		try{
			element.addToBag.click();
		}
		catch (Exception e) {
			e.getStackTrace();
			System.out.println(" Access denied by macys website !!");

		}

	}
}
