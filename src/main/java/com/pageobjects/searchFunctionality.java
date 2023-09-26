package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class searchFunctionality extends Testbase {
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(xpath = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e5855be3.png']")
	WebElement fujcam;
	@FindBy(linkText ="//span[text()='Buy now']")
	WebElement buybtn;

	public searchFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

	public void searchproducts() {
		searchbox.sendKeys(props.getProperty("searchbox"));
		searchbttn.click();
		fujcam.click();
		buybtn.click();
	
}


	public void searchproducts1() {
		// TODO Auto-generated method stub
		
	}

}
