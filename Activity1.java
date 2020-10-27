package suiteCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 

{ WebDriver driver;

@BeforeMethod
public void OpenURL() 
{
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
	
}

  @Test
  public void verifyingTitle() 
  
  {
	  String title = driver.getTitle();
		Assert.assertEquals(title,"SuiteCRM");
		System.out.println("Title matches the expected value: "+title);
  }


  @AfterMethod
  public void Logout()
  {
	  driver.close();
  }

}
