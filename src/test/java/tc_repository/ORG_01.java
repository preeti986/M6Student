package tc_repository;

import org.testng.annotations.Test;

import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import genricLibOrUtility.BaseClass;
import genricLibOrUtility.ExcelUtility;
import genricLibOrUtility.JavaLibrary;

public class ORG_01 extends BaseClass 
{
	@Test
	public void ORG_01() throws Exception{
		//JavaLibrary JUTIL =new JavaLibrary();
		//int num=JUTIL.generateRandomNumber(10000);
		
		ExcelUtility EUTIL = new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organization",2,1);
		String WEBSITE=EUTIL.readDataFromExcel("Organization",2,2);
		String EMP =EUTIL.readDataFromExcel("Organization",2,3);
		HomePage hp =new HomePage(driver);
		hp.clickOnOrg();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickonCreateOrgButton();
		CreateOrganizationPage cop = new CreateOrganizationPage(driver);
		cop.organizationoperation(ORGNAME, WEBSITE,EMP);
		
	}
	

}
