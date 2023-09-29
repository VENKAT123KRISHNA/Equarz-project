package com.Equarztestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.cartFunctionality;
import com.pageobjects.signinFunctionality;

public class cartpage extends Testbase{
	
	cartFunctionality cf;
	signinFunctionality sg;
	public cartpage() {
		super();
	
	}
	
	@BeforeMethod
	public void cart() throws Exception {
	setup();
	
	sg=new signinFunctionality(driver);
	sg.validatesignin(props.getProperty("Email1"),props.getProperty("Password1"));
	cf=new cartFunctionality(driver);
	
	}

	@Test(priority=1)
	public void banerproducts() {
		cf.bannerproducts();
		}
	
	@Test(priority=2)
	public void Homproducts() {
		cf.homeproducts();
		}
	@Test(priority=3)
	public void CategoryProducts() {
		cf.categeryproducts();
	}
   
	@Test(priority=4)
	public void SearchProducts() throws Exception {
		cf.searchproducts();
	}

	@Test(priority = 5)
	public void wishlistproducts() {
		cf.wishproducts();
	}
	
	@AfterMethod
	public void PRODUCTS() {
		driver.close();
	}


}
