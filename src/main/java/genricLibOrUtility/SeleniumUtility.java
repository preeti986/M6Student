package genricLibOrUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {
	public Actions act =null;
	
	public Select s=null;
	/*
	 * This method is useed to maximize the Window
	 * @param driver
	 * 
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/*
	 * This method is used for ImplicitWait
	 * 
	 * @param driver
	 * @param time
	 * 
	 * 
	 */
	public void implicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	/*
	 * This method is used to move a particular element 
	 * 
	 * @param driver
	 * @param element
	 * 
	 */
	public void movingTowardsAnElement(WebDriver driver,WebElement element)
	{
		act =new Actions(driver);
		act.moveToElement(element).perform();;
	}
	/*
	 * This method is used to perform right click operation
	 * 
	 * @param driver
	 * @param element
	 * 
	 */
	
	public void rightClick(WebDriver driver,WebElement element)
	{
		act =new Actions(driver);
		act.contextClick(element).perform();;
		
	}
	/*
	 * This method is used to click on an Element 
	 * 
	 * @param driver
	 * @param element
	 * 
	 */
	public void clickOnElement(WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.click(element).perform();
	}
	/*
	 * This method is used to scroll to a particular element 
	 * 
	 * @param driver
	 * @param element
	 * 
	 */
	
	public void scrollToAparticularElement(WebDriver driver,WebElement element)
	{
		act =new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/*
	 * This method is used to drag an element to its destination 
	 * 
	 * @param driver
	 * @param src
	 * @param dest
	 * 
	 */
	
	public void dragSrcToDest(WebDriver driver,WebElement src, WebElement dest)
	{
		act =new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
	}
	/*
	 * This method is used to drag a pointer
	 * 
	 * @param driver
	 * @param src
	 * @param x
	 * @param y
	 * 
	 * 
	 */
	public void dragPointer(WebDriver driver,WebElement src,int x, int y)
	{
		act =new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
		
	}
	
	/*
	 * This method is used to click and hold
	 * @param driver
	 * @param element
	 * 
	 */
	public void clickAndHoldAnElement(WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.clickAndHold(element).perform();
		
	}
	 /*
	  * this method is used to release an element
	  * @param driver
	  * @param element
	  */
	public void releaseAnElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.release(element).perform();
		
	}
	/*
	  * this method is used to select an option from dropdown based on Index
	  * @param driver
	  * @param element
	  */
	
	public void selectAnElementBasedOnIndex(WebElement element,int indexNo)
	{
		s =new Select(element);
		s.selectByIndex(indexNo);
	}
	/*
	  * this method is used to select an option from dropdown based on Value
	  * @param driver
	  * @param element
	  */
	
	public void selectAnElementBasedOnValue(WebElement element,String Value)
	{
		s =new Select(element);
		s.selectByValue(Value);
	}
	/*
	  * this method is used to select an option from dropdown based on VisibleText
	  * @param driver
	  * @param element
	  */
	
	public void selectAnElementBasedOnVisibleText(WebElement element,String text)
	{
		s =new Select(element);
		s.selectByVisibleText(text);
	}
	
	/*
	  * this method is used to deselect an option from dropdown based on Index
	  * @param driver
	  * @param element
	  */
	
	public void deSelectAnElementBasedOnIndex(WebElement element,int indexNo)
	{
		s =new Select(element);
		s.deselectByIndex(indexNo);
	}
	/*
	  * this method is used to deselect an option from dropdown based on Value
	  * @param driver
	  * @param element
	  */
	
	public void deSelectAnElementBasedOnValueAttribute(WebElement element,String value)
	{
		s =new Select(element);
		s.deselectByValue(value);
	}
	/*
	  * this method is used to deselect an option from dropdown based on VisibleText
	  * @param driver
	  * @param element
	  */
	
	public void deSelectAnElementBasedOnVisibleText(WebElement element,String text)
	{
		s =new Select(element);
		s.deselectByVisibleText(text);
	}
	/*
	  * this method is used to deselect all options
	  * @param driver
	  * @param element
	  */
	
	public void deSelectAllOptions(WebElement element)
	{
		s =new Select(element);
		s.deselectAll();
	}
	
	/*
	 *  this method is used to accept the alert
	  * @param driver
	 */
	public void toAcceptAlert(WebDriver driver)
	{
		Alert alt= driver.switchTo().alert();
		alt.accept();
	}
	/*
	 *  this method helps to dismiss the alert
	  * @param driver
	 */
	public void toDismissAlert(WebDriver driver) {
		Alert alt= driver.switchTo().alert();
		alt.dismiss();
	}
	/*
	 *  this method help to pass the alert msg
	  * @param driver
	  * @param msg
	 */
	public void toPassAlertMsg(WebDriver driver, String msg) {
		Alert alt= driver.switchTo().alert();
		alt.sendKeys(msg);
	}
	/*
	 *  this method help to read the alert msg
	  * @param driver
	  * @return
	 */
	public String toFetchAlertMsg(WebDriver driver) {
		Alert alt= driver.switchTo().alert();
		String alertMsg =alt.getText();
		return alertMsg;
		
	}
	/*
	 * this method will help us to perform its operation
	 * @param driver
	 * @param value
	 */
	
	public void operationsWithJs(WebDriver driver, String value)
	{
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript(value);
	}
	/*
	 *this method is use to capture the Screenshot 
	 * 
	 */
	
	public void captureScreenshot(WebDriver driver, String Path) throws Exception 
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(Path);
		Files.copy(src, dest);
	}
	
	/**
	 * Custom Click
	 * @param driver
	 * @param element
	 * @param time 
	 * @throws Exception
	 * 
	 */
	
	public void ifElementClickFails(WebElement element, WebDriver driver,int time) throws Exception
	{
		
		int count=0;
		int reclickCount=5;
		while(count<=reclickCount)
		{
			element.click();
			Thread.sleep(time);
			break;
		}
	}
	
	/*this method is to handle Window popup
	 * @param driver
	 *
	 * 
	 */
	
	public void windowPopUpHandle(WebDriver driver)
	{
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow =driver.getWindowHandles();
		
		Iterator<String> itr=allWindow.iterator();
		while(itr.hasNext())
		{
			String values =itr.next();
			String title = driver.switchTo().window(values).getTitle();
			if(title.contains(values))
			{
				break;
			}
		
		}
	}
	 
	
	
	 
	 
}
