package yulia.test.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PLNPage {
    WebDriver driver;
    By nomorTokenInputText = By.name("client_number");
    By bayarButton = By.xpath("//*[@id=\"mainLayout\"]/div[1]/div[3]/div[1]/div[2]/div/div/div[7]/div/button");
    By errorMessage = By.xpath("//*[@id=\"mainLayout\"]/div[1]/div[3]/div[1]/div[2]/div/div/div[5]/div[2]/div/span");


    public PLNPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToPLNPage(){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
        driver.get("https://www.tokopedia.com/pln/");
        wait.until(ExpectedConditions.presenceOfElementLocated(nomorTokenInputText));
    }
    public void inputNomorToken(String nomorToken){
        driver.findElement(nomorTokenInputText).sendKeys(nomorToken);
    }

    public void clickBayarButton(){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(bayarButton));
        assertTrue(driver.findElement(bayarButton).isEnabled());
        driver.findElement(bayarButton).click();
    }

    public void validateErrorMessage(String message) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
        assertTrue(driver.getPageSource().contains(message));
        wait.until(ExpectedConditions.textToBe(errorMessage, message));
        Thread.sleep(1000);
        assertFalse(driver.findElement(bayarButton).isEnabled());

    }

    public void validateLoginMessage(String message){
        assertTrue(driver.getPageSource().contains(message));
    }


}
