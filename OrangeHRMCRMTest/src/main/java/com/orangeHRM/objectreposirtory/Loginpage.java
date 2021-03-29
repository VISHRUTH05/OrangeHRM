package com.orangeHRM.objectreposirtory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy (id="txtUsername")
    private WebElement UNTF;
    
    @FindBy (id="txtPassword")
    private WebElement PWDTF;
    
    @FindBy (name="Submit")
    private WebElement button;
    
    public Loginpage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void setUsername(String UN)
    {
    	UNTF.sendKeys(UN);
    }
    
    public void setPassword(String PWD)
    {
    	PWDTF.sendKeys(PWD);
    }
    
    public void clickSubmit()
    {
    	button.click();
    }
    
    

}
