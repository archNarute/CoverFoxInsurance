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

public class TestNgAnnotation2 {
	 @Test
	  public void tc3()
	  {
		  Reporter.log("tc3 is running", true);
	  }
	  
	  @Test
	  public void tc4()
	  {
		  Reporter.log("tc4 is running", true);
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
	  
	 
	}


