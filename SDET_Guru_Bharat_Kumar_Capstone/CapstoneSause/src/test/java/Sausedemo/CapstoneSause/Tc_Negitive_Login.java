package Sausedemo.CapstoneSause;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sause.demo.pages.negitiveLogin;

public class Tc_Negitive_Login extends BaseClass {
	String title= "https://www.saucedemo.com/";
	@Test
	public void Negitive_Test() throws IOException {
		negitiveLogin NL=new negitiveLogin(driver);
		NL.setUser("standard_Invaliduser");
		NL.setPassWord("secret_Invalidpwd");
		NL.clickLogin();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if(actualUrl.equals(expectedUrl)) {
		 
	        	Assert.assertEquals(actualUrl, expectedUrl, "Login successful with invalid credentials");
	      
	        }else{
	
			captureScreenshot(driver,"SwagLoginError");
		   System.out.println("Not successfully login");
		   Assert.assertTrue(title.contains("saucedemo"));

		}}
}
	        
	


