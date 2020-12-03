package colvir;

import colvir.pages.authorized.MainPage;
import colvir.pages.unauthorized.LoginPage;
import org.testng.reporters.jq.Main;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Utils extends BaseTest {



    public static MainPage login() {
        LoginPage loginPage = open(LoginPage.URL, LoginPage.class);
        loginPage.login("OLEG", "QWErty789");
        return page(MainPage.class);
    }
}
