package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            String browser = ConfigurationReader.getProperty("browser");

            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(
                        Duration.ofSeconds(10)
                );
            }

        }
        return driver;
    }

    /*
    Driver is created once. Wait applies to all elements. Framework stays stable.
    So, implicit wait will wait to 10 sec to handle dynamic elements which improves test stability,
            instead of giving NoSuchElementException
    */


    public static void closeDriver(){

        if(driver != null){

            driver.quit();
            driver = null;

        }
    }

}


// Now a browser type comes from a config file. Check for it first.

// This uses Singleton pattern (same driver for all tests).