package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class delete_cookies {
	@Test
public void test()
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		driver.manage().deleteAllCookies();
		System.out.println("all cookies deleted..");
		
		
}
}
