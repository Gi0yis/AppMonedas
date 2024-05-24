package com.gioyis.miprograma.apiconversor;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConfigApi {
    private String primerMoneda = "";
    private String segundaMoneda = "";
    private MiMoneda miMonedaApi;

    public String getPrimerMoneda() {
        return primerMoneda;
    }

    public void setPrimerMoneda(String primerMoneda) {
        this.primerMoneda = primerMoneda;
    }

    public String getSegundaMoneda() {
        return segundaMoneda;
    }

    public void setSegundaMoneda(String segundaMoneda) {
        this.segundaMoneda = segundaMoneda;
    }

    public MiMoneda getMiMonedaApi() {
        return miMonedaApi;
    }

    public void configDeApi() {
        Gson gson = new Gson();
        String linkApi = "https://v6.exchangerate-api.com/v6/f4041b364028de0a1cd86abb/pair/" + primerMoneda + "/" + segundaMoneda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(linkApi))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            miMonedaApi = gson.fromJson(json, MiMoneda.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
