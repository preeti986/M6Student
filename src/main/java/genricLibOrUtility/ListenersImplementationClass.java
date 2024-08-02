package genricLibOrUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;


public class ListenersImplementationClass implements ITestListener
{
//public SeleniumUtility sutil=new SeleniumUtility();
//sutil.captureScreenshot("C:\Selenium");
@Override
public void onTestStart(ITestResult result) {
	String methodName=result.getMethod().getMethodName();
	Reporter.log(methodName+"execution starts");
	}
@Override
public void onTestSuccess(ITestResult result) {
	String methodName=result.getMethod().getMethodName();
	Reporter.log(methodName+"execution pass");
	
}

@Override
public void onTestFailure(ITestResult result) {
	String methodName=result.getMethod().getMethodName();

TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File(".\\ScreenShotFolder" +methodName+".png");
try {
	Files.copy(src,dest);
} 
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
@Override
public void onTestSkipped(ITestResult result) {
	String methodName=result.getMethod().getMethodName();
	Reporter.log(methodName+"execution skip");
}
}