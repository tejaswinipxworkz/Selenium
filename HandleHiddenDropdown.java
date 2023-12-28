package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/19492549/drop-down-menu-hidden-behind");
List<WebElement> elements=	driver.findElements(By.xpath("//select[@id = 'answer-sort-dropdown-select-menu']//option "));
for(WebElement elmnt : elements) {
	System.out.println(elmnt.getText());
	
	if(elmnt.getText().equals("Date created (oldest first)")) {
		elmnt.click();
		break;
	}
}
		
		
	}
}



 