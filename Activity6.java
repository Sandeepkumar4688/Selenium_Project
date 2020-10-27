package suiteCRM;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity6 {
WebDriver driver;
	
	@BeforeClass
	public void OpenURL() 
	{
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.get("https://alchemy.hguy.co/crm/");
	
	}

	  @Test  (priority = 0)
	  public void Login()
	  {
		  driver.findElement(By.id("user_name")).sendKeys("admin");
		  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		  driver.findElement(By.id("bigbutton")).click();
		  
	  }
	  @Test (priority = 1)
	  public void CheckActivities() 
	  {
		  String ActivitiesMenuitem = driver.findElement(By.cssSelector("a[id=\'grouptab_3\']")).getText();
		  //String ActivitiesMenuitem = driver.findElement(By.id("grouptab_3")).getText();
		  Assert.assertEquals(ActivitiesMenuitem, "ACTIVITIES");
		  System.out.println(ActivitiesMenuitem+" exist in menu items");
	  }


	  @AfterClass
	  public void Logout() 
	  {
		  driver.close();
	  }
}
