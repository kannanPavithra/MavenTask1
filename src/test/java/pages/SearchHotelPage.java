package pages;

import org.mavenproject.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnlocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checkindates;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement btnsubmit;

	
	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckindates() {
		return checkindates;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public void searchHotels (String location , String hotels, String roomtype, String roomno,String checkindates, String checkoutdate,String adultroom, String childroom) {
	
		selectByText(getdDnlocation(),location);
		selectByText(getdDnhotels(),hotels);
		selectByText(getRoomtype(),roomtype);
		selectByText(getRoomno(),roomno);
		sendkeys(getCheckindates(), checkindates);
		sendkeys(getCheckoutdate(), checkoutdate);
		selectByText( getAdultroom(),adultroom);
		selectByText(getChildroom(),childroom);
		click(getBtnsubmit());;
		
}}
