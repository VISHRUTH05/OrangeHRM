package com.orangeHRM.objectreposirtory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy (xpath="//a[text()='vishruth']")
	private WebElement V; 
	
	@FindBy (id="welcome")
	private WebElement W ;
	
	@FindBy (xpath="//a[text()='Logout']")
	private WebElement lgout;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUsername()
	{
		return V.getText();
	}
	public void Welcome()
	{
		W.click();
	}
	
	public void logout()
	{
		lgout.click();
	}

}
