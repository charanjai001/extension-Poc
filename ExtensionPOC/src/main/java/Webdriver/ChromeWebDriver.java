package Webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

		

		ChromeOptions options = new ChromeOptions();

		options.addExtensions(new File("Driver\\OneExtension.crx"));

		options.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		
		driver.get("https://auth.geeksforgeeks.org/");
		
		
  
		
        WebElement username=driver.findElement(By.id("luser"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.cssSelector("button[class='btn btn-green signin-button']"));
        username.sendKeys("charanjai2001@gmail.com");
        password.sendKeys("Charan@01");
        login.click();

	}

}
