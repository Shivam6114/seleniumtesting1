package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(priority = 1)
	public void doUserReg() {

		System.out.println("Executing User Reg Test");
		Assert.fail("User not registered successfully");
	}

	@Test(priority = 2,dependsOnMethods="doUserReg")
	public void dologin() {

		System.out.println("Executing login Test");
	}

	@Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true)
	public void thirdTest(){
		
		System.out.println("Executing Third Test");
	}
	@Test(priority=4,dependsOnMethods="doUserReg")
	public void fourthTest(){
		
		System.out.println("Executing Fourth Test");
	}

	
}
