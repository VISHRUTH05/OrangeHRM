package com.orangeHRM.objectreposirtory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.generics.Baseclass;

public class Admin extends Baseclass   {

	@FindBy (xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement adminMT;
	@FindBy (xpath="//a[@id='menu_admin_UserManagement']")
	private WebElement adminUmt;
	@FindBy (xpath="//a[@id='menu_admin_viewSystemUsers']")
	private WebElement adminU;
	
	
	
	public Admin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	Actions a = new Actions(driver);
	public void clickAdmin()
	{
		
		a.moveToElement(adminMT).perform();
		
	}
	
	public void clickUm()
	{
		a.moveToElement(adminUmt).perform();
	}
	
	public void clickU()
	{
		adminU.click();
	}
}
