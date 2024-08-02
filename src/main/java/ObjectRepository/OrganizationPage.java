package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{

	@FindBy(xpath="//img[@title='Create Organization...']	")
	private WebElement createNewOrgButton;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewOrgButton() 
	{
		return createNewOrgButton;
	}
	
	
	public void clickonCreateOrgButton()
	{
		createNewOrgButton.click();
	}
	
	
	
}
