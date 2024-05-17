import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PuxarJsonMoedas {
    public PuxarJsonMoedas(String urlExchangeRateAPI) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlExchangeRateAPI))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy
                        .LOWER_CASE_WITH_DASHES)
                .create();
        MoedaJson moedaJson = gson.fromJson(response.body(), MoedaJson.class);
        ConverterMoeda moeda = new ConverterMoeda(moedaJson);
        System.out.println(moeda);
    }
}
