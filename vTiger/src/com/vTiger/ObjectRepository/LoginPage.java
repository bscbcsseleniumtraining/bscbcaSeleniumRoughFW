package com.vTiger.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(name="user_name")
	private WebElement userNameEB;
	
	@FindBy(name="user_password")
	private WebElement passwordEB;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;

	public WebElement getUserNameEB() 
	{
		return userNameEB;
	}

	public WebElement getPasswordEB() 
	{
		return passwordEB;
	}

	public WebElement getLoginBtn() 
	{
		return loginBtn;
	}
		
	public void login(String userName, String password)
	{
		userNameEB.sendKeys(userName);
		passwordEB.sendKeys(password);
		loginBtn.click();
	}
	
}
