package pages;

import org.mavenproject.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="my_itinerary")
	private WebElement itinearylist;
	@FindBy(name="ids[]")
	private WebElement checkin;
	@FindBy(name="cancelall")
	private WebElement cancel;
	
	public WebElement getItinearylist() {
	return itinearylist;
}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCancel() {
		return cancel;
	}




	public void cancelBooking() {
		
		click(getItinearylist());
		click(getCheckin());
		click(getCancel());
		acceptAlert();
	}

	
	 
	

}
