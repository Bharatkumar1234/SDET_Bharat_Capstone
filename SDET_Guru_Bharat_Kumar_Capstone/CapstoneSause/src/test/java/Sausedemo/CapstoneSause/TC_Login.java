package Sausedemo.CapstoneSause;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sause.demo.pages.Login;

public class TC_Login extends BaseClass {
	String title= "https://www.saucedemo.com/";
	
	@Test
	public void Tesst1() throws InterruptedException, IOException {
		Login login=new Login(driver);
		Thread.sleep(3000);
		login.setUser("standard_user");
		Thread.sleep(3000);
		login.setPassWord("secret_sauce");
		Thread.sleep(3000);
		login.clickLogin();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if(actualUrl.equals(expectedUrl)) {
        	Assert.assertEquals(actualUrl, expectedUrl);
        	System.out.println("Login successful with valid credentials");
      
        }
        else {
        	Assert.assertNotEquals(actualUrl, expectedUrl);
        }
        if(title.contains("saucedemo")) {
    Assert.assertTrue(title.contains("saucedemo"));
    System.out.println("successfully login");
    captureScreenshot(driver,"SwagLogin");
    }
    else 
     {
	captureScreenshot(driver,"SwagLoginError");
   System.out.println("Not successfully login");
   Assert.assertTrue(title.contains("saucedemo"));

}}
		 
	}


