package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for create lead 
 * @author preeti
 * @version 7.1.24
 */
public class CreatingLeadLPage {
	
@FindBy(xpath="//input[@name=\"firstname\"]")
private WebElement Firstname;

@FindBy(xpath="//input[@name=\"lastname\"]")
private WebElement lastname ;

@FindBy(xpath="//input[@name=\"company\"]")
private WebElement company;

@FindBy(xpath="//input[@name=\"noofemployees\"]")
private WebElement NoEmployees;

@FindBy(xpath="//input[@id=\"designation\"]")
private WebElement Title;

@FindBy(xpath="//input[@name=\"mobile\"]")
private WebElement MobNo;

@FindBy(xpath="//input[@name=\"phone\"]")
private WebElement phoneno;

@FindBy(xpath="//input[@name=\"email\"]")
private WebElement email;

@FindBy(xpath="//textarea[@name=\"lane\"]")
private WebElement street;

@FindBy(xpath="//input[@id=\"code\"]")
private WebElement postalcode;

@FindBy(xpath="//input[@id=\"country\"]")
private WebElement country;

@FindBy(xpath="//input[@id=\"pobox\"]")
private WebElement pobox;

@FindBy(xpath="//input[@id=\"city\"]")
private WebElement city;

@FindBy(xpath="//input[@id=\"state\"]")
private WebElement state;

@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
private WebElement saveBtton;


/**
 * this is the constuctor
 * @param driver
 */

public CreatingLeadLPage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}

/**
 * these are the getters
 * @return
 */


public WebElement getFirstname() 
{
	return Firstname;
}


public WebElement getLastname() 
{
	return lastname;
}



public WebElement getCompany() {
	return company;
}



public WebElement getNoEmployees() {
	return NoEmployees;
}






public WebElement getTitle() {
	return Title;
}






public WebElement getMobNo() {
	return MobNo;
}






public WebElement getPhoneno() {
	return phoneno;
}






public WebElement getEmail() {
	return email;
}






public WebElement getStreet() {
	return street;
}






public WebElement getPostalcode() {
	return postalcode;
}






public WebElement getCountry() {
	return country;
}






public WebElement getPobox() {
	return pobox;
}



public WebElement getCity() {
	return city;
}


public WebElement getState() {
	return state;
}


public WebElement getSaveBtton() {
	return saveBtton;
}


/**
 *  this is business logic for employee name
 * @param fname
 * @param lname
 * @param com
 */

public void createlead(String fname,String lname,String com) {
	Firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	company.sendKeys(com);
	saveBtton.click();
}
}
