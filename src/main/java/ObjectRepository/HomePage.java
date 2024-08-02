package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement Leads;
	
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement Org;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contacts;
	
	@FindBy(xpath ="//span[text()=' Administrator']/../following-sibling::td[@class='small']/img[1]")
	private WebElement adminHover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement LogoutButton;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getOrg() {
		return Org;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getAdminHover() {
		return adminHover;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	/**
	 * Business Library to click on leads
	 */
	
	public void clickOnLeads()
	{
		Leads.click();
	}
	/**
	 * Business Library to click on org
	 */
	
	public void clickOnOrg()
	{
		Org.click();
	}
	/**
	 * Business Library to click on contacts
	 */
	
	public void clickOnContacts()
	{
		Contacts.click();
	}
	/**
	 * Business Library to perform logout
	 * @param driver
	 */
	
	public void logoutOperation(WebDriver driver)
	{
		Actions act =new Actions(driver);
		act.moveToElement(adminHover).perform();
		LogoutButton.click();
	}
	
		
	
}
