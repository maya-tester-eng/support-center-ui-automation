package step_definitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    // Valid login

    @Given("user opens login page")
    public void user_opens_login_page() throws InterruptedException {

        Driver.getDriver().get(
                "https://your-login-page-url.com"
        );

    }

    @When("user enters valid email and password")
    public void user_enters_valid_credentials() {

        loginPage.emailInput.sendKeys(
                "test@test.com"
        );

        loginPage.passwordInput.sendKeys(
                "Password123"
        );

    }

    @When("user clicks login")
    public void user_clicks_login() {

        loginPage.loginButton.click();
        BrowserUtils.sleep(2000);

    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {

        String currentUrl =
                Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("dashboard")
        );

    }

    // Invalid email login

    @When("user enters invalid email")
    public void user_enters_invalid_email() {

        loginPage.emailInput.sendKeys(
                "mayaishanova"
        );

        loginPage.passwordInput.sendKeys(
                "Password123"
        );

    }

    @Then("login should fail")
    public void login_should_fail() {

        boolean errorDisplayed =
                loginPage.errorMessage.isDisplayed();

        Assert.assertTrue(errorDisplayed);

    }

    // Short password

    @When("user enters short password")
    public void user_enters_short_password() {
        loginPage.passwordInput.sendKeys("Pass");
    }


}
