package testNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods2 {
	@Test
	  public void a() 
	  {
		  Reporter.log("a is running", true);
	  }
	  
	  @Test(dependsOnMethods = {"d"})
	  public void b() 
	  {
		  Reporter.log("b is running", true);
	  }
	  
	  @Test(timeOut = 3000)
	  public void c() throws InterruptedException 
	  {
		  Thread.sleep(4000);
		  Reporter.log("c is running", true);
	  }
	  
	  @Test
	  public void d() 
	  {
		  Assert.fail();
		  Reporter.log("d is running", true);
	  }
}
