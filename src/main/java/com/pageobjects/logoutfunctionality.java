package com.pageobjects;

import java.awt.Desktop.Action; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.webaudio.WebAudio;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class logoutfunctionality extends Testbase{
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d6aa14b4.png']")
	WebElement banner;
	@FindBy (css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-6495491569cb4.png']")
	WebElement jodhpurblazer;
	@FindBy(css = "[class='navbar-tool-text']")
	
	WebElement dashboard;
	@FindBy(css = "[href='http://e-quarz.com/customer/auth/logout']")
	WebElement logoutbtn;
	public logoutfunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public Hompage signout() throws Exception {
		banner.click();
		jodhpurblazer.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(dashboard).build().perform();
		logoutbtn.click();
		
		return new Hompage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
