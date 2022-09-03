package pages;

import org.mavenproject.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	
	public  Login() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id="username")
	private WebElement txtUserName;
	
	@FindBy (id="password")
	private WebElement txtPassword;
	
	@FindBy (id="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String Username, String Password) {
		sendkeys(getTxtUserName(), Username);
		sendkeys(getTxtPassword(), Password);
		click(getBtnLogin());
		
		
	}
	

}
