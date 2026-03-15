package step_definitions;

import io.cucumber.java.en.*;
        import pages.SupportPage;
import utilities.Driver;

public class SupportSteps {

    SupportPage supportPage = new SupportPage();

    @Given("user opens support page")
    public void user_opens_support_page() {

        Driver.getDriver().get("file:///Users/maya/support-center-ui-automation/test-website/index.html");

    }

    @When("user enters name email and message")
    public void user_enters_name_email_and_message() {

        supportPage.nameInput.sendKeys("Maya");
        supportPage.emailInput.sendKeys("maya@test.com");
        supportPage.messageInput.sendKeys("Need help with order");

    }

    @And("user clicks submit button")
    public void user_clicks_submit_button() {

        supportPage.submitButton.click();

    }

    @Then("form should be submitted")
    public void form_should_be_submitted() {

        System.out.println("Form submitted");

    }

}

