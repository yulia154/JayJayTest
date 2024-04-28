package yulia.test.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import yulia.test.BaseTest;
import yulia.test.page.PLNPage;

public class PLNStepDef extends BaseTest {
    PLNPage plnPage;

    @Given("user is on pln page")
    public void userIsOnPlnPage() {
        plnPage = new PLNPage(driver);
        plnPage.goToPLNPage();
    }
    @And("user input nomor token with {string}")
    public void userInputNomorTokenWith(String nomorToken) {
        plnPage.inputNomorToken(nomorToken);
    }

    @When("user click bayar button")
    public void userClickBayarButton() {
        plnPage.clickBayarButton();
    }

    @Then("user is on login page {string}")
    public void userIsOnLoginPage(String message) {
        plnPage.validateLoginMessage(message);
    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String message) throws InterruptedException {
        plnPage.validateErrorMessage(message);
    }
}
