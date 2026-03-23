package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            String browser = ConfigurationReader.getProperty("browser");

            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

        }
        return driver;
    }
    public static void closeDriver(){

        if(driver != null){

            driver.quit();
            driver = null;

        }
    }

}


// Now a browser type comes from a config file. Check for it first.

// This uses Singleton pattern (same driver for all tests).