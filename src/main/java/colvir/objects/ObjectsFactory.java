package colvir.objects;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.testng.Assert;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.StreamSupport;

import static com.google.gson.JsonParser.parseReader;

public class ObjectsFactory {
    Gson gson = new Gson();


    public Client getClient(String testName) {

        try {
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/colvir/objects/clients.json")); //TODO сделай путь короче и проще, вынеси его в static в отдельный класс

            JsonElement jsonElement = parseReader(reader);
            JsonArray array = jsonElement.getAsJsonArray();

            JsonElement element =  StreamSupport.stream(array.spliterator(), false)
                    .filter(i -> i.getAsJsonObject().get("testName").getAsString().equals(testName)).findAny().get();



            Client client = gson.fromJson(element, Client.class);
            return client;

        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.fail("error during CLient object parsing");
        return null;
    }
}
