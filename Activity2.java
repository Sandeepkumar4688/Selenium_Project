package suiteCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity2 {
	WebDriver driver;
	
	@BeforeMethod
	public void OpenURL() 
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		
	}
  @Test
  public void CheckHeaderText() {
	  
	  String headerImage = driver.findElement(By.cssSelector("img[alt=\'SuiteCRM\']")).getAttribute("src");
	  System.out.println("URL of header Image is "+headerImage);
	 
  }


  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
