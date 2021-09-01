package assignment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class download_file {


	@Test

	public void test() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");

		WebDriver driver;

		driver=new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("http://www.leafground.com/pages/download.html");

		driver.findElement(By.linkText("Download Excel")).click();

		File flocation=new File("C:\\Users\\sonukumar_gupta\\Downloads\\");

		File[] total_files=  flocation.listFiles();

		for (File file:total_files)
		{
			if (file.getName().equalsIgnoreCase("testleaf.xlsx")) 
			{
				System.out.println("File is downloaded");
				break;
			}


		}
	}
}


