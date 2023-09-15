package com.pageobjects;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.signbase;

public class signfunctionality extends signbase{
	
	
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	@FindBy(xpath ="//button[@class='close __close']")
	WebElement closebtn;
	@FindBy(xpath="//span[@style='margin-left: 20px !important;']")
	WebElement categoriebtn;
	@FindBy(xpath ="//a[@href='http://e-quarz.com/products?id=2&data_from=category&page=1']")
     WebElement hover;
	@FindBy(xpath = "//a[@href='http://e-quarz.com/products?id=229&data_from=category&page=1']")
	WebElement cambttn;
	@FindBy(xpath = "(//a[text()='2'])[1]")
	 WebElement secndbtn;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/product/canon-eos-200d-ii-241mp-digital-slr-camera-ef-s-18-55mm-f4-is-stm-lens-black-IkC5WB'])[1]")
	WebElement cam;
	@FindBy(xpath = "(//button[@style='color: #1b7fed'])[1]")
	WebElement plus;
	@FindBy(xpath = "//button[@onclick='addToCart()']")
	WebElement cart;
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement srchbttn;
	public signfunctionality(WebDriver driver) {
	PageFactory.initElements(driver,this );

	}
	public Hompage validatesignin() throws Exception {
		signin.sendKeys(props.getProperty("Email"));
		pass.sendKeys(props.getProperty("Password"));
	
		Thread.sleep(10000);
		
		signbttn.click();
		closebtn.click();
		
		//srchbttn.sendKeys(props.getProperty("searchbox"));
		
		categoriebtn.click();
		//JavascriptExecutor JSE=(JavascriptExecutor)driver;
		//JSE.executeScript("Window.scrollBy(0,500)");
	    Actions ac=new Actions(driver);
	    ac.moveToElement(hover).build().perform();  
		hover.click();
	    cambttn.click();
	    
	    secndbtn.click();
	    cam.click();
	    plus.click();
	    cart.click();
	    
	    
	    return new Hompage();
	
         
	
}	
	
}




