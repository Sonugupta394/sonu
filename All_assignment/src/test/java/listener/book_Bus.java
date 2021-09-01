package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class book_Bus {
	@Test
public void book_bus1()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
	
	ChromeDriver d1;

	d1=new ChromeDriver();
	
	  d1.manage().window().maximize();
      d1.get("https://ksrtc.in/oprs-web/user/add.do");
      d1.findElement(By.id("email")).sendKeys("Skg09081994@gmail.com");
      d1.findElement(By.id("fullName")).sendKeys("Sonu Gupta");
      d1.findElement(By.id("mobileNo")).sendKeys("7903395556");
      d1.findElement(By.name("SaveBtn")).click();
      d1.switchTo().alert().accept();
      
      d1.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();
      d1.findElement(By.id("userName")).sendKeys("Skg09081994@gmail.com");
      d1.findElement(By.id("password")).sendKeys("Sonu@1");
      d1.findElement(By.id("submitBtn")).click(); 
      d1.findElement(By.id("fromPlaceName")).sendKeys("Ballari" + Keys.ARROW_DOWN + Keys.ENTER);
	     d1.findElement(By.id("toPlaceName")).sendKeys("Bengaluru"+ Keys.ARROW_DOWN + Keys.ENTER); 
	     
	    d1.findElement(By.xpath("//*[@id='txtJourneyDate']")).click();
         d1.findElement(By.linkText("28")).click();
         
         d1.findElement(By.id("txtReturnJourneyDate")).click();
         d1.findElement(By.linkText("31")).click();   
         d1.findElement(By.id("corover-close-btn")).click(); 
         d1.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button")).click();
	 	
}
}
