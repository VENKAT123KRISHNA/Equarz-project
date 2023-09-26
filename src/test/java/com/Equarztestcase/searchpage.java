package com.Equarztestcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.searchFunctionality;

public class searchpage extends Testbase{
	
searchFunctionality sg;
	
	public searchpage() {
		super();
	
	}
  @BeforeMethod
	public void initialize() {
		setup();
		sg=new searchFunctionality(driver);
	}
	@Test(priority=1)
	public void verifysaerch() throws Exception {
		sg.searchproducts();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/",url);
		
	}		

}

	
	


