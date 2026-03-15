package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class SupportPage {

        public SupportPage(){

            PageFactory.initElements(Driver.getDriver(), this);

        }
        //Page Object pattern.

        @FindBy(id="name")
        public WebElement nameInput;

        @FindBy(id="email")
        public WebElement emailInput;

        @FindBy(id="message")
        public WebElement messageInput;

        @FindBy(id="submit")
        public WebElement submitButton;

    }


    public WebElement nameInput =
            Driver.getDriver().findElement(By.id("name"));

    public WebElement emailInput =
            Driver.getDriver().findElement(By.id("email"));

    public WebElement messageInput =
            Driver.getDriver().findElement(By.id("message"));

    public WebElement submitButton =
            Driver.getDriver().findElement(By.id("submit"));
}

