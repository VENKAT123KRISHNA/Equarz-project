package com.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.Base.Testbase;

public class UTILSprofile extends Testbase {
	
	 public void editimage() throws Exception {
		  
		 // changefile.click();
		  
		  Robot rb=new Robot();
		  rb.delay(3000);
		  StringSelection ss=new StringSelection("C:\\Users\\LENOVO\\Pictures\\images");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		  
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.delay(2000);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.delay(2000);
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  
		 // updatebtn.click();

}
}