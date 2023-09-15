package com.pageobjects;

import org.openqa.selenium.WebDriver ; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.searchbase;

public class searchFunctionalITY extends searchbase{
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	//@FindBy(xpath ="//button[@class='close __close']")
	//WebElement closebtn;
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(xpath = "//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e2446e92.png']")
	WebElement CAMERAproduct;
	@FindBy(css ="[onclick='addToCart()']")
	WebElement cartbox;
	public searchFunctionalITY(WebDriver driver) {
		PageFactory.initElements(driver,this );

		}
		public Hompage validatesearch() throws Exception {
			signin.sendKeys(props.getProperty("Email"));
			pass.sendKeys(props.getProperty("Password"));
		
			Thread.sleep(10000);
			
			signbttn.click();
			//closebtn.click();
			searchbox.sendKeys(props.getProperty("searchbox"));
			searchbttn.click();
			CAMERAproduct.click();
			cartbox.click();
			  return new Hompage();
}
}
