package colvir.system;

import com.codeborne.selenide.WebDriverRunner;

public class DriverUtils {

    public static void closeDriver() {
        try {
            WebDriverRunner.clearBrowserCache();
            WebDriverRunner.closeWebDriver();
        } catch (Exception e) {
            System.out.println(String.format("Failed to close webdriver. Message: %s\nStack trace:\n%s", e.getMessage(), e.getStackTrace()));
        }

    }
}
