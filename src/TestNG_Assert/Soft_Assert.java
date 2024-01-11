package TestNG_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
  
  @Test
  public void f()
  {
	  String a="gn";
	  String b="gn";
	  
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(a, b,"a and b are not equal, tc is failed");
	  
	  s.assertNull(b, "b is not null, Tc is failed");//if 1 assertion is pass and other is failed then resut is fail
	  
	  s.assertAll(); 
  }
  
  @Test
  public void g()
  {
	  String z=null;
	  SoftAssert s1=new SoftAssert();
	  s1.assertNull(z, "z not null,t passed");
	  
  }
  
  
}
