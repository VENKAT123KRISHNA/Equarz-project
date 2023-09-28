package com.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class profileFunctionality extends Testbase{
	
	

	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[class='navbar-tool-text']")
	WebElement dashboard;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/user-account'])[1]")
	WebElement profilebtn;
	@FindBy(id = "l_name")
	WebElement lastnamebox;
	@FindBy(id = "phone")
	WebElement phonebox;
	
	@FindBy(css = "[class='spandHeadO m-0']")
	WebElement changefile;
	
	
	
	@FindBy(css = "[class='btn btn--primary']")
	WebElement updatebtn;
	
	public profileFunctionality(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
		
	}

 public Hompage editprofile () {
	 
	 Actions al=new Actions(driver);
	 al.moveToElement(dashboard).build().perform();
	 profilebtn.click();
	
	 return new Hompage();
	 
	 }

  public void editdetails() throws Exception {
	  Thread.sleep(3000);
	  
	  //lastnamebox.click();
	  lastnamebox.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	  lastnamebox.sendKeys("krish");
	  phonebox.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	  phonebox.sendKeys("7788224466");
	  updatebtn.click();
	  
  }
 
  public void editimage() throws Exception {
	  
	  changefile.click();
	  
	  Robot rb=new Robot();
	  rb.delay(3000);
	  StringSelection ss=new StringSelection("C:\\Users\\LENOVO\\Pictures\\Screenshots");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	  
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  rb.delay(2000);
	  
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  rb.delay(2000);
	  
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  
	  updatebtn.click();
	  
  }
  
  
  
  
  
}
