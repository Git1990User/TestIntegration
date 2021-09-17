package com.login;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.extent.report.ExtentReportBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScenarios extends ExtentReportBaseClass  {

	
	public static ChromeDriver driver;	 


	@Test
   	public void LoginTest() {
	test = extent.createTest("LoginTest", "Testing login with valid credentials"); 
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://nstp-slmfrontend.evampsaanga.com/");
	driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("rabail@managementportal.com");
	driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("demo1234");
	driver.findElementByXPath("//span[@class='MuiButton-label']").click();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.urlContains("dashboard"));
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://nstp-slmfrontend.evampsaanga.com/#/admin-dashboard");
	driver.close();
		
	     }
	
	
   
	
	
	

}
