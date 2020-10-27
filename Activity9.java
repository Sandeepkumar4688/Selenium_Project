package suiteCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Activity9 {
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
  public void traversingTables2() throws InterruptedException 
  {
	  driver.findElement(By.cssSelector("a[id=\'grouptab_0\']")).click();
	     WebElement SalesDropDown = driver.findElement(By.cssSelector("a[id=\'grouptab_0\']"));  
		    Actions action = new Actions (driver);
		    action.moveToElement(SalesDropDown).click().build().perform();
		    WebElement Lead = driver.findElement(By.cssSelector("a[id=\'moduleTab_9_Leads\']")); 
		    action.moveToElement(Lead).click().build().perform();
		 
		    Thread.sleep(5000);
		    for(int i=1;i<=10;i++)
			  {
		    
					  String name = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[3]/form[2]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[3]/b[1]/a[1]")).getText();
					  String username = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[3]/form[2]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[8]/a[1]")).getText();
					  System.out.println(i+". Name: "+name+", Username: "+username);  
					  
			  }
  }
  


  @AfterClass
  public void afterClass() 
  {
	 driver.close();
  }

}
