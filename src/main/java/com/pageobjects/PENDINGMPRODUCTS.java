package com.pageobjects;

import java.awt.Window; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Testbase;

public class PENDINGMPRODUCTS extends Testbase{

	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[name='name']")
	WebElement searchbox;
	@FindBy(xpath = "(//i[@class='czi-search text-white'])[1]")
	WebElement SEARCHBTN;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953ed26d691.png']")
	WebElement PanasonicLumixCAM;
	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement addcartbttn;
	@FindBy(css = "[class='navbar-tool-icon czi-cart']")
	WebElement cartbox;
	@FindBy(css = "[class='btn btn--primary btn-sm btn-block']")
	WebElement checkoutbttn1;
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement shipmethod;
	@FindBy(css = "[class='btn btn--primary pull-right']") 
	WebElement checkoutbttn2;
	//@FindBy(css = "[class='btn btn-outline collapsed']")
	//WebElement anotheraddressbox2;
	@FindBy(css = "[onclick='hide_billingAddress()']")
	WebElement sameshipaddressbox;
	@FindBy(xpath = "//span[text()='Proceed payment']")
	WebElement procedpayment;
	@FindBy(xpath = "(//img[@class='__mt-n-10'])[1]")
	WebElement cashondeliverybox;
	@FindBy(css = "[class='btn btn-secondary pull-right']")
	WebElement checkordersbttn;
	
	public PENDINGMPRODUCTS(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}     
		
	public Hompage pendsproduct() throws Exception {
		
		searchbox.sendKeys(props.getProperty("searchbox"));
		SEARCHBTN.click();
		PanasonicLumixCAM.click();
		addcartbttn.click();
		Actions ac=new Actions(driver);
		ac.moveToElement(cartbox).build().perform();
		checkoutbttn1.click();
		Thread.sleep(5000);
		Select sl=new Select(shipmethod);
		sl.selectByVisibleText("Free delivery ( 8-11 days ) ₹0.00");
		checkoutbttn2.click();
		/*
		 * try { checkoutbttn2.click(); } catch(StaleElementReferenceException e) {
		 * checkoutbttn2=driver.findElement(By.cssSelector("[onclick='checkout()']"));
		 * checkoutbttn2.click(); }
		 */
		
		sameshipaddressbox.click();
		Thread.sleep(2000);
		procedpayment.click();
		cashondeliverybox.click();
		checkordersbttn.click();
		
		//return new Hompage();
		
		WebDriver  newTab =driver.switchTo().newWindow(WindowType.TAB);
	    newTab.get("//e-quarz.com/admin/auth/login") ; 
	
	
	
	
	}
}
