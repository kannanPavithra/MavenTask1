package org.mavenproject;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotel extends BaseClass {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		AdactinHotel adactin =new AdactinHotel();
		adactin.bookHotel();
	}
	private void bookHotel() throws IOException, InterruptedException {
		getDriver();
		
		
		
		
		loadUrl("https://adactinhotelapp.com/");
		getCurrentUrl();
		
		
		implicitwait();
		 maximize();
		 //findelement
		 WebElement txtusername = findLocatorById("username");
		
		  //.sendkeys
		 String name = getData("Datas", 1, 0);
		 sendkeys(txtusername, name);
		 
		 //findelement
		 WebElement password = findLocatorById("password");
		 String pass = getData("Datas", 1, 1);
		 sendkeys(password, pass);
		 WebElement btnlogin = findLocatorById("login");
		 click(btnlogin);
		 
		 WebElement location = findLocatorById("location");
		 String data = getData("Datas", 1, 2);
		 sendkeys(location, data);
		 //selectByValue(data, location);
		 
	 WebElement hotel = findLocatorById("hotels");
	 String data2 = getData("Datas", 1, 3);
	 sendkeys(hotel, data2);
	 //selectByValue(data2, hotel);
		 
	 WebElement roomtype = findLocatorById("room_type");
		 String data3 = getData("Datas", 1, 4);
		 sendkeys(roomtype, data3);
		// selectByValue(data3, roomtype);
		 
		 WebElement room = findLocatorById("room_nos");
		 String data4 = getData("Datas", 1, 5);
		 sendkeys(room, data4);
		// selectByValue(data4, room);
		 
		 WebElement datecheckin = findLocatorById("datepick_in");
		 clearMethod(datecheckin);
		 String data5 = getData("Datas", 1, 6);
		 sendkeys(datecheckin, data5);
		 
		 
		 WebElement datecheckout = findLocatorById("datepick_out");
		 clearMethod(datecheckout);
		 String data6 = getData("Datas", 1, 7);
		 sendkeys(datecheckout, data6);
		 
		 WebElement adultroom = findLocatorById("adult_room");
		 String data7 = getData("Datas", 1, 8);
		 selectByIndex(adultroom, 2);
		 
		 WebElement childroom = findLocatorById("child_room");
		 String data8 = getData("Datas", 1, 9);
		 selectByIndex(childroom, 2);
		 
		 WebElement btnsubmit = findLocatorById("Submit");
		 click(btnsubmit);
		 
		 WebElement radiobtn = findLocatorById("radiobutton_0");
		 click(radiobtn);
		 
		 WebElement cntbtn = findLocatorById("continue");
		 click(cntbtn);
		 
		 WebElement firstname = findLocatorById("first_name");
		 String data9 = getData("Datas", 1, 10);
		 sendkeys(firstname, data9);
		 
		 WebElement lastname = findLocatorById("last_name");
		 String data10 = getData("Datas", 1, 11);
		 sendkeys(lastname, data10);
		 
		 WebElement address = findLocatorById("address");
		 String data11 = getData("Datas", 1, 12);
		 sendkeys(address, data11);
		 
		 WebElement ccnum = findLocatorById("cc_num");
		 String data12 = getData("Datas", 1, 13);
		 sendkeys(ccnum, data12);
		 
		 WebElement cctyp = findLocatorById("cc_type");
		 String data13 = getData("Datas", 1, 14);
		 sendkeys(cctyp, data13);
		 
		 WebElement ccmonth = findLocatorById("cc_exp_month");
		 String data15 = getData("Datas", 1, 15);
		 sendkeys(ccmonth, data15);
		 
		 WebElement ccyr = findLocatorById("cc_exp_year");
		 String data16 = getData("Datas", 1, 16);
		 sendkeys(ccyr, data16);
		 
		 WebElement ccvv = findLocatorById("cc_cvv");
		 String data17 = getData("Datas", 1, 17);
		 sendkeys(ccvv, data17);
		 Thread.sleep(5000);
		  
		 WebElement booknow = findLocatorById("book_now");
		 click(booknow);
		 
      WebElement txtOrderId = findLocatorById("order_no");
      Thread.sleep(5000);
      String text = getAttribute(txtOrderId);
      writeData("Datas", 1, 18, text);
		
	}


}