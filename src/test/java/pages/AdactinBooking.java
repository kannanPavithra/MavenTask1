package pages;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mavenproject.BaseClass;

public class AdactinBooking extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		
	}
	 
	@Test
 
	public void Booking() throws IOException, InterruptedException {
		// login
	Login loginPage= new Login();
	loginPage.login(getData("Datas", 1, 0), getData("Datas",1,1));
	
		//search hotel
	
	SearchHotelPage searchHotelPage= new SearchHotelPage();
	searchHotelPage.searchHotels(getData("Datas", 1, 2), getData("Datas", 1, 3), getData("Datas", 1, 4), getData("Datas", 1, 5), getData("Datas", 1, 6), getData("Datas", 1, 7), getData("Datas", 1, 8), getData("Datas", 1, 9));
		
	//select hotel
	
	SelectHotelPage selectHotelPage= new SelectHotelPage();
	selectHotelPage.selectHotel();
	
	//book hotel
	
	BookHotel bookHotels= new BookHotel();
	bookHotels.bookHotel(getData("Datas", 1, 10), getData("Datas",1, 11), getData("Datas", 1, 12), getData("Datas", 1, 13), getData("Datas", 1, 14), getData("Datas", 1, 15), getData("Datas", 1, 16), getData("Datas", 1, 17));
		
	// booking confirm page
	
	 BookingConfirmPage bookingConfirmPage=new BookingConfirmPage();
	 bookingConfirmPage.bookingConfrimPage();
	
	 
	 //cancel booking
	 
	 CancelBookingPage cancelBookingPage= new CancelBookingPage();
	 cancelBookingPage.cancelBooking();
		
		
		
		
	

	}
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public static void afterClass() {
		//quit();
		

	}
	
	
	
}
