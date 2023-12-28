package Day10;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest3 {
  @Test
 /* public void test() {
	  System.out.println("Test passed....");
	  Assert.assertEquals(1, 2);
	  System.out.println("Hard assertion completed...");
	  
  }*/
  
  public void test2() {
	  System.out.println("Test2 passed....");
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(1, 2);
	  System.out.println("Soft assertion completed...");
  }
}
