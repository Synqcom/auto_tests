package colvir;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;

import static colvir.system.DriverUtils.closeDriver;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        closeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
        if (WebDriverRunner.hasWebDriverStarted()) closeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        closeDriver();
    }

    @AfterSuite
    public void afterSuite() {}
}
