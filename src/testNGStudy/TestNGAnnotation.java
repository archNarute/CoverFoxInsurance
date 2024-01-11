package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
  @Test
  public void tc1()
  {
	  Reporter.log("tc1 is running", true);
  }
  
  @Test
  public void tc2()
  {
	  Reporter.log("tc2 is running", true);
  }
  
  @BeforeMethod()
  public void beforeMethod()
  {
	 Reporter.log("beforeMethod methodis running", true); 
  }
  
  @AfterMethod()
  public void afterMethod()
  {
	 Reporter.log("afterMethod methodis running", true); 
  }
  
  @BeforeClass()
  public void beforeClass()
  {
	 Reporter.log("beforeClass methodis running", true); 
  }
  
  @AfterClass()
  public void afterClass()
  {
	 Reporter.log("afterclass methodis running", true); 
  }
  
  @BeforeTest()
  public void beforeTest()
  {
	 Reporter.log("beforeTest methodis running", true); 
  }
  @AfterTest()
  public void afterTest()
  {
	 Reporter.log("afterTest methodis running", true); 
  }
  @BeforeSuite()
  public void beforeSuite()
  {
	 Reporter.log("beforeSuite methodis running", true); 
  }
  @AfterSuite()
  public void afterSuit()
  {
	 Reporter.log("afterSuit methodis running", true); 
  }
}
