package com.universaltestcore.seleniumutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	

	 
	public  WebDriver ChooseBrower(String browserName) {
		WebDriver driver;
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			return driver;
		}else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			return driver;

		}else {
			System.out.println("Not a valid format");
			throw new IllegalArgumentException("UnSuuported Brower" + browserName);

		}
		
	}

}
