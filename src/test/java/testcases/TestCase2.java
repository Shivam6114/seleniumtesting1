package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	@Test
	public void validateTitles() {
		String expected_title = "Yahoo.com";
		String actual_title = "Yahoo.com";
		
		SoftAssert SoftAssert = new SoftAssert();
		
//		if(expected_title.equals(actual_title)) {
//		System.out.println("Test case pass");
//     	}else {
//		System.out.println("Test case fail");
		System.out.println("Validating title");
		SoftAssert.assertEquals(actual_title, expected_title);
//     	Assert.assertTrue(false,"Element not found");
		System.out.println("Validating image");
		SoftAssert.assertEquals(true, true,"image not present");
		System.out.println("Validate text box presence");
		SoftAssert.assertEquals(true, true,"text box not present");
//		Assert.fail("Failing the test as the condition is not met");
	
	
		SoftAssert.assertAll();
	}
	

}
