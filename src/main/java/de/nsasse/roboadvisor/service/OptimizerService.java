package de.nsasse.roboadvisor.service;

import de.nsasse.roboadvisor.model.Product;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.util.List;

@Named
public class OptimizerService {

    private RestService restService;
    private List<Product> productList;

    @PostConstruct
    public void init() {
        AnalyseService analyseService = new AnalyseService();
        restService = new RestService();
        productList = analyseService.getOptimalProducts(restService.getProducts());
    }

    public void addProductToPortfolio(String isin) {
        restService.addProductToPortfolio(isin);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
