package Day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
	Set<String>	WindowIds= driver.getWindowHandles();
/*	
 * 
List <String> WindowList	= new ArrayList(WindowIds);
//Approach 1 to switch and handle the browser
String ParentWindowId = WindowList.get(0);
String ChildWindowId = WindowList.get(1);
//Switch to child window
driver.switchTo().window(ChildWindowId);
driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
//Switch to parent window
driver.switchTo().window(ParentWindowId);
driver.findElement(By.cssSelector("button[type='submit']")).click();

*/
	//Approach2
	for(String winid : WindowIds) {
	String title =	driver.switchTo().window(winid).getTitle();
	if(title.equals("OrangeHRM HR Software | OrangeHRM")) {
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	}
	if(title.equals("OrangeHRM")) {
		driver.close();
	}
	
	}
	
	
	
	}

}
