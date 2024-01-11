package TestNG_Included_excluded;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "Regression")
	  public void TC1()
	  {
		  Reporter.log("TC1 is running", true);
	  }
	  
	  @Test(groups = "Regression")
	  public void TC2()
	  {
		  Reporter.log("TC2 is running", true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void TC3()
	  {
		  Reporter.log("TC3 is running", true);
	  }
	  
	  @Test(groups = "Regression")
	  public void TC4()
	  {
		  Reporter.log("TC4 is running", true);
	  }

}
