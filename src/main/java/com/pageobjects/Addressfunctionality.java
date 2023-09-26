package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(linkText = "//span[text()='India']")
	WebElement indianame;
	@FindBy(id = "address")
	WebElement addressbox;
	@FindBy(linkText = "//button[text()='Add Informations  ']")
	WebElement addinfobtn;
	@FindBy(linkText = "(//button[text()='Close'])[1]")
	WebElement closebtn;
	@FindBy(id = "edit")
	WebElement editbtn;
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
		contactnamebox.sendKeys("name");
		phonenumberbox.sendKeys("phone");
		citybox.sendKeys("city");
		zipcodebox.sendKeys("zip");
		countrybox.click();
		searchbox.sendKeys("country");
		indianame.click();
		 addressbox.sendKeys("address");
		 addinfobtn.click();
		 //closebtn.click();
		
		
	}
 
	public void editaddress() {
		
		
		editbtn.click();
		
	}


   public void deletaddress() {
	   deletebtn.click();
	   
	   
	   
   }



}
