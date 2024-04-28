package yulia.test.stepdef;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import yulia.test.BaseTest;

public class CucumberHooks extends BaseTest {
    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
