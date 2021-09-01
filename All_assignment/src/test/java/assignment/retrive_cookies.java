package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class retrive_cookies {
	@Test
public void cookies() 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();

	driver.get("https://ksrtc.in/oprs-web/login/show.do");
	/*driver.get("https://www.irctc.co.in/nget/train-search");
	driver.switchTo().alert().accept();
	driver.findElement(By.linkText(" LOGIN ")).click();
	driver.findElement(By.id("userId")).sendKeys("userIdaaa");
	driver.findElement(By.id("pwd")).sendKeys("pwddddddd");
    
	driver.findElement(By.id("submitBtn")).click(); */
	
	driver.findElement(By.id("userName")).sendKeys("userName");
	driver.findElement(By.id("password")).sendKeys("password");
	File f1 = new File("C://Users//sonukumar_gupta//OneDrive - HCL Technologies Ltd//Documents//assignment//cookies.data");
	try {
	f1.createNewFile();
	FileWriter fw =new FileWriter(f1);
	BufferedWriter bw =new BufferedWriter(fw);
	for(Cookie ck:driver.manage().getCookies())
	{
		bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
		bw.newLine();
	}
	bw.close();
	fw.close();
	}
	catch(Exception e) {
		System.out.println(e);
	
	
}
}}
