package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  //if we want to execute specific method firstly then use priority,, less priority will execute first
  // default priority is 0
  @Test(priority = 4)
  public void a()
  {
		Reporter.log("method a is running", true);
  }
  
  @Test(priority = -3)
  public void b()
  {
		Reporter.log("method b is running", true);
  }
  
  @Test
  public void c()
  {
		Reporter.log("method c is running", true);
  }
  
  @Test(priority = 1)
  public void d()
  {
		Reporter.log("method d is running", true);
  }
}
