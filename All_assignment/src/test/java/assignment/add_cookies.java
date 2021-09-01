package assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class add_cookies {
	@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();

	driver.get("http://flipkart.com/");
	Cookie name =new Cookie("mycookie", "123456789123");
	driver.manage().addCookie(name);
	
	Set<Cookie> All_Cookies = driver.manage().getCookies();
	for(Cookie getcookies : All_Cookies)
	{
		System.out.println("Cookies NAme ; "+getcookies);
		
	}
		System.out.println("No of Cookies = "+All_Cookies.size());
	
}
}
