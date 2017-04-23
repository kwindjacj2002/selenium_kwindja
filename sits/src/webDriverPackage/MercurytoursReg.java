package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercurytoursReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		// Launch Mercury Website
		driver.get("http://newtours.demoaut.com/");
		// Print the title of the page 
		System.out.println(driver.getTitle());
		// Click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		//Enter First name
		driver.findElement(By.name("firstName")).sendKeys("Cedric");
		// Enter Last name
		driver.findElement(By.name("lastName")).sendKeys("Kwindja");
		// Enter Phone Number
		driver.findElement(By.name("phone")).sendKeys("7036261351");
		// Enter Email address
		driver.findElement(By.id("userName")).sendKeys("kwindjacj2002@gmail.com");
		// Enter Address
		driver.findElement(By.name("address1")).sendKeys("1904 Cedar st #415");
		// Enter City
		driver.findElement(By.name("City")).sendKeys("Richmond");
		// Enter State
		driver.findElement(By.name("State")).sendKeys("Virginia");
		// Enter Postal Code
		driver.findElement(By.name("PostalCode")).sendKeys("23223");
		// Enter User name
		driver.findElement(By.name("email")).sendKeys("tester");
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("1111");
		// Enter Confirm Password
		driver.findElement(By.name("confirmpassword")).sendKeys("1111");
		// Click on Register Link
		driver.findElement(By.name("Register")).click();
		driver.close();
	}

}
