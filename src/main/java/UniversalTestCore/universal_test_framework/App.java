package UniversalTestCore.universal_test_framework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.checkerframework.checker.units.qual.kg;
import org.json.JSONObject;

/*import com.fasterxml.jackson.databind.JsonNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;*/

import com.universaltestcore.seleniumutils.BrowserControlUtils;
import com.universaltestcore.seleniumutils.BrowserFactory;
import com.universaltestcore.seleniumutils.WebElementUtils;
import com.universaltestcore.utils.JsonFileHandler;

public class App 
{
	public static void main( String[] args ) throws IOException, InterruptedException
    {
		BrowserFactory BrowserFactory = new BrowserFactory();
		WebDriver driver = BrowserFactory.ChooseBrower("Chrome");
		BrowserControlUtils BrowserControlUtils = new BrowserControlUtils(driver);
		BrowserControlUtils.navigateTo("https://www.google.com/");
		BrowserControlUtils.maximizeBrowser();
		Thread.sleep(5000);
		BrowserControlUtils.closeBrowser();
		
    }
    
    
    
}
