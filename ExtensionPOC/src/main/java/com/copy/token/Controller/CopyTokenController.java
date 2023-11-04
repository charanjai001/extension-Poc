package com.copy.token.Controller;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class CopyTokenController {

	@GetMapping("/{env}")
	public ResponseEntity<?> copyToken(@PathVariable String env) {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addExtensions(new File("Driver\\OneExtension.crx"));

		options.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		if(env.equals("Dev1")) {

		driver.get("https://auth.geeksforgeeks.org/");

		WebElement username = driver.findElement(By.id("luser"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.cssSelector("button[class='btn btn-green signin-button']"));
		username.sendKeys("charanjai2001@gmail.com");
		password.sendKeys("Charan@01");
		login.click();
		}
		return ResponseEntity.ok().build();
	}

}

