package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Sathish");
		driver.findElement(By.id("firstname")).sendKeys("Poo");
		driver.findElement(By.id("lastname")).sendKeys("Sathish");
		driver.findElement(By.id("email")).sendKeys("poongothai.sathishn@gmail.com");
		driver.findElement(By.id("input-country")).sendKeys("India");
		driver.findElement(By.id("password")).sendKeys("Test@321");
		driver.findElement(By.xpath("//button[@class='bg-info']")).click();
		
	}

}
