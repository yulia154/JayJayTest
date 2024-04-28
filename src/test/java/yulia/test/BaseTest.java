package yulia.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;

    protected void getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--headless");
//        options.addArguments("--window-size=1280,800");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }
}
