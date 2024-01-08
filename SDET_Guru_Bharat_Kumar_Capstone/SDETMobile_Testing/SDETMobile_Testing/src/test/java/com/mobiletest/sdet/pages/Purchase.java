package com.mobiletest.sdet.pages;

import org.openqa.selenium.By;

import Mobile.SDETMobile_Testing.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Purchase extends BaseClass {
	 AndroidDriver driver;
	By AddtoCart=By.xpath("AndroidDriver driver;\r\n"
			+ "	By customerName=By.id(\"com.androidsample.generalstore:id/nameField\");");
	public Purchase(AndroidDriver driver) {
		this.driver = driver;
	}
	 public void Addcart()  {
		 driver.findElement(AddtoCart).click();
		 
	    }

}
