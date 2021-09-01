package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class apachiPoi_Read {
	@Test
	  public void fatchData1() throws IOException 
	{
		  
		// ========================= Apachi POI  ======================//  
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
		  
		  WebDriver d1;
		  
		  d1=new ChromeDriver();
		  d1.manage().window().maximize();
		  
		  File file = new File("C:\\Users\\sonukumar_gupta\\OneDrive - HCL Technologies Ltd\\Desktop\\Sonu.xlsx");
		  FileInputStream fis = new FileInputStream(file);
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 int lastRowNum = sheet.getLastRowNum();
		 System.out.println("Last Row = "+ lastRowNum);
		 
		 for(int i =1;i<=lastRowNum;i++)
		 {
			 String username= sheet.getRow(i).getCell(0).toString();
             String password= sheet.getRow(i).getCell(1).toString();
             System.out.println("username:"+username);
             System.out.println("password:"+password); 
             d1.get("https://ksrtc.in/oprs-web/login/show.do");
             d1.findElement(By.id("userName")).sendKeys(username);
             d1.findElement(By.id("password")).sendKeys(password);
             d1.findElement(By.id("submitBtn")).click();
		 }
		  
}}
