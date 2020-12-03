package colvir.pages.authorized;

import colvir.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static colvir.system.PageUtils.waitTillUrlContains;

public class MainPage extends BasePage {

    public static final String URL = "http://cw-test.core-banking.cloud/main";

    @FindBy(xpath = "//*[@href='/main/client-identification']/*")
    private SelenideElement clientIdentificationMenu;

    public ClientIdentificationPage openClientIdentificationMenu() {
        clientIdentificationMenu.click();
        waitTillUrlContains(ClientIdentificationPage.URL);
        return page(ClientIdentificationPage.class);
    }

}
