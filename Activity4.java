package suiteCRM;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity4 {
WebDriver driver;
	
	@BeforeMethod
	public void OpenURL() 
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		
	}
	
  @Test
  public void Login() 
  {
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  String SuitCRMDashboard = driver.findElement(By.id("tab0")).getText();
	  Assert.assertEquals(SuitCRMDashboard, "SUITECRM DASHBOARD");
	  System.out.println("Logged in successfully");
  }


  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
