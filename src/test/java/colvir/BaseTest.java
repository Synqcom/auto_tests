package colvir;

import colvir.objects.ObjectsFactory;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;

import static colvir.system.DriverUtils.closeDriver;

public class BaseTest {
    ObjectsFactory objectsFactory;

    @BeforeSuite
    public void beforeSuite() {
        closeDriver();
        objectsFactory = new ObjectsFactory();
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
