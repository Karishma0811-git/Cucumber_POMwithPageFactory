package hooks;

import Base.BaseSetUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseSetUp {

    private static WebDriver driver;
    @Before
    public void setUp() {
        driver = new BaseSetUp().initializeDriver("chrome");
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @After
    public void tearDown() {
       if (driver !=null){driver.quit();}
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
