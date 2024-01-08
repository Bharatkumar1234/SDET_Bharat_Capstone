package Sausedemo.CapstoneSause;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sause.demo.pages.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;
	Login login=new Login(driver);
	 @Parameters({ "UserName", "UserPassword", "invalidusername", "invalidpassword" })
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
		Login login;
	
//		negitiveLogin NL;
	}
	 @AfterSuite
	 public void teardown() {
//		 driver.quit();
	 }


	public void captureScreenshot(WebDriver driver,String tname)throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
	FileUtils.copyFile(source, target);
	
}
}
