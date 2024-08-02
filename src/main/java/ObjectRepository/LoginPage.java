package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**	
 * This is a LoginPage POM class
 * @author 
 * 
 */

public class LoginPage 
{
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsername() 
	{
		return username;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getLoginButton() 
	{
		return LoginButton;
	}
	
	public void loginToApplication(String username,String password)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
	}
	
	
	
	
}
