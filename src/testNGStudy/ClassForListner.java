package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


  @Listeners(listenarsStudy.Listeners.class)
public class ClassForListner {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  
  @Test(dependsOnMethods = "d")
  public void b() 
  {
	  Reporter.log("TC b is running", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("TC c is running", true);
  }
  
  @Test
  public void d() 
  {   Assert.fail();
	  Reporter.log("TC d is running", true);
  }
}
