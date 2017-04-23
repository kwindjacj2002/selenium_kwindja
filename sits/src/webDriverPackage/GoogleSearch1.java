package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1 Launch Web Browser
		WebDriver browser = new FirefoxDriver();
		//Step 2 Enter http://www.google.com and click on Enter Button
		browser.get("http://www.google.com");
		//Step 3 Enter "Herndon VA Weather"
		//browser.findElement(By.name("q").sendkeys("Herndon VA Weather"));
		WebElement element = browser.findElement(By.name("q"));
		element.sendKeys("Herndon VA Weather");
		element.submit();
		System.out.println("Page title is : "+ browser.getTitle());
		

	}

}
