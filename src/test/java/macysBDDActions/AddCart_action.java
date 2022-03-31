package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import macysBDDElements.ElementsTasmia;
import macysBDDElements.Registration__Elements;
import macysBDDElements.EndToEnd_Elements;
import macysBDDUtilities.SetupDriver;

public class AddCart_action{
	
	EndToEnd_Elements eTeElements;
	ElementsTasmia elementTas;
	Registration__Elements Ruby_element;
	
	public AddCart_action() {
		eTeElements = new EndToEnd_Elements();	
		elementTas= new ElementsTasmia();
		 Ruby_element= new Registration__Elements();
		PageFactory.initElements(SetupDriver.driver, eTeElements);
		PageFactory.initElements(SetupDriver.driver, elementTas);
		PageFactory.initElements(SetupDriver.driver, Ruby_element);
	}
	public void Macys() {
		SetupDriver.driver.get("https://www.macys.com/shop/product/club-room-mens-performance-stripe-polo-created-for-macys?ID=5509420&CategoryID=20626&swatchColor=Navy%20Blue");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();

		
	}
	public void cokies( ) {
		SetupDriver.driver.manage().deleteAllCookies();
		
	}
	
	public void Handling_Alert() throws InterruptedException {
		eTeElements.Add_To_Bag.submit();	
		 Alert alert = 	SetupDriver.driver.switchTo().alert();
		String alertMessage= SetupDriver.driver.switchTo().alert().getText();		
 		System.out.println(alertMessage);
 		Thread.sleep(5000);
	     	
	    System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        SetupDriver.driver.manage().deleteAllCookies();
		
	}
	public void alert_clickView() {
		Ruby_element.alertViewBag.click();
		SetupDriver.driver.manage().deleteAllCookies();
	}
}
