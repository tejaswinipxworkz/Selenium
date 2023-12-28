package Day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title of the page : "+driver.getTitle());
		System.out.println("Current page url : "+driver.getCurrentUrl());
		//System.out.println("page source .........");
		//System.out.println(driver.getPageSource());
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource.contains("html"));
		Thread.sleep(3000);
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	    
	    Set<String>  windowid = driver.getWindowHandles();
	 
	     for(String windid : windowid) {
		 System.out.println(windid);
	 }
	}
}
