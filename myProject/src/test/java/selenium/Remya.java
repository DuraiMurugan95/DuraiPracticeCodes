package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Remya {
	
	
	@Test(priority=-1)
	public void fileReadandWrite() throws IOException
	{
		
		
		File file=new File("C:\\Users\\hp\\Desktop\\Remya.xlsx");
		FileInputStream fi=new FileInputStream(file);
		XSSFWorkbook xssfWorkBook=new XSSFWorkbook(fi);
		XSSFSheet xssfSheet=xssfWorkBook.getSheet("Sheet1");
		System.out.println(xssfSheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(xssfSheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(xssfSheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(xssfSheet.getRow(1).getCell(1).getStringCellValue());
		xssfSheet.createRow(1).createCell(3).setCellValue("Success");
		FileOutputStream fo=new FileOutputStream(file);
		xssfWorkBook.write(fo);
		xssfWorkBook.close();
		System.out.println("Am in file i/o");
	
	}
	
	@Test(priority=0)
	@Parameters({"name","value"})
	public void parametirization(String name,String value)
	{
		System.out.println("Name :"+name);
		System.out.println("Value: "+value);
	}
  @Test(dataProvider = "dp",priority=1)
  public void f(String n, String s) 
  {
	  System.out.println("Course: "+n);
	  System.out.println("Role: "+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Selenium Using Python", "Educator" },
      new Object[] { "Agile Tesing", "Co Educator" },
    };
  }
}
