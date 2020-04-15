package de.nsasse.roboadvisor.controller;

import de.nsasse.roboadvisor.model.Product;
import de.nsasse.roboadvisor.service.RestService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;


@Named
public class OptimizerController {

    @Inject
    private RestService restService;

    private List<Product> productList;

    public void getProducts() {
        productList = restService.getProducts();
        System.out.println(productList.get(1).getName());
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
