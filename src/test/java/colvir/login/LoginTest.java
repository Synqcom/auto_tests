package colvir.login;

import colvir.BaseTest;
import colvir.pages.authorized.MainPage;
import colvir.pages.unauthorized.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginCredentialsEmail", parallel = true)
    public Object[][] loginCredentialsEmail() {
        return new Object[][]{
                //TODO надо подумать куда деть пароли
                {"OLEG", "QWErty789"},
//                {"asd@asd.zxc", "654321"}
        };
    }


    @Test(dataProvider = "loginCredentialsEmail")
    public void checkWeCanLoginViaEmail(String email, String password) {
        LoginPage loginPage = open(LoginPage.URL, LoginPage.class);
        loginPage.login(email, password);
    }

}
