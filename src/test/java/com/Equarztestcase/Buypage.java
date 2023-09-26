package com.Equarztestcase;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.BuynowFunctionality;
import com.pageobjects.signinFunctionality;

public class Buypage extends Testbase{
	
	

	BuynowFunctionality cf;
	signinFunctionality sg;
	public Buypage() {
		super();
	
	}
	
	@BeforeMethod
	public void cart() throws Exception {
	setup();
	
	sg=new signinFunctionality(driver);
	sg.validatesignin(props.getProperty("Email1"),props.getProperty("Password1"));
	cf=new BuynowFunctionality(driver);
	
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

	@AfterMethod
	public void PRODUCTS() {
		driver.close();
	}

}
