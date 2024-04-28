package yulia.test.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import yulia.test.BaseTest;


import static org.junit.Assert.*;

public class PulsaPage{
    private WebDriver driver;
    By inputPhoneNumber = By.name("client_number");
    By beliButton = By.cssSelector("#mainLayout > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div.css-171uhiz > div > div > div.css-kxhboe > div.css-1o3sybl > button");

    public PulsaPage(WebDriver driver){
//        WebDriverManager.chromedriver().create();
        this.driver = driver;
    }

    public void goToPulsaPage(){
        driver.get("https://www.tokopedia.com/pulsa/");
    }
    public void checkText(String text){
        assertTrue("text not found on pulsa page",driver.getPageSource().contains(text));
    }

    public void inputPhoneNumber(String phoneNumber) throws InterruptedException {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        Thread.sleep(2000);
    }

    public void checkProviderImage(String url){
        assertTrue(driver.getPageSource().contains(url));

    }
    public void verifyBeliButtonEnabled(){
        assertTrue(driver.findElement(beliButton).isEnabled());
    }
    public void verifyBeliButtonDisabled(){
        assertFalse(driver.findElement(beliButton).isEnabled());
    }
    public void verifyErrorMessage(String message){
        assertTrue(driver.getPageSource().contains(message));
    }

}
