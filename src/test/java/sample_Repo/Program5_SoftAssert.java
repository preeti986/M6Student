package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program5_SoftAssert  {
	
	@Test
	public void strictLevelComparison() {
		String expectedValue ="raja";
		String actualValue ="Raja";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(actualValue, expectedValue);
		System.out.println("assertion passed!!");
		sf.assertAll();
		
	}
	@Test
	public void containsLevel() {
		
		String expectedValue ="raja";
		String actualValue ="Maharaja";
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(actualValue.contains(expectedValue));
		System.out.println("contains passed");
		sf.assertAll();
	}
}
