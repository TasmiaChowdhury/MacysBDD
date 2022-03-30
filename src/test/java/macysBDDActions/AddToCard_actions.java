package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import macysBDDElements.AddtoCart_Elements;
import macysBDDElements.HomePageElements;
import macysBDDUtilities.SetupDriver;

public class AddToCard_actions {
	AddtoCart_Elements element;
	
	public AddToCard_actions(){
		element = new AddtoCart_Elements();
		PageFactory.initElements(SetupDriver.driver, element);
	}
	public void openShoesPage() {
		SetupDriver.driver.get("https://www.macys.com/shop/shoes/high-heels?id=71123&cm_sp=c2_1111US_catsplash_shoes-_-row2-_-image_heels&edge=hybrid");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened ==>");
		System.out.println("Shoes Page Loading==>");
	}
	public void systemerror() {
		element.serviceerror.click();
		System.out.println("temporary error!!");

	}
	
	public void dropdownMenu() {
		try {
			Select dropdown = new Select(element.dropdown);
			dropdown.selectByVisibleText("Best Sellers");
			element.dropdown.click();
			element.serviceerror.click();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Failed to select drom drop down Menu !!");
		}
	}
	public void clickInShoe(){
		element.selectedShoe.click();
		System.out.println("selection a heel Now!!");
	}
	public void selectColor(){
		element.color.click();
	}
	public void selectSize(){
		element.size.click();
		
	}
	
	public void cookiesHandle(){
		element.cookies.click();
	}
	public void addToBag(){
		element.addtoBag.click();
	}
		
	}
	


