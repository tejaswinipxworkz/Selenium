package Day10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void test() {
	/*  int a=10;
	  int b=10;
	  
	  Assert.assertEquals(a, b,"a and b are not equal");
	  */
	  String s1 = "abc";
	  String s2 = "abc1";
	  Assert.assertEquals(s1, s2, "s1 ans s2 are not equal");
	  
	  
  }
}
