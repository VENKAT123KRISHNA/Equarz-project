package com.equarzlogin.testcase;

import org.openqa.selenium.WebDriver; 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.loginFunctionality;

public class Loginpage extends Testbase{
	
     //WebDriver driver;
	loginFunctionality lg;
	
	public Loginpage() {
		super();
	}
	@BeforeMethod
	public void intialize() {
		setup();
		lg=new loginFunctionality(driver);
	}
	@Test(priority=1)
	public void verifyLogin() throws Exception {
		lg.ValidateLogin();
	}
//	@Test(priority=2)
//	public void verifyurl() {
//		lg.ValidateLogin();
//	   String url=driver.getCurrentUrl();
//	   Assert.assertEquals("http://e-quarz.com/admin",url);
//	}
//	@AfterMethod
//	public void teardown() {
//		driver.close();
	//}
}
