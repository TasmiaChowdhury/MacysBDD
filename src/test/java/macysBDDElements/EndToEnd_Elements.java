package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class EndToEnd_Elements {

		@FindBy(xpath="//*[@id=\"flexid_1\"]/a/span")
		public WebElement Men;
		
		@FindBy(xpath="//*[@id=\"categoryTree\"]/ul/li[4]/div[1]/div/div/ul/li[11]/a")
		public WebElement Shirt;
		
		
        @FindBy(xpath="//*[@id=\"img_5509420\"]")
		public WebElement desired_Shirt;
		
		
		@FindBy(xpath="//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/ul/li[5]/div/picture/img")
		public WebElement color_black;
		
		@FindBy(xpath="//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/ul/li[1]")
		public WebElement size_S;
		
		@FindBy(id="bag-add-5509420")                                                       //("//*[@id=\"bag-add-5509420\"]")                                             
	                                                                                        //     //*[@id=\"bag-add-13570751\"]
		public WebElement Add_To_Bag;
		
		@FindBy(xpath="//*[@id=\"atbIntCheckout\"]")
		public WebElement Checkout;
		
		@FindBy(xpath="//*[@id=\"servicError\"]/button")
		public WebElement serviceerror; 
		
		@FindBy(xpath=("//*[@id=\"cta-notification-order-panel-5509420\"]/div/div/div[2]/button"))                                         
		//("//*[@id=\"cta-notification-order-panel-5509420\"]/div/div/div[2]/button")
		public WebElement Crosserror; 
	}