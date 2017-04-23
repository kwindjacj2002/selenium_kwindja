package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browser = new FirefoxDriver();
		browser.get("https://www.usps.com");
		browser.manage().window().maximize();
		browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		browser.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a")).click();
		browser.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys("23223");
		browser.findElement(By.xpath(".//*[@id='bSearch']")).click();
		browser.close();
		
		
		
	}

	
}
