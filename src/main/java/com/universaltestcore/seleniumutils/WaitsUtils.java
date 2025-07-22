package com.universaltestcore.seleniumutils;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtils {
	
	private WebDriver driver;

	public WaitsUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public void explicitWait(By element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}

	public void fluentWait (By element) {
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(15))
		        .pollingEvery(Duration.ofSeconds(2))
		        .ignoring(NoSuchElementException.class);

		fluentWait.until(driver1 -> driver1.findElement(element));
	}
	
	

}
