package TestNG_Included_excluded;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group2 {
	@Test(groups = "Regression")
	  public void TC5()
	  {
		  Reporter.log("TC5 is running", true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void TC6()
	  {
		  Reporter.log("TC6 is running", true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void TC7()
	  {
		  Reporter.log("TC7 is running", true);
	  }
	  
	  @Test(groups = "Regression")
	  public void TC8()
	  {
		  Reporter.log("TC8 is running", true);
	  }
}
