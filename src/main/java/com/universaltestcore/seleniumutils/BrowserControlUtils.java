package com.universaltestcore.seleniumutils;

import org.openqa.selenium.WebDriver;



public class BrowserControlUtils {
	
	private  WebDriver driver;

    // Initialize driver (called once from base/setup class)
    public  BrowserControlUtils(WebDriver driver) {
        this.driver = driver;
    }

    // 1. Open URL
    public  void openURL(String url) {
        driver.get(url);
    }

    // 2. Navigate to another URL
    public  void navigateTo(String url) {
        driver.navigate().to(url);
    }

    // 3. Navigate Back
    public  void goBack() {
        driver.navigate().back();
    }

    // 4. Navigate Forward
    public  void goForward() {
        driver.navigate().forward();
    }

    // 5. Refresh the page
    public  void refreshPage() {
        driver.navigate().refresh();
    }

    // 6. Close current tab
    public  void closeBrowser() {
        driver.close();
    }

    // 7. Quit entire browser
    public  void quitBrowser() {
        driver.quit();
    }
    
    //8. maximize Browser
    public  void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    //9  minimize Browser
    public  void minimizeBrowser() {
        driver.manage().window().minimize();
    }

    //10  fullScreen Browser
    public  void fullScreenBrowser() {
        driver.manage().window().fullscreen();
    }

}
