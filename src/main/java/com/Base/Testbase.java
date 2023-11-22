package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.utils.Exceptionslistners;

public class Testbase {
	//public static void main(String[] args) {
	
	
	 FileInputStream file;
	 public static Properties props;
     public static WebDriver driver;
     
	//public static EventFiringWebDriver e_driver;
	//Exceptionslistners listenerss;
  
	
	public Testbase() {
		 props=new Properties();
		try {
			 file=new FileInputStream("./src/main/java/com/propertiesConfigure/propfile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 		}
	}
	public void setup() {
 		
		String browsername=props.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win32(119 versn)\\chromedriver.exe");		
			
	     driver=new ChromeDriver();
	}
		else if(browsername.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		}
		
//		e_driver=new EventFiringWebDriver(driver);
//		listenerss=new Exceptionslistners();
//		e_driver.register(listenerss);
//		driver=e_driver;

		driver.manage().window().maximize();
		driver.get(props.getProperty("url1"));
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
	}
	
}



