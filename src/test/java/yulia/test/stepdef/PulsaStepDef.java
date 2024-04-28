package yulia.test.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yulia.test.BaseTest;
import yulia.test.page.PulsaPage;

public class PulsaStepDef extends BaseTest {
    PulsaPage pulsaPage ;
    @Given("user is on beli pulsa page")
    public void userIsOnBeliPulsaPage() {
        pulsaPage = new PulsaPage(driver);
        pulsaPage.goToPulsaPage();
    }

    @When("user input phone number with {string}")
    public void userInputPhoneNumberWith(String phoneNumber) throws InterruptedException{
        pulsaPage.inputPhoneNumber(phoneNumber);
    }

    @Then("user should see provider image {string}")
    public void userShouldSeeProviderImage(String url) {
        pulsaPage.checkProviderImage(url);
    }

    @Then("nominal options should be shown with {string}")
    public void nominalOptionsShouldBeShownWith(String text) {
        pulsaPage.checkText(text);
    }

    @And("Beli button should be enabled")
    public void beliButtonShouldBeEnabled() {
        pulsaPage.verifyBeliButtonEnabled();
    }
    @And("Beli button should be disabled")
    public void beliButtonShouldBeDisabled() {
        pulsaPage.verifyBeliButtonDisabled();
    }

    @Then("user should see error message with {string}")
    public void userShouldSeeErrorMessageWith(String message) {
        pulsaPage.verifyErrorMessage(message);
    }

    @And("user should see Beli Pulsa text {string}")
    public void userShouldSeeBeliPulsaText(String text) {
        pulsaPage.checkText(text);
    }
}
