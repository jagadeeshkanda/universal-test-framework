package com.universaltestcore.seleniumutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtils {

	private  WebDriver driver;
	public  void click(By locator) {
        driver.findElement(locator).click();
    }

	 public  WebElementUtils(WebDriver webDriver) {
	        driver = webDriver;
	    }
	 
    public  void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public  void clear(By locator) {
        driver.findElement(locator).clear();
    }

    public  String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public  String getAttribute(By locator, String attribute) {
        return driver.findElement(locator).getAttribute(attribute);
    }

    public  String getCssValue(By locator, String propertyName) {
        return driver.findElement(locator).getCssValue(propertyName);
    }

    public  boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public  boolean isEnabled(By locator) {
        return driver.findElement(locator).isEnabled();
    }

    public  boolean isSelected(By locator) {
        return driver.findElement(locator).isSelected();
    }

}
