package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class of create organization
 */
public class CreateOrganizationPage {

	@FindBy(xpath="//input[@name=\"accountname\"]")
	private WebElement organizationname;
	
	@FindBy(xpath="//input[@name=\"website\"]")
	private WebElement website;
	
	@FindBy(xpath="//input[@name=\"employees\"]")
	private WebElement employees;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	private WebElement phoneno;
	
	@FindBy(xpath="//input[@id=\"otherphone\"]")
	private WebElement    otherphoneno;
	
	@FindBy(xpath="//input[@id=\"email1\"]")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name=\"bill_street\"]")
	private WebElement billingaddress;
	
	@FindBy(xpath="//input[@id=\"bill_state\"]")
	private WebElement buillingstate;
	
	@FindBy(xpath="//input[@id=\"bill_city\"]")
	private WebElement city;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement saveBtn;

	public CreateOrganizationPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getOrganizationname() {
		return organizationname;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getOtherphoneno() {
		return otherphoneno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getBuillingstate() {
		return buillingstate;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * this is the business class of organization fields
	 * @param orgn
	 * @param webs
	 * @param emp
	 */
	public void organizationoperation(String orgn,String webs,String emp) {
		organizationname.sendKeys(orgn);
		website.sendKeys(webs);
		employees.sendKeys(emp);
		saveBtn.click();
	}
	/**
	 * this is the business library for creating organization
	 * @param orgn
	 * @param webs
	 * @param emp
	 * @param phno
	 * @param ophno
	 * @param id
	 * @param BAd
	 * @param BS
	 * @param cty
	 */
	
	public void organizationoperation(String orgn,String webs,String emp,String phno,String ophno,String id,String BAd,String BS,String cty) {
		organizationname.sendKeys(orgn);
		website.sendKeys(webs);
		employees.sendKeys(emp);
		//saveBtn.click();
		phoneno.sendKeys(phno);
		otherphoneno.sendKeys(ophno);
		email.sendKeys(id);
		billingaddress.sendKeys(BAd);
		buillingstate.sendKeys(BS);
		city.sendKeys(cty);
		saveBtn.click();
	}
	
	/**
	 * this is the business library of the employee shipping address
	 * @param orgn
	 * @param webs
	 * @param emp
	 * @param BAd
	 * @param BS
	 * @param cty
	 */
	public void organizationoperation(String orgn,String webs,String emp,String BAd,String BS,String cty) {
			organizationname.sendKeys(orgn);
			website.sendKeys(webs);
			employees.sendKeys(emp);
			billingaddress.sendKeys(BAd);
			buillingstate.sendKeys(BS);
			city.sendKeys(cty);
			saveBtn.click();
	}
	
	/**
	 * this is the business library of employee details
	 * @param orgn
	 * @param webs
	 * @param phno
	 * @param ophno
	 * @param id
	 */
	public void organizationoperation(String orgn,String webs,String phno,String ophno,String id) {
			organizationname.sendKeys(orgn);
			website.sendKeys(webs);	
			phoneno.sendKeys(phno);
			otherphoneno.sendKeys(ophno);
			email.sendKeys(id);
			saveBtn.click();
	}
}
	