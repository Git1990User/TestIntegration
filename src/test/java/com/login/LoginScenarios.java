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
	
	
   	public static void LandConfigTest() {
   		
   	WebDriverManager.chromedriver().setup();
   	driver=new ChromeDriver();
   	driver.manage().window().maximize();
	driver.get("https://nstp-slmfrontend.evampsaanga.com/#/sign-in");
	driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("rabail@managementportal.com");
	driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("demo1234");
	driver.findElementByXPath("//span[@class='MuiButton-label']").click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.urlContains("dashboard"));
	driver.findElementByXPath("//*[@id=\"root\"]/div[2]/div[1]/div/div/h4").click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main/h2")));
	if(driver.findElementByXPath("//span[text()='Dashboard']").isEnabled())
		Reporter.log("Landed on dashboard");
	else  
		Reporter.log("Error while Landing on dashboard");
	//	driver.close();
		
	     }

	@Test
   	public void LogoutTest() {
		test = extent.createTest("LogoutTest", "Testing Logout"); 
		LandConfigTest();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByClassName("MuiSvgIcon-root")));
	//	driver.findElementByClassName("MuiSvgIcon-root").click();
		driver.findElementByCssSelector("#root > div.makeStyles-root-5.makeStyles-shiftContent-6 > header > div > svg").click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/html/body/div[2]/div[3]/div/div[3]/button[2]")));
	    driver.findElementByXPath("/html/body/div[2]/div[3]/div/div[3]/button[2]").click();
	    driver.close();
		driver.quit();
	
		
	     }
	
   
	
	
	
	
	

}
