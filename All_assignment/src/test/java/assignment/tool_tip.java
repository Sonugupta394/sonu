package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tool_tip {
	@Test
	public void tool_tip1(){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
	  
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  
	  
	  driver.get("https://demoqa.com/tool-tips/");
	  driver.manage().window().maximize();
	//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	  Actions actions = new Actions(driver);
	  String expectedValue= "Hover me to see";
	  System.out.println(expectedValue);

	  WebElement element1=driver.findElement(By.id("toolTipButton"));
	  actions.moveToElement(element1).build().perform();

	  WebElement element2=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	  String actualValue=element2.getText();
	  System.out.println(actualValue);
	  
}}



