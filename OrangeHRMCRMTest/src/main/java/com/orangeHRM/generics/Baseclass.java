package com.orangeHRM.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRM.objectreposirtory.Loginpage;
import com.orangeHRM.objectreposirtory.Logout;

public class Baseclass {

  static{	
	System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");
  }
	public static WebDriver driver;
	public Filelib fl = new Filelib();
	Webdrivercommonlib w= new Webdrivercommonlib();
	@BeforeTest
	public void openBrowser() throws IOException
	{
		
		 driver = new FirefoxDriver();
		 driver.get(fl.getPropertyvalue("URL")); 
		 w.waitForelementingui(driver);
	}
	
	
	@BeforeMethod
	public void login() throws IOException
	{
		
		Loginpage lp = new Loginpage(driver);
		String un=fl.getPropertyvalue("UN");
		String pwd = fl.getPropertyvalue("PWD");
		
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clickSubmit();
	}
	
	@AfterMethod
	public void logot()
	{
		Logout lg = new Logout(driver);
		lg.Welcome();
		lg.logout();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

    public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
	
