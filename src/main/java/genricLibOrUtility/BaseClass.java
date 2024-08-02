package genricLibOrUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass 
{
public static WebDriver driver =null;
public PropertiesUtilityOrLib PUTIL =null;
public SeleniumUtility SUTIL =null;

@BeforeSuite
public void createDbConnection()
{
	System.out.println("db connection Successfull!!");
}

@BeforeClass
public void launchBrowser() throws Exception
{
	PUTIL= new PropertiesUtilityOrLib();
	String URL=PUTIL.getDataFromProperties("url");
	
	driver =new ChromeDriver();
	SUTIL.implicitWait(driver, 10);
	SUTIL.maximizeWindow(driver);
	driver.get(URL);
	
	System.out.println("Launching Browser");
}

@BeforeMethod
public void loginOperation() throws Exception
{
	String USERNAME=PUTIL.getDataFromProperties("username");
	String PASSWORD=PUTIL.getDataFromProperties("password");
	LoginPage lp = new LoginPage(driver);
	lp.loginToApplication(USERNAME,PASSWORD);
	System.out.println("Login Successfull!!");
}

@AfterMethod
public void logoutOperation()
{
	HomePage hp = new HomePage(driver);
	hp.logoutOperation(driver);
	System.out.println("Logout Successfull!!");
}

@AfterClass
public void closeBrowser()
{
	driver.close();
	System.out.println("Browser Closed successfully!!");
}

@AfterSuite
public void closeDB()
{
	System.out.println("db connection closed!!");
	
}


}
