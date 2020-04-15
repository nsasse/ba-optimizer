package de.nsasse.roboadvisor.service;

import javax.inject.Named;

@Named
public class RestService {

//    private final HttpClient httpClient = HttpClient.newBuilder()
//            .version(HttpClient.Version.HTTP_2)
//            .build();
//
//    public List<Product> getProducts() {
//
//        try {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .GET()
//                    .uri(URI.create("http://localhost:8081/product/all"))
//                    .setHeader("Optimizer", "Java 11 HttpClient Bot") // add request header
//                    .build();
//
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//            // print response headers
//            HttpHeaders headers = response.headers();
//            headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
//
//            // print status code
//            System.out.println(response.statusCode());
//
//            // print response body
//            System.out.println(response.body());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return null;
//    }
}
