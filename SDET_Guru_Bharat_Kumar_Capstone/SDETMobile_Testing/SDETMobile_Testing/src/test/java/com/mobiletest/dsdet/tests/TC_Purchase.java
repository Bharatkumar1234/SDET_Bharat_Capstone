package com.mobiletest.dsdet.tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.mobiletest.sdet.pages.Purchase;

import Mobile.SDETMobile_Testing.BaseClass;


public class TC_Purchase extends BaseClass {
	@Test
	public void AddcartPage() throws InterruptedException, MalformedURLException {
		Purchase purchase=new Purchase(driver);
		purchase.Addcart();
	}	
}
