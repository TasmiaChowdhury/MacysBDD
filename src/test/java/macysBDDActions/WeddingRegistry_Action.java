package macysBDDActions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import macysBDDElements.Wedding_ELements;
import macysBDDUtilities.SetupDriver;

public class WeddingRegistry_Action {
	Wedding_ELements object4;

public WeddingRegistry_Action(){
	object4=new Wedding_ELements();
	PageFactory.initElements(SetupDriver.driver, object4);
}
public void get_Weddingpage() {
	SetupDriver.driver.get("https://www.macys.com/s/registry-top-reasons/");
	SetupDriver.driver.manage().window().maximize();
	SetupDriver.driver.manage().deleteAllCookies();
}
public void create_registry () {
	object4.createRegistry.click();
	SetupDriver.driver.manage().deleteAllCookies();
}
public void putEmail() {
	object4.emailEntry.sendKeys("Galaxyqaaa2022@gmail.com");
	SetupDriver.driver.manage().deleteAllCookies();
}

public void putPassword() {
	object4.passwordEntry.sendKeys("Galaxy2022!");
	SetupDriver.driver.manage().deleteAllCookies();
}
public void reentrypass() {
	object4.verifyPass.sendKeys("Galaxy2022!");
	SetupDriver.driver.manage().deleteAllCookies();
}

public void SecurityQuestion() {
	object4.drpmenu.click();
	
	Select sc= new Select (object4.drpmenu);
	try{
		sc.selectByVisibleText("What was the name of your first pet ?");
		sc.selectByIndex(8);
	}catch(Exception e) {
		e.getStackTrace();
		System.out.println("Failed to select from dropdown menu");
	}
    SetupDriver.driver.manage().deleteAllCookies();

}	

	public void QuestionAnswer() {
	object4.answer.sendKeys("Mini");
    SetupDriver.driver.manage().deleteAllCookies();
}

public void Click_continue() {
	try{
		//object4.Continue.isDisplayed();
		object4.Continue.click();
	}catch(Exception e) {
		e.getStackTrace();
		SetupDriver.driver.get("https://www.macys.com/wgl/registry/create-registry/?cm_sp=registry_sign_in-create_registry-sign-in&lid=registrytopreasons_topnav-createyourregistry");
	}
	
}
public boolean additional_info() {
	return object4.additionalInfo.isDisplayed();
}

}

