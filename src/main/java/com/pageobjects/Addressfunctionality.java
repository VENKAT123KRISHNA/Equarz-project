package com.pageobjects;

import java.util.Iterator; 
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Testbase;

public class Addressfunctionality extends Testbase{
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[class='navbar-tool-text']")
	WebElement dashboard;
	@FindBy(css ="[href='http://e-quarz.com/account-oder']")
	WebElement myorderbtn;
	@FindBy(css ="[href='http://e-quarz.com/account-address']")
	WebElement Addressbtn;
	
	
	@FindBy(id ="add_new_address")
	WebElement Addnewaddressbtn;
	@FindBy(id = "name")
	WebElement contactnamebox;
	@FindBy(id = "phone")
	WebElement phonenumberbox;
	@FindBy(id = "address-city")
	WebElement citybox;
	@FindBy(id = "zip")
	WebElement zipcodebox;
	@FindBy(css = "[class='filter-option-inner-inner']")
	WebElement countrybox;
	@FindBy(css = "[role='textbox']")
	WebElement searchbox;
	@FindBy(xpath = "//span[text()='India']")
     WebElement indianame;
	@FindBy(id = "address")
	WebElement addressbox;
	@FindBy(xpath = "//button[text()='Add Informations  ']")
	WebElement addinfobtn;
	@FindBy(xpath = "//button[text()='Close']")
	WebElement closebtn;
	
	@FindBy(id = "edit")
	WebElement editbtn;
	@FindBy(id = "person_name")
	WebElement editname;
	@FindBy(id = "own_phone")
	WebElement editphone;
	@FindBy(id = "city")
	WebElement editcity;
	@FindBy(xpath = "//button[text()='Add Informations  ']")
	WebElement updatebtn;
	@FindBy(css = "[class='closeB btn btn-secondary']")
	WebElement editclosebtn;
	
	@FindBy(id = "delete")
	WebElement deletebtn;
	
	
	
	
	
	public Addressfunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );
}
     
	public Hompage Addrespage() {
		
		Actions ac=new Actions(driver);
		ac.moveToElement(dashboard).build().perform();
		 
		 myorderbtn.click();
		 Addressbtn.click();
		 
		 return new Hompage();
	}
	
	
	
	
	public   void validaddress(String name,String phone,String city,String zip,String country,String address) throws Throwable  {
		
		Addnewaddressbtn.click();
		contactnamebox.sendKeys(name);
		phonenumberbox.sendKeys(phone);
		citybox.sendKeys(city);
		zipcodebox.sendKeys(zip);
		countrybox.click();
		searchbox.sendKeys(country);
		
		//for(WebElement india:indianame)
			
		//if(india.getText().contains("india")) {
			Thread.sleep(2000);	
			
		indianame.click();
		//}
		 addressbox.sendKeys(address);
		 
		 Thread.sleep(3000);
		 
		 addinfobtn.click();
		 //closebtn.click();
		Alert al=driver.switchTo().alert();
		al.dismiss();
		
	}
 
	public void editaddress() throws Exception {
		
		
		editbtn.click();
		Thread.sleep(4000);
		editname.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		editname.sendKeys("venkat");
		editphone.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		editphone.sendKeys("7788223344"); 
		editcity.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		editcity.sendKeys("guntur"); 
		 updatebtn.click();
		 editclosebtn.click();
	}


   public void deletaddress() {
	   deletebtn.click();
	   Alert al=driver.switchTo().alert();
	   al.accept();
	   //deletebtn.sendKeys(Keys.ENTER);
	   
	   
	   
   }



}
