package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String Text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
		
		
		if(Text.contains("Congratulations")) {
			System.out.println("Successful login");
		} else {
			System.out.println("Unsuccessful login");
		}
	}

}
