package com.Equarztestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.Addressfunctionality;
import com.pageobjects.signinFunctionality;
import com.utils.signuputils;
import com.utils.sognup2tUtils;

public class addresspage  extends Testbase{
	
	Addressfunctionality as;
	signinFunctionality sf;
	
	public final String sheetName="address";
	
	@DataProvider
	public String[][] NewAddress() throws Exception{
		return sognup2tUtils.signupdata(sheetName) ;
		
	}
	public addresspage() {
		super();
	}
	@BeforeMethod
	public void intialize() throws Exception {
		setup();
		sf=new signinFunctionality(driver);
		sf.validatesignin(props.getProperty("Email1"),props.getProperty("Password1"));
		as=new Addressfunctionality(driver);
		as.Addrespage();
	}
	@Test(priority=1,dataProvider="NewAddress",dataProviderClass=addresspage.class)
	public void Addaddress(String name,String phone,String city,String zip,String country,String address) throws Throwable {
		as.validaddress(name,phone,city,zip,country,address);
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/account-address",url);
		
	}
	@Test(priority =2)
	public void editsaddress() throws Exception {
		
		as.editaddress();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/account-address-edit/22",url);
		
	}
     @Test(priority=3)
	public void deleteaddress() {
		as.deletaddress();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/account-address",url);
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
}
