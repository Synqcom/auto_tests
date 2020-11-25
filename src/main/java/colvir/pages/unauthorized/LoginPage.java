package colvir.pages.unauthorized;

import colvir.pages.authorized.MainPage;
import colvir.system.PageUtils;
import com.codeborne.selenide.SelenideElement;
import colvir.pages.BasePage;
import org.openqa.selenium.support.FindBy;

import static colvir.system.PageUtils.waitTillUrlContains;

public class LoginPage extends BasePage {

    //TODO вынеси все что до /login в отдельный конфиг
    public static final String URL = "http://cw-test.core-banking.cloud/login";

    @FindBy(xpath = "//input[@id='outlined-name']")
    private SelenideElement loginInput;
    @FindBy(xpath = "//input[@id='outlined-password-input']")
    private SelenideElement passwordInput;
    @FindBy(xpath = "//form//button[@type='submit']")
    private SelenideElement loginBtn;

    public void login(String email, String password) {
        loginInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginBtn.click();
        waitTillUrlContains(MainPage.URL);
    }

}
