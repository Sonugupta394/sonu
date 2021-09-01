package assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class apachiPoi_Write {
	@Test
	  public void fatchData1() throws IOException 
	{
		  
		// ========================= Apachi POI  ======================//  
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
		  
		  WebDriver d1;
		  
		  d1=new ChromeDriver();
		  d1.manage().window().maximize();
		  
		  File file = new File("C:\\Users\\sonukumar_gupta\\OneDrive - HCL Technologies Ltd\\Desktop\\Sonu1.xlsx");
		  FileOutputStream fos = new FileOutputStream(file);
		  XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet("Java");
		 XSSFRow row = sheet.createRow(0);
		 XSSFCell cell = row.createCell(1);
		 cell.setCellType(CellType.STRING);
		 cell.setCellValue("Sonu");
		 XSSFCell cell2 = row.createCell(2);
		 cell2.setCellType(CellType.BOOLEAN);
		 cell2.setCellValue(false);

		 workbook.write(fos);
		  
		  
		  
		  
		  
		  
		
}}
