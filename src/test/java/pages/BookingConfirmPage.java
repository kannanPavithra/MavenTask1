package pages;

import java.io.IOException;

import org.mavenproject.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	

	public WebElement getOrderno() {
		return orderno;
		
		
	}
	
	



	public void bookingConfrimPage() throws InterruptedException
	{
		Thread.sleep(5000);
		getAttribute(getOrderno());
		 

}
}