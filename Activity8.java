package suiteCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Activity8 
{
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
  public void traversingTables() throws InterruptedException 
  
  {
	  Thread.sleep(5000);
	  Actions action = new Actions (driver);
	  WebElement SalesDropDown = driver.findElement(By.cssSelector("a[id=\'grouptab_0\']")); 
	  action.moveToElement(SalesDropDown).click().build().perform();
	   
	  WebElement account = driver.findElement(By.cssSelector("a[id=\'moduleTab_9_Accounts\']")); 
	    action.moveToElement(account).click().build().perform();
		  Thread.sleep(5000);
       for(int i=0;i<10;i++)
	  {
    	  if(i%2 != 0)
		  {
			  String name = driver.findElement(By.xpath("//tr["+i+"]//td[3]//b[1]//a[1]")).getText();
			  System.out.println("Name "+i+": "+name);  
		  }
		  
	  }
  }


  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
