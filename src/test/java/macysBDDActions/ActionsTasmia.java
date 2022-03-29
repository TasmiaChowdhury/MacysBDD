package macysBDDActions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import macysBDDElements.ElementsTasmia;
import macysBDDUtilities.SetupDriver;



public class ActionsTasmia {
	
	ElementsTasmia elementTas;
		
	public ActionsTasmia(){
		elementTas = new ElementsTasmia();
		PageFactory.initElements(SetupDriver.driver, elementTas);
	
	}
	public void openMacysSignin() {
		SetupDriver.driver.get("https://www.macys.com/account/signin");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("chrome opened ==>");
	}
	
	public void inputEmail(){
		elementTas.emailId.sendKeys("TestEMail@gmail.com");
		System.out.println("Passing email ==>");
		//elementTas.emailId.sendKeys("alex");
	}
	
	public void inputPass(){
//		Set_Drivers.driver.findElement(By.xpath("//input[@id='pw-input']")).sendKeys("Galaxy2022!");
		elementTas.password.sendKeys("hello123");
		System.out.println("Passing password ==>");
		//elementTas.password.sendKeys("hello123");
	}
	public void clickSignin(){
		System.out.println("clicked on sign in button ==>");
		SetupDriver.driver.findElement(By.xpath("//input[@id='sign-in']")).click();
		//elementTas.clickSubmit.click();
	}
	
	public void errormessage(){
		System.out.println("output signin/error ==>");
		//String s = Set_Drivers.driver.findElement(By.xpath("//p[@class='notification-body']")).getText();
		//System.out.println("unable to login for system issue: " + s);
	}
	
	}


