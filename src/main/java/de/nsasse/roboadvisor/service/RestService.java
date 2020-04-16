package de.nsasse.roboadvisor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.nsasse.roboadvisor.model.Product;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestService {

    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public List<Product> getProducts() {
        List<Product> productList = new ArrayList<>();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("http://localhost:8082/product/all"))
                    .setHeader("Optimizer", "Java 11 HttpClient Bot") // add request header
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            // print response headers
            HttpHeaders headers = response.headers();
            headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

            // print status code
            System.out.println(response.statusCode());

            // print response body
            System.out.println(response.body());

            ObjectMapper mapper = new ObjectMapper();
            Product[] productArray = mapper.readValue(response.body(), Product[].class);

            productList = Arrays.stream(productArray).collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println(e);
        }

        return productList;
    }

    public void addProductToPortfolio(String isin) {

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(isin))
                    .uri(URI.create("http://localhost:8082/portfolio/addproduct"))
                    .setHeader("Optimizer", "Java 11 HttpClient Bot") // add request header
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            HttpHeaders headers = response.headers();
            headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
