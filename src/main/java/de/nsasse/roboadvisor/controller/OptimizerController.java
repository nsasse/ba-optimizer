package de.nsasse.roboadvisor.controller;

import de.nsasse.roboadvisor.model.Product;
import de.nsasse.roboadvisor.service.OptimizerService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class OptimizerController {

    @Inject
    OptimizerService optimizerService;

    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = optimizerService.getProductList();
    }

    public void addProductToPortfolio(String isin) {
        optimizerService.addProductToPortfolio(isin);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
