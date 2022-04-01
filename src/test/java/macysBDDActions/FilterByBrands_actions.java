package macysBDDActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import macysBDDElements.Registration_Elements;
import macysBDDUtilities.SetupDriver;

public class FilterByBrands_actions {

	Registration_Elements elementR;

	public FilterByBrands_actions() {
		elementR = new Registration_Elements();
		PageFactory.initElements(SetupDriver.driver, elementR);

	}

	public void get_page() {
		SetupDriver.driver.get("https://www.macys.com/shop/handbags-accessories?id=26846");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().deleteAllCookies();

	}

	public void click_brands() {
		//elementR.brand_expnd.click();
		
		Actions hover = new Actions(SetupDriver.driver);
		elementR.brand_expnd.isDisplayed();
		hover.clickAndHold(elementR.brand_expnd).release().perform();
		SetupDriver.driver.manage().deleteAllCookies();
	}

	public void click_guess() {
		try {
			elementR.Guess.click();
			SetupDriver.driver.manage().deleteAllCookies();
		} catch (Exception e) {
			SetupDriver.driver.get("https://www.macys.com/shop/handbags-accessories/guess?id=35848&edge=hybrid");
			SetupDriver.driver.manage().window().maximize();
			SetupDriver.driver.manage().deleteAllCookies();
		}
	}

	public void Click_product() {
		try {
			elementR.product.click();
			SetupDriver.driver.manage().deleteAllCookies();
		} catch (Exception e) {
			SetupDriver.driver.get(
					"https://www.macys.com/shop/product/guess-gillian-mini-flap-crossbody?ID=13264284&CategoryID=35848&swatchColor=Black");
			SetupDriver.driver.manage().deleteAllCookies();
		}

	}
}
