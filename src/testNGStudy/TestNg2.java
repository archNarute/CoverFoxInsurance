package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg2 {
  @Test
  public void f() 
  {
	  System.out.println("printing statement"); //only shown in console
	  Reporter.log("this is statement without boolean"); //not shown in console only shown in report
	  Reporter.log("this is statement with boolean", true); //if true then only shown in console and always shown in report
  }
}
