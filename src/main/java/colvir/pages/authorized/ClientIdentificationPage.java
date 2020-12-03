package colvir.pages.authorized;

import colvir.objects.Client;
import colvir.pages.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ClientIdentificationPage extends BasePage {

    public static final String URL = "http://cw-test.core-banking.cloud/main/client-identification";

    @FindBy(xpath = "//input[@name='GEN_ID_FIN']")
    private SelenideElement finInput;
    @FindBy(xpath = "//button[.//*[contains(text(), 'Найти')]]")
    private SelenideElement findFIOButton;
    @FindBy(xpath = "//input[@name='GEN_ID_INDIVID_SNAME']")
    private SelenideElement surnameInput;


    @FindBy(xpath = "//button[ .//*[contains(text(), 'Идентифицировать')] ]")
    SelenideElement confirmIdentificationBtn;


    public void fillFIO(String fio) {
        finInput.sendKeys(fio);
//        finInput.shouldHave(Condition.text(fio));
        findFIOButton.click();
    }


    public void checkSurnameInputDisabled() {
        surnameInput.should(Condition.disabled);
    }

    public void checkClientFields(Client client) {
//        surnameInput.should(Condition.text(client.getSurname()));
    }
}
