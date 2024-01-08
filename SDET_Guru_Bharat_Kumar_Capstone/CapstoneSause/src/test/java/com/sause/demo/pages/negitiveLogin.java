package com.sause.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class negitiveLogin {
	private WebDriver driver;
	By NagitiveUserName=By.id("user-name");
	By NagitiveUserPassword=By.id("password");
	By NagitiveloginButton=By.id("login-button");
	public negitiveLogin(WebDriver driver) {
		this.driver = driver;
		
	}
	public void setUser(String Bharat) {
		driver.findElement(NagitiveUserName).sendKeys(Bharat);
	}
	public void setPassWord(String pass) {
		driver.findElement(NagitiveUserPassword).sendKeys(pass);
	} 
	public void clickLogin() {
		driver.findElement(NagitiveloginButton).click();
	}
}
