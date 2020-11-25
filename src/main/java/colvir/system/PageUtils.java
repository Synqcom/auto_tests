package colvir.system;

import org.testng.Assert;

import static com.codeborne.selenide.WebDriverRunner.url;

public class PageUtils {
    public static void waitTillUrlContains(String partOfUrl, int seconds) {
        long startTime = System.currentTimeMillis();
        while (startTime + seconds * 1000 > System.currentTimeMillis()) {
            if (url().contains(partOfUrl)) return;
        }
        Assert.fail("Waiting for \"" + partOfUrl + "\" url was failed, current url is \" + url()\"");
    }

    public static void waitTillUrlContains(String partOfUrl) {
        waitTillUrlContains(partOfUrl, 40);
    }
}
