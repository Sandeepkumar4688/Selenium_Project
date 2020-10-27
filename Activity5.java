package suiteCRM;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Activity5 {
WebDriver driver;
	
	@BeforeClass
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
		
	  }

	
  @Test
  public void colourOfNavigationMenu() 
  {
	  String Color = driver.findElement(By.className("desktop-toolbar")).getCssValue("color");
	 //String Color = driver.findElement(By.cssSelector("a[id=\'grouptab_1\']")).getCssValue("color");
	  System.out.println("Colour of Navigation Menu is: "+Color);
  }

  @AfterClass
  public void Logout() 
  {
	  driver.close();
  }

}
