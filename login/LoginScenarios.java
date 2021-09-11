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
    public void GoogleTest() {
	test = extent.createTest("Testing integration", "Testing integration"); 
	System.out.println("hello world");
	WebDriverManager.chromiumdriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElementByName("q").sendKeys("Mobile phones");
	driver.close();
	
	
    }
}
