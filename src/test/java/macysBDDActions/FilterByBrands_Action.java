package macysBDDActions;

import org.openqa.selenium.support.PageFactory;

import macysBDDElements.Registration__Elements;
import macysBDDUtilities.SetupDriver;

public class FilterByBrands_Action {
	Registration__Elements Ruby_elements;

	public FilterByBrands_Action() {
		Ruby_elements = new Registration__Elements();

		PageFactory.initElements(SetupDriver.driver, Ruby_elements);

	}

	public void get_page() {
		SetupDriver.driver.get("https://www.macys.com/shop/handbags-accessories?id=26846");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().deleteAllCookies();

	}

	public void click_brands() {
		Ruby_elements.brand_expnd.click();
		SetupDriver.driver.manage().deleteAllCookies();
	}

	public void click_guess() {
		try {
			Ruby_elements.Guess.click();
			SetupDriver.driver.manage().deleteAllCookies();
		}catch(Exception e) {
			SetupDriver.driver.get("https://www.macys.com/shop/handbags-accessories/guess?id=35848&edge=hybrid");
			SetupDriver.driver.manage().window().maximize();
			SetupDriver.driver.manage().deleteAllCookies();
	}
	}

	public void Click_product() {
		try {
		Ruby_elements.product.click();
		SetupDriver.driver.manage().deleteAllCookies();
	}catch(Exception e) {
		SetupDriver.driver.get("https://www.macys.com/shop/product/guess-gillian-mini-flap-crossbody?ID=13264284&CategoryID=35848&swatchColor=Black");
		SetupDriver.driver.manage().deleteAllCookies();
	}
	}
	
	
}
