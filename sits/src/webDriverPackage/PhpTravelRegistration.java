package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhpTravelRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http;://phptravels.net");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Cedric");
		driver.findElement(By.name("lastname")).sendKeys("Kwindja");
		driver.findElement(By.name("phone")).sendKeys("7036261351");
		driver.findElement(By.name("email")).sendKeys("kwindjacj2002@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("7036261351");
		driver.findElement(By.name("password")).sendKeys("Mercury123");
		driver.findElement(By.name("confirmpassword")).sendKeys("Mercury123");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a"));
		driver.close();
				

		
	}

}
