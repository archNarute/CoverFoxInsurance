package testNg_FailedXML_Serial_Parallel;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_xml 
{
  @Test
  public void a()
  {
	  Reporter.log("TC a is running", true);
  }
  
  @Test
  public void b()
  {
	  //Assert.fail();
	  Reporter.log("TC b is running", true);
  }
  
  @Test
  public void c()
  {
	  //Assert.fail();
	  Reporter.log("TC c is running", true);
  }
  
  @Test
  public void d()
  {
	  Reporter.log("TC d is running", true);
  }
  
  @Test
  public void e()
  {
	  //Assert.fail();
	  Reporter.log("TC e is running", true);
  }
}
