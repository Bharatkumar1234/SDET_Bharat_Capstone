package com.sause.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Sausedemo.CapstoneSause.BaseClass;

public class Login  {
	private WebDriver driver;
By UserName=By.id("user-name");
By UserPassword=By.id("password");
By loginButton=By.id("login-button");



public Login(WebDriver driver) {
	this.driver = driver;
	
}
public void setUser(String Bharat) {
	driver.findElement(UserName).sendKeys(Bharat);
}
public void setPassWord(String pass) {
	driver.findElement(UserPassword).sendKeys(pass);
} 
public void clickLogin() {
	driver.findElement(loginButton).click();
}


}
