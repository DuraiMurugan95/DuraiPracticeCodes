package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGDemoTest {
  @Test(priority=-1)
  public void f() {
	  System.out.println("At Test F");
  }
  
  @Test(priority=0)
  public void f1() {
	  System.out.println("At Test F1");
  }
  
  @Test(priority=-4,dependsOnMethods={"f3","f"})
  public void f2() {
	  System.out.println("At Test F2");
	  
  }
  
  @Test(priority=-2)
  public void f3() {
	  System.out.println("At Test F3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  @Parameters({"author","searchKey"})
  public void beforeClass(String author,String SearchKey) {
	  System.out.println("BeforeClass");
	  System.out.println("Author Name Is: "+author);
	  System.out.println("searchKey Is: "+SearchKey);
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("AfterClass");
  }
  

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }

}
