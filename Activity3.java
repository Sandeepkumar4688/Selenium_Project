package suiteCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity3 {
	WebDriver driver;
	
	@BeforeMethod
	public void OpenURL() 
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		
	}
	
  @Test
  public void copyRight() 
  {
	  String CopyRight = driver.findElement(By.id("admin_options")).getText();
	  System.out.println("First Copyright text is: "+CopyRight);
  }

  @AfterMethod
  public void Logout() 
  {
	  driver.close();
  }

}
