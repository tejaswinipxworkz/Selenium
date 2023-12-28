package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
       
      /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");*/
        
      WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      WebElement Username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	  Username.sendKeys("Admin");

	  WebElement Password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	  Password.sendKeys("admin123");
	
	}

}
