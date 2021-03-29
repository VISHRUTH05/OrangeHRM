package com.orangeHRM.objectreposirtory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addusers {

	
	@FindBy (id="systemUser_employeeName_empName")
	private WebElement emploeeName;
	
	@FindBy (id="systemUser_userName")
	private WebElement userName;
	
	@FindBy (id="systemUser_password")
	private WebElement userPwd;
	
	@FindBy (id="systemUser_confirmPassword")
	private WebElement userCpwd;
	
	@FindBy (xpath="//input[@id='btnSave']")
	private WebElement saveBtn;
	
	
	public Addusers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setEname(String EN)
	{
		emploeeName.sendKeys(EN);
	}
	public void setUname(String UN)
	{
		userName.sendKeys(UN);
	}
	public void setPwd(String PWD)
	{
		userPwd.sendKeys(PWD);
	}
	public void clickSave()
	{
		saveBtn.click();
	}
	
	public void setCpwd(String CPWD)
	{
		userCpwd.sendKeys(CPWD);
	}
	
	
	
	
}
