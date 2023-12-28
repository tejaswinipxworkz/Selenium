package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("Location of an image before maximazing screen ; "+ img.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("Location of an image after maximazing screen ; "+ img.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("Location of an image after full screen ; "+ img.getLocation());
		
		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);
		System.out.println("Location of an image after giving particular position of the screen ; "+ img.getLocation());
		
        driver.quit();
	}

}
