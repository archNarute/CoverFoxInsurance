package TestNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Asset2 {
  
  @Test
  public void f() 
  {
	  //String a="hello";
	  //String b="Hello";  case sensitive
	 // String b="hello";
	  
	  
	//Assert.assertEquals(a, b,"a and b are not equal, Tc is failed");
	 // Assert.assertNotEquals(a, b,"a and b are not equal, Tc is failed");
	  
	  boolean c=true;
	  boolean d=false;
	  
	 // Assert.assertTrue(c, "c is false, tc is failed");
	  
	  //Assert.assertFalse(c, "c is true, tc is failed");
	 // Assert.assertFalse(d, "d is true, tc is failed");
	  
	  String x="hi";
	  String y=null;
	  
	  
	  
	  Assert.assertNull(y, "y is not null, tc is failed");
	  //Assert.assertNotNull(x, "x is null, tc is failed");
	  
	  
	  
	  
  }
}
