package yulia.test.stepdef;

import org.junit.After;
import org.junit.Before;
import yulia.test.BaseTest;

public class CucumberHooks extends BaseTest {
    @Before
    public void beforeTest(){
        getDriver();

    }

    @After
    public void afterClass(){
        driver.close();
    }
}
