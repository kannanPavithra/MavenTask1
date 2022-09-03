package pages;

import org.mavenproject.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnClick;
	
	@FindBy(id="continue")
	private WebElement btncontinue;
 
	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public void selectHotel() {
		click(getBtnClick());
		click(getBtncontinue());

}
}