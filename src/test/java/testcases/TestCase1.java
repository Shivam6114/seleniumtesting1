package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeMethod
	public void createDBConn() {
		System.out.println("Creating db conn");
	}
	
	@AfterMethod
	public void closeDBConn() {
		System.out.println("Closing db conn");
	}

	@BeforeMethod
	public void lounchBrowser() {
		System.out.println("Lounching browser");
	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Close the browser");
	}

	@Test(priority = 1)
	public void doUserReg() {

		System.out.println("Executing User Reg Test");
	}

	@Test(priority = 2)
	public void dologin() {

		System.out.println("Executing login Test");
	}

}
