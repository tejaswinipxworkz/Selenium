package Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	//
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
List<WebElement> CheckBox =	driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println("the number of checkboxes : "+CheckBox.size());

/*for(WebElement chkboxselect : CheckBox) {
	chkboxselect.click();
}*/

/*for(int i=0;i<CheckBox.size(); i++) {
	CheckBox.get(i).click();
}*/
//Total checkboxes 6
//I want to select last 3 checkbox
//6-3=3 so starting index 3
//6-2=4 so stating index 4 (6 total size , we need to select last 2 check box so 6-2 = 4) we should put 4 as astarting index
/*for(int i=4;i<CheckBox.size(); i++) {
	CheckBox.get(i).click();

	}*/

/*//I want to select starting 2 checkbox
for(int i=0;i<2; i++) {
	CheckBox.get(i).click();

	}*/
/*//Uncheck the checkbox
for(int i=0;i<CheckBox.size(); i++) {
	CheckBox.get(i).click();
}

for(int i=0;i<CheckBox.size(); i++) {
	CheckBox.get(i).click();
	}*/
for(int i=0;i<2; i++) {
	CheckBox.get(i).click();
}
Thread.sleep(4000);
/*for(int i=0;i<CheckBox.size(); i++) {
	if(CheckBox.get(i).isSelected()){
	CheckBox.get(i).click();
	}}*/
for(WebElement chkbox:CheckBox) {
	if(chkbox.isSelected()) {
		chkbox.click();
	}
}
}
}
