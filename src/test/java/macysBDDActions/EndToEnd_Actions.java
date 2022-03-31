package macysBDDActions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;

import macysBDDElements.EndToEnd_Elements;
import macysBDDUtilities.SetupDriver;

public class EndToEnd_Actions {

EndToEnd_Elements eTeElements;
	
	//WebDriver driver = new ChromeDriver();

	public EndToEnd_Actions() {
		eTeElements = new EndToEnd_Elements();		
		PageFactory.initElements(SetupDriver.driver, eTeElements);
	}
	

	public void Macys() {
		SetupDriver.driver.get("https://www.macys.com");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();

		
	}
	public void cokies( ) {
		SetupDriver.driver.manage().deleteAllCookies();
		
	}	
		
	public void Click_men() {
		System.out.println("Clicking on Men");
		eTeElements.Men.click();
		SetupDriver.driver.manage().deleteAllCookies();
	}

	
public void Click_Shirt() {
		System.out.println("Clicking on Shirt");
		eTeElements.Shirt.click();
		SetupDriver.driver.manage().deleteAllCookies();
}
	public void systemerror(){
		eTeElements.serviceerror.click();
		
	}
	public void crosserror(){
		eTeElements.Crosserror.click();
		SetupDriver.driver.manage().deleteAllCookies();
		
	}
	
	public void Click_desired_shirt() {
		System.out.println("Clicking on desired Shirt");
		eTeElements.desired_Shirt.click();
		SetupDriver.driver.manage().deleteAllCookies();
}


	public void Click_color_black() {
		System.out.println("Clicking on black color");
		eTeElements.color_black.click();
		SetupDriver.driver.manage().deleteAllCookies();
		
}

	public void Click_size_S() {
		System.out.println("Clicking on size S");
		eTeElements.size_S.click();
		SetupDriver.driver.manage().deleteAllCookies();
}
	public void Click_Add_To_Bag () {
		System.out.println("Clicking on Add to Bag");
		eTeElements.Add_To_Bag.click();
		SetupDriver.driver.manage().deleteAllCookies();

}
	public void Click_Checkout () {
		System.out.println("Clicking on Add to Bag");
		eTeElements.Checkout.click();
		SetupDriver.driver.manage().deleteAllCookies();

}


	public void MacysHomePage() {
		System.out.println("Clicking on Add to Bag");
		eTeElements.Checkout.click();
		SetupDriver.driver.manage().deleteAllCookies();
		
		
	}


	
}