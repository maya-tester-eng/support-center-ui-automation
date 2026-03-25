package step_definitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.SupportPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SupportSteps {

    SupportPage supportPage = new SupportPage();

    @Given("user opens support page")
    public void user_opens_support_page() {

        Driver.getDriver().get("file:///Users/maya/support-center-ui-automation/test-website/index.html");

    }

    // Successful form submission

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

    // Name validation

    @When("user enters invalid name")
    public void user_enters_invalid_name() {
        supportPage.nameInput.sendKeys("12345");
        supportPage.emailInput.sendKeys("test@test.com");
        supportPage.messageInput.sendKeys("Test message");

    }

    @And("user clicks submit")
    public void user_clicks_submit() {
        supportPage.submitButton.click();
    }

    @Then("error message should appear")
    public void error_message_should_appear() {
        boolean errorDisplayed = supportPage.errorMessage.isDisplayed();
        Assert.assertTrue(errorDisplayed);
    }


    // Fields are clear after submission

    @When("user submits the form")
    public void user_submits_the_form() {

        supportPage.nameInput.sendKeys("Maya");

        supportPage.emailInput.sendKeys("maya@test.com");

        supportPage.messageInput.sendKeys("Help request");

        supportPage.submitButton.click();

    }
    @Then("name email and message fields should be empty")
    public void fields_should_be_empty() {

        Assert.assertTrue(
                supportPage.nameInput.getAttribute("value").isEmpty()
        );

        Assert.assertTrue(
                supportPage.emailInput.getAttribute("value").isEmpty()
        );

        Assert.assertTrue(
                supportPage.messageInput.getAttribute("value").isEmpty()
        );

    }


    // Responsive website link

    @When("user clicks website link")
    public void user_clicks_website_link() {

        supportPage.websiteLink.click();

    }

    @Then("user should be redirected to {string} website") //parameterized step defin
    public void user_should_be_redirected_to_website(String expectedText) {

        String expectedUrl = ConfigurationReader.getProperty("shecodes.url");

        Assert.assertTrue(expectedUrl.contains(expectedText),"User was redirected to company website");



    }



}

