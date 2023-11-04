package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebdriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com/users/sign_in");
		WebElement username=driver.findElement(By.id("user_email_login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("charanjai2001@gmail.com");
		password.sendKeys("Charan@01");
		login.click();
		
	
	}

}
