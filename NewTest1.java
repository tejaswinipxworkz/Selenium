package Day10;

import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest1 {
  
	@BeforeClass
	public void login() {
		
		Assert.assertTrue(true);
		System.out.println("Login.......");
	}
	@Test(priority=1)
	public void search() {
		
		Assert.assertTrue(true);
		System.out.println("Search.......");
	}
	@Test(priority=2,dependsOnMethods = {"login"})
	public void Advancesearch() {
		
		Assert.assertTrue(true);
		System.out.println("Advancesearch.......");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout.......");
	}
}
