package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	
		//1) Find total number of rows
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	   //int	rows = driver.findElements(By.tagName("tr")).size();////If we will have only one table then we can use tagname
	    System.out.println("Number of rows : "+rows);
	    
	    //2) Find number of coloumns
	  
	     int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	  //  int cols = driver.findElements(By.tagName("th")).size();//If we will have only one table then we can use tagname
	    System.out.println("Number of columns : "+cols);
   /*
	    //3)Find specific row and coloumn data
	     String value = driver.findElement(By.xpath("//table[@name ='BookTable']//tr[4]//td[2]")).getText();
	     System.out.println("Value from row 4 and col 4 : "+ value);
	*/
	/*    
	 
	    //4)Find all the values from row and coloumns
	     * 
	    for(int r=2; r<=rows; r++) {
	    for(int c=1; c<=cols; c++) {
	    String value = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    // System.out.print(value +"   ");
	       System.out.print(value +" \t  ");
	    	}
	    	System.out.println();
	    }*/
    /*	     
	    //5)Find the books which are written by Amit
	    for(int r=2; r<=rows; r++) {
	    String  elements = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[2]")).getText();
	//  System.out.println(elements);
	   
	       if(elements.equals("Amit")) {
		   String  element = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[1]")).getText();
		   System.out.println(element);
		}   
		   */
	    
	    //6)Find the total number of price
	    int sum=0;
	    for(int r=2; r<=rows; r++) {
		    String  price = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[4]")).getText();
		  //  System.out.println("Price : "+price);
		    sum=sum+Integer.parseInt(price);
	    }
	    System.out.println("The toatl amount of books : "+sum);
	} 
	}


