package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.amazon.in/");
System.out.println(driver.getCurrentUrl());

driver.navigate().to("https://www.flipkart.com/");
System.out.println(driver.getCurrentUrl());

driver.navigate().back();
System.out.println(driver.getCurrentUrl());

driver.navigate().forward();
System.out.println(driver.getCurrentUrl());

driver.navigate().refresh();
System.out.println(driver.getCurrentUrl());

	}

}
