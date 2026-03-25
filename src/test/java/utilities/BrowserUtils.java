package utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class BrowserUtils {

    public static void sleep(int seconds){

        try{
            Thread.sleep(seconds * 1000);  //slows down, good for each step to watch
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public static void waitForVisibility(WebElement element, int seconds) {

        WebDriverWait wait =
                new WebDriverWait(
                        Driver.getDriver(),
                        Duration.ofSeconds(seconds)
                );

        wait.until(
                ExpectedConditions.visibilityOf(element)  //webElements more visible to locate
        );

    }

}

