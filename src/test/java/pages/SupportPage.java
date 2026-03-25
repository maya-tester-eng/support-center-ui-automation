package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SupportPage {

    public SupportPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="name")
    public WebElement nameInput;

    @FindBy(id="email")
    public WebElement emailInput;

    @FindBy(id="message")
    public WebElement messageInput;

    @FindBy(id="submit")
    public WebElement submitButton;

    @FindBy(id="error-message")        // or @FindBy(className = "error")
                                        // or @FindBy(xpath = "//div[contains(text(),'error')]")
    public WebElement errorMessage;

    @FindBy(linkText = "our website")
    public WebElement websiteLink;
}


