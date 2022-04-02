package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import macysBDDElements.SignInPage_elements;
import macysBDDUtilities.Helper;
import macysBDDUtilities.SetupDriver;;


public class Search_actions {
	
	SignInPage_elements element;
	
	public Search_actions(){
		element = new SignInPage_elements();
		PageFactory.initElements(SetupDriver.driver, element);
	}
	
	
	public void getoMacysHomePage(){
		
		SetupDriver.driver.get("https://www.macys.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened for searching item ==>");
	}
	
	public void searchItem(){
		element.searchBox.clear();
		element.searchBox.sendKeys("perfums ");
		//element.serviceerror.click();
		
		
	}
	
	public void clickSearch(){
		element.searchBox.sendKeys(Keys.ENTER);    
		//element.serviceerror.click();
		
		
	}
	
	public void getTitle(){
		Helper.getPageTitle();
		
	}

}
