package com.equarzlogin.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.wishlistbase;
import com.pageobjects.searchFunctionalITY;
import com.pageobjects.signtopage;
import com.pageobjects.wishlistFunctionality;

public class wishlistlogin extends wishlistbase{
  
wishlistFunctionality wf;
signtopage sp;
	
	public wishlistlogin(WebDriver driver) {
		super();
	
	}
  @BeforeMethod
	public void initialize() {
		setup();
		sp=new signtopage(driver);
		sp.validsign(props.getProperty("Email"),props.getProperty("Password"));
		wf=new wishlistFunctionality(driver);
	}
	@Test(priority=1)
	public void homeproduct() throws Exception  {
		wf.Homeproducts();
		}
	@Test(priority=2)
	public void searchproduct() throws Exception {
		wf.productsearch();
	}

}

