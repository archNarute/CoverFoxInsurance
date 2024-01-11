package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  // if we want to execute particlar method for multiple time then use invocation count
  // default capacity is 1, can't be negative no.
	
  @Test(invocationCount = 2)
  public void sample() 
  {
	  Reporter.log("sample method is running", true);
  }
  
  @Test 
  public void set() 
  {
	  Reporter.log("set method is running", true);
  }
  
  @Test (invocationCount = 3)
  public void group() 
  {
	  Reporter.log("group method is running", true);
  }
  }
