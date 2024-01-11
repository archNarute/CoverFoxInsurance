package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2ForListeners {
	@Test
	  public void e() 
	  {
		  Reporter.log("TC e is running", true);
	  }
	  
	  @Test(timeOut = 3000)
	  public void f() throws InterruptedException 
	  { 
		  Thread.sleep(4000);
		  Reporter.log("TC f is running", true);
	  }
	  
	  @Test
	  public void g() 
	  {
		  Reporter.log("TC g is running", true);
	  }
	  
	  @Test
	  public void h() 
	  {   Assert.fail();
		  Reporter.log("TC h is running", true);
	  }
}
