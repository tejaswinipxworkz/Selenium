package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement Drpdownelmt=driver.findElement(By.xpath("//select[@id='country-list']"));
	Select countryselect =	new Select(Drpdownelmt);

	//1 dropdown selectby visibletext
	//countryselect.selectByVisibleText("India");
	
	//dropdown selectby visibletext
	//countryselect.selectByValue("1");

	//dropdown selectby index
	//countryselect.selectByIndex(2);
	
	//2 Find total number of options in dropsown
	List<WebElement> optn = countryselect.getOptions();
	System.out.println("Number of options :"+optn.size());
	
	//3 Print all options in consloe
/*for(WebElement opt:optn) {
		System.out.println(opt.getText());
	}*/
	
	for(int i=0; i<optn.size(); i++) {
		System.out.println(optn.get(i).getText());
	}
	}

}
