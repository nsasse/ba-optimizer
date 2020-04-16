package de.nsasse.roboadvisor.service;

import de.nsasse.roboadvisor.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnalyseService {
    public List<Product> getOptimalProducts(List<Product> productList) {
        return productList
                .stream()
                .sorted(Comparator.comparing(Product::getPerformanceThisYear).reversed())
                .collect(Collectors.toList());
    }

    public List<Product> getOptimalPortfolioProducts(List<Product> productList) {
        //TODO
        return null;
    }
}
