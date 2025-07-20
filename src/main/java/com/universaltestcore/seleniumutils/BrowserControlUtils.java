package com.universaltestcore.seleniumutils;

import org.openqa.selenium.WebDriver;


public class BrowserControlUtils {
	
	private static WebDriver driver;

    // Initialize driver (called once from base/setup class)
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    // 1. Open URL
    public static void openURL(String url) {
        driver.get(url);
    }

    // 2. Navigate to another URL
    public static void navigateTo(String url) {
        driver.navigate().to(url);
    }

    // 3. Navigate Back
    public static void goBack() {
        driver.navigate().back();
    }

    // 4. Navigate Forward
    public static void goForward() {
        driver.navigate().forward();
    }

    // 5. Refresh the page
    public static void refreshPage() {
        driver.navigate().refresh();
    }

    // 6. Close current tab
    public static void closeBrowser() {
        driver.close();
    }

    // 7. Quit entire browser
    public static void quitBrowser() {
        driver.quit();
    }
    
    //8. maximize Browser
    public static void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    //9  minimize Browser
    public static void minimizeBrowser() {
        driver.manage().window().minimize();
    }

    //10  fullScreen Browser
    public static void fullScreenBrowser() {
        driver.manage().window().fullscreen();
    }

}
