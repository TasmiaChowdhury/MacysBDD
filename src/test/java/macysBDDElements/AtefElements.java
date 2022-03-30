package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AtefElements {
	
	@FindBy(id = "\"globalSearchInputField\"")
	public WebElement search;

	@FindBy(id = "searchSubmit")
	public WebElement searchbtn;

	@FindBy(xpath = "//*[@id=\"mainCont\"]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[2]/div[1]/picture[1]/img[1]")
	public WebElement item;

	@FindBy(xpath = "//*[@id=\"mcom-a11y-6698085\"]/picture[1]/img[1]" )
	public WebElement color;
	
	@FindBy(xpath = "//*[@id=\"mainCont\"]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[2]")
	public WebElement sizee;
	
	@FindBy(xpath = "//*[@id=\"bag-add-4339197\"]")
	public WebElement addbtn;
		
		
		
	}


