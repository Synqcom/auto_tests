package colvir;

import colvir.objects.Client;
import colvir.objects.ObjectsFactory;
import colvir.pages.authorized.ClientIdentificationPage;
import colvir.pages.authorized.MainPage;
import org.testng.annotations.Test;

import static colvir.Utils.login;
import static com.codeborne.selenide.Selenide.open;

public class ClientAuthenticationTests extends BaseTest {

    @Test
    public void IdentifyIndividualsViaFIN() {
        MainPage mainPage = login();
        ClientIdentificationPage clientIdentificationPage = mainPage.openClientIdentificationMenu();
        clientIdentificationPage.fillFIO("AS50060"); //TODO убери fio из кода


        Client clientA = objectsFactory.getClient("userA");

        clientIdentificationPage.checkSurnameInputDisabled();

        clientIdentificationPage.checkClientFields(clientA);




    }
}
