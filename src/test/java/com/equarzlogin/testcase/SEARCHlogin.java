package com.equarzlogin.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.searchbase;
import com.pageobjects.searchFunctionalITY;
import com.pageobjects.signfunctionality;

public class SEARCHlogin extends searchbase{
searchFunctionalITY sg;
	
	public SEARCHlogin() {
		super();
	
	}
  @BeforeMethod
	public void initialize() {
		setup();
		sg=new searchFunctionalITY(driver);
	}
	@Test(priority=1)
	public void verifyLogin() throws Exception {
		sg.validatesearch();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/",url);
		
	}		

}
