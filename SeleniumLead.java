package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLead {
	public static void main(String[]args) {
		//Driver setup
		WebDriverManager.chromedriver().setup();
		
		//Open the chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the window
		driver.manage().window().maximize();
		//Finding the Webelement
		WebElement elementUsername = driver.findElement(By.id("username"));
		//Entering Some input in the text box
		elementUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.tagName("h2")).getText();
		System.out.println("text");
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.linkText("login")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DRS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("POONGOTHAI");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("CHINNADHURAI");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.tagName("Lead ID")).getText();
		
	}

}
