package com.universaltestcore.seleniumutils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardAction {
	
	private WebDriver driver;
    Actions actions;

    public MouseKeyboardAction(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Hover over an element
    public void moveToElement(By locator) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).perform();
    }

    // Click / Double Click / Right Click on an element
    public void performClicks(By locator) {
        WebElement element = driver.findElement(locator);
        actions.click(element).perform();                 // Single Click
        actions.doubleClick(element).perform();           // Double Click
        actions.contextClick(element).perform();          // Right Click
    }

    // Drag and Drop
    public void dragAndDrop(By sourceLocator, By targetLocator) {
        WebElement source = driver.findElement(sourceLocator);
        WebElement target = driver.findElement(targetLocator);
        actions.dragAndDrop(source, target).perform();
    }

    // Send ENTER or other key
    public void sendKeyboardKey(By locator) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER); // Or Keys.TAB, Keys.ESCAPE, etc.
    }

    // Click and Hold
    public void clickAndHold(By locator) {
        WebElement element = driver.findElement(locator);
        actions.clickAndHold(element).perform();
    }

    // Release mouse hold (used after clickAndHold or dragAndDropBy)
    public void release(By locator) {
        WebElement element = driver.findElement(locator);
        actions.release(element).perform();
    }

    // Select by visible text (for dropdowns)
    public void selectByVisibleText(By dropdownLocator, String visibleText) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(dropdown);
        select.selectByVisibleText(visibleText);
    }

}
